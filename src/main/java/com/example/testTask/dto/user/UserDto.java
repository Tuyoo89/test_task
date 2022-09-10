package com.example.testTask.dto.user;

import com.example.testTask.dto.base.AbstractDto;
import com.example.testTask.dto.base.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto implements BaseDto {
    private String username;
}
