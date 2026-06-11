import java.util.HashMap;
import java.util.Map;

public class ChatBotEngine {

    private static Map<String, String> faq = new HashMap<>();

    static {
        faq.put("hello", "Hi! How can I help you?");
        faq.put("how are you", "I'm functioning perfectly!");
        faq.put("what is java", "Java is a programming language.");
        faq.put("bye", "Goodbye! Have a nice day.");
    }

    public static String getResponse(String input) {

        input = input.toLowerCase();
        input = input.replaceAll("[^a-zA-Z ]", "");

        for(String key : faq.keySet()) {
            if(input.contains(key)) {
                return faq.get(key);
            }
        }

        return getSmartResponse(input);
    }

    public static String getSmartResponse(String input) {

        String intent = IntentClassifier.classify(input);

        switch(intent) {

            case "pricing":
                return "Our pricing starts at $10/month.";

            case "support":
                return "Please contact support@example.com.";

            default:
                return "Can you explain more?";
        }
    }
}