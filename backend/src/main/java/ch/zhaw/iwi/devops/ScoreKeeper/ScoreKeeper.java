package ch.zhaw.iwi.devops.scorekeeper;

public class ScoreKeeper {
    int scoreA = 0;
    int scoreB = 0;
    String teamA = "Stump";
    String teamB = "Moser";


    void teamNameA(String teamA1){
        teamA = teamA1;
    }
    void teamNameB(String teamB1){
        teamB = teamB1;
    }
    void scoreTeamA1(){
        scoreA++;
    }
    void scoreTeamA2(){
        scoreA=scoreA+2;
    }
    void scoreTeamA3(){
        scoreA=scoreA+3;
    }
    void scoreTeamB1(){
        scoreB++;
    }
    void scoreTeamB2(){
        scoreB=scoreB+2;
    }
    void scoreTeamB3(){
        scoreB=scoreB+3;
    }
    String getScore(){
        return teamA + " " + String.format("%03d", scoreA) + ":" + String.format("%03d", scoreB) + " " + teamB;
    }   
}
