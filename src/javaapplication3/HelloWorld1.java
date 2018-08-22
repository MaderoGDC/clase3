package javaapplication3;

import fisica.FBox;
import fisica.FCircle;
import fisica.FCompound;
import fisica.FWorld;
import fisica.Fisica;
import org.jbox2d.dynamics.World;
import processing.core.PApplet;
import processing.event.KeyEvent;

public class HelloWorld1 extends PApplet {

    public static void main(String[] args) {
        PApplet.main(HelloWorld1.class.getCanonicalName());
    }

    public void settings(){
        size(800, 600);
    }
    private FWorld world;
    private FCompound compound;
    
    public void setup(){
        Fisica.init(this); 
        world = new FWorld();
        world.setEdges();
        
        FCircle circle = new FCircle(50);
        circle.setPosition(width >> 1,10);
        circle.setRestitution(0.9f);
        world.add(circle);
        
        compound =  new FCompound();
        compound.setPosition(50, 50);
        
        FBox box = new FBox(5, 60);
        box.setPosition(0, 20);
        compound.addBody(box);
        
        circle = new FCircle(30);
        circle.setPosition(0,0);
        compound.addBody(circle);
        world.add(compound);
    }
    
    @Override
    public void keyPressed() {
        if (key == 'p') {
        FCircle circle = new FCircle(50);
        circle.setPosition(mouseX,mouseY);
        circle.setRestitution(0.9f);
        world.add(circle); 
        }
        
    }

    @Override
    public void keyPressed(KeyEvent event) {
        super.keyPressed(event); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public void draw(){
        background(0);
        int force = 30;
        if(keyPressed){
        switch(key){
            case 'w': 
                compound.addImpulse(0,-force);
                break;
            case 'a':
                compound.addImpulse(-force, 0);
                break;
            case 's': 
                compound.addImpulse(0,force);
                break;
            case 'd': 
                compound.addImpulse(force, 0);
                break;
            }
        }
        world.step();
        world.draw();
    }
    
    
    
    /*
    @Override
    public void mouseClicked() {
        FCircle circle = new FCircle(50);
        circle.setPosition(mouseX,mouseY);
        circle.setRestitution(0.9f);
        world.add(circle);
    }*/
}