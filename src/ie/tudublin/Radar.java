package ie.tudublin;

import processing.core.PApplet;

public class Radar
{
    PApplet ui;
    float r;
    float iAngle;

    public Radar(PApplet ui, float r, float iAngle)
    {
        this.ui = ui;
        this.r = r;
        this.iAngle = iAngle;
        
    }

    public void render()
    {
        float rwidth = ui.random(-50,50);
        float rheight = ui.random(0,50);

        ui.ellipse(100,600,200,200);
        ui.ellipse(100,600,150,150);
        ui.ellipse(100,600,150,150);
        ui.ellipse(100,600,50,50);

        ui.line(100,700,100,500);
        ui.line(0,600,200,600);
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