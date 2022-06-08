import java.util.*;

/**
 * Each iteration of the while loop represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int highest = 0;
        int index = 0;

        // game loop - each turn

        while (true) {
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.

                if (mountainH > highest){ // if 'mountain height' is higher than the 'highest mountain',
                    highest = mountainH; // then the 'highest mountain' receive the 'mountain height'
                    index = i; // keep the index of the highest mountain to use it to shoot
                }
            }

            System.out.println(index); // The index of the highest mountain to fire on.

            highest = 0; // clean the variables to the next turn
            index = 0;
        }
    }
}