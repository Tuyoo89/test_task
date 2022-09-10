package com.example.testTask.dao.chat;

import com.example.testTask.dao.base.BaseDao;
import com.example.testTask.entity.chat.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long>, BaseDao {
}
