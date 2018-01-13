package com.shsxt;

import org.springframework.stereotype.Service;

import com.shsxt.api.IHelloService;

@Service
public class HelloServiceImpl implements IHelloService {

	public String sayHello(String msg) {
		return "服务端 收到  信息  ：" + msg;
	}

}
