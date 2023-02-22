package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

//*デフォルト存在するファイルだが基本的にいらないので削除してよい */
@MybatisTest
@ActiveProfiles("test")
class DemoApplicationTests {
	@Autowired
	private UserDao userDao;
	@Test
	void DB登録確認テスト(){
		final User act = userDao.findById("test01");
			assertEquals("test01",act.getUserid());
		
	}
}
