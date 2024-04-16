//package prac;
import java.util.Scanner;
public class student {
    String name;
    int marks;
    //System.out.println("")
    void details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the students");
         name = sc.nextLine();

        System.out.println("Enter the marks of the students");
        marks = sc.nextInt();
    }
    void display(){
        System.out.println("The name of the student is : "+ name);
        System.out.println("The marks of the student is :  "+ marks);
        }
    }
    
    public void main(String[] args) {
        student s1 = new student();
        s1.details();
        s1.display();

    }

