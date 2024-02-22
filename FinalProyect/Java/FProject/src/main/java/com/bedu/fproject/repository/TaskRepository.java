package com.bedu.fproject.repository;

import com.bedu.fproject.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
