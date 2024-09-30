package builder;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        //this is prone to error
//        Student student = new Student(58674,"Asur",87,98.06,"JP",2023,"353453453");


//        hashmap creating problem
//        Map<String, Object> properties = new HashMap<>();
//        properties.put("name","Pratyush");
//        properties.put("age",20);
//        Student s1 = new Student(properties);

        Builder builder = new Builder();
        builder.setAge(21);
        builder.setName("Pratyush");
        builder.setId(234);

        Student student2 = new Student(builder);

        Builder builder1 = Student.getBuilder();
        builder.setId(345);
        builder.setName("Prat");
        builder.setAge(29);
        Student build = builder1.build();
    }
}
