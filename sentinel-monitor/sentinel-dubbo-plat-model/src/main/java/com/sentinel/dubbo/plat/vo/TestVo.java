package com.sentinel.dubbo.plat.vo;

import java.io.Serializable;

public class TestVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String message;

	private String head;

	private String body;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
