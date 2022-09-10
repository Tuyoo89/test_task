package com.example.testTask.serivce.message;

import com.example.testTask.dao.message.MessageRepository;
import com.example.testTask.mapper.message.MessageMapper;
import com.example.testTask.serivce.base.AbstractService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageService extends AbstractService<MessageRepository, MessageMapper> {
}
