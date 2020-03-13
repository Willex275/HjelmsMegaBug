package com.company;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        Studentview view = new Studentview();

        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("William");


    }

    private static Student retriveStudentFromDatabase() {
    Student student = new Student();
    student.setName("Wille");
    student.setRollNO("10");
    return student;
    }


}
