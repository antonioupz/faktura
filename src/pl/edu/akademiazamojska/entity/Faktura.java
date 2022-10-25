package pl.edu.akademiazamojska.entity;


import java.util.Date;
import java.util.List;

public class Faktura {
    private Integer nrFaktury;
    private String miejscowosc;
    private Date dataFaktury;
    private Date terminPlatnosci;
    private String formaPlatnosci;
    private Date dataWykonania;
    private String uwagi;
    private String faktureWystawil;
    private Sprzedawca sprzedawca;
    private Nabywca nabywca;
    private List<Pozycja> pozycje;

    public Integer getNrFaktury() {
        return nrFaktury;
    }

    public void setNrFaktury(Integer nrFaktury) {
        this.nrFaktury = nrFaktury;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public Date getDataFaktury() {
        return dataFaktury;
    }

    public void setDataFaktury(Date dataFaktury) {
        this.dataFaktury = dataFaktury;
    }

    public Date getTerminPlatnosci() {
        return terminPlatnosci;
    }

    public void setTerminPlatnosci(Date terminPlatnosci) {
        this.terminPlatnosci = terminPlatnosci;
    }

    public String getFormaPlatnosci() {
        return formaPlatnosci;
    }

    public void setFormaPlatnosci(String formaPlatnosci) {
        this.formaPlatnosci = formaPlatnosci;
    }

    public Date getDataWykonania() {
        return dataWykonania;
    }

    public void setDataWykonania(Date dataWykonania) {
        this.dataWykonania = dataWykonania;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }

    public String getFaktureWystawil() {
        return faktureWystawil;
    }

    public void setFaktureWystawil(String faktureWystawil) {
        this.faktureWystawil = faktureWystawil;
    }

    public Sprzedawca getSprzedawca() {
        return sprzedawca;
    }

    public void setSprzedawca(Sprzedawca sprzedawca) {
        this.sprzedawca = sprzedawca;
    }

    public Nabywca getNabywca() {
        return nabywca;
    }

    public void setNabywca(Nabywca nabywca) {
        this.nabywca = nabywca;
    }

    public List<Pozycja> getPozycje() {
        return pozycje;
    }

    public void setPozycje(List<Pozycja> pozycje) {
        this.pozycje = pozycje;
    }

    public Faktura() {
    }
}
