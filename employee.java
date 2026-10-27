import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

abstract class NHANVIEN {
    protected String name;
    protected String id;

    public NHANVIEN() {
    }

    public NHANVIEN(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract int tinhluong();

    public void hienthithongtin() {
        System.out.println("name: " + name + "\n" + "id: " + id + "\n" + "luong: " + tinhluong());
    }
}

class Office_worker extends NHANVIEN {
    private int work_days;

    public Office_worker(String name, String id, int work_days) {
        super(name, id);
        this.work_days = work_days;
    }

    @Override
    public int tinhluong() {
        return work_days * 100000;
    }

    @Override
    public void hienthithongtin() {
        super.hienthithongtin();
        System.out.println("(nhan vien van phong)");
    }

}

class Production_worker extends NHANVIEN {
    private int products;
    private int base_salary;

    public Production_worker(String name, String id, int products, int base_salary) {
        super(name, id);
        this.products = products;
        this.base_salary = base_salary;
    }

    @Override
    public int tinhluong() {
        return base_salary + products * 5000;
    }

    @Override
    public void hienthithongtin() {
        super.hienthithongtin();
        System.out.println("(nhan vien san xuat)");
    }
}

public class employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<NHANVIEN> danhsach = new ArrayList<>();
        int n;
        System.out.println("nhap vao so nhan vien cho danh sach: ");
        n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; ++i) {
            System.out.println("nhap thong tin nv thu " + (i + 1) + ": ");
            String name;
            String id;
            System.out.print("nhap ho ten: ");
            name = scanner.nextLine();
            System.out.print("nhap id: ");
            id = scanner.nextLine();

            System.out.print("nhap loai nv (1: nv van phong. 2: nv san xuat): ");
            int type = Integer.parseInt(scanner.nextLine());

            if (type == 1) {
                System.out.println("nhap so ngay lam viec: ");
                int work_days = Integer.parseInt(scanner.nextLine());

                danhsach.add(new Office_worker(name, id, work_days));
                continue;
            }

            else if (type == 2) {
                int base_salary;
                int products;

                System.out.println("Nhap so san pham: ");
                products = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap luong can ban: ");
                base_salary = Integer.parseInt(scanner.nextLine());

                danhsach.add(new Production_worker(name, id, products, base_salary));
                continue;
            }
            
                System.out.println("loai nv khong hop le, bo qua nv nay.");

        }
        System.out.println("===============================");
        System.out.println("danh sach nhan vien: ");
        
        for(int i=0; i < n; ++i){
            danhsach.get(i).hienthithongtin();
        }

        scanner.close();
    }

}