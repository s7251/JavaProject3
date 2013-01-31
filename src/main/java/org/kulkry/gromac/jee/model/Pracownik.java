
package org.kulkry.gromac.jee.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pracownik implements Serializable {
    
    @Id 
    @GeneratedValue(strategy=GenerationType.TABLE)
    private int id;
    
    @Column(nullable=false, length=128)
    protected String login;
    @Column(nullable=false, length=128)
    protected String haslo;
    
    
    
    public String szukajUzytkownika(String login){
        return "";
    }
    
    public void usunUzytkownika(String login){
        
    }
    
    public void zmienHaslo(String login, String haslo){
        
    }

    public void zmienUzytkownika(String login, String nowyLogin){
        
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
