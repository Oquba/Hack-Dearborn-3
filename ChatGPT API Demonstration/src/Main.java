import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ChatGPTController.initializeGPT();
        for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine();
            ChatGPTController.question(input, i);
        }
    }
}
