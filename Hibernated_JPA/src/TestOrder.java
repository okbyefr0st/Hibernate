import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import lti.pojo.Customer;
import lti.pojo.Order;
import lti.util.HibernateUtil;

public class TestOrder {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.getTransaction();

		txn.begin(); // starting db transaction

		Order ord = new Order();
		ord.setId(123);
		Date orddate=new Date();
		ord.setOrderDate(orddate);
		ord.setAmount(1000);
		ord.setPromoCode("ABC");
		session.save(ord); // saving customer object
		txn.commit(); // ending transaction with commit

	}

}
