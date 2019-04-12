package ie.tudublin;

import java.awt.Stroke;
import java.util.Random;
import processing.data.*;


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

	

   public Wave(TableRow row) {
	}



void loadTable()
   {
        Object table = loadTable("Planets.csv", "header");
       
   }

    private Object loadTable(String string, String string2) {
        return null;
    }

    public void waverect()
    {
        // ui.fill(0);
        // ui.stroke(199,199,199);
        // ui.rect(600,610,155,130);
    }

    void render()
    {
        ui.fill(255);
        ui.rect(409,580,50,90);
        ui.rect(450,550,50,120);
    }

   
    public void draw()
    {
        
       

    }

}