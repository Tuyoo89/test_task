package com.example.testTask.controller.base;

import com.example.testTask.base.BaseUtils;
import com.example.testTask.dto.base.AbstractDto;
import com.example.testTask.dto.base.BaseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface GenericGLController<D extends BaseDto> {
    @GetMapping(value = BaseUtils.GET_PATH)
    D get(@PathVariable Long id);

    @GetMapping(value = BaseUtils.LIST_PATH)
    List<D> list();
}
