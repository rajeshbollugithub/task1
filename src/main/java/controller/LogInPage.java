package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpDb;
import dao.UserDb;
import dto.EmpDetails;
import dto.UserData;

public class LogInPage extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserDb db=new UserDb();
		List data=db.fetch();
		
		req.setAttribute("key", data);
		RequestDispatcher dispatcher=req.getRequestDispatcher("indexLogin.jsp");
		dispatcher.forward(req, resp);
	}
}
