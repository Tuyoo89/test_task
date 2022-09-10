package com.example.testTask.serivce.base;

import com.example.testTask.dto.base.AbstractDto;
import com.example.testTask.dto.base.BaseDto;
import org.springframework.stereotype.Service;

@Service
public interface CRUDService<D extends BaseDto> extends BaseService{

    public Long create(D createDto);

    public D update(D updateDto);

    public Boolean delete(Long id);

}
