import java.util.Random;

public class Main {
    private static final int NUM_GAMES = 1000;

    public static void main(String[] args) {
        MontyHallGame game = new MontyHallGame();
        Random random = new Random();

        for (int i = 0; i < NUM_GAMES; i++) {
            int playerChoice = random.nextInt(MontyHallGame.NUM_DOORS);
            game.playerChooseDoor(playerChoice);

            int emptyDoor = game.revealEmptyDoor();

            game.playerSwitchDoor();
        }

        game.printStatistics();
    }
}
