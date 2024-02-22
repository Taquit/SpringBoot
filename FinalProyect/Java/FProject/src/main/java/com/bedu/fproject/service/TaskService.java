package com.bedu.fproject.service;

import com.bedu.fproject.model.Task;
import com.bedu.fproject.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void creatTask(Task task){
        taskRepository.save(task);
    }

    public void updateTask(Task task){
        taskRepository.save(task);
    }

    public void deletTask(Long id){
        taskRepository.deleteById(id);
    }

    public void deletAllTask(){
        taskRepository.deleteAll();
    }

    public Optional<Task> getTask(Long id){
        return  taskRepository.findById(id);
    }

    public Iterable <Task> getTasks(){
        return taskRepository.findAll();
    }
}
