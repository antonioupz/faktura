package pl.edu.akademiazamojska.entity;

public class Podmiot {
    private String nazwa;
    private String miejscowosc;
    private String ulica;
    private String kodPocztowy;
    private String numerDomu;
    private Integer nip;
    private Integer pesel;


    public Podmiot() {
    }

    public String getAdres() {
        return nazwa + "\n" + ulica + " " +  numerDomu + "\n" +  kodPocztowy  + " " + miejscowosc ;
    }

    public Podmiot(String nazwa, String miejscowosc, String ulica, String kodPocztowy, String numerDomu, Integer nip, Integer pesel) {
        this.nazwa = nazwa;
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.numerDomu = numerDomu;
        this.nip = nip;
        this.pesel = pesel;
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        this.numerDomu = numerDomu;
    }

    public Integer getNip() {
        return nip;
    }

    public void setNip(Integer nip) {
        this.nip = nip;
    }

    public Integer getPesel() {
        return pesel;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }
}
