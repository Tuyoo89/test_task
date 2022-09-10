package com.example.testTask.dto.message;

import com.example.testTask.dto.base.BaseDto;
import com.example.testTask.dto.user.UserDto;
import com.example.testTask.entity.enums.MessageType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MessageDto implements BaseDto {
    private UserDto author;
    private MessageType contentType;
    private String content;
}
