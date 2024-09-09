package W13;

public class W13_03_Array_CountOddEven {
    public static void main(String[] args) {
        // ให้นับจำนวนเลขคู่และเลขคี่ใน array ด้านล่าง
        int [] numbers = {1, 2 , 32 , 41 , 58 , 65 , 72 , 89 , 91 , 13 , 31 , 35 , 1 , 79 ,5};
            
        int countOdd = 0;
        int countEven = 0;
        
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i] + "  ");
            if (numbers[i] % 2 == 0) {
                 countEven++;
            }else{
                countOdd++;
            }
            
        }
        System.out.print("\n Amount of all Number : " + numbers.length);
        System.out.print("\n Amount of odd Number : " + countOdd);
        System.out.print("\n Amount of Even Number : " + countEven);
        
    

        
    }
}
