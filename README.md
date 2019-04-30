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
* BarLoad - firstly, this class is responsible for making loading bar, which iterates an counter on rectangle and also it is sub-class of SpaceObject. Secondly, it has a background image which gives it massive impression.

* Object - This class is used to make two ( on left and right ) moving objects. For making them i used the math function and transform functions .


# What I am most proud of in the Assignment

# Markdown Tutorial

