package ch.zhaw.iwi.devops.ScoreKeeper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScoreKeeperTest {

    @Test
    public void ScoreKeeper_start() {

        ScoreKeeper Score = new ScoreKeeper();
        Assertions.assertEquals("Stump 000:000 Moser", Score.getScore());
    }
}