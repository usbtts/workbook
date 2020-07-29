package org.walker.spring.rest.base;

import java.util.ArrayList;
import java.util.List;

public class Result {
	private String resultCode = ResultCode.SUCCESS.toString();
	private List<Object> resultBody = new ArrayList<Object>();

	public Result add(Object obj) {
		this.resultBody.add(obj);
		return this;
	}
	
	public Result code(ResultCode resultCode) {
		this.resultCode = resultCode.toString();
		return this;
	}
	
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public List<Object> getResultBody() {
		return resultBody;
	}
	public void setResultBody(List<Object> resultBody) {
		this.resultBody = resultBody;
	}

	public enum ResultCode {
		SUCCESS, FAILURE;
	}
	
}
