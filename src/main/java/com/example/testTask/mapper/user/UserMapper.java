package com.example.testTask.mapper.user;

import com.example.testTask.dto.user.UserDto;
import com.example.testTask.entity.user.User;
import com.example.testTask.mapper.base.GenericDtoMapper;
import com.example.testTask.mapper.base.GenericEntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends
        GenericDtoMapper<User, UserDto>,
        GenericEntityMapper<User, UserDto> {
}
