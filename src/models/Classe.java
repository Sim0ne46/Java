package models;

import java.util.Arrays;

public class Classe {
    String sezione;
    int ID;
    String specializzazione;
    String istituto;
    int[] studente;
    boolean presenza;

    int c;


    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public String getIstituto() {
        return istituto;
    }

    public void setIstituto(String istituto) {
        this.istituto = istituto;
    }

    public int[] getStudente() {
        return studente;
    }

    public void setStudente(int[] studente) {
        this.studente = studente;
    }

    public boolean isPresenza() {
        return presenza;
    }

    public void setPresenza(boolean presenza) {
        this.presenza = presenza;
    }

    @Override
    public String toString() {
        return "Classe{" +
                "sezione='" + sezione + '\'' +
                ", ID=" + ID +
                ", specializzazione='" + specializzazione + '\'' +
                ", istituto='" + istituto + '\'' +
                ", studente=" + Arrays.toString(studente) +
                ", presenza=" + presenza +
                '}';
    }

    public  Classe(String sezione, int ID, int studente, String specializzazione, String istituto, boolean presenza) {
        this.sezione = sezione;
        this.ID = ID;
        this.studente = new int[]{studente};
        this.specializzazione = specializzazione;
        this.istituto = istituto;
        this.presenza = presenza;




    }

}