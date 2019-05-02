package com.sree.trc.implementation.web;

import com.sree.trc.framework.service.ParameterService;
import com.sree.trc.framework.web.ParameterController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParameterControllerImpl implements ParameterController {

    @Autowired
    private ParameterService parameterService;

    @Override
    @RequestMapping(value = "/parameter/create", method = RequestMethod.POST)
    public void createParameter(String parameterName, String parameterValue) {
        parameterService.createParameter(parameterName, parameterValue);
    }
}
