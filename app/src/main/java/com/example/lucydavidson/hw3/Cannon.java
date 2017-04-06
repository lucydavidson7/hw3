package com.example.lucydavidson.hw3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Color;
import java.lang.Math;

/**
 * Cannon
 *
 * This is the class for the cannon. It creates a Cannon.
 *
 * @author Lucy Davidson
 * @version April 2017
 *
 */

public class Cannon {

    //Initialize variables.
    //The angle the cannon is set to.
    private float radians;
    //The coordinates for the outlines of the cannon.
    private float pX1;
    private float pY1;
    private float pX2;
    private float pY2;
    //The color of the line of the cannon
    private Paint line = new Paint();

    //Constructor.
    public Cannon(int degrees){

        //Convert degrees to radians.
        radians = (degrees*((float)Math.PI/180));

        //Set initial x and y positions.
        pX1 = 500f;
        pY1 = 1220f;
        pX2 = 500f;
        pY2 = 1220f;

        //Set the color of the cannon to red.
        line.setColor(Color.RED);
        line.setFakeBoldText(true);
    }

    //Draws the cannon on the given canvas at the given angle.
    public void paint(Canvas canvas, int degrees){

        //Set x and y position based on the angle of the cannon of line 1.
        pX1 = 500f - (500f - (500f*((float)Math.cos(radians-.2))));
        pY1 = 1220f - (500f*((float)Math.sin(radians-.2)));

        //Set x and y position based on the angle of the cannon of line 1.
        pX2 = 500f - (500f - (500f*((float)Math.cos(radians+.2))));
        pY2 = 1220f - (500f*((float)Math.sin(radians+.2)));

        //Draw all of the lines that make up the cannon.
        canvas.drawLine(100, 1220, pX1, pY1, line);
        canvas.drawLine(0, 1120, pX2, pY2, line);
        canvas.drawLine(pX1, pY1, pX2, pY2, line);

        /**
         External Citation
         Date: 4 April 2017
         Problem: Needed to know how to draw objects.
         Resource:
         https://developer.android.com/reference/android/graphics/Canvas.html
         Solution: I looked up and used the methods from this source to do this.
         */
    }

    //Setter to set the angle of the cannon.
    public void setAngle(float degrees) {radians = (degrees*((float)Math.PI/180));}

}
