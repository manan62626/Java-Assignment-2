/*
Q7. Sports League (Polymorphism – Method Overriding)
Problem
A sports league awards points differently depending on the sport. Cricket and Football teams follow different rules. We use inheritance + method overriding to handle this polymorphism.
*/

class Team {
    protected String name;
    protected int matchesPlayed;
    protected int wins;
    protected int draws;

    public Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    public int calculatePoints() {
        return 0;
    }
}

class CricketTeam extends Team {
    public CricketTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculatePoints() {
        return wins * 2 + draws;
    }

    @Override
    public String toString() {
        return "Team: " + name + " (Cricket) Points: " + calculatePoints();
    }
}

class FootballTeam extends Team {
    public FootballTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculatePoints() {
        return wins * 3 + draws;
    }

    @Override
    public String toString() {
        return "Team: " + name + " (Football) Points: " + calculatePoints();
    }
}

public class code_7 {
    public static void main(String[] args) {
        Team c = new CricketTeam("India", 10, 6, 2);
        Team f = new FootballTeam("Barcelona", 8, 6, 1);
        System.out.println(c);
        System.out.println(f);
    }
}
