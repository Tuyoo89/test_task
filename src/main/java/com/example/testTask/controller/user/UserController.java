package com.example.testTask.controller.user;

import com.example.testTask.controller.base.AbstractController;
import com.example.testTask.controller.base.GenericCRUDController;
import com.example.testTask.dto.chat.ChatDto;
import com.example.testTask.dto.user.UserDto;
import com.example.testTask.exception.custom_exception.ApiRequestException;
import com.example.testTask.serivce.user.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users/")
public class UserController extends AbstractController<UserService> implements GenericCRUDController<UserDto> {

    public UserController(UserService service) {
        super(service);
    }

    @Override
    public ResponseEntity<Long> create(UserDto DTO) throws ApiRequestException {
        return ResponseEntity.ok(service.create(DTO));
    }

    @Override
    public UserDto update(UserDto DTO) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @GetMapping("get/chats/{id}")
    public ResponseEntity<List<ChatDto>> getUserChat(@PathVariable Long id){
        return ResponseEntity.ok(service.getUserChat(id));
    }
}
