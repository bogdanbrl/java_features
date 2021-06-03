import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Double "B"
 * @created 12/04/2021 - 6:15 PM
 * @project ReadWriteJSON
 */
public class ReadJSON {

    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();

        try(FileReader reader = new FileReader("employees.json")){

            //read json file
            Object obj = jsonParser.parse(reader);
            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);

            employeeList.forEach(e -> parseEmployeeObject((JSONObject) e));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

    private static void parseEmployeeObject(JSONObject employee){
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("employee");

        //Get employee first name
        String firstName = (String) employeeObject.get("firstName");
        System.out.println(firstName);

        //Get employee last name
        String lastName = (String) employeeObject.get("lastName");
        System.out.println(lastName);

        //Get employee website name
        String website = (String) employeeObject.get("website");
        System.out.println(website);
    }
}
