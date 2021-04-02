package oop;

public class Teacher {
    private String firstName;
    private String lastName;
    private int age;
    private String subject;
    private boolean isTeacher;

    Teacher() { }

    Teacher(boolean isTeacher) {
        this.isTeacher = isTeacher;}

    Teacher(String firstName_, String lastName_, int age_, String subject_, boolean isTeacher_) {
        this.firstName = firstName_;
        this.lastName = lastName_;
        this.age = age_;
        this.subject = subject_;
        this.isTeacher = isTeacher_;
    }
    Teacher(String firstName_, String lastName_, int age_) {
        this.firstName = firstName_;
        this.lastName = lastName_;
        this.age = age_;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setIsTeacher (boolean isTeacher) {
        this.isTeacher = isTeacher;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    public boolean isTeacher() {
        return isTeacher;
    }
}








