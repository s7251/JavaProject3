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
import org.kulkry.gromac.jee.model.Administrator;

/**
 *
 * @author wnuk
 */
@Stateless
public class AdministratorFacade extends AbstractFacade<Administrator> {
    @PersistenceContext(unitName = "JPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdministratorFacade() {
        super(Administrator.class);
    }
    
    public Administrator getAdministratorFor(String login) {
        Query query = em.createQuery("SELECT adm FROM Administrator adm WHERE adm.login = :login");
        query.setParameter("login", login);
        
        try{
            return (Administrator)query.getSingleResult();
        } catch(NoResultException ex) {
            return null;
        }
    }
}
