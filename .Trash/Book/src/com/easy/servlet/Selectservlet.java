package com.easy.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.easy.entity.Book;
import com.easy.mapper.Bookmapper;
import com.easy.util.MybatisUtil;

@WebServlet("/Selectservlet.do")
public class Selectservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bookname = request.getParameter("bookname");
//		System.out.println(bookname);
		//把字符串转字符数组
		String[] s= bookname.split(",");
		
		SqlSession session = MybatisUtil.getSqlSession();
		
		Bookmapper bookmapper = session.getMapper(Bookmapper.class);
		
		List<Book> list = bookmapper.selectbook(s);
		
		request.setAttribute("book", list);
		
		
		request.getRequestDispatcher("select.jsp").forward(request, response);
//		doGet(request, response);
	}

}
