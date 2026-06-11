public class IntentClassifier {

    public static String classify(String input) {

        input = input.toLowerCase();

        if(input.contains("price") || input.contains("cost")) {
            return "pricing";
        }

        if(input.contains("help") || input.contains("support")) {
            return "support";
        }

        return "general";
    }
}