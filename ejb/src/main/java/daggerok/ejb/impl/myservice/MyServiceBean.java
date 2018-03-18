package daggerok.ejb.impl.myservice;

import javax.ejb.CreateException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class MyServiceBean implements SessionBean {

	private static final long serialVersionUID = -4653289636787705783L;

	public String sayHello(final String name) {
		return "hey, " + name + "!";
	}

	public void ejbCreate() throws CreateException {}
	public void setSessionContext(final SessionContext sessionContext) {}
	public void ejbActivate() {}
	public void ejbPassivate() {}
	public void ejbRemove() {}
}
