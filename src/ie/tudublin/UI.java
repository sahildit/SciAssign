package ie.tudublin;

import processing.core.PApplet;
import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;

import processing.core.PImage;
import ddf.minim.*;


public class UI extends PApplet {
    Minim minim;
    // scifi is the name of the music
    AudioPlayer rocket2;
    int counter;
    PImage img;
    BarLoad loading;
    ComingStars stars;
    Radar r;
    Sketch s;
    Wave w;
    int mode = 0;
    LdTable l;
    Object o;
    ArrayList<SpaceObject> items = new ArrayList<SpaceObject>();
    ArrayList<LdTable> ldTables = new ArrayList<LdTable>();
    ArrayList<Wave> waves= new ArrayList<Wave>();

    Rects bar1, bar2, bar3;

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
        l = new LdTable(this,"f","g");
        o = new Object(this);
        bar1 = new Rects(0, 255, 0, 400, 580, 40, random(30, 100), this);
        // can't load data for my histogram
        //loadWaves();
        //printWaves();
        minim = new Minim(this);
        rocket2 = minim.loadFile("rocket2.wav");
    }

    // using for Waves( making histogram but can't)
    public void loadWaves()
	{
		Table table = loadTable("Planets.csv", "header");
        for(TableRow row : table.rows())
        {
            Wave wa = new Wave(row);
            waves.add(w);
        }

    }
    
    
    public void printWaves()
	{
		for(int i = 0; i < waves.size(); i++)
		{
            System.out.println(waves.get(i));
		}
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
    
                    rocket2.play();
                    //alien.rewind();

                    background(255);
                    stroke(255);
                    line(200, 200, mouseX, mouseY);
                    //println(mouseX, mouseY);
                    //text(mouseX, 800, 588);
                    noFill();
                    int k = loadbar(counter);
                    counter += 2;
                    
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
                    // bar1.drawRects();
                   
   
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
            
            l.render();
            
            s.render();
            s.show();
           
        
            // // here have to put the method so that it will work after the loading screen 
            // r.render();
            // r.rotateLine();
        } else if(mode == 1)
        {
            background(10);
            
           
            s.render();
            s.show();
        
            r.render();
            r.rotateLine();
            w.draw();
            o.draw();

        }
      
    }

}