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

    private Boolean isReached100() {
        return this.currentPosition == 100;
    }
    
    private void play() {
        Random random = new Random();
        int chance = random.nextInt(3);
        int dice = this.getDiceNumber();
        
        System.out.println("Player got: " + dice);
        if(chance == LADDER) {
            if(this.currentPosition + dice <= 100) {
                this.currentPosition += dice;
                System.out.println("Got Ladder and move ahead and now at " + this.currentPosition);
            } else {
                System.out.println("Got Ladder but cant move and move ahead and now at " + this.currentPosition);
            }
        } else if(chance == SNAKE) {
            this.currentPosition -= dice;
            if(this.currentPosition < 0) {
                this.currentPosition = 0;
                System.out.println("Got Snake and move backward and get restarted and now at " + this.currentPosition);
            } else {
                System.out.println("Got Snake and move backward and now at " + this.currentPosition);
            }
        } else {
            System.out.println("Got Not play and stay at same position at " + this.currentPosition);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        SnakeLadder player1 = new SnakeLadder();
        int player1DiceCount = 0;

        while(!player1.isReached100()) {
            player1.play();
            player1DiceCount++;
        }

        System.out.println("Total Dice Count to Win: " + player1DiceCount);
    }
}