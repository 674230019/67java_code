package Test_674230019;

public class S674230019_02_myTest {
    public static void main(String[] args) {
        int sum = 0;
        for (int j=1 ; j<=6 ; j++ ) {
            System.out.print(j+" ");
            if(j<6){
                System.out.print("+");
            }
            System.out.print(" ");
            sum = sum+j; 
        }            
        System.out.println(" = "+sum);
    }
}
