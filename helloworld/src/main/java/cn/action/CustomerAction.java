package cn.action;

import javax.servlet.annotation.WebServlet;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

import com.opensymphony.xwork2.ActionSupport;

@WebServlet(name="/CustomerAction", urlPatterns="/*")
public class CustomerAction extends ActionSupport {
	StrutsPrepareAndExecuteFilter s=new StrutsPrepareAndExecuteFilter();
	private Long custId;

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}
	
	public String findCustomerById() {
		System.out.println("前端过来的客户id是："+custId);
		return SUCCESS;
	}
}
