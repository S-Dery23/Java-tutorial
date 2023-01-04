package src.main.models;

import java.util.HashMap;
import java.util.stream.Collectors;

public class Game {

    private static final Integer QUAFFLE_POINTS = 10;
    private static final Integer SNITCH_POINTS = 150;
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
        if (team == null){
            throw new IllegalArgumentException("Team should not be null");
        }
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

    public String replacePlaceholder(String play, String placeholder, String value){
        return play.replace("<" + placeholder + ">", value);
    }

    public void quaffleScore(Team team){
        setScore(new Team(team), getScore(team) + QUAFFLE_POINTS);
    }

    public void catchSnitch(Team team){
        setScore(new Team(team), getScore(team) + SNITCH_POINTS);
    }

    public String simulate(String play){
        String placeHolder = getPlaceholder(play);
        Team team = getRandomTeam();
        String value = "";
        if (placeHolder.equals(Team.getPositionChaser())){
            quaffleScore(team);
            value = team.getChasers()[random(team.getChasers().length)];
        } else if (placeHolder.equals(Team.getPositionSeeker())){
            catchSnitch(team);
            value = team.getSeeker();
        }else if (placeHolder.equals(Team.getPositionKeeper())){
            value = team.getKeeper();
        }

        return replacePlaceholder(play, placeHolder, value);
    }

    public Team getRandomTeam(){
            Object[] teams = this.scoreBoard.keySet().toArray();
        return (Team) teams[random(teams.length)];
    }

    public int random(int range){
        int random = (int) (Math.random() * range);
        return random;
    }
}
