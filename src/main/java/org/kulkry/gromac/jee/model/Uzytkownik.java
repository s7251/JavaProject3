/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kulkry.gromac.jee.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Uzytkownik implements Serializable {
    
    @Id 
    @GeneratedValue(strategy=GenerationType.TABLE)
    private int id;
    
    @Column(nullable=false, length=128)
    private String imie;
    @Column(nullable=false, length=128)
    private String nazwisko;
    @Column(nullable=false, length=128)
    private String login;
    @Column(nullable=false, length=128)
    private String haslo;
    @Column(nullable=false, length=128)
    private String mail;
    private String adres;
    
    public void rejestracja(Uzytkownik uzytkownik) {
    }

    public void zmienDane(Uzytkownik uzytkownik) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
