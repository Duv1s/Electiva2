package herokuServices;

import static spark.Spark.get;

import com.google.gson.Gson;


public class TestApiRest {
	public static void main(String[] args) {
		Gson gson = new Gson();
		
		get("/hello", (req, res) -> {
			res.type("application/json");
			return gson.toJson("Hola gente");
		}, gson::toJson);
	}

}
