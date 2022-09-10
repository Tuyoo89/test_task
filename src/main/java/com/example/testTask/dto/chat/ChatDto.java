package com.example.testTask.dto.chat;

import com.example.testTask.dto.base.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChatDto implements BaseDto {
    private String name;
}
