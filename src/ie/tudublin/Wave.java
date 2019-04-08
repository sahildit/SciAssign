package ie.tudublin;

import java.awt.Stroke;
import java.util.Random;

import processing.core.PApplet;

public class Wave 
{
    PApplet ui;
    private float w;
    float[] PlanetsMass = {3,6,4,5,8,1,5,2};
    String[] Planets = {"Mercury","Mars","Venus","Earth","Uranus","Neptune","Saturn","Jupiter"};
    float[] fa = new float[2];
    int[] colors = new int[PlanetsMass.length];
    int i;


    public Wave(PApplet ui, int i) {
        this.ui = ui;
        this.i = i;
	}

	

    public void waverect()
    {
        // ui.fill(0);
        // ui.stroke(199,199,199);
        // ui.rect(600,610,155,130);
    }

    void drawLineGraph()
    {
        float x = ui.random(PlanetsMass.length);
        float gap = ui.width * 0.1f;
        ui.stroke(0);
       // ui.line(gap, gap, gap, ui.height - gap);
        //ui.line(gap, ui.height - gap, ui.width - gap, ui.height - gap);
        ui.rect(600,600,800,600);



        for(int i = 1 ; i < PlanetsMass.length ; i ++)
        {
            float x1 = ui.map(i - 1, 0, x - 1, gap, ui.width - gap); 
            float y1 = ui.map(PlanetsMass[i - 1], 0, 150, ui.height - gap, gap);
            float x2 = ui.map(i, 0, x - 1, gap, ui.width - gap); 
            float y2 = ui.map(PlanetsMass[i], 0, 150, ui.height - gap, gap);
            ui.line(x1, y1, x2, y2);            
        }
    }

   
    public void draw()
    {
        ui.background(0);

        drawLineGraph();

    }

}