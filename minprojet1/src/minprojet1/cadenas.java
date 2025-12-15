package minprojet1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


 
   public class cadenas {
    private boolean jokerUsed = false;
    private final int codeLength = 4;
    private final int maxAttempts = 10;

    private int[] secretCode;
    private int attemptsUsed;
    private boolean won;
    private final List<String> history = new ArrayList<>();

    public static class Result {
        public final int exact;
        public final int tooHigh;
        public final int tooLow;
        public final boolean isWin;

        public Result(int exact, int tooHigh, int tooLow, boolean isWin) {
            this.exact = exact;
            this.tooHigh = tooHigh;
            this.tooLow = tooLow;
            this.isWin = isWin;
        }

        @Override
        public String toString() {
            return String.format("Exact: %d | Trop hauts: %d | Trop bas: %d",
                    exact, tooHigh, tooLow);
        }
    }

    
    public cadenas() {
        startNewGame();
    }

    
    public void startNewGame() {
        Random rnd = new Random();
        secretCode = new int[codeLength];
        for (int i = 0; i < codeLength; i++) {
            secretCode[i] = rnd.nextInt(10); 
        }
        attemptsUsed = 0;
        won = false;
        history.clear();
        jokerUsed = false;
    }

    public int getAttemptsLeft() {
        return maxAttempts - attemptsUsed;
    }

    public boolean isWon() {
        return won;
    }

    public boolean isGameOver() {
        return won || attemptsUsed >= maxAttempts;
    }

    public List<String> getHistory() {
        return new ArrayList<>(history);
    }

    /**
     * Analyse un essai (ex: "1234").
     * Retourne un objet Result contenant :
     *   - exact
     *   - trop hauts
     *   - trop bas
     */
    public Result tryGuess(String guess) {
        if (isGameOver()) {
            throw new IllegalStateException("La partie est terminée.");
        }

        if (guess == null || guess.length() != codeLength) {
            throw new IllegalArgumentException("Le code doit avoir 4 chiffres.");
        }

        int exact = 0, tooHigh = 0, tooLow = 0;

        for (int i = 0; i < codeLength; i++) {
            char c = guess.charAt(i);
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Chaque caractère doit être un chiffre.");
            }

            int d = c - '0';
            if (d == secretCode[i])
                exact++;
            else if (d > secretCode[i])
                tooHigh++;
            else
                tooLow++;
        }

        attemptsUsed++;
        won = (exact == codeLength);

        Result result = new Result(exact, tooHigh, tooLow, won);
        history.add("Essai " + attemptsUsed + " : " + guess + " -> " + result.toString());

        return result;
    }

    /** Dev optionnel : retourne la combinaison secrète */
  public String revealSecret() {
        StringBuilder sb = new StringBuilder();
        for (int n : secretCode) {
            sb.append(n);
        }
        return sb.toString();
    }
  
  public int utiliserJoker() {
    if (jokerUsed) {
        return -1; // Joker déjà utilisé
    }

    jokerUsed = true;

    // On choisit un index qui sera révélé
    int index = (int) (Math.random() * codeLength);
    return secretCode[index];
}

}
