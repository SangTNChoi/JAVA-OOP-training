import java.util.Scanner;

class DIEM{
    public float x;
    public float y;

    public DIEM(){}

    public DIEM(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void nhap(Scanner scanner){
        System.out.println("enter x: ");
        this.x = Float.parseFloat(scanner.nextLine());
        System.out.println("enter y: ");
        this.y = Float.parseFloat(scanner.nextLine());
    }

    public void area(){
        System.out.print(x*y);
    }

}
public class Bai_1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DIEM point = new DIEM();
        point.nhap(scanner);

        point.area();
    }
}