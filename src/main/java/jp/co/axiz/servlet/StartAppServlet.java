package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.app.GameApp;

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
		String appli = request.getParameter("app");
		
		App app = null;
		
		if (name == null || name.isEmpty()) {
			request.getRequestDispatcher("appStart.jsp").forward(request, response);
            return;
		}
		
		if(appli.equals("trump")) {
			app = new CardGameApp(appli);
		}else if(appli.equals("darts")){
			app = new DartsGameApp(appli);
		}else if(appli.equals("clock")) {
			app = new ClockApp();
		}
		
		if(app instanceof GameApp) {
			GameApp gameapp = (GameApp)app;
			request.setAttribute("playtime", gameapp.getPlayTime());
		}
		
		request.setAttribute("result", app.start(name));
		
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
