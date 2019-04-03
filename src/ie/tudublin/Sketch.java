package ie.tudublin;

import processing.core.PApplet;

public class Sketch
{
    private PApplet ui;
    float s;

    public Sketch(PApplet ui, float s)
    {
        this.ui = ui;
        this.s = s;
        
    }
    public void render()
    {
        ui.line(0,700,1000,300);
    }
}