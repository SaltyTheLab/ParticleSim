package ParticleSim;

import java.util.Random;

public class Trials {
    public static void main(String[] args) {
        Random bob = new Random();
        System.out.print("Trial | Steps | Final");
        int steps = 1000;
        int trials = 10;
        int position;
        int heads = 1;
        int round = 1;
        for (int i = 0; i < trials; i++) {
            position = 0;
            
            for (int j = 0; j < steps; j++) {
                int prob = bob.nextInt(2);
                if (prob == heads)
                    position++;
                else
                    position--;
            }
            System.out.print(String.format("\n%d    | %d    |    %d", round, steps, position));
            round++;
        }
    }

}
