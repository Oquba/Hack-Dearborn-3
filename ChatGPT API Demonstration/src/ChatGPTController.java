import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ChatGPTController {
    static String apiKey = System.getenv("OPENAI_API_KEY");

    public static void initializeGPT() throws IOException, InterruptedException {
        var body = """
        {
            "model": "gpt-4o",
            "messages": [
                {
                    "role": "user",
                    "content": "You are to ask 3 questions. You are to take the user's inputs and base your next questions around that. With the given responses, determine the mood of the user. start with 'how are you currently feeling'"
                }
            ]
        }""";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.openai.com/v1/chat/completions"))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + apiKey)
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println(response.body());
    }
    public static void question(String q, int i) throws IOException, InterruptedException {
        String body = String.format("""
                {
                    "model": "gpt-4",
                    "messages": [
                        {
                            "role": "user",
                            "content": "%s"
                        }
                    ]
                }""", q + " Determine my current mood. Ask me " + 3 + " more questions to help me determine my mood, then show my mood");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.openai.com/v1/chat/completions"))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + apiKey)
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
