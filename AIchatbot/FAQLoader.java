import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FAQLoader {

    public static JSONArray loadFAQs() throws Exception {

        String content = new String(
                Files.readAllBytes(Paths.get("faq.json"))
        );

        return new JSONArray(content);
    }
}