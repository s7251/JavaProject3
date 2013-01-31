/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kulkry.gromac.jee.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produkt implements Serializable {

    @Id 
    @GeneratedValue(strategy=GenerationType.TABLE)
    private int id;
    
    @Column(nullable=false)
    private double cenaBrutto;
    @Column(nullable=false)
    private double cenaNetto;
    private String kategoria;
    @Column(nullable=false, length=128)
    private String nazwa;
    private String numerZamowienia;
    private String opis;
    private int waga;
    
    @ManyToOne
    @JoinColumn(name="magazyn_fk")
    private Magazyn magazyn;

    public void dodajProdukt(Produkt produkt) {
    }

    public void sprawdzStan(Produkt produkt) {
    }

    public void usunProdukt(Produkt produkt) {
    }

    public void zmienProdukt(Produkt produkt) {
    }

    public List<Produkt> szukajPoNazwie(String nazwa) {

        return new ArrayList<Produkt>();
    }

    public double getCenaBrutto() {
        return cenaBrutto;
    }

    public void setCenaBrutto(double cenaBrutto) {
        this.cenaBrutto = cenaBrutto;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNumerZamowienia() {
        return numerZamowienia;
    }

    public void setNumerZamowienia(String numerZamowienia) {
        this.numerZamowienia = numerZamowienia;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public Magazyn getMagazyn() {
        return magazyn;
    }

    public void setMagazyn(Magazyn magazyn) {
        this.magazyn = magazyn;
    }
}
