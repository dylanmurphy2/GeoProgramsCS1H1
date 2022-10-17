public class LoopPractice extends World {

    //Still choose 10 different shapes in different locations
    //draw 5 of the same random shape
    // each of those 5 should be a different random color

    public void go() {
        plane.pausetime = 0;
        // write a for loop that draws 10 different shapes in 10 random places
        for(int x = 0; x < 35; x = x + 1) {
            plane.teleport(plane.random(0,1000), plane.random(0,800));
            plane.setColor(plane.random(70,180), plane.random(100,125), plane.random(2,10));
            drawRandomShape();
        }
    }

    public void drawRandomShape() {

        // if/else statement
        int random = plane.random(0,5); //0,1,2 at random
        System.out.println(random);
        if (random == 0) {
            plane.trailWidth = 5;
            plane.square(100);
            plane.teleport(10,10);
        }
        if (random == 1) {
            plane.house(100);
        }
        if (random == 2); {
            plane.fillCircle(100);
        }
        if (random == 3);{
            plane.triangle(100);
        }
        if (random == 4);{
            plane.circle(100);
        }
    }
}
