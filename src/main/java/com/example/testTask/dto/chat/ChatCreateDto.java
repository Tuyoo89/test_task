package com.example.testTask.dto.chat;

import com.example.testTask.dto.base.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChatCreateDto implements BaseDto {
    private String name;
    private List<Long> users;
}
