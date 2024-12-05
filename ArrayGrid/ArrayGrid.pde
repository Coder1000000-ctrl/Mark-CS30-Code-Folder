grid g;
void setup () {
  size(1700,800);
 g = new grid(10,10);
  
}

void draw() {
  background(220);
  g.displayGrid();
  
  
}
void mousePressed() {
  g.click(mouseX, mouseY);
}

void keyPressed() {
  if ( key == 'c') {
    g.clear();
  }
  else if (key== '5') {
  g.five();
  }
  else if (key== 'a') {
  g.crissCross();
  }
  
  
}  
  
  
class grid {
  int ROWS, COLS;
  boolean[][] gridarray;

  // Constructor
grid (int tempr,int tempc)   {
    ROWS = tempr;
    COLS = tempc;
    gridarray = new boolean [ROWS][COLS];
    
    clear();
    
  }
 
  void displayGrid() {
    
  for (int y = 0; y<ROWS; y ++) {
      for (int x = 0; x < COLS; x++){
        if (gridarray[y][x] == false) {
        fill(255);
        }
        if (gridarray[y][x] == true) {
        fill(0);
        }
        
        
        int cellWidth = width/COLS;
        int cellHeight = height/ROWS;
        
        //Starts drawing from top left corner of Rectangle
        rect(x * cellWidth, y * cellHeight, cellWidth,cellHeight);
      }
    }
  }
  
  void click(int mx, int my){
    int cellWidth = width / COLS;
    int cellHeight = height / ROWS;
    
    int x  = mx / cellWidth;
    int y = my /cellHeight;
    
    if (gridarray[y][x] == false) {
    gridarray[y][x] = true; //make it true if it is false
    }
    else {
    gridarray[y][x] = false; //make it false if it is true
    }
    }
void clear () {
for (int y = 0; y<ROWS; y ++) {
      for (int x = 0; x < COLS; x++){
        gridarray [y][x] = false;
      }
    }
}
void five(){
for (int y = 0; y< ROWS; y++) {
 for (int x = 0; x< COLS; x++){
   //ONly activate if it is in row #5 or col# 5
   if (y ==5 || x==5) {
   gridarray[y][x] = true;
   }
   
 } 
}
  
}
void crissCross() {
for (int y = 0; y< ROWS; y++) {
 for (int x = 0; x< COLS; x++){
   //ONly activate if it is in row #5 or col# 5
   if (y %2 == 0 || x % 2==0) {
   gridarray[y][x] = true;
}
 }
 }
}
}
