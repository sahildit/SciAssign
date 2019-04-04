package ie.tudublin;

import java.util.Random;
import java.util.*;
import processing.core.PApplet;
import java.lang.Math;
public class Radar
{
   PApplet ui;
   float r;
   float iAngle;
    public Radar(PApplet ui,float r,float iAngle)
    {
        this.ui = ui;
        this.r = r;
        this.iAngle = iAngle;
    }

    
    public void render()
    {
        float rwidth = ui.random(-50,50);
        float rheight = ui.random(0,50);
        
        // for changing the color of radar lines
        ui.stroke(100,200,0);
        ui.ellipse(100,600,200,200);
        ui.ellipse(100,600,150,150);
        ui.ellipse(100,600,100,100);
        ui.ellipse(100,600,50,50);
        ui.ellipse(100,600,rwidth,rheight);
        
        ui.line(100,700,100,500);
        ui.line(0,600,200,600);
        // line on the top of radar
        //ui.stroke(200);
        ui.line(0,500,1000,500);
        
    }   
   
    public void rotateLine(){
        
        ui.pushMatrix();
            ui.translate(100,600); //translates origin 0,0 to center of screen
            ui.rotate(ui.radians(r));
            Object width;
            //moving line
            ui.line(0,0,0,100); // 100 is radius i.e half the diamter 
            //ui.line(0,0,100*Math.cos(ui.radians(iAngle)),100*Math.sin(ui.radians(iAngle)));
            ui.popMatrix();
        // speed of rotating line 
        r += 2;

    }



}