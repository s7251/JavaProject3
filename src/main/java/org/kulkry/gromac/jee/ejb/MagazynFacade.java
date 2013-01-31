/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kulkry.gromac.jee.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.kulkry.gromac.jee.model.Magazyn;

/**
 *
 * @author wnuk
 */
@Stateless
public class MagazynFacade extends AbstractFacade<Magazyn> {
    @PersistenceContext(unitName = "JPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MagazynFacade() {
        super(Magazyn.class);
    }
    
}
