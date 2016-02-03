package com.gamecodeschool.c1tappydefender;

import java.util.Random;

/**
 * Created by uma on 2/2/16.
 */
public class SpaceDust {
    private int x, y;
    private int speed;
    // Detect dust leaving the screen
    private int maxX;
    private int maxY;
    private int minX;
    private int minY;
    // Constructor
    public SpaceDust(int screenX, int screenY){
        minX=minY=0;
        maxX=screenX;
        maxY=screenY;
// Set a speed between 0 and 9
        Random generator = new Random();
        speed = generator.nextInt(10);
        // Set the starting coordinates
        x = generator.nextInt(maxX);
        y = generator.nextInt(maxY);
    }
    public void update(int playerSpeed){
// Speed up when the player does
        x -= playerSpeed;
        x -= speed;
//respawn space dust
        if(x < 0){
            x = maxX;
            Random generator = new Random();
            y = generator.nextInt(maxY);
            speed = generator.nextInt(15);
        }
    }
    // Getters and Setters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}


