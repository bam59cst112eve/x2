//////// Exercise x2:  modularize exercise x1, and add dog to chase hero.
//////// Whoever Whoever  (CST 112; today's date?)

//////// Please change these to your name and today's date.
String author=  "Brian Salaway 09/30/2015";
String title=  " Dog Chasing Hero??? ";
String help=  " Click to relocate hero \n 'q' to quit; 'r' to reset. ";
//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of cow.
float dx, dy;     // Speed.
float horizon;
float a,b;        //dog
float da, db;     //speed of dog
float c; //dogs head
float dc;
float d; //dogs ears
float dd;
float e; //dogs tail
float de;
float f; //dogs eye
float df;

 
//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/2;
  x=  width/5;
  y=  height/2;
  dx=  5; //movement of cow
  dy=  2;
  a  =width/6; //dog location
  b  =height/2;
  c=a+20;
  d=c-2;
  e=a-25;
  f=c+3;
  

  
  da=1;
  db=-1;
  dc=da;
  dd=dc;
  de=da;
  df=dc;
  
  
  
  
  
}
 



//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, moon, tree, barn, etc.
  background( 50,50,200 );                // sky
  fill( 250 );
  ellipse( width*1/2, height/3, 100,100 );    // moon
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  triangle( 50,220, 65,100, 80,220  );  // tree
  triangle (81,220, 96, 95, 121, 220);  //tree
  triangle(410, 220, 430, 80, 440, 220); //tree
  
  fill (200, 20, 100);
  rect(63, 220, 5, 30);
  rect(94, 220, 5, 25);
   rect(428, 220, 5, 30); //tree trunks
  fill(0);
    triangle(500,200, 550,150, 600, 200);     //barn roof                                   
  
  fill (255,0,0);
   rect(500,200, 100,50); //barn
   fill (0); 
   rect (550, 220, 20, 30); //barn door
  
  fill (255);
   rect(490,250, 10,40);
   rect(420,250,10,40);
   rect(570,250,10,40);
   rect(630,250,10,40);
   rect(630,220,5,20);
   rect(490,220, 5,20);
   rect(420, 220, 5, 20);
   rect(415,220, 5, 50);
   rect(420, 225, 80, 3);
   rect(420, 235, 80, 3);
   rect(600, 225, 30,3);
   rect(600, 235, 30,3);
   rect(625, 220, 5, 50);
   rect(415, 255, 215, 5); 
   rect(415, 275, 215, 5); //fence
  
  
  
  fill(0);
                                            
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  a=a+da;
   b=b+db;
  c=c+dc;
  d=d+dd;
  e=e+de;
  f=f+df;
  
 if (b>=470){db=db*(-1);}
  if(b<=200){db=db*(-1);}  
  
  
  if (y<=height-470){dy=dy*(-1);} //gravity on cow
  
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  fill(255,255,255); rect( x,y, 80,50 );  /* REPLACE THIS WITH YOUR OWN CODE! */
  rect(x, y+50, 10, 40); //cow
  rect (x+70, y+50, 10,40);
  rect (x+70,y-30, 20, 30);
  ellipse(x+100, y-30, 60,30);
  triangle(x+90, y-45, x+105,y-55,x+110,y-45);
  triangle(x+70, y-40, x+85,y-50, x+90, y-40);
  fill (255, 255,155);
  rect (x+85, y-5, 10,20); //cowbell
  
 
  
 
  fill (0); ellipse(x+10,y+10, 20,10);
 fill (0); ellipse(x+20, y+40, 20, 10);
 fill (0); ellipse (x+60, y+20, 20, 10);
 ellipse(x+100, y-35, 10,5);
 ellipse (x+110, y-40, 7,5);
 line(x,y, x-20, y+50);
 
 fill(0,0,255);  
  text( "cow", x+40,y+40 );
 
fill (200, 100, 50); /////////////////dog
 ellipse (a, b,  40,20); //torso
  ellipse (c,b-10, 20, 10); //head
 rect(a-20, b+5, 3, 15); //leg 
 rect(a-12, b+5, 3, 15);//leg
 rect (a+5, b+5, 3, 15);//leg
 rect(a+12, b+5, 3, 15);//leg
 fill(0);
 ellipse (d, b-7, 4, 7); //ear
 
 ellipse (f,b-12, 2,2);//eye
 fill (200, 100, 50);
 
 ellipse (e,b+5, 35, 2); //tail


if(y>=height-150){dy=0;} //keeps cow from falling off screen

if(x>=(width*4/5)){dx=0;}

if(x>=(width*3/5)){a=(x+100);} {b=y+100;} 

 if(x>=(width*4/5)){dy=0;}
 
if (a>=(width*4/5)){c=a-20;}{d=c+2;}{e=a+25;}{f=c-3;}








}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  a=width/6; //dog location
  b=height/2;
  c=a+20;
  d=c-2;
  e=a-25;
  f=c+3;
 
  
  //
  dx=  random( +5 );                  // random speed.
  dy=  random( -10 );
}

void keyPressed() {
  if (key == 'q') 
    exit();                           // press 'q' key to QUIT.
  }





 
