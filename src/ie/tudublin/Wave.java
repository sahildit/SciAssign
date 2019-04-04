package ie.tudublin;

import processing.core.PApplet;

public class Wave 
{
    PApplet ui;
    float w;
    int space = 10; // space between waves
    int width; // of wave
    float theta = 0.0f;
    float height = 70.0f; // height of wave
    float pixels = 450.0f; // period when wave repeats
    float dx; // used for incrementng
    float[] yVal; // store height

    public Wave(PApplet ui, float w, int space, int width, float theta, float height, float pixels,float dx,
            float[] i)
    {
        this.ui = ui;
        this.w = w;
        this.space = space;
        this.width = width;
        this.theta = theta;
        this.height = height;
        this.pixels = pixels;
        this.dx = dx;
        this.yVal = i;
        
        
    }

	public Wave(UI ui2, int w2, int space2, int width2, float theta2, float height2, float pixels2, int dx2, int i) {
	}

	public void render()
    {

    }
}