# OOP Assignment
================

# Space Ship

Name : Sahil Sahil

Student Number : D17124269

Youtube Link: 

# Description of the Assignment

This assignment is about to create the user interface for sci-fi idea which can be used in any sci-fi movie. It was done in language called java and processing. My User Interface is Space Ship control panel and this idea came from Avengers (Ender's Game) when iron man is stuck in ship. So, then i decided to make interface like that but mine is slightely different. Through this assignment i learnt alot not only how to code and improve skills but also how to work/manage time under pressure ( as we were having other assignments at the same time).

# Instructions 

The User must compile and run the program, the screen ( first screen) will be displayed which has background image of space and an loading bar. 
When loading bar gonna finish it will prompt the user to new screen and that's my main screen. The main screen contains Three buttons. First, an Launch button which will launch the features of ship, Second, Shutdown button will make features stop working and Third, Exit button will close the program and brings user to git again if he/she wants to start all over again.

### 3 Buttons on Top from Left to right which are :

* Launch button
* ShutDown button
* Exit button

# How it works

In Total i created 11 classes for my program to work which are:

* LdTable - Loads table from csv file. 

* Main - It is used to execute the UI class.

* SpaceObject - It is an Abstract class

* ComingStars - this class is used for displaying random stars on the screen.

```
 public  ComingStars(UI ui)
    {
        this.ui = ui;
    }
    public void render()
    {
        float r = ui.random(0,1000);
        float w = ui.random(70,500);

```
* BarLoad - Firstly, this class is responsible for making loading bar, which iterates an counter on rectangle and also it is sub-class of SpaceObject. Secondly, it has a background image which gives it massive impression.

* Object - This class is used to make two ( on left and right ) moving objects. For making them i used the math function and transform functions . Here is the example of push and popo matrix :

```
public void draw()
    {
        // for left object 
        ui.pushMatrix();
        ui.translate(40,350);
        ui.rotate(ui.frameCount/200);
        drawObject(0,0,20,30,50);
        ui.popMatrix();


        // for right object
        ui.pushMatrix();
        ui.translate(960,350);
        ui.rotate(ui.frameCount/200);
        drawObject(0,0,20,30,50);
        ui.popMatrix();

    }

```
* Radar - This class make an Radar, in which i used maths function and also made an cool thing in the middle of radar.

* Rects - I was using this class before, so now it doesn't do anything suspicious.

* Sketch - This class is basically used for making the interior sketch of space ship using different functions.

```
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

```

* UI - This class contains lots of stuff so i am gonna tell u about few common things which includes :
```
.:

 variables and inialize them

 declare Arrays and Arraylists

 loading sound files and load table from csv file

 used KeyPressed() and checkkey() functions

 loops, methods

 ```
Here is the exmaple from code

 ```
  public void mousePressed()
    {
        if((mouseX > 150 && mouseX < 300) && (mouseY > 10 && mouseY < 40))
        {
            mode = 1;
        } else if((mouseX > 420 && mouseX < 570) && (mouseY > 10 && mouseY < 40))
        {
            mode = 0;
        }
        else if((mouseX > 700 && mouseX < 850) && (mouseY > 10 && mouseY < 40))
        {
            System.exit(0);
        }
    }


    public void draw()
    {
    
                    rocket2.play();
                    //alien.rewind();

                    background(255);
                    stroke(255);
                    line(200, 200, mouseX, mouseY);
                    println(mouseX, mouseY);
                    noFill();
                    int k = loadbar(counter);
                    counter += 2;
                    
                    if(k>=200)
                    {
                        clearScreen();
                    
                    
                        for(int i = items.size()-1; i>=0;i--)
                            {
                                SpaceObject j = items.get(i);
                                j.render();
                                
                        
                            }
                        stars.update();
                    }
                    // bar1.drawRects();
                   
   
    }

 ```

# What I am most proud of in the Assignment

# Markdown Tutorial

## Interactive ( Buttons)

There are 3 buttons 

* Launch = Start various features like start radar,histogram,etc.

* Shutdown = This button will turn off many functions as discussed above.

* Exit =  Close the program.

![An image](image/buttons.PNG)

```
 public void mousePressed()
    {
        if((mouseX > 150 && mouseX < 300) && (mouseY > 10 && mouseY < 40))
        {
            mode = 1;
        } else if((mouseX > 420 && mouseX < 570) && (mouseY > 10 && mouseY < 40))
        {
            mode = 0;
        }
        else if((mouseX > 700 && mouseX < 850) && (mouseY > 10 && mouseY < 40))
        {
            System.exit(0);
        }
    }

```
* Them both are in different classes and also i want to mention that i couldn't do that using math function so have to hard code. 
```
  ui.rect(150,10,150,30); //x,y,width,height
            ui.rect(700,10,150,30);
            ui.rect(420, 10, 150, 30); 
            ui.fill(255);   
            ui.stroke(255);
            ui.textAlign(PApplet.CENTER,PApplet.CENTER);
            ui.text("LAUNCH",225,23);
            ui.text("ShutDown",490,23);
            ui.text("EXIT",770,23);

```


