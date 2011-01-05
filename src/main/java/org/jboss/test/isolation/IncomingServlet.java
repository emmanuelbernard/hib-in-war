package org.jboss.test.isolation;

import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Emmanuel Bernard
 */
public class IncomingServlet extends HttpServlet {
	@Inject
	UserManager manager;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType( "text/html" );

		manager.saveUser( new User("Emmanuel") );
		PrintWriter out = response.getWriter();

		out.println( "<html>" );
		out.println( "<head>" );
		out.println( "<title>Hola</title>" );
		out.println( "</head>" );
		out.println( "<body bgcolor=\"white\">" );

		out.println( "<h1> HelloWorldEJB Says: </h1>" );
		//out.println( this.hw.hi() );

		out.println( "</body>" );
		out.println( "</html>" );
	}
}
