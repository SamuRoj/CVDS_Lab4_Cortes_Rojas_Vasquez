package hangman.model;

import org.junit.Assert;
import org.junit.Test;
public class GameScoreTest {
    /*
    Clases de equivalencia para OriginalScore
    - Score perfecto, sin errores, frontera en 0.
    - Score minimo igual a 0, sin aciertos.
     */

    @Test
    public void shouldCalculateScorePerfectScore() {
        GameScore score = new OriginalScore();
        try{
            int expectedScore = score.calculateScore(5, 0);
            Assert.assertEquals(100,expectedScore);
        }
        catch(Throwable e){
            Assert.fail();

        }
    }

    @Test
    public void shouldCalculateMinorScore() {
        GameScore score = new OriginalScore();
        try{
            int expectedScore = score.calculateScore(20, 20);
            Assert.assertEquals(0,expectedScore);
        }
        catch(Throwable e){
            Assert.fail();
        }
    }
   /*
    Clases de equivalencia para BonusScore
    - Score valido, con aciertos y errores.
    - Score minimo igual a 0, sin aciertos.
    */
    @Test
    public void shouldCalculateScoreBonusScore() {
        GameScore score = new BonusScore();
        try{
            int expectedScore = score.calculateScore(10, 5);
            Assert.assertEquals(75,expectedScore);
        }
        catch(Throwable e){
            Assert.fail();
        }
    }

    @Test
    public void shouldCalculateMinorScoreBonusScore() {
        GameScore score = new BonusScore();
        try{
            int expectedScore = score.calculateScore(0, 5);
            Assert.assertEquals(0,expectedScore);
        }
        catch(Throwable e){
            Assert.fail();
        }
    }

    /*
    Clases de equivalencia para PowerBonusScore
    - Puntaje perfecto mas de 3 aciertos.
    - Score minimo igual a 0, sin aciertos.
    */
    @Test
    public void shouldCalculatePerfectScorePowerBonusScore() {
        GameScore score = new PowerBonusScore();
        try{
            int expectedScore = score.calculateScore(4, 0);
            Assert.assertEquals(500,expectedScore);
        }
        catch(Throwable e){
            Assert.fail();
        }
    }

    @Test
    public void shouldCalculateMinorScorePowerBonusScore() {
        GameScore score = new PowerBonusScore();
        try{
            int expectedScore = score.calculateScore(0, 20);
            Assert.assertEquals(0,expectedScore);
        }
        catch(Throwable e){
            Assert.fail();
        }
    }
}
