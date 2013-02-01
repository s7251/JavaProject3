/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kulkry.gromac.jee.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.kulkry.gromac.jee.model.Uzytkownik;

@Stateless
public class UzytkownikFacade extends AbstractFacade<Uzytkownik> {
    @PersistenceContext(unitName = "JPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UzytkownikFacade() {
        super(Uzytkownik.class);
    }
    
}
