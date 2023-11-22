import java.util.Random;


public class SnakeLadder {
    int getDiceNumber() {
        Random random = new Random();
        int num = random.nextInt(6) + 1;
        return num;
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        SnakeLadder player1 = new SnakeLadder();
        System.out.println("Player 1 got: " + player1.getDiceNumber());
    }
}