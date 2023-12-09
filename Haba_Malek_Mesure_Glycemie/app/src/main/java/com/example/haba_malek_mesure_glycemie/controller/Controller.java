package com.example.haba_malek_mesure_glycemie.controller;
import com.example.haba_malek_mesure_glycemie.model.Patient;
public class Controller {
    private static Controller instance = null;
    private static Patient Patient;
    private Controller(){
        super();
    }
    public static final Controller getInstance(){
        if(Controller.instance == null)
            Controller.instance = new Controller();
        return Controller.instance;
    }
    public void create_patient(int age ,float valeurMesuree , boolean isFasting){
        Patient = new Patient(isFasting, age, valeurMesuree);
    }
    public String getResult(){
        return Patient.getR();//update patient to controller
    }

}