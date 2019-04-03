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
        //noStroke();
        noFill();
        int k = loadbar(counter);
        counter++;

    }

    public int loadbar()
    {
        img = loadImage("planetImageResize.jpg");
        rect(50,450,200,50);
        noStroke();
        

    }
}