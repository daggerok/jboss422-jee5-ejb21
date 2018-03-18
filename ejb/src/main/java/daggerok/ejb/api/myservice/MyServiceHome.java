package daggerok.ejb.api.myservice;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;

public interface MyServiceHome extends EJBHome {
	MyServiceRemote create() throws CreateException, RemoteException;
}
