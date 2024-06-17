package Junitproject.Junit;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringListUtils {


    public String concatenate(List<String> strings){
        if(strings.isEmpty()|| strings == null)return "Lista vacía";
        return String.join("",strings);
    }

    public  List<String> filterByPrefix(List<String> strings, String prefix){
        if(strings.isEmpty()|| prefix.equals(""))return null;

        else {
            List<String> value = strings.stream().filter(n-> n.startsWith(prefix)).toList();
            if(value.isEmpty()){
                return Collections.singletonList("No hizo match");
            }
            return value;
    }}

    public  List<String> toUpperCase(List<String> strings){
        if(strings.isEmpty()|| strings.equals(""))return null;
        List <String> value= strings.stream().map(String::toUpperCase).toList();
        return  value;
    }


}
