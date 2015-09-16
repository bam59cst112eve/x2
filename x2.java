//////// Exercise x2:  modularize exercise x1, and add dog to chase hero.
//////// Drake  (CST 112; 9/16/15)

String author=  "Drake";
String title=  " Chasing Square ";
String help=  " Click to relocate hero \n 'q' to quit; 'r' to reset. ";


//// GLOBALS:  coordinates, speed, etc.
float horizon;
float x, y;       // Position.
float dx, dy;     // Speed.
float dogX, dogY;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 700,700);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  scene();
  hero();
  dog();
  messages();
}

//// SCENE:  sky, sun, tree, house, etc.
void scene() {  
  /* INSERT YOUR CODE HERE! */    background( 200,255,255 );
  fill(0);
  /* REPLACE THIS STUB! */  text( "scene", 100, 100 );
}

void messages() {
  text( title, width/3, 20 );
  text( help, width*2/3, 30 );
  text( author, 10,height-20 );
}

//// ACTION:  move (x,y) coordinates of hero & dog; show them.
void hero() {
  /* INSERT YOUR CODE HERE! */
  /* REPLACE THIS STUB! */  text( "[[[[ Zoog. ]]]]", 200, 200 );
  rect( x,y, 50,80 );
  x=x+dx;
  if (x>width-50) dx=-dx;
  if (x<0) dx=-dx;
  y= y+dy;
  if (y<0 || y>height-80){ dy=-dy;}
}
void dog() {
  dogX=  dogX - (dogX-x)/30;
  dogY=  dogY - (dogY-y)/40;
  text( dogX, 10, 10 );
  text( dogY, 10, 20 );
  //
  fill( 150,0,0 );
  rect(dogX,dogY, 60,30 );
  /* INSERT YOUR CODE HERE! */
  /* REPLACE THIS STUB! */  text( "woof, woof!d!!", 150, 150 );
}

//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;         // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
  /* INSERT YOUR CODE HERE! */
}
