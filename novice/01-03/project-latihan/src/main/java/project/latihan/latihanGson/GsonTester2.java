package project.latihan.latihanGson;

import com.google.gson.Gson;

public class GsonTester2 {
    public static void main(String args[]) {

        Student1 student = new Student1();
        student.setRollNo(1);
        Student1.Name name = new Student1.Name();

        name.firstName = "Andre";
        name.lastName = "Septian";
        student.setName(name);

        Gson gson = new Gson();
        String jsonString = gson.toJson(student);
        System.out.println(jsonString);
        student = gson.fromJson(jsonString, Student1.class);

        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("First Name: " + student.getName().firstName);
        System.out.println("Last Name: " + student.getName().lastName);
        String nameString = gson.toJson(name);
        System.out.println(nameString);

        name = gson.fromJson(nameString, Student1.Name.class);
        System.out.println(name.getClass());
        System.out.println("First Name: " + name.firstName);
        System.out.println("Last Name: " + name.lastName);
    }
}

class Student1 {
    private int rollNo;
    private Name name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    static class Name {
        public String firstName;
        public String lastName;
    }
}