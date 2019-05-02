package com.sree.trc.implementation.service;

import com.sree.trc.framework.dao.ParameterDao;
import com.sree.trc.framework.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParameterServiceImpl implements ParameterService {

    @Autowired
    private ParameterDao parameterDao;

    @Override
    public int createParameter(String parameterName, String parameterService) {
        return parameterDao.createParameter(parameterName, parameterService);
    }
}
