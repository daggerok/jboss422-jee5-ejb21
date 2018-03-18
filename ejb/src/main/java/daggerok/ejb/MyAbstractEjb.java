package daggerok.ejb;

import javax.ejb.CreateException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public abstract class MyAbstractEjb implements SessionBean {

  private static final long serialVersionUID = 0L;

  public void ejbCreate() throws CreateException {}
  public void setSessionContext(final SessionContext sessionContext) {}
  public void ejbActivate() {}
  public void ejbPassivate() {}
  public void ejbRemove() {}
}
