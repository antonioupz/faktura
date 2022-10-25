package pl.edu.akademiazamojska.entity;

public class Sprzedawca extends Podmiot {
    private String nrKontaBankowego;

    public String getNrKontaBankowego() {
        return nrKontaBankowego;
    }
    public void setNrKontaBankowego(String nrKontaBankowego) {
        this.nrKontaBankowego = nrKontaBankowego;
    }

}
