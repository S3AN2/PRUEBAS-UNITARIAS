package Junitproject.Junit;

public class StringUtils {


public String reverse(String str) {
    String[] value = str.split("");
    int longitudCadena = value.length;
    int i;
    if(str.isEmpty()){
        return  "error cadena vacia";

    }
    else if (str.length()==1) {
        return  str;
    }
    for (i = 0; i < longitudCadena / 2; i++) {
        int dato=longitudCadena-i-1;
        String caracterFinal = value[dato];
        String caracterInicial = value[i];
        value[i] = caracterFinal;
        value[dato] = caracterInicial;
    }
    return String.join("", value);

}

        public boolean isPalindrome (String str){
            String valorRevertido=reverse(str);
            if (valorRevertido.equals(str)) return true;
            return false;
        }

        public Object countOccurrences (String str,char c){
            String [] arregloData= str.split("");

            int count=0;
            for (String resultado:arregloData){

                if(c ==  resultado.charAt(0)){
                count++;
                }

            }

            if(count<2){
                return "Sin ocurrencias";
            }
            return count;
        }
    }

