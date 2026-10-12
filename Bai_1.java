class DIEM{
    public float x;
    public float y;

    public DIEM(float x, float y){
        this.x = x;
        this.y = y;
    }
    public void area(){
        System.out.print(x*y);
    }
}
public class Bai_1{
    public static void main(String[] args){
        DIEM point = new DIEM(5,2);
        point.area();
    }
}