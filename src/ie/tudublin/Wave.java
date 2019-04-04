package ie.tudublin;

import processing.core.PApplet;

public class Wave 
{
    PApplet ui;
    private float w;
    float[] PlanetsMass = {3,6,4,5,8,1,5,2};
    String[] Planets = {"Mercury","Mars","Venus","Earth","Uranus","Neptune","Saturn","Jupiter"};
    float[] fa = new float[2];
    int[] colors = new int[Planets.length];


    public Wave(PApplet ui,float w)
    {
        this.ui = ui;
        this.w = w;
    }
    
    // place where wave gonna be
    public void WaveSketch()
    {
        ui.noStroke();
        ui.rect(650, 510, 1000, 700);
    }
	public void render()
    {

    }
}