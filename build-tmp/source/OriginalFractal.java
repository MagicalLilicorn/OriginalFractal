import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {


public void setup(){
    size(600,600);
    background(0,0,0);
}

public void draw(){
    cirCle(300, 300, 500);
}

public void cirCle(int x, int y, int w){
    if (w > 30){
        cirCle(x+w/4,y,w/2);
        cirCle(x-w/4,y,w/2);
        cirCle(x,y+w/4,w/2);
        cirCle(x,y-w/4,w/2);
     } 
    else {
        stroke(255,255,255);
        noFill();
        ellipse(x,y,w,w);
    }
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
