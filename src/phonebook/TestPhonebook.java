package phonebook;

import java.util.HashMap;

public class TestPhonebook {
    public static void main(String[] args) {
        HashMap<String, Integer> phonebook = new HashMap<>();

        phonebook.put("Моника", 731569);
        phonebook.put("Леонард", 731580);
        phonebook.put("Энтони", 731582);
        phonebook.put("Ричард", 731583);
        System.out.println(phonebook);
    }

}
