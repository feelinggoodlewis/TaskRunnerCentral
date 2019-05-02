package com.sree.trc.implementation.dao.service;

import com.sree.trc.framework.dao.ParameterDao;
import com.sree.trc.implementation.dao.entity.Parameter;
import com.sree.trc.implementation.dao.repository.ParameterRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParameterDaoImpl implements ParameterDao {

    private static final Logger LOGGER = Logger.getLogger(ParameterDaoImpl.class);

    @Autowired
    private ParameterRepository parameterRepository;

    @Override
    public int createParameter(String parameterName, String parameterValue) {
        Parameter newParameter = new Parameter(parameterName, parameterValue);
        parameterRepository.save(newParameter);
        return 0;
    }
}
