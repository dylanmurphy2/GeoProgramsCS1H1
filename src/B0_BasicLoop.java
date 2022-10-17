public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.pausetime = 0;
        plane.teleport(0,0);
        plane.trailWidth=10;
        scene();



 //       squareRow();
     //   grid();

        //int squareSize = 100;
        //grid2Loops(squareSize);
    }
    public void scene(){
        for (int y = 0; y < 7; y = y + 1){
            plane.teleport(y*100,500);
            plane.square(100);

            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));

        }
        for (int y = 0; y < 7; y = y + 1){
            plane.teleport(y*100,300);
            plane.triangle(100);

            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));




        }
        for (int y = 0; y < 7; y = y + 1){
            plane.teleport(y*100,100);
            plane.circle(100);
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));


        }
    }

    public void grid2Loops(int squareSize) {
        for (int y = 0; y < 7; y = y + 1) {
            for (int x = 0; x < 10; x = x + 1) {
                plane.trailWidth = plane.random(2,15);
                plane.setColor(plane.random(70,180),plane.random(100,125), plane.random(2,10));
                plane.teleport(x * squareSize, y*squareSize);
                System.out.println(x);
                plane.square(squareSize);
            }
        }
    }
    public void squareRow(int y) {
        for (int x = 0; x < 10; x = x + 1) {
            plane.setColor(200,y*30,x*20);
            plane.teleport(x * 100,y*100);
            System.out.println(x);
            plane.square(100);
        }
    }
    public void grid() {
        for (int y = 0; y < 7; y = y + 1) {
            squareRow(y*100);
        }
    }
}
