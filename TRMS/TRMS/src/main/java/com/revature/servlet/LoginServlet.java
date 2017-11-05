package com.revature.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.revature.trms.dao.Benco;
import com.revature.trms.dao.BencoDAOImp;
import com.revature.trms.dao.DepartmentHead;
import com.revature.trms.dao.DepartmentHeadDAOImp;
import com.revature.trms.dao.DirectSupervisor;
import com.revature.trms.dao.DirectSupervisorDAOImp;
import com.revature.trms.dao.Employee;
import com.revature.trms.dao.EmployeeDAOImp;
import com.revature.util.ConnFactory;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static ConnFactory cf = ConnFactory.getInstance();
    public EmployeeDAOImp edi = new EmployeeDAOImp();
    public DepartmentHeadDAOImp dhdi = new DepartmentHeadDAOImp();
    public DirectSupervisorDAOImp dsdi = new DirectSupervisorDAOImp();
    public BencoDAOImp bcdi = new BencoDAOImp();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
        String password = request.getParameter("password");
		Connection conn = cf.getConnection();
		Statement stmt;
		ResultSet rs;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM DUMMY");
			while(rs.next()){
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(username + " " + password);
         //Need to create the service
        //String message = service.doLogin(username, password);
        //response.getWriter().write(message);
        response.getWriter().write(username + " " + password);
	}
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	String username = request.getParameter("username");
        String password = request.getParameter("password");
        String type = request.getParameter("type");
        //Called DAO method here that returns a user-type object (i.e employee, supervisor, dh, or benco)
        //Call another DAO method to get that user's TR info to display
        System.out.println(type);
        Employee emp = null;
        DirectSupervisor ds = null;
    	DepartmentHead dh = null;
    	Benco bc = null;
        if(type.equals("Employee")){
        	try {
        		emp = edi.getEmployeeByCreds(username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	System.out.println(emp.getUsername());
        }
        else if(type.equals("DirectSupervisor")){
        	try {
				ds = dsdi.getDirectSupervisorByCreds(username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        else if(type.equals("DepartmentHead")){
        	try {
				dh = dhdi.getDepartmentHeadByCreds(username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        else{
        	try {
				bc = bcdi.getBencoByCreds(username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        JSONObject obj = new JSONObject();
        obj.put("username", username);
        obj.put("password", password);
        obj.put("type", type);
        response.getWriter().write(obj.toJSONString());
    }
    
    
}
