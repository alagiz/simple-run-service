package com.simple.run.controller;

import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

import java.sql.Timestamp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.simple.run.model.RunResult;
import com.simple.run.service.RunResultsService;

@RunWith(MockitoJUnitRunner.class)
public class RunResultServiceControllerTest {
    @InjectMocks
    private RunResultsController runResultsController;

    @Mock
    private RunResultsService runResultsService;

    private String userId = "fake-user-id";
    private long runResultId = 0;
    private RunResult runResult = new RunResult();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);

        runResult.setUserId(userId);
        runResult.setDate(new Timestamp(System.currentTimeMillis()));
        runResult.setDistanceInMeters(3L);
        runResult.setDurationInMinutes(3L);
    }

    @Test
    public void shallCallGetAllRunResultsByUserIdOfRunResultsService_WhenGetAllRunResultsByUserIdIsCalled() {
        runResultsController.getAllRunResultsByUserId(userId);

        verify(runResultsService, times(1)).getAllRunResultsByUserId(userId);
    }

    @Test
    public void shallCallGetRunResultByIdOfRunResultsService_WhenGetRunResultByIdIsCalled() {
        runResultsController.getRunResultById(runResultId);

        verify(runResultsService, times(1)).getRunResultById(runResultId);
    }

    @Test
    public void shallCallSaveRunResultsOfRunResultsService_WhenCreateReportIsCalled() {
        runResultsController.createReport(runResult);

        verify(runResultsService, times(1)).saveRunResults(runResult);
    }
}
