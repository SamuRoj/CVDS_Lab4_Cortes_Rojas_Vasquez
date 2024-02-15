package hangman.model;
import java.lang.Math;
public class PowerBonusScore implements GameScore{

    /*
    Metodo que calcula el puntaje en el esquema PowerBonusScore.
    @pre El puntaje inicial es de 0 puntos.
    @param correctCount cantidad de letras correctas.
    @param incorrectCount cantidad de letras incorrectas.
    @pos El puntaje minimo es de 0 puntos.
    */
    public int calculateScore (int correctCount, int incorrectCount){
        int score= (int)(Math.pow(5,correctCount)) - incorrectCount*8;
        if (score<0){
            return 0;
        } else if (score>500){
            return 500;
        }
        return score;
    }
}
