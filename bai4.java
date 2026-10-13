import java.util.Scanner;
class SINHVIEN{
    public String mssv;
    public String name;
    public String lop;
    public Float diem1;
    public Float diem2;
    public Float diem3;

    public SINHVIEN(){}
    public SINHVIEN(String mssv, String name, String lop, Float diem1, Float diem2, Float diem3){
        this.mssv = mssv;
        this.name = name;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public void nhap(Scanner scanner){
        System.out.println("nhap mssv, ho va ten, lop: ");
        this.mssv = scanner.nextLine();
        this.name = scanner.nextLine();
        this.lop = scanner.nextLine();
        System.out.println("nhap diem1, diem 2, diem3: ");
        this.diem1 = scanner.nextFloat();
        this.diem2 = scanner.nextFloat();
        this.diem3 = scanner.nextFloat();
    }
    public String getmssv(){
        return this.mssv;
    }
    public String getname(){
        return this.name;
    }
    public String getlop(){
        return this.lop;
    }
    public Float diemtrungbinh(){
        float med = (diem1 + diem2 + diem3) / 3;
        return med;
    }
    public void xeploai(){
        if(this.diemtrungbinh() <= 2 ){
            System.out.print("hoc sinh yeu.");
            return;
        }
        else if(this.diemtrungbinh() < 6){
            System.out.print("hoc sinh trung binh");
            return;
        }
        else if(this.diemtrungbinh() < 8.5){
            System.out.print("hoc sinh kha.");
            return;
        }
            System.out.print("hoc sinh gioi.");
    }

}
public class bai4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SINHVIEN sv = new SINHVIEN();
        sv.nhap(scanner);
        System.out.println("mssv: " + sv.getmssv());
        System.out.println("ho va ten: " + sv.getname());
        System.out.println("lop: " + sv.getlop());
        System.out.println("diem trung binh: " + sv.diemtrungbinh());
        sv.xeploai();
        scanner.close();
    }
}
