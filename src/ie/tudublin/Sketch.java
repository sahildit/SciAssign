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

    //     ui.beginShape();
    //     ui.fill(0);
    //     ui.strokeWeight(4);
    //     ui.vertex(ui.width,(ui.height/2)-40);
    //     ui.vertex(ui.width,(ui.height/2)+90);
    //     ui.vertex(ui.width-140,(ui.height/2)-40);
    //     ui.vertex(ui.width-140, (ui.height/2)+90);
    //     ui.vertex(ui.width-340,(ui.height/2)+240);
    //     ui.vertex(ui.width,ui.height);
    //     ui.endShape(ui.CLOSE);
    
    //     ui.createShape();
    //     ui.beginShape();
    //     ui.fill(0);
    //     ui.stroke(200);
    //     ui.strokeWeight(4);
    //     ui.vertex(ui.width-340,ui.height);
    //     ui.vertex(ui.width-340,(ui.height/2)+240);
    //     ui.vertex(290,(ui.height/2)+240);
    //     ui.vertex(290,ui.height);
    //     ui.endShape(ui.CLOSE);
            
            // for bottom part of ship
            ui.beginShape();
            ui.fill(199);
            ui.strokeWeight(3);
            ui.vertex(0, 500);
            ui.vertex(1000,500);
            ui.vertex(1000, 750);
            ui.vertex(0, 750);
            
            ui.endShape(ui.CLOSE);

            // for top part
            ui.beginShape();
            ui.strokeWeight(3);
            ui.vertex(0,0);
            ui.vertex(1000,0);
            ui.vertex(900,70);
            ui.vertex(100,70);
            
            ui.endShape(ui.CLOSE);
            //ui.stroke(255);


            // for little rectangle in the center
            ui.text("START",460,540);
            ui.beginShape();
            //ui.fill(255);
            ui.vertex(460,470);
            ui.vertex(540,470);
            ui.vertex(540,500);
            ui.vertex(460,500);
            ui.endShape(ui.CLOSE);

            // left part 
            ui.beginShape();
            ui.strokeWeight(3);
            ui.vertex(0, 20);
            ui.vertex(10,90);
            ui.vertex(100, 380);
            ui.vertex(0,480);
            ui.endShape(ui.CLOSE);


            // right part
            ui.beginShape();
            ui.strokeWeight(3);
            ui.vertex(1000, 20);
            ui.vertex(990, 90);
            ui.vertex(900, 380);
            ui.vertex(1000, 480);
            ui.endShape(ui.CLOSE);

        
    }
}