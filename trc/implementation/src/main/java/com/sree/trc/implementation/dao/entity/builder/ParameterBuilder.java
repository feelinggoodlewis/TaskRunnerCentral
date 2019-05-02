package com.sree.trc.implementation.dao.entity.builder;

import com.sree.trc.implementation.dao.entity.Parameter;

import java.util.List;
import java.util.stream.Collectors;

public class ParameterBuilder {
    public static List<Parameter> createDBParameterList(List<com.sree.trc.framework.domain.Parameter> parameters) {
        return parameters.stream()
                .map(parameter -> new Parameter(parameter.getParameterName(), parameter.getParameterValue()))
                .collect(Collectors.toList());
    }

    public static List<com.sree.trc.framework.domain.Parameter> createParameterListFromDB(List<Parameter> parameterList) {
        return parameterList.stream()
                .map(parameter -> new com.sree.trc.framework.domain.Parameter(parameter.getParameterName(), parameter.getParameterValue()))
                .collect(Collectors.toList());
    }
}
