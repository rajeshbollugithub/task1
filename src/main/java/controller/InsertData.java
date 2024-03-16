package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDb;
import dto.UserData;

public class InsertData extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				String name=req.getParameter("name");
				String email=req.getParameter("email");
				int age=Integer.parseInt(req.getParameter("age"));
				String dob=req.getParameter("dob");
				
				UserData ud=new UserData();
				ud.setUserName(name);
				ud.setUserEmail(email);
				ud.setUserAge(age);
				ud.setUserDob(dob);
				
				UserDb db=new UserDb();
				db.insertEmployee(ud);
				
			}
	
	}

