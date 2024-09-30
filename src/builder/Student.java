package builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String uniName;
    private long id;
    private int gradyear;
    private String phoneNumber;

    /*
    1.too mane constructors
    2. at some point constructor overloading is not even possible
     */

//    public Student(long id, String name, int age, double psp, String uniName, int gradyear, String phoneNumber) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.psp = psp;
//        this.uniName = uniName;
//        this.gradyear = gradyear;
//        this.phoneNumber = phoneNumber;
//    }

    /* int this if there is any typo error then that will lead to the
    ambiguity of the results , any spelling mistake can lead to error
     */
//    public Student(Map<String,Object> map)
//    {
//        if(map.containsKey("name"))
//        {
//            this.name = (String)map.get("name");
//        }
//        if(map.containsKey("age"))
//        {
//            this.name = (String) map.get("age");
//        }
//    }

    public Student(Builder builder)
    {
        //add any validations
        this.name = builder.getName();
        this.age = builder.getAge();

    }


    public static Builder getBuilder()
    {
        return new Builder();
    }
}
