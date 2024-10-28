package Test_674230019;
import java.util.Scanner;
public class S674230019_01_myTest{
    public static void main(String[] args){
      Scanner kb = new Scanner(System.in);
       System.out.print("ตรวจสอบว่าเป็นจำนวนเต็มลบเต็มบวก: ");
        int number = kb.nextInt();
        int result = number % 2;
        if(result > 0){
            System.out.print(number + " เต็มบวก");
        } else{
            System.out.print(number + " เต็มลบ");
        }

    }
  }