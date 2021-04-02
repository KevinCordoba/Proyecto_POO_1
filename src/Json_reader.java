import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.Iterator;

public class Leer_Json {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        String ruta;
        ruta = System.getProperty("user.dir") + System.getProperty("file.separator") + "src" + System.getProperty("file.separator");
        String archivo;
        archivo = "principal.json";
        String ruta_completa = ruta + archivo;
        System.out.println("Ruta:::" + ruta_completa);


        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(ruta_completa));

            JSONObject jsonObject = (JSONObject) obj;
            JSONArray companyList = (JSONArray) jsonObject.get("Company List");
            Iterator<JSONObject> iterator = companyList.iterator();

            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}