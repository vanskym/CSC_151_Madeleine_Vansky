package labs.example.gemini;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ChatBot {

    private static final String API_KEY = "AIzaSyCzRwhbeLPHkwW57MUrT_6ZMPqd-Wb5EBE";
    private static final String ENDPOINT = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent?key=" + API_KEY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Chatbot using Gemini 2.0 Flash API");
        System.out.println("-----------------------------------------");

        while (true) {
           
            String userInput = scanner.nextLine();

            if ("exit".equalsIgnoreCase(userInput)) {
                break;
            }

            try {
                String response = sendToGemini(userInput);
                System.out.println("Gemini: " + response);
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    public static String sendToGemini(String userText) throws IOException, URISyntaxException {
        URL url = new URI(ENDPOINT).toURL();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
       


        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        conn.setDoOutput(true);


        String jsonInput = "{\n" +
                "  \"contents\": [\n" +
                "    {\n" +
                "      \"parts\": [\n" +
                "        {\n" +
                "          \"text\": \"" + userText.replace("\"", "\\\"") + "\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        // Send request
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInput.getBytes(StandardCharsets.UTF_8);
            os.write(input);
        }

        // Read response
        int responseCode = conn.getResponseCode();
        InputStreamReader streamReader = new InputStreamReader(
                (responseCode < HttpURLConnection.HTTP_BAD_REQUEST) ?
                        conn.getInputStream() : conn.getErrorStream(),
                StandardCharsets.UTF_8);

        StringBuilder response = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(streamReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line.trim());
            }
        }

        conn.disconnect();

        String fullResponse = response.toString();
       

        return extractText(fullResponse);
    }


    private static String extractText(String json) {
        String pattern = "\"text\"\\s*:\\s*\"(.*?)\"";
        java.util.regex.Pattern regex = java.util.regex.Pattern.compile(pattern);
        java.util.regex.Matcher matcher = regex.matcher(json);
   
        if (matcher.find()) {
            String response = matcher.group(1);
            return response.replace("\\n", "").replace("\\\"", "\"");
        } else {
            return "[No response text found]";
        }
    }
   
    }
