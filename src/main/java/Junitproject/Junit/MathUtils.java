package Junitproject.Junit;

public class MathUtils {
    private int IllegalArgumentException;

    public int add(int a , int b){

        return  a+b;
    }


    public int substract(int a , int b){

        return  a-b;
    }

    public int multiply(int a , int b){

        return  a*b;
    }


    public int divide(int a , int b){
        if(b==0){
           throw new IllegalArgumentException("error");

        }
        
        return  a/b;
    }



}
