package com.example.testTask.controller.base;

import com.example.testTask.serivce.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractController<S extends BaseService> implements BaseController{
    protected S service;

    @Autowired
    public AbstractController(S service){
        this.service = service;
    }

}

