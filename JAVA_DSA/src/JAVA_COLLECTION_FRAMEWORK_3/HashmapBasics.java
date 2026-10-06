package JAVA_COLLECTION_FRAMEWORK_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapBasics {
    static void main(String[] args) {
        Map<String,String> mapping=new HashMap<>();

        //insertion
        mapping.put("in","india");
        mapping.put("us","united state");
        mapping.put("IR","Iran");
        mapping.put("UK","united Kingdom");

        System.out.println(mapping);

        Map<String,String> table= new HashMap<>();
        table.put("CH","china");
        table.put("RS","Russia");
        table.put("bz","Brazil");
        table.put("SA","south Africa");
        table.put("UAE","united Arab Emirates");

        System.out.println("Before:"+table);
        table.putAll(mapping);
        System.out.println("After:"+table);

        //deletion
        table.remove("bz");
        System.out.println(table);

        System.out.println(table.get("RS"));

        System.out.println(table.containsKey("bz"));

        System.out.println(table.containsValue("south Africa"));

        table.replace("us","America");
        System.out.println(table);

        //key set
        Set<String> keyset= table.keySet();
        System.out.println(keyset);

        //get all the entries from the map
        //entryset

        Set<Map.Entry<String,String>> entrySet= table.entrySet();
        System.out.println("printing Entires: " + entrySet);

        System.out.println(table.putIfAbsent("is","India3"));
        System.out.println(table);

        // System.out.println(table.size());
        // table.clear();
        // System.out.println(table.size());

    }
}
