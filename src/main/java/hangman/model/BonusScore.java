package hangman.model;

public class BonusScore implements GameScore {
    /*
    Metodo que calcula el puntaje en el esquema BonusScore.
    @pre El puntaje inicial es de 0 puntos.
    @param correctCount cantidad de letras correctas.
    @param incorrectCount cantidad de letras incorrectas.
    @pos El puntaje minimo es de 0 puntos.
    */
    public int calculateScore(int correctCount, int incorrectCount) {
        int score = correctCount * 10 - incorrectCount * 5;
        if (score < 0) {
            return 0;
        }
        return score;
    }

    @Override
    public int initialScore() {
        return 0;
    }
}
