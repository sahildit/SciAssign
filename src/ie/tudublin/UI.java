package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;


public class UI extends PApplet
{
    int counter;
    PImage img;
    BarLoad loading;

    public void settings()
    {
        size(1000,800);
    }

    public void setup()
    {
        loading = new BarLoad(this);
        
    }

    public void draw()
    {
        background(255);
        
        noFill();
        int k = loadbar(counter);
        counter++;

        if(k>=200)
        {
            clearScreen();
        }

    }

    public int loadbar(int inc)
    {
        img = loadImage("planetImageResize.jpg");
        rect(50,450,200,50);
        image(img,0,0);        

        // ask bryan in class 
        
        text("PROJECT : SECRET DOJO",400,200);
        stroke(0,255,255);

        if(inc<200)
        {
            fill(0);
            rect(50,450,inc,50);
            stroke(200);
        }
        if(inc>=200)
        {
            fill(0);
            rect(50,450,200,50);
            return inc;
        }
        return inc;
        
        
    }
    public void clearScreen()
    {
        background(0);
    }
}