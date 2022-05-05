import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OOPTest {
    public static void main(String[] args) throws IOException {
        OOPTest main = new OOPTest();
        main.selection();
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        File file = new File("users.json");
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    private static void menu() {
        System.out.println("""
                    [1]. suvesti duomenis
                    [2]. atspausdinti sarasa
                    [3]. baigti
                """);
    }

    private void selection() {
        Scanner scanner = new Scanner(System.in);
        EnterInfo service = new EnterInfo();
        String action;

        do {
            menu();
            action = scanner.nextLine();
            switch (action) {
                case "1" -> service.enterInfo(scanner);
                case "2" -> ;
                case "3" -> System.out.println("Programa baigta");
                default -> System.out.println("Tokio veiksmo nera");
            }
        } while (!action.equals("3"));
    }

}

