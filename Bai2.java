
import java.util.Scanner;
class HINHCHUNHAT{
    public float length;
    public float width;
//      CONSTUCTORS
    public HINHCHUNHAT(){}
    public HINHCHUNHAT(float length, float width){
        this.length = length;
        this.width = width;
    }
    // 
    public void nhap(Scanner scanner){
        System.out.print("enter a length and a width of the rectangle: ");
        this.length = scanner.nextFloat();
        this.width = scanner.nextFloat();
    }
    public Float getlength(){
        return this.length;
    }
    public Float getwidth(){
        return this.width;
    }
    public void area(){
        System.out.println("area of the rectangle: " + length*width);

    }
    public void perimeter(){
        System.out.println("perimeter of the rectangle: " + ((length+width)*2));
    }
}
public class Bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HINHCHUNHAT rec = new HINHCHUNHAT();
        rec.nhap(scanner);
        System.out.println("length and width: " + rec.getlength() + " " + rec.getwidth());
        rec.area();
        rec.perimeter();
        
        scanner.close();
    }
}
