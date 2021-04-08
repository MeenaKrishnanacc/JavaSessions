package Loops;

public class ImplementNestedForLoops {

    //for loop within for loop

    public static void main(String[] args) {
        for(int i =0;i <=5;i++){ //i =0 , conditoon true ;  i = 1; true;
            for(int j =0;j<=5;j++){ //j = 0 , true j=1; true ; j =3 ; true ;j =4 ; true ; j = 5 ; true ; j = 6
                System.out.println("the value of i is : "+ i +"The value of J is : "+ j);
            }
        }
    }

}
