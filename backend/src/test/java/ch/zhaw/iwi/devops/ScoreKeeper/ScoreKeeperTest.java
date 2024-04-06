package ch.zhaw.iwi.devops.ScoreKeeper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScoreKeeperTest {

    @Test
    public void ScoreKeeper_start() {

        ScoreKeeper Score = new ScoreKeeper();
        Assertions.assertEquals("Stump 000:000 Moser", Score.getScore());
    }
    @Test
    public void ScoreKeeper_Moser1() {

        ScoreKeeper Score = new ScoreKeeper();
        Score.scoreTeamB1();
        Assertions.assertEquals("Stump 000:001 Moser", Score.getScore());
    }
    @Test
    public void ScoreKeeper_Stump1() {

        ScoreKeeper Score = new ScoreKeeper();
        Score.scoreTeamA1();
        Assertions.assertEquals("Stump 001:000 Moser", Score.getScore());
    }
    @Test
    public void ScoreKeeper_Moser2_Stump1() {

        ScoreKeeper Score = new ScoreKeeper();
        Score.scoreTeamA1();
        Score.scoreTeamB2();
        Assertions.assertEquals("Stump 001:002 Moser", Score.getScore());
    }
    @Test
    public void ScoreKeeper_Moser2_Stump2() {

        ScoreKeeper Score = new ScoreKeeper();
        Score.scoreTeamA2();
        Score.scoreTeamB2();
        Assertions.assertEquals("Stump 002:002 Moser", Score.getScore());
    }
    @Test
    public void ScoreKeeper_Moser3_Stump2() {

        ScoreKeeper Score = new ScoreKeeper();
        Score.scoreTeamA2();
        Score.scoreTeamB3();
        Assertions.assertEquals("Stump 002:003 Moser", Score.getScore());
    }
    @Test
    public void ScoreKeeper_Moser3_Stump3() {

        ScoreKeeper Score = new ScoreKeeper();
        Score.scoreTeamA3();
        Score.scoreTeamB3();
        Assertions.assertEquals("Stump 003:003 Moser", Score.getScore());
    }
}