
void setup(){
    size(600,600);
    background(0,0,0);
}

void draw(){
    cirCle(300, 300, 500);
}

void cirCle(int x, int y, int w){
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

