package com.example.testTask.controller.base;

import com.example.testTask.base.BaseUtils;
import com.example.testTask.dto.base.BaseDto;
import org.springframework.web.bind.annotation.*;
@RestController
public interface GenericCRUDController<D extends BaseDto> extends BaseController{

    @PostMapping(BaseUtils.CREATE_PATH)
    abstract Long create(@RequestBody D DTO);

    @PutMapping(BaseUtils.UPDATE_PATH)
    abstract D update(@RequestBody D DTO);

    @DeleteMapping(BaseUtils.DELETE_PATH)
    abstract Boolean delete(@PathVariable Long id);

}
