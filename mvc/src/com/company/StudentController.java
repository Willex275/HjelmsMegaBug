package com.company;

public class StudentController {
    private Student model;
    private Studentview view;

    public StudentController(Student model, Studentview view ){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNO(String rollNO){
        model.setRollNO(rollNO);

    }

    public String getStudentRollNO(){
        return model.getRollNO();

    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNO());
    }

}
