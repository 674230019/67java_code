package W12;

public class W12_01_WhileTrue {
    public static void main(String[] args) {
        // กำหนดค่าเริ่มต้น
        int i = 0;
        while (true) { 
            i++;                       // แสดงข้อความพร้อมกับค่า i
            System.out.print(i+" ");  //แสดงค่า i
         
            if(i>=1000){              // ตรวจสอบเงื่อนไข ถ้ารอบมากกว่าหรือเท่ากับ 1000 ให้ออกจากลูป
             break;                 // ออกจากลูป
           }
           
        // if(i>=1000) break;           //เขียนลดรูปให้สั้นลง

        }                               
                                        
            

    }
}