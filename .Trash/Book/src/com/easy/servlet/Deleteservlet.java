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

import com.easy.mapper.Bookmapper;
import com.easy.util.MybatisUtil;

/**
 * Servlet implementation class Deleteservlet
 */
@WebServlet("/Deleteservlet.do")
public class Deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub//解决乱码

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		//获取查询页面checkbox的数据
		String[] booknos = request.getParameterValues("booknos");
		System.out.println(booknos);
		//装取删除图书编号list
		List<Integer> list = new ArrayList<>();
		
		for(String s:booknos) {
				int book = Integer.parseInt(s);
				list.add(book);
		}
		
		SqlSession session = MybatisUtil.getSqlSession();
		//使用session会话加载为其定义的sql。并执行相应的sql
		Bookmapper bookmapper = session.getMapper(Bookmapper.class);
	
		bookmapper.deletebook(list);
		
		System.out.println("删除成功");
		request.getRequestDispatcher("select.jsp").forward(request, response);
		
		session.commit();
		session.close();		
		
//		doGet(request, response);
	}

}
