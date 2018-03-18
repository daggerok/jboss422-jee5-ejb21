package daggerok.web;

import daggerok.context.Beans;
import daggerok.ejb.api.myservice.MyServiceRemote;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = 2643827692067657414L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		final PrintWriter out = response.getWriter();
		final String name = request.getParameter("name");
		final MyServiceRemote myService = Beans.getMyServiceBean();

		out.println(myService.sayHello(name));
		out.close();
	}
}
