/** Programmers:  [your names here]
* Course:  CS 212
* Due Date:
* Lab Assignment:
* Problem Statement:
* Data In:
* Data Out:
* Credits: [Is your code based on an example in the book, in class, or something else?
*            Reminder: you should never take code from the Internet or another person
*/

class Main {
    public static void main(String[] args) {
        System.out.println("Music of the Spheres");

    }
    public class Spheres {
        private String name;
        private double xCoordinate;
        private double yCoordinate;
        private double zCoordinate;
        private double radius;
    }

    public Spheres(String name, double xCoordinate, double yCoordinate, double zCoordinate, double radius){

        this.name = name;
        this.xCoordinate= xCoordinate;
        this.yCoordinate= yCoordinate;
        this.zCoordinate= zCoordinate;
        this.radius = radius;

    }
    public Spheres(){
        this.name = "Unknown";
        this.xCoordinate= 0;
        this.yCoordinate= 0;
        this.zCoordinate= 0;
        this.radius = 0;
    }
}
