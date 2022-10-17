
public class doritosColor extends World {
    public int red; // this is a variable of type integer
    public int blue;
    public int green;

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround(); // method
        System.out.println(plane.howMuchRed());

        for (int row = 2; row < 510; row = row + 1) {
            for (int col = 60; col < 446; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed(); // ex. 165
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);
                // if color is red, set pixel color to blue
                if (red < 130 && blue > 50) {
                    plane.setPixelColor(0, 100, 0);
                }
            }
        }

                for (int row = 31; row < 309; row = row + 1) {
                    for (int col = 107; col < 416; col++) {
                        plane.teleport(col, row);

                        red = plane.howMuchRed(); // ex. 165
                        green = plane.howMuchGreen();
                        blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);
                        // if color is red, set pixel color to blue
                        if (red > 100 && blue > 100) {
                            plane.setPixelColor(0, 148, 146);
                        }
                    }


        }
    }
}
