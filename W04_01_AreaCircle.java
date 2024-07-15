import java.util.Scanner; // นำเข้าคลาส Scanner จาก package java.util
public class W04_01_AreaCircle{
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in); // สร้างอ็อบเจ็กต์ของคลาส Scanner
     System.out.print("ป้อนค่ารัศมีของวงกลม:"); //แสดงข้อความที่ให้ผู้ใช้ป้อนค่ารัศมี
     double radius = sc.nextDouble(); // รับค่ารัศทีจากผู้ใช้และเก็บในตัวแปร radius

    //    double radius; // ประกาศตัวแปรเก็บค่ารัศมี
    //    radius = 10; // กำหนดค่ารัศมีเป็น 10

       double area; // ประกาศตัวแปรเก็บค่าพื้นที่
       double PI = 3.14159; // ประกาศค่าคงที่ PI
    if(radius > 0){
    

    } else {

    }
       area = PI*radius*radius; // คำนวนพื้นที่ของวงกลม
       System.out.print("พื้นที่ของวงกลมมีรัศมี ="+radius+"คือ"+area);

    }
}