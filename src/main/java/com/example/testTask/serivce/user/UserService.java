package com.example.testTask.serivce.user;

import com.example.testTask.dao.user.UserRepository;
import com.example.testTask.dto.chat.ChatDto;
import com.example.testTask.dto.user.UserDto;
import com.example.testTask.mapper.chat.ChatMapper;
import com.example.testTask.mapper.user.UserMapper;
import com.example.testTask.serivce.base.AbstractService;
import com.example.testTask.serivce.base.CRUDService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends AbstractService<UserRepository, UserMapper>
        implements CRUDService<UserDto> {

    private ChatMapper chatMapper;

    public UserService(UserRepository repository, UserMapper mapper, ChatMapper chatMapper) {
        super(repository, mapper);
        this.chatMapper = chatMapper;
    }

    @Override
    public Long create(UserDto createDto) {
       return repository.save(mapper.toEntity(createDto)).getId();
    }

    @Override
    public UserDto update(UserDto updateDto) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    public List<ChatDto> getUserChat(Long id){
        return chatMapper.toDto(repository.getChatByUserId(id));
    }
}
