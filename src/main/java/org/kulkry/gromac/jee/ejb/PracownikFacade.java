/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kulkry.gromac.jee.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.kulkry.gromac.jee.model.Pracownik;

@Stateless
public class PracownikFacade extends AbstractFacade<Pracownik> {
    @PersistenceContext(unitName = "JPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PracownikFacade() {
        super(Pracownik.class);
    }
    
    public Pracownik getPracownikFor(String login) {
        Query query = em.createQuery("SELECT pr FROM Pracownik pr WHERE pr.login = :login");
        query.setParameter("login", login);
        
        try{
            return (Pracownik)query.getSingleResult();
        } catch(NoResultException ex) {
            return null;
        }
    }
}
