package phonebook;

import java.util.HashMap;

public class Phonebook {
    HashMap<String, Integer> phonebook = new HashMap<>();

    public Phonebook(HashMap<String, Integer> phonebook) {
        this.phonebook = phonebook;
    }
}
