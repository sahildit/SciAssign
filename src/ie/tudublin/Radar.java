package ie.tudublin;

import processing.core.PApplet;

public class Radar
{
    PApplet ui;

    public Radar(PApplet ui)
    {
        this.ui = ui;
    }

    public void render()
    {
        ui.ellipse(50,300,200,300);
        ui.ellipse(50,600,150,159);
    }
}