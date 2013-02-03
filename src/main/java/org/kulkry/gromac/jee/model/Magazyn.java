/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kulkry.gromac.jee.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Magazyn implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    @Column(nullable = false, length = 128)
    private String nazwa;
    @Column(nullable = false, length = 255)
    private String adres;
    private int powierzchnia;
    @OneToMany(mappedBy = "magazyn")
    private List<Produkt> produkty;

    public void dodajProdukt(Produkt produkt) {
    }

    public void usunProdukt(Produkt produkt) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(int powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public List<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(List<Produkt> produkty) {
        this.produkty = produkty;
    }

    @Override
    public String toString() {
        return nazwa;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Magazyn temp = (Magazyn) obj;
        return nazwa.equals(temp.getNazwa());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.nazwa != null ? this.nazwa.hashCode() : 0);
        return hash;
    }
}
