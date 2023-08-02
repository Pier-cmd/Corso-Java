import com.google.gson.Gson;
import persona.Persona;

import java.io.FileWriter;
import java.io.IOException;

public class SerializationExample {
    public static void main(String[] args) {

        Persona persona = new Persona("Alice", 30, "CiaoS");

        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("persona.json")) {
            gson.toJson(persona, writer);
            System.out.println("Serializzazione in JSON completata");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
