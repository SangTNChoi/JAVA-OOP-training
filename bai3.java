import java.util.Scanner;
class HINHTRON{
    public float r;

    public HINHTRON(){}
    public HINHTRON(float r){
        this.r = r;
    }
    public void nhap(Scanner scanner){
        System.out.println("enter a radius of the circle: ");
        this.r = scanner.nextFloat();
    }
    public Float getradius(){
        return this.r;
    }
    public void area(){
        System.out.println("area of the circle: " + Math.PI*Math.pow(r,2));
    }
    public void circumference(){
        System.out.println("circumference of the circle: " + 2*Math.PI*r);
    }
}
public class bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HINHTRON circle = new HINHTRON();
        circle.nhap(scanner);
        System.out.println("radius of the circle: " + circle.getradius());
        circle.area();
        circle.circumference();

        scanner.close();
    }
}
