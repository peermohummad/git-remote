package fr.test.test;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@RequestMapping("/doctor/{id}")
	@ResponseBody
	public String doctor(@PathVariable int id) throws JSONException {
		if (id == 0 || id >= 14) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de récupérer l'incarnation : " + id);

		} else if (id >= 1 && id <= 8) {
			throw new ResponseStatusException(HttpStatus.SEE_OTHER, "");

		} else {
			JSONObject obj = new JSONObject();

			switch (id) {
			case 9:
				try(FileWriter file = new FileWriter("doctor.json"))
				{
					obj.put("number", id);
					obj.put("name", "Christopher Eccleston");
					file.write(obj.toString());
					file.flush();
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				break;

			case 10:
				try(FileWriter file = new FileWriter("doctor.json"))
				{
					obj.put("number", id);
					obj.put("name", "David Tennant");
					file.write(obj.toString());
					file.flush();
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				break;

			case 11:
				try(FileWriter file = new FileWriter("doctor.json"))
				{
					obj.put("number", id);
					obj.put("name", "Matt Smith");
					file.write(obj.toString());
					file.flush();
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				break;

			case 12:
				try(FileWriter file = new FileWriter("doctor.json"))
				{
					obj.put("number", id);
					obj.put("name", "Peter Capaldi");
					file.write(obj.toString());
					file.flush();
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				break;

			case 13:
				try(FileWriter file = new FileWriter("doctor.json"))
				{
					obj.put("number", id);
					obj.put("name", "Jodie Whittaker");
					file.write(obj.toString());
					file.flush();
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				break;

			}
			System.out.println(obj);
			return obj.toString();
		}
	}

}
