package W13;
import java.util.Scanner;
public class W13_02_introArray {
    public static void main(String[] args){
        // ประกาศตัวแปรชนิด Array แบบที่ 2 - ไม่รู้จำนวนข้อมูลล่วงหน้า
        String [] brandCars = new String[3];
        
        Scanner kb = new Scanner(System.in);
        // กำหนดค่าให้กับ Array
        brandCars[0] = "Totota";
        brandCars[1] = "Honda";
        brandCars[2] = "Nissan";
        
          System.out.println("=============================================================");

        //แสดงผลลัพธ์โดยใช้ loop
        System.out.println("old Brand of cars in the array are");
        
        for  (int i = 0  ; i < brandCars.length  ; i++ ) {
            System.out.print(brandCars[i] + "  ");
            
        }
        System.out.println();
        System.out.println("=============================================================");

        //แกเไขค่าใน Array โดยรับค่าจากคีย์บอร์ด
        System.out.println("\n\nPlease enter the brand of the 3rd car:");
        for (int i = 0; i < brandCars.length ; i++) {
            System.out.println("Enter brand " + (i+1) + ": ");
            brandCars[i] = kb.next();


        }

        System.out.println();
        System.out.println("=============================================================");


        System.out.println("New Brand of cars in the array are");
        for  (String car : brandCars ) { // ใช้ for each-loop ใช้ลดรูป
            System.out.print(car + "  ");
            
        }
    }
    
}