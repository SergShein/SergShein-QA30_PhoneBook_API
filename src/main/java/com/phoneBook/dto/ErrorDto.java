package com.phoneBoo.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Builder
@ToString
@Setter


public class ErrorDto {

    private int status;
    private String error;
    private Object message;
}
