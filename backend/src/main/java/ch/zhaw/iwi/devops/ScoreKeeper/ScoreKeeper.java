package ch.zhaw.iwi.devops.ScoreKeeper;

public class ScoreKeeper {
    int a = 0;
    int b = 0;
    String A = "Stump";
    String B = "Moser";


    void TeamNameB(String B1){
        B = B1;
    }
    void scoreTeamA1(){
        a++;
    }
    void scoreTeamA2(){
        a=a+2;
    }
    void scoreTeamA3(){
        a=a+3;
    }
    void scoreTeamB1(){
        b++;
    }
    void scoreTeamB2(){
        b=b+2;
    }
    void scoreTeamB3(){
        b=b+3;
    }
    String getScore(){
        return A + " " + String.format("%03d", a) + ":" + String.format("%03d", b) + " " + B;
    }   
}
