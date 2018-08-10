import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Person;
import lti.util.HibernateUtil;

public class TestPerson {

	@Test
	public void testSaePerson() {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.beginTransaction();

		Person p = new Person(new Person.Id("India", 123456), "Polo", 21);
		session.save(p);

		txn.commit();
	}

}
