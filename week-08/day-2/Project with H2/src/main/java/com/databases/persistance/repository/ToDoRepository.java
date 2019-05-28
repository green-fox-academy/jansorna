package com.databases.persistance.repository;

import com.databases.persistance.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<Todo, Long> {
}
