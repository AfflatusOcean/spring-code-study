package com.shen;

import com.shen.bean.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shenjianeng
 * @date 2019-08-03
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean(UserService.class);
		userService.login();
		context.close();
	}
}
