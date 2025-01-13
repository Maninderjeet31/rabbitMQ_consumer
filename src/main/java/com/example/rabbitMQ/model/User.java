package com.example.rabbitMQ.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class User implements Serializable {

    @JsonProperty
    private String fName;

    @JsonProperty
    private String lName;

    @JsonProperty
    private String city;

    @JsonProperty
    private int age;
}
