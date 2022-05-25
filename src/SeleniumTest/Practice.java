package SeleniumTest;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        Map<String,String> myMap=new HashMap<>();
        myMap.put("Street" , "Patrick ST" );
        myMap.put("Suite" , "265");
        myMap.put("City" , "Vienna");
        myMap.put("Zip" , "22180");
        myMap.put("Country" , "United State");
// Advance for
       // for (Map.Entry<String,String> entry: myMap.entrySet()){
          //  System.out.println(entry.getValue().toUpperCase(Locale.ROOT));
      //  }
         myMap.forEach((key, value) ->
        System.out.println(value.toUpperCase(Locale.ROOT)));
    }
}