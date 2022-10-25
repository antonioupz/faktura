package pl.edu.akademiazamojska.entity;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pozycja {
    private Integer lp;
    private String nazwaTowaru;
    private String symbolPKWiU;
    private String jm;
    private BigDecimal ilosc;
    private BigDecimal cenaNetto;
    private BigDecimal wartoscNetto;
    private StawkaVAT stawkaVAT;

    public BigDecimal getKwotaVAT() {
        return wartoscNetto.multiply(stawkaVAT.getStawka()).divide(BigDecimal.valueOf(100),2, RoundingMode.HALF_UP);
    }
    private BigDecimal getWartoscBrutto(){
        return getKwotaVAT().add(wartoscNetto);
    }
    public Integer getLp() {
        return lp;
    }

    public void setLp(Integer lp) {
        this.lp = lp;
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public String getSymbolPKWiU() {
        return symbolPKWiU;
    }

    public void setSymbolPKWiU(String symbolPKWiU) {
        this.symbolPKWiU = symbolPKWiU;
    }

    public String getJm() {
        return jm;
    }

    public void setJm(String jm) {
        this.jm = jm;
    }

    public BigDecimal getIlosc() {
        return ilosc;
    }

    public void setIlosc(BigDecimal ilosc) {
        this.ilosc = ilosc;
    }

    public BigDecimal getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(BigDecimal cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public BigDecimal getWartoscNetto() {
        return wartoscNetto;
    }

    public void setWartoscNetto(BigDecimal wartoscNetto) {
        this.wartoscNetto = wartoscNetto;
    }

    public StawkaVAT getStawkaVAT() {
        return stawkaVAT;
    }

    public void setStawkaVAT(StawkaVAT stawkaVAT) {
        this.stawkaVAT = stawkaVAT;
    }
}
