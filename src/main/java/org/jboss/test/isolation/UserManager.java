package org.jboss.test.isolation;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Emmanuel Bernard
 */
@Stateless @TransactionAttribute
public class UserManager {
	@PersistenceContext
	EntityManager em;

	public void saveUser(User user) {
		em.persist( user );
	}
}
