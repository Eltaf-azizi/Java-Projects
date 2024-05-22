import java.util.HashMap;

public class MapandHashMap {
    public static void main(String a[]){
        
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12347);
        empIds.put("Carl", 97987);
        empIds.put("Jerry", 97889);

        System.out.println(empIds);

        System.out.println(empIds.get("Carl"));

        System.out.println(empIds.containsKey("George"));

        System.out.println(empIds.containsValue(8978497));

        empIds.put("John", 72989);
        System.out.println(empIds);

        empIds.replace("Kramer", 777);
        System.out.println(empIds);

        empIds.putIfAbsent("Steve", 222);
        System.out.println(empIds);

        empIds.remove("Steve");
    }
}
