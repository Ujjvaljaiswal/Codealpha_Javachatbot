


import java.util.HashMap;
import java.util.Map;

public class ChatBotBackend {
    private static final Map<String, String> responses = new HashMap<>();

    static {
        responses.put("hi", "Hello! How can I assist you?");
        responses.put("hello", "Hi there! Ask me anything.");
        responses.put("how are you", "I'm just code, but I'm doing great!");
        responses.put("bye", "Goodbye! Have a nice day!");
        responses.put("name", "I'm your simple Java chatbot.");
        responses.put("help", "You can ask me about weather, greetings, or say 'bye'.");
    }

    public static String getResponse(String input) {
        input = input.toLowerCase();
        for (String key : responses.keySet()) {
            if (input.contains(key)) {
                return responses.get(key);
            }
        }
        return "Sorry, I didn't understand that.";
    }
}
