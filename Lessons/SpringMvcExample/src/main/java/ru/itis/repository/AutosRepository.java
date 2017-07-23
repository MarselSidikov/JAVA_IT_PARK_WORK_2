package ru.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.models.Auto;

import java.util.List;

public interface AutosRepository extends JpaRepository<Auto, Integer> {
    List<Auto> findAllByOwnerId(int userId);
}
