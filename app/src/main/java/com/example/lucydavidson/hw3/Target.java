package com.example.lucydavidson.hw3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Target
 *
 * This is the class for the target. It creates a Target.
 *
 * @author Lucy Davidson
 * @version April 2017
 *
 */

public class Target {

    //X and Y positions.
    private int xPos;
    private int yPos;

    //Radius of the circular target.
    private int radius;

    //Constructor.
    public Target() {
        //Randomly pick a position and size.
        xPos = (int)((Math.random()*1000) + 1000);
        yPos = (int)((Math.random()*900)+ 300);
        radius = (int)((Math.random()*50)+ 50);
    }

    //Draw the target on the given canvas.
    public void paint(Canvas c){

        //Paint object.
        Paint color = new Paint();

        //The outer red circle.
        color.setColor(Color.RED);
        c.drawCircle(xPos, yPos, radius, color);

        //The inner white circle.
        color.setColor(Color.WHITE);
        c.drawCircle(xPos, yPos, radius/2, color);

        //The inner red circle.
        color.setColor(Color.RED);
        c.drawCircle(xPos, yPos, radius/4, color);

    }

    //Getter for the Y position of the target.
    public int getYPos(){return yPos;}

    //Getter for the X position of the target.
    public int getXPos(){return xPos;}

    //Getter for the radius of the target.
    public int getRadius(){return radius;}
}
