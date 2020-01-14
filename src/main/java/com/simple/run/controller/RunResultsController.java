package com.simple.run.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.simple.run.model.RunResult;
import com.simple.run.service.RunResultsService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Rest controller, provides /run-results endpoint
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/run-results")
public class RunResultsController {
    private RunResultsService runResultsService;

    @Autowired
    protected RunResultsController(RunResultsService runResultsService) {
        this.runResultsService = runResultsService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Get all run results by user id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully fetched the run results by user id"),
            @ApiResponse(code = 401, message = "You are not authorized to get the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public List<RunResult> getAllRunResultsByUserId(@RequestParam String userId) {
        return runResultsService.getAllRunResultsByUserId(userId);
    }

    @GetMapping(("/{runResultId}"))
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Get run result by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully fetched the run result by id"),
            @ApiResponse(code = 401, message = "You are not authorized to get the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public RunResult getRunResultById(@PathVariable long runResultId) {
        return runResultsService.getRunResultById(runResultId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Post the run results")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successfully posted the run results"),
            @ApiResponse(code = 401, message = "You are not authorized to access the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public void createReport(@RequestBody RunResult runResult) {
        runResultsService.saveRunResults(runResult);
    }
}