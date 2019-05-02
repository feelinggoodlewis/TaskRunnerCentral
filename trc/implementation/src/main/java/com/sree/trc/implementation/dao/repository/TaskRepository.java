package com.sree.trc.implementation.dao.repository;

import com.sree.trc.implementation.dao.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}
