package com.easy.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	
	public static SqlSession getSqlSession(){
		//1.声明Mybatis所要加载的配置文件名。
		String resource = "sqlMapConfig.xml";
		InputStream is = null;
		SqlSession session = null;
		try {
			//is读出的数据流
			is = Resources.getResourceAsStream(resource);
			//ssf
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
			session = ssf.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return session;
	}

}
