package src.test;
import org.junit.Before;
import src.main.models.Game;
import org.junit.Test;
import src.main.models.Team;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GameTest {

    Game game;

    @Before
    public void setup() {
        game = new Game(
                new Team("GRYFFINDOR", "Oliver", "Harry",
                        new String[] {"Angelina", "Ginny", "Katie"}),

                new Team("SLYTHERIN", "Vincent",  "Draco",
                        new String[] {"Bridget", "Harper", "Malcolm"})
        );
    }

    @Test
    public void getPlaceholderTest(){
        assertEquals("chaser" , game.getPlaceholder("<chaser> gets the next pass"));
    }

    @Test
    public void getReplacePlaceholderTest(){
        assertEquals("Katie gets the next pass", game.replacePlaceholder("<chaser> gets the next pass", "chaser", "Katie"));
    }

    @Test
    public void quaffleScoreTest(){
        Team team = new Team(game.getTeam("GRYFFINDOR"));
        game.quaffleScore(team);
        game.quaffleScore(team);

        assertEquals(20, game.getScore(team));
    }

    @Test
    public void catchSnitchTest(){
        Team team = new Team(game.getTeam("SLYTHERIN"));
        game.catchSnitch(team);

        assertEquals(150, game.getScore(team));
    }

}
