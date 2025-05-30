package com.hanginwithjayden;

import com.birdbrain.Finch;

public class MazeFinch {
    public static void main(String[] args) {
        Finch bird = new Finch();

        // Code to make finch move forward and stop before it hits a wall
        System.out.println(bird.getDistance());
        bird.setMove("F", bird.getDistance() - 0.50, 100);

        bird.stop();
        bird.disconnect();
    }
}