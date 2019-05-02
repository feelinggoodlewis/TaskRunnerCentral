package com.sree.trc.implementation.dao.repository;

import com.sree.trc.implementation.dao.entity.Parameter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterRepository extends CrudRepository<Parameter, Integer> {
//    Parameter findParameterByName(String parameterName);
}
