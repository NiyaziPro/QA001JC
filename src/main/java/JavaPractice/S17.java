package JavaPractice;

import java.util.*;

public class S17 {
    public static void main(String[] args) {

        /*Create a method that takes a Map<String, String> and
 return the values as a separate array. Return the keys sorted alphabetically, and their corresponding values in the same order.
 ex: getValues({ "a": "1", "b": "2", "c": "3" } )   ➞ ["1", "2", "3"]

 Map<String, String> alan bir yöntem oluşturun ve
 değerleri ayrı bir dizi olarak döndürün. Anahtarları alfabetik olarak
 sıralanmış olarak ve karşılık gelen değerlerini aynı sırada döndürün.

 */

        Map<String,String> myMap = new TreeMap<>();
        myMap.put("a","1");
        myMap.put("b","2");
        myMap.put("c","3");
        myMap.put("d","4");
        myMap.put("e","5");

        System.out.println(Arrays.toString(getValues(myMap)));

        printValues(myMap);

        printValues2(myMap);

        arrMethod(myMap);


    }
    public static void printValues(Map<String,String> myMap){
        System.out.print(myMap.keySet()+ " \n");

        System.out.print(myMap.values() + " \n");

    }

    public static void printValues2(Map<String,String> myMap){
        for (Map.Entry<String,String> entry : myMap.entrySet()){
            System.out.println("Key : "+entry.getKey()+ "  Values : "+entry.getValue() );
        }
    }

    public static void arrMethod(Map<String,String> myMap){
        String []arrkeys = new String[myMap.size()];
        Set<String>mySet = new TreeSet<>();


        for (Map.Entry<String,String> entry : myMap.entrySet()){

        }
        System.out.println(Arrays.toString(arrkeys));
    }

    public static String[] getValues(Map<String, String>map) {
        ArrayList sortKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortKeys);

        String[] values = new String[sortKeys.size()];

        for (int i = 0; i < sortKeys.size(); i++) {
            values[i] = map.get(sortKeys.get(i));
        }
        return values;
    }
}
