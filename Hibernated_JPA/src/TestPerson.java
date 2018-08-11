import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Person;
import lti.util.HibernateUtil;

public class TestPerson {

	@Test
	public void testSavePerson() {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.beginTransaction();

		Person p = new Person(new Person.Id("Nepal", 654321), "Shubham Semwal", 69);
		session.save(p);

		txn.commit();
	}

}
