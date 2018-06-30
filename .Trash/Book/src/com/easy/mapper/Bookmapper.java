package com.easy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.easy.entity.Book;

public interface Bookmapper {
		List<Book> selectbook(@Param("book") String[] books);
		int deletebook(@Param("nos") List<Integer>list);

}
