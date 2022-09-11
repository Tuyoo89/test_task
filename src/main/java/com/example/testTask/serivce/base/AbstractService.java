package com.example.testTask.serivce.base;

import com.example.testTask.dao.base.BaseDao;
import com.example.testTask.mapper.base.BaseMapper;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class AbstractService<R extends BaseDao, M extends BaseMapper> implements BaseService{
    protected R repository;
    protected M mapper;

    @Autowired
    public AbstractService(R repository, M mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

}
