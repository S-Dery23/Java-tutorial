package src.main.models;

import java.util.HashMap;
import java.util.stream.Collectors;

public class Game {

    private static final Integer QUAFFLE_POINTS = 1;
    private static final Integer SNITCH_POINTS = 0;
    private HashMap<Team, Integer> scoreBoard;

    private static int gameCount;

    public Game(Team home, Team away){
        scoreBoard = new HashMap<Team, Integer>();
        scoreBoard.put(new Team(home), 0);
        scoreBoard.put(new Team(away), 0);
        gameCount++;
    }

    public Integer getScore(Team team){
        return this.scoreBoard.get(team);
    }

    public void setScore(Team team, Integer score){
        this.scoreBoard.put(new Team(team), score);
    }

    public Team getTeam(String name){
        return this.scoreBoard.keySet().stream()
                .filter((key) -> key.getHouse().equals(name))
                .findFirst()
                .orElse(null)
                ;
    }

    public static int getGameCount() {
        return gameCount;
    }


    public String getPlaceholder(String play){
        return play.substring(play.indexOf('<') + 1, play.indexOf('>'));
    }

}
