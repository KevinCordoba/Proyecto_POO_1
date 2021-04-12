
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Leer_Json{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("principal.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);

            //Iterate over employee array
            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseEmployeeObject(JSONObject employee) {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("plato_fuerte");

        //Get namae
        String name = (String) employeeObject.get("nombre");
        System.out.println(name);

        //Get precio
        long price_tag = ((Number) employeeObject.get("precio")).longValue();
        System.out.println(price_tag);

        //Get Duracion
        long time = ((Number) employeeObject.get("Duracion")).longValue();
        System.out.println(time);

        //Get tamanno
        String portion_size = (String) employeeObject.get("tamanno");
        System.out.println(portion_size);
    }
}