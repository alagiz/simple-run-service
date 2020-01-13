package com.simple.run.service;

import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.simple.run.model.RunResult;
import com.simple.run.repository.IRunResultsRepository;

@RunWith(MockitoJUnitRunner.class)
public class RunResultServiceTest {
    @InjectMocks
    private RunResultsService runResultsService;

    @Mock
    private IRunResultsRepository iRunResultsRepository;

    private RunResult runResult = new RunResult();
    private String userId = "fake-user-id";

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shallCallFindAllByUserIdOfIRunResultsRepository_WhenGetAllRunResultsByUserIdIsCalled() {
        runResultsService.getAllRunResultsByUserId(userId);

        verify(iRunResultsRepository, times(1)).findAllByUserId(userId);
    }

    @Test
    public void shallCallSaveOfIRunResultsRepository_WhenSaveRunResultsIsCalled() {
        runResultsService.saveRunResults(runResult);

        verify(iRunResultsRepository, times(1)).save(runResult);
    }
}
