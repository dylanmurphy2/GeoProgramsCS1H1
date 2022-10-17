public class WrapupProject extends World {
    public int red; // this is a variable of type integer
    public int blue;
    public int green;

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        plane.isTrail = true;
        plane.pausetime = 0;
        plane.teleport(0, 0);
        plane.trailWidth = 10;
        scene();
    }

    public void scene() {
        for (int y = 0; y < 1; y = y + 2) {
            plane.teleport(422, 346);
            plane.circle(40);

            for (int x = 0; x < 1; x = x + 1) {
                plane.startingAngle(50);
                plane.teleport(520, 270);
                plane.triangle(70);
            }

            for (int x = 0; x < 1; x = x + 1) {
                plane.startingAngle(190);
                plane.teleport(450, 270);
                plane.triangle(70);
            }

            {
                plane.teleport(412, 336);
                plane.startingAngle(180);
                plane.move(200);
                plane.turn(90);
                plane.move(75);
                plane.turn(90);
                plane.move(240);
                plane.turn(270);
                plane.move(50);
            }
            for (int x = 0; x < 1; x = x + 1) {
                plane.startingAngle(90);
                plane.teleport(247, 418);
                plane.move(50);
            }
            for (int row = 5; row < 164; row = row + 1) {
                for (int col = 40; col < 722; col++) {
                    plane.teleport(col, row);

                    red = plane.howMuchRed(); // ex. 165
                    green = plane.howMuchGreen();
                    blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);
                    // if color is red, set pixel color to blue
                    if (red > 250 && blue > 250 && green > 250) {
                        plane.setPixelColor(0, 148, 146);
                    }
                }
            }
        }
    }
}