package com.greenfox.rest.repositories;

import com.greenfox.rest.models.log.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log, Long> {
}
