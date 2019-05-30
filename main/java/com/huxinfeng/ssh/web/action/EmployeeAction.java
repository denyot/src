package com.huxinfeng.ssh.web.action;

import com.huxinfeng.ssh.service.IEmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class EmployeeAction extends ActionSupport {
    @Autowired
    private IEmployeeService service;

    @Override
    public String execute() throws Exception {
        ActionContext.getContext().put("employees", service.select());
        return "list";
    }
}
