Ball redball;

//Happens once at the launch
void setup() {
    size(1280,720);
    background(200, 200, 200);
    redball = new Ball(200, 200, 50);

    
}

// Happens constantly (screen refresh)
void draw() {
    background(200, 200, 200);
    redball.display();
    redball.move();

}
class Ball {
    int x, y, r;
    int dx, dy; //Speed or Velocity

    // Constructor
    Ball(int tempx, int tempy, int tempr) {
        x = tempx;
        y = tempy;
        r = tempr;
        dx = 3;
        dy = 3;
    }
    void display() {
        circle(x, y, r*2);

    }

    void move() {
        x = x+dx;
        y = y + dy;

        if(y >= height - r || y<= 0 + r) {
            dy = dy*-1;
    }
    if (x>=width-r || x<= 0 +r) {
        dx = dx*-1;
    }
    }

}