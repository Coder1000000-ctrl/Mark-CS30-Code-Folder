// Walker Demo
// Intro to keyboard input for movement
Walker joe,alan,sally,tim,sandra;

void setup (){
    size(1500,700);
    joe = new Walker(width/2,height/2,false);
    alan = new Walker ((int)width/2 + 30, height / 2 -70,false);
    sally = new Walker ((int)random(0,width),(int)random(0,height) ,true);
    tim = new Walker ((int)random(0,width),(int)random(0,height) ,true);
    sandra = new Walker ((int)random(0,width),(int)random(0,height) ,true);
    
    
}
void draw(){
    background(255);
    joe.display();
    alan.display();
    sally.display();
    sally.move(0);
    tim.display();
    tim.move(0);
    sandra.display();
    sandra.move(0);

}

void mousePressed() {
    
}
void keyPressed(){
    // For arrows, use KeyCode and UP, DOWN, ENTER, etc...
    // For ACSII char's, use 'key' and 'a', 'w', etc...
    // joe/ arrow input
    if (keyCode == UP ){
        joe.move(0);
    }
    else if (keyCode == RIGHT) {
        joe.move(1);

    }
    else if (keyCode == DOWN) {
        joe.move(2);
        
    }
    else if (keyCode == LEFT) {
        joe.move(3);
        
    }

    // Alan /WASD input
    if (key == 'w' ){
        alan.move(0);
    }
    else if (key == 'd') {
        alan.move(1);

    }
    else if (key == 's') {
        alan.move(2);
        
    }
    else if (key == 'a') {
        alan.move(3);
        
    }

}