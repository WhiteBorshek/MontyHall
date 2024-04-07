import java.util.Random;

public class MontyHallGame {
    public static final int NUM_DOORS = 3;
    private static final Random random = new Random();

    private int prizeDoor;
    private int playerChoice;

    private int wins = 0;
    private int losses = 0;

    public MontyHallGame() {
        prizeDoor = random.nextInt(NUM_DOORS);
    }

    public void playerChooseDoor(int door) {
        playerChoice = door;
    }

    public int revealEmptyDoor() {
        int emptyDoor;
        do {
            emptyDoor = random.nextInt(NUM_DOORS);
        } while (emptyDoor == prizeDoor || emptyDoor == playerChoice);
        return emptyDoor;
    }

    public void playerSwitchDoor() {
        if (playerChoice != prizeDoor) {
            wins++;
        } else {
            losses++;
        }
    }

    public void printStatistics() {
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
