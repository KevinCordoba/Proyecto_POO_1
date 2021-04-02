import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadingJSON {
    @SuppressWarnings("unchecked")
    //public static void main(String[] args) {
        String ruta;
        ruta = System.getProperty("user.dir") + System.getProperty("file.separator") + "src" + System.getProperty("file.separator");
        String archivo;
        archivo = "principal.json";
        String ruta_completa = ruta + archivo;

        private static final Type REVIEW_TYPE = new TypeToken<List<Review>>() {
        }.getType();
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader(ruta_completa));
        List<Review> data = gson.fromJson(reader, REVIEW_TYPE);
        data.toScreen();
    //}
}