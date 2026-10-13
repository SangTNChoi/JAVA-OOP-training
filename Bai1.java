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
        System.out.println("enter x and y: ");
        this.x = scanner.nextFloat();
        this.y = scanner.nextFloat();
    }
    public void get_DIEM(){
        System.out.println(x + " " + y);
    }
    public void di_chuyen(Scanner scanner){
        System.out.println("enter new position for x and y: ");
        x = scanner.nextFloat();
        y = scanner.nextFloat();
    }
}
public class Bai1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DIEM point = new DIEM();
        point.nhap(scanner);
        point.get_DIEM();
        point.di_chuyen(scanner);
        point.get_DIEM();

        scanner.close();
    }
}