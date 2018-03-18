package daggerok.ejb.api.myservice;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface MyServiceRemote extends EJBObject {

	String sayHello(final String name) throws RemoteException;
}
