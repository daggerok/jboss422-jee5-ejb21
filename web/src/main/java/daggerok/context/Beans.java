package daggerok.context;

import daggerok.ejb.api.myservice.MyServiceHome;
import daggerok.ejb.api.myservice.MyServiceRemote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

public class Beans {

  private static final Logger log = LoggerFactory.getLogger(Beans.class);

  public static MyServiceRemote getMyServiceBean() {

    try {

      final InitialContext ctx = new InitialContext();
      final Context env = Context.class.cast(ctx.lookup("java:comp/env"));
      final Object narrowFrom = env.lookup("MyServiceBean");
      final MyServiceHome home = MyServiceHome.class.cast(PortableRemoteObject.narrow(narrowFrom, MyServiceHome.class));

      return home.create();
    }

    catch (NamingException e) { wrap("naming error", e); }
    catch (Throwable e) { wrap("f*ck", e); }
    return null;
  }

  private static void wrap(final Object prefix, final Throwable e) {
    log.error("{}: {}", prefix, e.getLocalizedMessage(), e);
    throw new RuntimeException(e);
  }

  private Beans() {}
}
