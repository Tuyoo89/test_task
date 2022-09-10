package com.example.testTask.dao.user;

import com.example.testTask.dao.base.BaseDao;
import com.example.testTask.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, BaseDao {
}
