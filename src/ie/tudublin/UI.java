package ie.tudublin;

import processing.core.PApplet;
import java.util.ArrayList;


import processing.core.PImage;

public class UI extends PApplet {
    int counter;
    PImage img;
    BarLoad loading;
    ComingStars stars;
    Radar r;
    Sketch s;
    Wave w;
    ArrayList<SpaceObject> items = new ArrayList<SpaceObject>();
    boolean[] keys = new boolean[1024];

    public void KeyPressed()
    { 
        keys[keyCode] = true;
    }

    public void KeyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean CheckKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }




    public void settings() {
        size(1000, 800);
    }

    public void setup() {
        stars = new ComingStars(this);
        items.add(stars);
        loading = new BarLoad(this);
        r = new Radar(this, 0, 1);
        s = new Sketch(this,0);
        w = new Wave(this,0,10,0,0.0f,70.0f,450.0f,0,0);
        
        
        
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
                    
                    
                        for(int i = items.size()-1; i>=0;i--)
                            {
                                SpaceObject j = items.get(i);
                                j.render();
                                
                        
                            }
                        stars.update();
                    }
            
                
                
                
       
        
        
    }
   
    public int loadbar(int inc)
    {
        
    img = loadImage("planetImageResize.jpg");
    
    
    rect(50,450,200,50);
    image(img,0,0);
    

    fill(255);
   
    //FONT font1 = new Font("SansSerif", Font.BOLD,20);
    textSize(25);
    textAlign(CENTER);
    text("PROJECT : AVENGERS ENDER GAME",400,200);
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
        background(10);
        s.render();
        w.render();
        // // here have to put the method so that it will work after the loading screen 
        r.render();
        r.rotateLine();
        

    }

    

}