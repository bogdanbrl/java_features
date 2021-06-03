import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Double "B"
 * @created 12/04/2021 - 5:58 PM
 * @project ReadWriteJSON
 */
public class WriteJSON {

    public static void main(String[] args) {

        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Brl");
        employeeDetails.put("lastName", "Bogdan");
        employeeDetails.put("website", "bogdanbrljava.com");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Brl");
        employeeDetails2.put("lastName","L");
        employeeDetails2.put("website", "l-hr.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);

        //add employee to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);

        try(FileWriter file = new FileWriter("employees.json")) {
            file.write(employeeList.toJSONString());
            file.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
