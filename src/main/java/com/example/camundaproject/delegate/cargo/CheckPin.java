package com.example.camundaproject.delegate.cargo;

import com.example.camundaproject.entity.Child;
import com.example.camundaproject.service.ChildService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("checkPin")
public class CheckPin implements JavaDelegate {
    @Autowired
    private ChildService service;
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String pin = (String) delegateExecution.getVariable("pin");
        System.out.printf(pin);
    }
}
