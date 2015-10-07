//////// Exercise x2:  modularize exercise x1, and add dog to chase hero.
//////// Drake  (CST 112; 9/16/15)

  String author=  "Drake";
  String title=  " Chasing Dog ";
  String help=  " Click to relocate hero \n 'q' to quit; 'r' to reset. ";


  //// GLOBALS:  coordinates, speed, etc.
  float horizon;
  float x, y;       // Position.
  float dx, dy;     // Speed.
  float dogX, dogY;
  float sunX, sunY;

  //// SETUP:  window size, initialization (start in middle of screen).
  void setup() {
  size( 700,700);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
  sunX=width*3/4;
  sunY=height/8;
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
background( 100,200,250 );                // sky
  fill( 255,255,0 );
  sunX= (sunX+1) % (width+150);
 
  ellipse( sunX,sunY, 40,40 );    // sun
  
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  triangle(550,150,600,150,575,100);
  fill(139,80,13);
  rect(568,150,15,25);
  
  
  fill(255,0,0);
  rect( 150,horizon, 120,horizon-50);  // house
  fill(139,80,13);
  rect(230,250,25,50);
  fill(0);
  triangle(150,horizon,271,horizon,210,90);
  fill(255);
  rect(165,200,30,30);
  rect(225,200,30,30);
  }

  void messages() {
  text( title, width/3, 20 );
  text( help, width*2/3, 30 );
  text( author, 10,height-20 );
  }

  //// ACTION:  move (x,y) coordinates of hero & dog; show them.
  void hero() {
  fill(50,80,150); 
  rect( x,y, 30,50 );
  fill(255,0,0);
  ellipse(x+15,y-11,20,20);  
  fill(255,255,0);
  stroke(255,255,0);          //Puppet Sting//
  line(x+15,y-11,350,80);  
  stroke(0);
  fill(255);
  text( "Jimmy", x,y+30 );
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
  //rect(dogX,dogY, 50,30 ); change shape of dog
  ellipse(dogX,dogY,50,30);
  /* INSERT YOUR CODE HERE! */
  text( "Arf,Arf!", dogX-20, dogY-20);
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
