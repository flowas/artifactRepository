package test;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.jboss.seam.transaction.DefaultTransaction;
import org.jboss.seam.transaction.Transactional;

@Named
//@Transactional
public class UserFacet {

	@Inject
	EntityManager entityManager;

	public void test() {

		User user = (User) entityManager
				.createQuery("from User where name=:username")
				.setParameter("username", "hello").getSingleResult();
		System.out.println(user);
	}
	@DefaultTransaction
	public void save() {
		System.out.println(entityManager);
//		entityManager.joinTransaction();
//		User user = new User();
//		entityManager.persist(user);
	}

}
