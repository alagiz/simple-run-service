package com.simple.run.controller;

import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.simple.run.service.RunResultsService;

@RunWith(MockitoJUnitRunner.class)
public class RunResultServiceControllerTest {
    @InjectMocks
    private RunResultsController runResultsController;

    @Mock
    private RunResultsService runResultsService;

    private String userId = "fake-user-id";

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shallCallGetAllRunResultsByUserIdOfRunResultsService_WhenGetAllRunResultsByUserIdIsCalled() {
        runResultsController.getAllRunResultsByUserId(userId);

        verify(runResultsService, times(1)).getAllRunResultsByUserId(userId);
    }
}
