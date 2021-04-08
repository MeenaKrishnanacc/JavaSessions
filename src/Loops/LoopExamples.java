package Loops;

import java.util.Scanner;

public class LoopExamples {

    public static void main(String[] args) {
        //i = 0 to 100 0+1+2+3....100
        //Sum =
        int sum =0;
        for(int i=0;i<=100;i++){
            sum=sum+i;
        }
        System.out.println("Sum : "+ sum);


        /// GEt teh password ; repeate the step for 3 times if the password is wrong
        String password ;
        String correctPassword="JAVA";
        int i=1;
        do{
            System.out.println("Enter the password");
            Scanner sc = new Scanner(System.in);
            password = sc.next();
            i++;
        }while (!password.equals(correctPassword)&&i<=3);
    }
}
