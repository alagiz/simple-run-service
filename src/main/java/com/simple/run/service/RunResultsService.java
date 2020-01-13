package com.simple.run.service;

import com.simple.run.model.RunResult;
import com.simple.run.repository.IRunResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunResultsService {
    private IRunResultsRepository runResultsRepository;

    @Autowired
    public RunResultsService(IRunResultsRepository runResultsRepository) {
        this.runResultsRepository = runResultsRepository;
    }

    public List<RunResult> getAllRunResultsByUserId(String userId) {
        return runResultsRepository.findAllByUserId(userId);
    }

    public RunResult getRunResultsId(String runResultId) {
        return runResultsRepository.findById(runResultId);
    }

    public void saveRunResults(RunResult runResult) {
        runResultsRepository.save(runResult);
    }
}