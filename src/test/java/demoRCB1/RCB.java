package demoRCB1;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class RCB {

	int foreignPlayers=0;
	int wicketkeeper=0;
	
	@Test
	public void RCBparsing () {
		
		String jsonStringPayload="{\r\n"
				+ "  \"name\": \"Royal Challengers Bangalore\",\r\n"
				+ "  \"location\": \"Bangalore\",\r\n"
				+ "  \"player\": [\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Faf Du Plessis\",\r\n"
				+ "      \"country\": \"South Africa\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n"
				+ "      \"price-in-crores\": \"7\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Virat Kohli\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n"
				+ "      \"price-in-crores\": \"15\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Glenn Maxwell\",\r\n"
				+ "      \"country\": \"Australia\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n"
				+ "      \"price-in-crores\": \"11\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Mohammad Siraj\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n"
				+ "      \"price-in-crores\": \"7\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Harshal Patel\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n"
				+ "      \"price-in-crores\": \"10.75\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Wanindu Hasaranga\",\r\n"
				+ "      \"country\": \"Srilanka\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n"
				+ "      \"price-in-crores\": \"10.75\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Dinesh Karthik\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Wicket-keeper\",\r\n"
				+ "      \"price-in-crores\": \"5.5\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Shahbaz Ahmed\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"All-Rounder\",\r\n"
				+ "      \"price-in-crores\": \"2.4\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Rajat Patidar\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n"
				+ "      \"price-in-crores\": \"0.20\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Josh Hazlewood\",\r\n"
				+ "      \"country\": \"Australia\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n"
				+ "      \"price-in-crores\": \"7.75\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Mahipal Lomror\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n"
				+ "      \"price-in-crores\": \"7.75\"\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		
		JsonPath J = new JsonPath(jsonStringPayload);
		List<Object> L = J.getList("player");
		System.err.println(L);
		System.out.println(L.size());
		
		//  Test case 1---------------------
		
		List<Object> M = J.getList("player.country");
		System.err.println(M);
		System.out.println(M.size());
		
		for(int i=0; i<M.size(); i++) {
			System.out.println(M.get(i));
			if(!M.get(i).equals("India")) {
				foreignPlayers = foreignPlayers+1;
			}
			
		}
		
		System.out.println(foreignPlayers);
		
		if(foreignPlayers==4) {
			System.out.println("Test case 1 is Pass");
		}
		
	     
		

	}
	
	
}
