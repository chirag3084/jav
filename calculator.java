package prac;


import java.util.Scanner;

public class r{
    public static void main(String[] args) {
        int x,y,sum,min,mul;
        char z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        x = sc.nextInt();


        System.out.println("Enter your second number : ");
        y = sc.nextInt();


        System.out.println("Enter your character : ");
        z = sc.next().charAt(0);

        sum = x + y;
        min = x - y;
        mul = x * y;

        switch (z){
            case '+':
                System.out.println("Your answer is : "+sum);
                break;
            case '-':
                System.out.println("Your answer is : "+min);
                break;
            case '*':
                System.out.println("Your answer is : "+mul);
                break;
        }









    }
}
