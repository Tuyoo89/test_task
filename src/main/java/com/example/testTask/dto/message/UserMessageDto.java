package com.example.testTask.dto.message;

import com.example.testTask.dto.base.BaseDto;
import com.example.testTask.entity.enums.MessageType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserMessageDto implements BaseDto {
    @NotNull
    private Long chatId;
    @NotNull
    private Long author;
    private MessageType contentType;
    private String content;
}
