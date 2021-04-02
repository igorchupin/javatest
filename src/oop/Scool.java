package oop;

public class Scool {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher ("Maria Ivanovna", "Petrova", 35);
        Teacher teacher3 = new Teacher("Ivan Petrovich", "Ivanov", 55, "Math", true);
        Teacher teacher4 = new Teacher(true);

        System.out.println(teacher2.getFirstName());

        teacher1.setIsTeacher(false);



    }
}
