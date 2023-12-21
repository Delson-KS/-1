import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;



public class Main {
    public static void divisionOfString(String XandYstring){

    }
    public static void main(String[] args) throws FileNotFoundException {
            File file = new File("/Users/kaiyrkeldi_sagitzan/CLionProjects/Delson/src/source.txt");
            Scanner read = new Scanner(file);
            Shape shape = new Shape();

            while (read.hasNext()) {
                String adress = read.next();
                String[] onlyXandY = adress.split(",");

                double x = Double.parseDouble(onlyXandY[0]);
                double y = Double.parseDouble(onlyXandY[1]);


                Point point = new Point(x, y);
                shape.addPoint(point);
            }
            System.out.println(shape.calculatePerimeter());
            System.out.println(shape.longestDistance());
        }
    }
