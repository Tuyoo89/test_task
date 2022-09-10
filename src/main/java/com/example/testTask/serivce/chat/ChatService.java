package com.example.testTask.serivce.chat;

import com.example.testTask.dao.chat.ChatRepository;
import com.example.testTask.dto.chat.ChatDto;
import com.example.testTask.mapper.chat.ChatMapper;
import com.example.testTask.serivce.base.AbstractService;
import com.example.testTask.serivce.base.CRUDService;
import com.example.testTask.serivce.base.SearchingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ChatService extends AbstractService<ChatRepository, ChatMapper>
        implements CRUDService<ChatDto>,
        SearchingService<ChatDto> {

    @Override
    public Long create(ChatDto createDto) {
        return null;
    }

    @Override
    public ChatDto update(ChatDto updateDto) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public ChatDto get(Long id) {
        return null;
    }

    @Override
    public List<ChatDto> getAll() {
        return null;
    }
}
