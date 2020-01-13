package com.simple.run.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RunResult {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;

    @Column(name = "user_id")
    @JsonProperty
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String userId;

    @Column(name = "date")
    @JsonProperty
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Timestamp date;

    @Column(name = "duration")
    @JsonProperty
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer durationInMinutes;

    @Column(name = "distance")
    @JsonProperty
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer distanceInMeters;
}
