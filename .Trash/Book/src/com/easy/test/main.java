package com.easy.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.easy.entity.Book;
import com.easy.mapper.Bookmapper;
import com.easy.util.MybatisUtil;

public class main {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("选择删除的图书编号：");
		System.out.println("按0开始删除");
		//装取用户输入的删除图书编号
		List<Integer> nos = new ArrayList<>();
		//判定用户的输入
		int no = 0;
		while(true) {
			
			//用户输入想删除的图书编号
			no = in.nextInt();
			
			//判断输入是否为零并终止删除
			if(no == 0) {
				break;
				
			}
			
			nos.add(no);
			
		}
		
		SqlSession s = MybatisUtil.getSqlSession();
		
		//使用session会话加载为其定义的sql。并执行相应的sql
		Bookmapper bookmapper = s.getMapper(Bookmapper.class);
		
		bookmapper.deletebook(nos);
		System.out.println("删除成功");
		s.commit();
		s.close();
		
	}
}
