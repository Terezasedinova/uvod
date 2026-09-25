package org.example;

public class Clovek {
    private String jmeno;
    private String prijmeni;
    private int vek;

    public Clovek() {
        jmeno = "";
        prijmeni = "";
        vek = 0;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public Clovek(String jm, String pjm, int vek){
        jmeno=jm;
        prijmeni=pjm;
        this.vek=vek;
    }

    public String celeJmeno(){
        return "";

    }
}

