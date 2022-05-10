package app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/StartAppServlet")
public class StartAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartAppServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request.setCharacterEncoding("UTF-8");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String app = request.getParameter("app");
	    
		if(app.equals("trump")) {
			CardGameApp gameapp = new CardGameApp(app);
			
			if (name != null && !name.isEmpty()) {
		    	request.setAttribute("result", gameapp.start(name));
		    }
		}else {
			GameApp gameapp = new GameApp();
			
			if (name != null && !name.isEmpty()) {
		    	request.setAttribute("result", gameapp.start(name));
		    }
		}
	    /*if (name != null && !name.isEmpty()) {
	    	request.setAttribute("result", gameapp.start(name));
	    }*/
		
		request.getRequestDispatcher("/appStart.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
