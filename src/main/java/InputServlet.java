
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    	// ここに必要な処理を記述してください。
    	request.setCharacterEncoding("UTF-8");
    	String name = request.getParameter("name");
    	String language = request.getParameter("language");
    	String bPlace = request.getParameter("birthPlace");
    	
    	String rhInfo;
    	String rbInfo;
    	
    	if(request.getParameter("btn").equals("simple")) {
    		switch(request.getParameter("bPlace")) {
    			case "japan":
    				Japanese jp = new Japanese();
    				rhInfo = jp.returnHumanInfo();
    				rbInfo = jp.returnBirthPlaceInfo();
    			    request.setAttribute("info", rhInfo + rbInfo);
    				break;
    			case "america":
    				American am = new American();
    				break;
    			default:
    				Human hm = new Human();
    				break;
    		}
    		
    	}
    	
        // 結果画面へ
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
