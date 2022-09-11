package com.example.testTask.mapper.chat;

import com.example.testTask.dto.chat.ChatCreateDto;
import com.example.testTask.dto.chat.ChatDto;
import com.example.testTask.entity.chat.Chat;
import com.example.testTask.mapper.base.GenericDtoMapper;
import com.example.testTask.mapper.base.GenericEntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ChatMapper extends
        GenericDtoMapper<Chat, ChatDto>,
        GenericEntityMapper<Chat, ChatDto> {

    @Mapping(source = "users", target = "users", ignore = true)
    Chat toEntity(ChatCreateDto chatCreateDto);

}
