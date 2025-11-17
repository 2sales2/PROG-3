package Exercicio1;

import java.lang.ArithmeticException ;
public class To_divide {
    public static void to_divide(int a ,int b){
        int result = 0;
        try{
            result = a / b ;
            System.out.println(a+"/"+b+" = "+result);
        }catch (ArithmeticException arithmeticException){
            System.out.println("It is not possible to divide a number by zero !!");
        }
    }

}
