import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two values to be swapped :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("Value of a = " + a + " and value of b = " + b + " before swapping");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value of a = " + a + " and value of b = " + b + " after swapping");

    }
    
}
