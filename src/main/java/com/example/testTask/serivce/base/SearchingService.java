package com.example.testTask.serivce.base;

import com.example.testTask.dto.base.BaseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SearchingService<RD extends BaseDto> extends BaseService{

    public RD get(Long id);

    public List<RD> getAll();

}
