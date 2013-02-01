/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kulkry.gromac.jee.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.kulkry.gromac.jee.model.Produkt;

@Stateless
public class ProduktFacade extends AbstractFacade<Produkt> {
    @PersistenceContext(unitName = "JPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProduktFacade() {
        super(Produkt.class);
    }
    
}
