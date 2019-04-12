package ie.tudublin;

import processing.core.PApplet;

public class Rects
{
    float r, g, b, x, y, w, h;
    PApplet ui;

    public Rects(float r, float g, float b, float x, float y, float w, float h, PApplet ui)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.ui = ui;
    }

    public void drawRects()
    {
        ui.stroke(r, g, b);
        ui.rect(x, y, w, h);
        ui.noStroke();
    }
}
