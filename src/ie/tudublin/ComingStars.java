package ie.tudublin;

import prcessing.core.PApplet;

public class ComingStars extends SpaceObject
{
    UI ui;

    public ComingStars(UI ui)
    {
        this.ui = ui;
    }
    
    public void render()
    {
        float r = ui.random(0,1000);
        float w = ui.random(0,799);
    }
}