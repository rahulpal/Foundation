import java.util.*;
public class SwapWithoutThirdVariable2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to be swapped :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("value of a = " + a + " and value of b = " + b + " before swapping" );
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("value of a = " + a + " and value of b = " + b + " after swapping" );
 }
}

/* Working 
Step 1: a = a ^ b

Now a holds a ^ b.
Step 2: b = a ^ b

so now b = (a ^ b)  ^  b   =  a ^ (b ^ b) =  a ^ 0 = a   because the property of bitwise exclusive OR (^) is that if same values are there the result is 0 and any value with 0 is the value itself

Step 3: a = a ^ b

Now a becomes: 
a = (a ^ b) ^ a = (a ^ b) ^ a = (a ^ a) ^ b = 0 ^ b = b   because of same property of bitwise exclusive OR (^)

This is how the values gets swapped 
 */
 