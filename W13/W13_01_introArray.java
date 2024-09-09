package W13;

public class W13_01_introArray {

    public static void main(String[] args) {
        // ประกาศตัวแปรชนิด Array แบบที่ 1 - รู้จพนวนข้อมูลล้วงหน้า
        String[] colors = {"Purple", "Cuan", "Blue", "Green", "Yellow", "Orange", "Red"};
        
        int [] banks = {20,50,100,500,1000};
        char [] alphabet = {'A','B','C','D','E'};
System.out.println("=============================================================");

        // แสดงผลลัพธ์โดยใช้ index ของ Array
        System.out.println("The first color is " + colors[0]);

        System.out.println();
        System.out.println("=============================================================");

        System.out.println("The Third alohabet is " + alphabet[2]);

         System.out.println();
        System.out.println("=============================================================");
        //แสดงผลลัพธ์โดนใช้ Loop
        System.out.println("Colors in the array are");
        for (int i = 0 ; i < 7  ; i++ ) {
            System.out.print(colors[i] + "  ");  
        }
        System.out.println();
        System.out.println("=============================================================");
        for (int i = 6 ; i >= 0  ; i-- ) {
            System.out.print(colors[i] + "  ");   
         }
          System.out.println();
          System.out.println("=============================================================");
          System.out.println("Banks in the array are");
        for (int i = 0 ; i < banks.length  ; i++ ) { // ใช้ [ชื่อตัวแปร].length หาขนาด Array
            System.out.print(banks[i] + "  ");  
        }
    }
}