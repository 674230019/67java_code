package Test_674230019;
import java.util.Scanner;
public class S674230019_03_myTest {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("กรุณาใส่เลขจำนวนเต็มมา 4 ค่า ");
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        int num3 = kb.nextInt();
        int num4 = kb.nextInt();
        if (num1 > num2 && num1 > num3 && num1 > num4){
            System.out.println("ค่าที่มากที่สุดคือ: " + num1);
        }else if (num2 > num1 && num2 > num3 && num2 > num4) {
            System.out.println("ค่าที่มากที่สุดคือ: " + num2);
        }else if (num3 > num1 && num3 > num2 && num3 > num4) {
            System.out.println("ค่าที่มากที่สุดคือ: " + num3);
        }else if (num4 > num1 && num4 > num2 && num4 > num3) {
            System.out.println("ค่าที่มากที่สุดคือ: " + num4);
        }
    }
}
