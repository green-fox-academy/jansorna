package com.greenfox.jan.mysql.repositories;

import com.greenfox.jan.mysql.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

    List<ToDo> findAllByDoneIsFalseOrderById();

    List<ToDo> findAllByTitleLikeOrDescriptionLike(String word, String word2);

    List<ToDo> findAllByIdGreaterThanOrderById(long number);

    }