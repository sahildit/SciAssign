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
    }
}