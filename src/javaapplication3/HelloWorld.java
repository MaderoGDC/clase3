package javaapplication3;

import processing.core.PApplet;

public class HelloWorld extends PApplet {

    public static void main(String[] args) {
        PApplet.main(HelloWorld.class.getCanonicalName());
    }
    
    @Override
    //tamaño de la ventana y D
    public void settings(){
        size(800, 600);
    }
    
    @Override
    //Se ejecuta una unica vez
    public void setup(){
        //67, 223, 216
    }
    private int i;
    private static final int NUM = 30;
    
    public void draw(){
        background(0);
        
        if(i %25 == 0){
        fill((i) % 255, (i << 1) % 255, random(0, 255));
        }
        
        translate(width >> 1, height >> 1);
        //scale(2,1);
               
        for (int j = 0; j < NUM; j++) {
            pushMatrix();
            rotate((2*PI*i + 100*j) /20);
            scale((1f-j/(float)NUM));
            ellipse(j*50,0, 50, 50);
            popMatrix();
        }
        i++;
    }

}