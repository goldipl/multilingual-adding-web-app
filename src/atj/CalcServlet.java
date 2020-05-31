package atj;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalcServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String base = "/";
		String url = base + "Argumenty.jsp";

		HttpSession session = request.getSession();
		Sumator obiekt = (Sumator) session.getAttribute("obiekt");
		if (obiekt == null) {
			obiekt = new Sumator();
			session.setAttribute("obiekt", obiekt);
			obiekt.setArg0(0.0);
			obiekt.setArg1(0.0);
		}

		
		String action = request.getParameter("btn");
		if (action != null) {
			// jak jest btn to wyszlismy z 1 strony
			obiekt.setArg0(Double.parseDouble(request.getParameter("arg0")));
			obiekt.setArg1(Double.parseDouble(request.getParameter("arg1")));
			
			switch (action) {
			case "Oblicz":
				url = base + "Wynik.jsp";
				break;
			case "Berechnen":
				url = base + "Wynik.jsp";
				break;
			case "Calculate":
				url = base + "Wynik.jsp";
				break;
			default:
				break;
			}
		}
		
		SumatorVO vo = new SumatorVO();
		vo.setArg0(obiekt.getArg0());
		vo.setArg1(obiekt.getArg1());
		vo.setResult(obiekt.getResult());
		request.setAttribute("vo", vo);
		
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(url);
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}