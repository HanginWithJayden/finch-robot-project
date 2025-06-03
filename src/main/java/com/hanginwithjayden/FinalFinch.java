package com.hanginwithjayden;

import com.birdbrain.Finch;

public class FinalFinch {
    public static void main(String[] args) {
        Finch bird = new Finch();

        // Code to make finch move forward and stop before it hits a wall
        System.out.println(bird.getDistance());
        bird.setMove("F", 110, 100);
        // Make the robot turn left
        bird.setTurn("L", 75, 100);
        // Does all again
        System.out.println(bird.getDistance());
        bird.setMove("F", bird.getDistance() - 2, 75);
        bird.setTurn("L", 75, 100);
        // Finish the path
        bird.setMove("F", 30, 100);
        bird.setTurn("R", 90, 100);
        System.out.println(bird.getDistance());
        bird.setMove("F", 45, 75);
        bird.setTurn("R", 90, 100);
        System.out.println(bird.getDistance());
        bird.setMove("F", 115, 75);
        bird.setTurn("R", 100, 100);
        System.out.println(bird.getDistance());
        bird.setMove("F", bird.getDistance() - 4, 75);
        bird.setTurn("L", 90, 100);
        System.out.println(bird.getDistance());
        bird.setMove("F", bird.getDistance() - 4, 75);
        bird.setTurn("L", 100, 100);
        System.out.println(bird.getDistance());
        bird.setMove("F", bird.getDistance() - 2, 75);

        bird.stop();
        bird.disconnect();
    }
}