package prototypeAndRegistry;

public class App {
    public static void main(String[] args) {

        StudentRegistry  studentRegistry = new StudentRegistry();
        fillStudentRegistry(studentRegistry);

    }
    private static void fillStudentRegistry(StudentRegistry studentRegistry)
    {
        Student aprBatchStudent = new Student();
        aprBatchStudent.setBatch("Apr 23");
        aprBatchStudent.setAvgBatchPsp(90.0);
        studentRegistry.register("aprilBtch23",aprBatchStudent);

        IntelligentStudent aprBatchIntelligentStudent = new IntelligentStudent();
        aprBatchIntelligentStudent.setIq(180);
        aprBatchIntelligentStudent.setBatch("Apr 23");
        aprBatchIntelligentStudent.setAvgBatchPsp(90.0);
        studentRegistry.register("aprBatchIntelligentStudent23",aprBatchIntelligentStudent);
        
    }
}
