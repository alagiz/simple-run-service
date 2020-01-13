package com.simple.run.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.simple.run.model.RunResult;

@Repository
public interface IRunResultsRepository extends CrudRepository<RunResult, Long> {
    RunResult findById(@Param("id") String id);

    List<RunResult> findAllByUserId(@Param("userId") String userId);
}