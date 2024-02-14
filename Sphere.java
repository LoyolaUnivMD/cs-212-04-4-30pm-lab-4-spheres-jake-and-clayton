
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

import java.util.Scanner;
public class Sphere {
    Scanner scan = new Scanner(System.in);
    private String name;
    private double xCoordinate;
    private double yCoordinate;
    private double zCoordinate;
    private double radius;


    public Sphere(String name, double xCoordinate, double yCoordinate, double zCoordinate, double radius){

        this.name = name;
        this.xCoordinate= xCoordinate;
        this.yCoordinate= yCoordinate;
        this.zCoordinate= zCoordinate;
        this.radius = radius;

    }
    public Sphere() {

        this.name = "Unknown";
        this.xCoordinate = 0;
        this.yCoordinate = 0;
        this.zCoordinate = 0;
        this.radius = 0;
    }
    public void calcArea(){
        double area = (4)*(Math.PI)*(radius*radius);
        System.out.println(area);
    }
    public void calcVolume(){
        double volume = 4.0/3.0*(Math.PI)*(radius*radius*radius);
        System.out.println(volume);
    }
    public void calcDistance(){
        System.out.println("X:");
        double x = scan.nextDouble();
        System.out.println("Y:");
        double y = scan.nextDouble();
        System.out.println("Z:");
        double z = scan.nextDouble();
        double distance= Math.sqrt(Math.pow((xCoordinate-x),2)+Math.pow((yCoordinate-y),2)+Math.pow((zCoordinate-z),2));
        System.out.println(distance);
    }
    public void collision(){
        
    }

}