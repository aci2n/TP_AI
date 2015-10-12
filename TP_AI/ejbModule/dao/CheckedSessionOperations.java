package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public abstract class CheckedSessionOperations {
	private static final SessionFactory sf = HibernateUtil.getSessionFactory();

	protected interface ReadOperation {
		public Object operation(Session s);
	}

	protected interface WriteOperation {
		public Object operation(Session s, Object obj);
	}

	protected Object executeCheckedRead(ReadOperation ro) {
		Session s = null;
		try {
			s = sf.openSession();
			return ro.operation(s);
		} finally {
			if (s != null)
				s.close();
		}
	}

	protected Object executeCheckedWrite(WriteOperation wo, Object obj) {
		Session s = null;
		try {
			s = sf.openSession();
			Transaction t = s.beginTransaction();
			Object o = wo.operation(s, obj);
			t.commit();
			return o;
		} finally {
			if (s != null)
				s.close();
		}
	}
}
