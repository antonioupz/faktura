package pl.edu.akademiazamojska.entity;

import java.math.BigDecimal;

public class StawkaVAT {
    private Integer id;
    private BigDecimal stawka;
    private String opis;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getStawka() {
        return stawka;
    }

    public void setStawka(BigDecimal stawka) {
        this.stawka = stawka;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public StawkaVAT(Integer id, BigDecimal stawka, String opis) {
        this.id = id;
        this.stawka = stawka;
        this.opis = opis;
    }

    public StawkaVAT() {
    }
}
