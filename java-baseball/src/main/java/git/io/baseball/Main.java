package git.io.baseball;

import git.io.baseball.Dice.SixDice;

public class Main {
    private static final Dice dice = new SixDice();
    public static void main(String[] args) {
        UserHistory userHistory = new UserHistory();

        userHistory.roll(dice.roll(),100);
        System.out.println("First = " + userHistory.now());
        userHistory.roll(dice.roll(),100);
        System.out.println("Second = " + userHistory.now());
        userHistory.rollBack();
        System.out.println("RollBack = " + userHistory.now());
    }
}