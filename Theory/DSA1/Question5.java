import java.util.HashMap;
import java.util.Map;

public class Question5 {
    public static void main(String[] args) {

        HashMap<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);

        String lookupStudent = "Bob";
        if (studentGrades.containsKey(lookupStudent)) {
            System.out.println(lookupStudent + "'s grade: " + studentGrades.get(lookupStudent));
        } else {
            System.out.println(lookupStudent + " not found.");
        }

        String removeStudent = "Bob";
        studentGrades.remove(removeStudent);

        System.out.println("Remaining students:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
