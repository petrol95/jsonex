import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;

public class MainClass {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Student student = mapper.readValue(new File("stud.json"), Student.class);
        student.info();

//        Student student = new Student();
//        student.setId(1);
//        student.setName("John");
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//        mapper.writeValue(new File("output.json"), student);
    }
}
