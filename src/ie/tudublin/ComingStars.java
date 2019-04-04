package ie.tudublin;

import processing.core.PApplet;
public class ComingStars extends SpaceObject
{
    UI ui;
    
    public  ComingStars(UI ui)
    {
        this.ui = ui;
    }
    public void render()
    {
        float r = ui.random(0,1000);
        float w = ui.random(70,500);
        // it will increase the speed of star occuring on screen
        ui.fill(0,0);
        ui.rect(0,0,1000,799);
        ui.fill(255);
        ui.ellipse(r,w,7,7);
        ui.ellipse(r,w,7,7);
        ui.ellipse(r,w,7,7);
        ui.ellipse(r,w,7,7);
        ui.ellipse(r,w,7,7);
        ui.noStroke();
        

        
    }
    public void update()
    {
        ui.line(200,200,700,600);
     
    }
}