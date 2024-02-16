package hangman.model;
import java.lang.Math;
import java.util.ArrayList;

public class PowerBonusScore implements GameScore{
    private ArrayList<Integer> positions = new ArrayList<>();
    /*
    Metodo que calcula el puntaje en el esquema PowerBonusScore.
    @pre El puntaje inicial es de 0 puntos.
    @param correctCount cantidad de letras correctas.
    @param incorrectCount cantidad de letras incorrectas.
    @pos El puntaje minimo es de 0 puntos.
    */
    public int calculateScore (int posCorrectCount, int incorrectCount){
        int score = 0;
        if(!positions.contains(posCorrectCount) && posCorrectCount!=-1){
            positions.add(posCorrectCount);
        }
        for(int pos : positions){
            score +=  (int)(Math.pow(5,pos));
        }

        score -= incorrectCount*8;
        if (score<0){
            return 0;
        } else if (score>500){
            return 500;
        }
        return score;
    }

    @Override
    public int initialScore() {
        positions = new ArrayList<>();
        return 0;
    }
}
