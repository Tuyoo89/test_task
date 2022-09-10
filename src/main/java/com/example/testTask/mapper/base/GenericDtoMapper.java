package com.example.testTask.mapper.base;

import com.example.testTask.dto.base.BaseDto;
import com.example.testTask.entity.base.AbstractEntity;

import java.util.List;

public interface GenericDtoMapper<E extends AbstractEntity, D extends BaseDto> extends BaseMapper{

    D toDto(E entity);

    List<D> toDto(List<E> entities);

}
