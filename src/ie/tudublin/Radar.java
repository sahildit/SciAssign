package ie.tudublin;

import processing.core.PApplet;

public class Radar
{
    PApplet ui;
    float r;

    public Radar(PApplet ui)
    {
        this.ui = ui;
        this.r = r;
        
    }

    public void render()
    {
        ui.ellipse(100,600,200,200);
        ui.ellipse(100,600,150,150);
        ui.ellipse(100,600,150,150);
        ui.ellipse(100,600,50,50);

        ui.line(100,700,100,500);
        ui.line(0,600,200,600);
    }
    public void rotateLine(){

        ui.pushMatrix();
            ui.translate(100, 600);
            ui.rotate(ui.radians(r));
        ui.popMatrix();
    }
}