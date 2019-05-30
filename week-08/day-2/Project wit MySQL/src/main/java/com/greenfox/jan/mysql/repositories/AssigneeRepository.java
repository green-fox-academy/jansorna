package com.greenfox.jan.mysql.repositories;

import com.greenfox.jan.mysql.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
    List<Assignee> findAllByIdGreaterThanOrderById(long number);

    List<Assignee> findAllByNameLikeIgnoreCaseOrderById(String word);

}
