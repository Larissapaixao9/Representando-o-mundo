public class App {
    public static void main(String[] args) throws Exception {

        Student studentInfo = new Student();

        studentInfo.name = "Larissa";

        studentInfo.setEmail("laryssapaixao9@gmail.com");

        Discipline disciplineInfo = new Discipline();

        disciplineInfo.name = "matematica";

        disciplineInfo.id = 1;

        disciplineInfo.exercises.level = 3;

        System.out.println(disciplineInfo.exercises.level);

        System.out.println(studentInfo.getEmail());
    }
}
