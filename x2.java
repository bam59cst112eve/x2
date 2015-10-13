//////// Exercise x2:  modularize exercise x1, and add dog to chase hero.
//////// Justin Acosta  (CST 112; 9/23)
//

String author=  "Justin Acosta 9/23";
String title=  " Good Morning! ";
String help=  " Click to relocate hero \n 'q' to quit; 'r' to reset. ";


//// GLOBALS:  coordinates, speed, etc.
float horizon;
float x, y;       // Position.
float dx, dy;     // Speed.
float dogX, dogY;
float z;            //Sun Postion
int count;         // framecounter for animation

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
  z= width*3/4;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  count= count + 1;  //count increases by one on each frame.
  scene();
  hero();
  dog();
  messages();
  bounce();
  sunRise();
  
}

//// SCENE:  sky, sun, tree, house, etc.
void scene() {  
     z = z + 1;                 //Movement of sun

  stroke(0);
  strokeWeight(1);
  background( 60,100,z+110 );    // sky, sky changes with sun position

  // Sunlight and values
  if (count / 30 % 2 == 0){           //Sunlight Animation
  fill(255, 255, 255, 20);                      
  noStroke();
  ellipse(z, height/8, 140, 140);
  fill(255, 255, 255, 60);                    
  noStroke();
  ellipse(z, height/8, 90, 90);
  }else{
  }
  
  
  fill(255, 255, 255, 40);           //Sunlight Static
  noStroke();
  ellipse(z, height/8, 120, 120);
  fill(255, 255, 255, 60);                    
  noStroke();
  ellipse(z, height/8, 90, 90);    
  
  // Sun
  fill( 255,255,0 );
  ellipse( z, height/8, 60,60 ); 
  
   // The Suns's Eyes 
  stroke(0);
  fill(255);
  ellipse( z-12, height/8-2, 20, 10);
  ellipse( z+14, height/8-2, 20, 10);
  fill(0);
  ellipse( z-9, height/8-2, 10, 5);
  ellipse( z+17, height/8-2, 10, 5);

  // Suns' Smile
  fill(255,0,0);
  arc(z+1, height/8+8, 30, 30, HALF_PI/17, PI);
  
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      
  
  // Tree Trunk
  fill(#392707);                                         
  rect(horizon+25, horizon-30, 10, 30); 
  
  // Tree
  fill(100,200,100);
  triangle( horizon+10,horizon-25, horizon+35,horizon-100, horizon+50,horizon-25  );  // tree
  
   // House
  fill(200,50,50);
  rect(200, horizon-60, 80, 60);   
  fill(0);
  triangle(185, horizon-60, 245, horizon-90, 300, horizon-60); 
  fill(0);
  rect(245, horizon-30, 15, 30);
  
}
             
    void sunRise() {                                      
    if (z > width){          // Sunrise and Sunset
    z = 0;
  }                              
                                            
}


void messages() {
  textSize(10);
  text( title, width/3, 20 );
  text( help, width*2/3, 30 );
  textSize(20);
  text( author, 10,height-20 );
}

//// ACTION:  move (x,y) coordinates of hero & dog; show them.
void hero() {
  
   x=  x + dx;
   y=  y + dy;
  
  
  
  // Head of character
  fill(255,200,200);               // Head
  ellipse(x+15, y-15, 30, 30);
  
  fill(0);                         // Eyes
  ellipse(x+10, y-15, 5, 5);
  ellipse(x+23, y-15, 5, 5);

  // Body of character
  fill(255,0,0); 
  rect( x,y, 34,60 );
  textSize(11);
  fill(0);
  text( "Justin", x+2,y+15 );    // Name
  
  // Hat
  fill(0,0,255); 
  triangle(x, y-25, x+15, y-50, x+30, y-24);
  fill(#FFA703);
  ellipse(x+15, y-50, 10, 10);
  stroke(#FFA703);
  strokeWeight(2);
  line(x+4, y-32, x+27, y-28);
  line(x+6, y-37, x+26, y-33);
  line(x+8, y-42, x+22, y-39);
  
  
  // Arms
  stroke(255, 0, 0);
  strokeWeight(3);
  if (count / 30 % 2 == 0){                 //Arms Animation
  line(x, y, x-20, y-9);
  line(x+33, y, x+54, y-17);
  }else{
  line(x, y, x-10, y-19);
  line(x+33, y, x+44, y-27);
  }
  stroke(0);
  strokeWeight(1);
  
}

void bounce(){
  // Bouce off Walls
  if ( x > width - 30){
  dx = dx -1;
  }
  
  if ( x < 30){
    dx= dx +1;
  }
 
 
   if ( y > height - 30){
     dy = dy - 1;
   }
   
   if ( y < horizon){
   dy = dy + 1;
}
   
  
}
void dog() {
  dogX=  dogX - (dogX-x)/30;
  dogY=  dogY - (dogY-y)/40;
  text( dogX, 10, 10 );
  text( dogY, 10, 20 );
  //
  fill( 255 );
  rect(dogX,dogY, 60,30 );     //Dog Body
  rect(dogX-30, dogY-30, 40, 20);   /// Dog Head
  fill(0);                                  
  rect(dogX, dogY-30, 20, 40);               /// Dog Ear
  
  strokeWeight(6);
  stroke(255);
  if (count / 30 % 2 == 0){                    ///Dog Tail Animation
  line(dogX+60, dogY, dogX + 80, dogY - 30);   /// Dog Tail
  }else{
  line(dogX+60, dogY, dogX + 70, dogY - 35); 
  }
 
  strokeWeight(6);    // Dog Legs
  stroke(255);
                                              // Front Leg Animation
  if (count / 30 % 2 == 0){                   
  line(dogX, dogY+20, dogX-20, dogY+40);      //front legs
  line(dogX+20, dogY+20, dogX-10, dogY+50);   
  }else{
  line(dogX, dogY+20, dogX-30, dogY+30);      
  line(dogX+20, dogY+20, dogX-20, dogY+40); 
  }
  
  //Back Leg Animation
  if (count / 30 % 2 == 0){
  line(dogX+55, dogY + 5, dogX+60, dogY+50);  //back legs
  line(dogX+60, dogY + 5, dogX+ 45, dogY+50);
  }else{
  line(dogX+55, dogY + 5, dogX+80, dogY+45);  
  line(dogX+60, dogY + 5, dogX+65, dogY+45);
  }
  
  noStroke();                          ///Dog Spots
  fill(0);
  ellipse(dogX +30, dogY +20 , 7, 7);
  ellipse(dogX +47, dogY +10 , 10, 10);
  ellipse(dogX +30, dogY +5 , 8, 8);


  ellipse(dogX -30, dogY -28 , 9, 7);     // Dog Nose
  



  
  /* INSERT YOUR CODE HERE! */
  /* REPLACE THIS STUB! */  text( "woof, woof!d!!", 150, 150 );
}





//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
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
   
   
