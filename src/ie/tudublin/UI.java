package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;


public class UI extends PApplet
{
    int counter;
    PImage img;
    BarLoad loading;
    ComingStars stars;

    public void settings()
    {
        size(1000,800);
    }

    public void setup()
    {
        stars = new ComingStars(this);
        items.add(stars);
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
            for(int i = items.size()-1; i>=0;i--)
            {
                SpaceObject j =items.get(i);
            }
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