import java.util.Random;

public class SnakeLadder {

    final int NO_PLAY = 0;
    final int SNAKE = 0;
    final int LADDER = 0;

    int currentPosition = 0;

    private int getDiceNumber() {
        Random random = new Random();
        int num = random.nextInt(6) + 1;
        return num;
    }
    
    private void play() {
        Random random = new Random();
        int chance = random.nextInt(3);
        int dice = this.getDiceNumber();
        
        System.out.println("Player got: " + dice);
        if(chance == LADDER) {
            this.currentPosition += dice;
            System.out.println("Got Ladder and move ahead and now at " + this.currentPosition);
        } else if(chance == SNAKE) {
            this.currentPosition -= dice;
            System.out.println("Got Snake and move backward and now at " + this.currentPosition);
        } else {
            System.out.println("Got Not play and stay at same position at " + this.currentPosition);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        SnakeLadder player1 = new SnakeLadder();

        player1.play();
    }
}