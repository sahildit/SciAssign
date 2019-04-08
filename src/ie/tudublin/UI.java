package ie.tudublin;

import processing.core.PApplet;
import java.util.ArrayList;

import processing.data.Table;
import processing.data.TableRow;

import processing.core.PImage;

public class UI extends PApplet {
    int counter;
    PImage img;
    BarLoad loading;
    ComingStars stars;
    Radar r;
    Sketch s;
    Wave w;
    int mode = 0;
    LdTable l;
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
        w = new Wave(this,0);
        LdTable ldTable = new LdTable(this);
        
    }

    public void mousePressed()
    {
        if((mouseX > 150 && mouseX < 300) && (mouseY > 10 && mouseY < 40))
        {
            mode = 1;
        } else if((mouseX > 420 && mouseX < 570) && (mouseY > 10 && mouseY < 40))
        {
            mode = 0;
        }
        else if((mouseX > 700 && mouseX < 850) && (mouseY > 10 && mouseY < 40))
        {
            System.exit(0);
        }
    }


    public void draw()
    {
    
               
                    background(255);
                    stroke(255);
                    line(200, 200, mouseX, mouseY);
                    println(mouseX, mouseY);
                    noFill();
                    int k = loadbar(counter);
                    counter += 5;
                    
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
        if(mode == 0)
        {

            background(10);
            
            //l.render();
            //w.drawLineGraph();
            s.render();
            s.show();
        
            // // here have to put the method so that it will work after the loading screen 
            // r.render();
            // r.rotateLine();
        } else if(mode == 1)
        {
            background(10);
            
            //l.render();
            //w.drawLineGraph();
            s.render();
            s.show();
        
            // // here have to put the method so that it will work after the loading screen 
            r.render();
            r.rotateLine();
        }
       
      
        

    }

    

}