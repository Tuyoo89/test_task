package com.example.testTask.mapper.message;

import com.example.testTask.dto.chat.ChatDto;
import com.example.testTask.dto.message.MessageDto;
import com.example.testTask.entity.chat.Chat;
import com.example.testTask.entity.message.Message;
import com.example.testTask.mapper.base.GenericDtoMapper;
import com.example.testTask.mapper.base.GenericEntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper extends
        GenericDtoMapper<Message, MessageDto>,
        GenericEntityMapper<Message, MessageDto> {
}
