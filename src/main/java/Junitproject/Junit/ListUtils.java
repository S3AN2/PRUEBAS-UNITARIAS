package Junitproject.Junit;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;


public class ListUtils {

    public   int sum(List<Integer> numbers) {
        int suma=0;
        if(numbers==null||numbers.isEmpty()){
            return 0;
        }
        for(int number: numbers){
             suma=suma+number;
        }
        return suma;
    }


    public   int max(List<Integer> numbers) {

        if(numbers==null || numbers.isEmpty()){
            return -1;
        }
          OptionalInt valueMax=      numbers.stream().mapToInt(n->n).max();

        return valueMax.isPresent()?valueMax.getAsInt():-1;
    }


    public   int min(List<Integer> numbers) {
        if(numbers==null|| numbers.isEmpty())return -1;
        OptionalInt valuemin= numbers.stream().mapToInt(Integer::intValue).min();

        return valuemin.isPresent()?valuemin.getAsInt():-1;
    }


    public   double average(List<Integer> numbers) {
        if(numbers==null|| numbers.isEmpty())return -1;
        OptionalDouble valueAverage=numbers.stream().mapToInt(n->n).average();

        return valueAverage.isPresent()? valueAverage.getAsDouble() : -1;
    }
}
