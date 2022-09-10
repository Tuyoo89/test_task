package com.example.testTask.serivce.base;

import com.example.testTask.dao.base.BaseDao;
import com.example.testTask.mapper.base.BaseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public abstract class AbstractService<R extends BaseDao, M extends BaseMapper> implements BaseService{
    protected R repository;
    protected M mapper;
}
