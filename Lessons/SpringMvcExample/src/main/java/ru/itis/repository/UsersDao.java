package ru.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.itis.models.User;

import java.util.List;

public interface UsersDao extends JpaRepository<User, Integer> {
}
