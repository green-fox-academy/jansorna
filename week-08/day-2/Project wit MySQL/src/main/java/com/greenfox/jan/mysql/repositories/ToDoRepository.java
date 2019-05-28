package com.greenfox.jan.mysql.repositories;

import com.greenfox.jan.mysql.models.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}