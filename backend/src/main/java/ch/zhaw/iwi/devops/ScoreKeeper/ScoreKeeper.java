package ch.zhaw.iwi.devops.ScoreKeeper;

public class ScoreKeeper {
    int a = 0;
    int b = 0;
    String A = "Stump";
    String B = "Moser";


    void scoreTeamA1(){
        a++;
    }
    void scoreTeamA2(){

    }
    void scoreTeamA3(){

    }
    void scoreTeamB1(){
        b++;
    }
    void scoreTeamB2(){
        b=b+2;
    }
    void scoreTeamB3(){

    }
    String getScore(){
        return A + " " + String.format("%03d", a) + ":" + String.format("%03d", b) + " " + B;
    }   
}
