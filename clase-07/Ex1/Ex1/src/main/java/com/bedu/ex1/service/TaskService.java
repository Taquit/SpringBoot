package com.bedu.ex1.service;

import com.bedu.ex1.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    public List<Task> findAll() {
        return tasks;
    }
    public void addTask(Task task){
        task.setId(nextId++);
        tasks.add(task);
    }
    public void deletTask(Long id){
        tasks.removeIf(task -> task.getId().equals(id));
    }
    public void editTask(Long id,Task updateTask){
        for (int i =0; i <tasks.size();i++){
            if (tasks.get(i).getId())
        }
    }

}
