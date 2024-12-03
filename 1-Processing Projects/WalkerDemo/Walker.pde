class Walker {
    int x,y; //Position Variables
    int size;
    int speed;
    int cr, cg, cb;
    boolean npc; //Is this a computer


    //Constructor
    Walker(int tempx, int tempy, boolean tempnpc) {
        x = tempx;
        y = tempy;
        npc = tempnpc; // If true, automate!
        size = 25;
        speed = 10;
        cr = (int) random(0,255);
        cg = (int) random(0,255);
        cb = (int) random(0,255);
    }

    void display() {
        fill (cr,cb,cg);
        rect(x,y,size,size); //rect(xpos, ypos, width, height)


    }
    //dir var ----> 0 = up, 1 = right, 2 = down, 3 = left
    void move(int dir){
        // Computer Movement
        if (npc) {
            dir = (int)random(0,4);
           
        }

        //User Movement
        //move Up
        if (dir == 0) {
            y= y - speed;
        }
        // move right
        if (dir == 1) {
            x = x + speed;
        }
        // move down
        if (dir == 2) {
            y = y + speed;
            
        }
        //move left
        if (dir == 3) {
            x= x - speed;
            
        }
        

    }
}