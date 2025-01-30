import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.print("Enter Number = ");
        int r = sc.nextInt();
        sc.close();
        System.out.println("Fibonacci Series:");
        int a = 0 ;
        int b =1;
        for(int i=0;i<r;i++){
            System.out.print(a + " ");
            int temp=a;
            a=b;
            b=temp+b;
        }

    }
    
}
