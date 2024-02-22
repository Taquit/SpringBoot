package com.bedu.ex1.service;

import com.bedu.ex1.model.Task;
import com.bedu.ex1.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public void deletTask(Long id){
        taskRepository.deleteById(id);
    }

    public void deletAllTask(){
        taskRepository.deleteAll();
    }

    public Task getTask(Long id){
        return taskRepository.findById(id).orElse(null);
    }
    public Iterable<Task> getTasks(){
        return taskRepository.findAll();
    }
    public void createTask(Task task){
        taskRepository.save(task);
    }
    public void updateTask(Task task){
        taskRepository.save(task);
    }
}
