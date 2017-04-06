package com.example.lucydavidson.hw3;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * CannonBall
 *
 * This is the class for the cannonball. It creates a CannonBall.
 *
 * @author Lucy Davidson
 * @version April 2017
 *
 */

public class CannonBall {

    //The x position and y position.
    private int xPos;
    private float yPos;

    //The x velocity and y velocity.
    private int xVel;
    private int yVel;

    //The radius of the cannonball.
    private int radius;

    //The color of the cannonball.
    private Paint color;

    //The angle at which the cannonball was fired.
    private float radians;

    //The time value in which the cannonball has been
    //in the air.
    private int count;

    //Constructor that passes the velocity in the x and y directions.
    public CannonBall (int initDegrees) {

        //Create the color of the cannonball and set to black.
        color = new Paint();
        color.setColor(0xFF000000);

        //Convert the degrees to radians.
        radians = ((float)initDegrees*((float)Math.PI/180));

        //Set the radius to 30.
        radius = 30;

        //Set the time value to 1.
        count = 1;

        //initialize the x velocity and y velocity based on the
        //angle at which the cannon was fired.
        xVel = (int)(65*(Math.cos(radians)));
        yVel = (int)(65*(Math.sin(radians)));

        /**
         External Citation
         Date: 3 April 2017
         Problem: Couldn't remember what class allowed me to
         use sin() and cos().
         Resource:
         https://developer.android.com/reference/java/lang/Math.html
         Solution: I used the methods in this class.
         */
    }

    //Method to move the cannonball a certain value across the screen
    public void move() {
        //The position will move in a parabola in order to mimic gravity.
        xPos = xPos + xVel;
        yPos = (float)(yPos - (yVel + (-0.04 * (count * count))));
    }

    //Method to draw the cannonball.
    public void paint(Canvas c){
        //Draw the circle on the canvas.
        c.drawCircle(xPos, yPos, radius, color);
        //Add one to the count to track the time.
        count++;
    }

    //Getter for the Y position.
    public float getYPos(){return yPos;}

    //Getter for the X position.
    public int getXPos(){return xPos;}

    //Getter for the radius.
    public int getRadius(){return radius;}

    //Setter for the X position.
    public void setXPos(int x){xPos = x;}

    //Setter for the Y position.
    public void setYPos(int y){yPos = y;}

}
