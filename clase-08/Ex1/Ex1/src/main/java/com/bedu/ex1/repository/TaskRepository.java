package com.bedu.ex1.repository;

import com.bedu.ex1.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
