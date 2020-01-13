package com.simple.run.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
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
    private Long durationInMinutes;

    @Column(name = "distance")
    @JsonProperty
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long distanceInMeters;
}
