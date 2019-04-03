package ie.tudublin;

import processing.core.PImage;
public class BarLoad extends SpaceObject
{
    UI ui;
    int counter;
    private PImage img;

    public BarLoad(UI ui)
    {
        this.ui = ui;
    }

    public void render()
    {
        img = ui.loadImage("planetImageResize.jpg");
        counter++;

        ui.rect(50,450,200,50);
        ui.image(img,0,0);
        update(counter);
        
        

    }
}