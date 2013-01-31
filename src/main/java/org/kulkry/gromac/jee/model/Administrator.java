/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kulkry.gromac.jee.model;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Administrator extends Pracownik implements Serializable {
    
    
    public void dodajPracownika(Pracownik pracownik){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void usunPracownika(Pracownik pracownik){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void zmienPracownika(Pracownik pracownik){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
