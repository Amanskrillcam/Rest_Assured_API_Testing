package JsonParsing;

import io.restassured.config.ObjectMapperConfig;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
//import io.restassured.mapper.ObjectMapperDeserializationContext;
//import io.restassured.mapper.ObjectMapperSerializationContext;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParsingTest {
//    static ;
    public static void main(String[] args) throws IOException
    {
        byte[] jsonData= Files.readAllBytes(Paths.get("C:\\Users\\AmanShukla\\IdeaProjects\\RestAssuredApiTesting\\Data.json"));
        ObjectMapper mapper = new ObjectMapper();
        Person person=mapper.readValue(jsonData, Person.class);
        System.out.println(person.getEmail());
    }
}
