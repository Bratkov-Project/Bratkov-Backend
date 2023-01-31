package com.bratkov.project.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonResonse {

    private String message;

    private Object data;

    private boolean status;

    //private String redirect;
}
