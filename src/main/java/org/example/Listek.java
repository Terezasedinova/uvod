package org.example;

public class Listek {
    private int cdosp;
    private int cdite;

    public Listek(){
        cdosp=300;
        cdite=200;

    }

    public int getCdosp() {
        return cdosp;
    }

    public int getCdite() {
        return cdite;
    }
    public int getCena(Clovek cl){
        if (cl.jstedospely())
            return cdosp;
        else
            return cdite;
    }
}
