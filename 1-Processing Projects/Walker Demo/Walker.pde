class Walker {
    int x,y; //Position Variables
    int size;
    int speed;
    //Constructor
    Walker(int tempx, int tempy) {
        x = tempx;
        y = tempy;
        size = 25;
        speed = 25;

    }

    void display() {
        fill (0);
        rect(x,y,size,size); //rect(xpos, ypos, width, height)


    }

    void move(){

    }
}