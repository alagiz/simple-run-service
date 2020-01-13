package com.simple.run.repository;

import com.simple.run.model.RunResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRunResultsRepository extends CrudRepository<RunResult, Long> {
    RunResult findById(@Param("id") long id);

    List<RunResult> findAllByUserId(@Param("userId") String userId);
}