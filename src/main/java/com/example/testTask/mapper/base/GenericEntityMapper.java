package com.example.testTask.mapper.base;

import com.example.testTask.dto.base.BaseDto;
import com.example.testTask.entity.base.AbstractEntity;

import java.util.List;

public interface GenericEntityMapper<E extends AbstractEntity, D extends BaseDto> extends BaseMapper{
    E toEntity(D dto);

    List<E> toEntity(List<D> entities);
}
