package hangman.model;

public class OriginalScore implements GameScore{

    /*
    Metodo que calcula el puntaje en el esquema OriginalScore.
    @pre El puntaje inicial es de 100 puntos.
    @param correctCount cantidad de letras correctas.
    @param incorrectCount cantidad de letras incorrectas.
    @pos El puntaje minimo es de 0 puntos.
    */
    public int calculateScore (int correctCount, int incorrectCount){
        int score = 100-incorrectCount*10;
        if (score<0){
            return 0;
        }
        return score;
    }

    @Override
    public int initialScore() {
        return 100;
    }
}
