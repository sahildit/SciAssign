package ie.tudublin;

import processing.core.PApplet;

import processing.data.*;

public class Object
{
    PApplet ui;
    public Object(PApplet ui)
    {
        this.ui = ui;
    }

    public void drawObject(float x,float y,float r1,float r2,float n)
    {
        float angle = ui.TWO_PI / n;
        float halfAngle = angle/2;

        ui.beginShape();

        for(float i = 0; i< ui.TWO_PI; i += angle)
        {
            float sx  = x + ui.cos(i) * r2;
            float sy = y + ui.sin(i) * r1;
            ui.vertex(sx,sy);

            sx = x + ui.cos(i + halfAngle) * r1;
            sy = y + ui.sin(i + halfAngle) * r2;

            ui.vertex(sx,sy);
        }
        ui.endShape(ui.CLOSE);


    }
    public void draw()
    {
        ui.pushMatrix();
        ui.translate(ui.width / 2,ui.height /2);
        ui.rotate(ui.frameCount/200);
        drawObject(0,0,80,100,50);
        ui.popMatrix();

    }

   
}