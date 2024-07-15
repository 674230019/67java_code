import java.util.Scanner;
 public class  W05_01_ifElse_OddEvenNumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        int result = number % 2;
        
        // case 1
        // if(result == 1){
        //     System.out.print(number + " is an Odd number");
        // } else{
        //     System.out.print(number + " is an even number");
        // }
        
        // case 2
        // if(result == 1){
        //     System.out.print(number + " is an Odd number");
        // } else{
        //     System.out.print(number + " is an even number");
        // }
        
        // case 3
        if(result == 0){
            System.out.print(number + " is an even number");
        } else{
            System.out.print(number + " is an Odd number");
        }
        
        // //case 4
        // if(result != 1){
        //     System.out.print(number + " is an even number");
        // } else{
        //     System.out.print(number + " is an Odd number");
        // }
        
    

    }
 }
