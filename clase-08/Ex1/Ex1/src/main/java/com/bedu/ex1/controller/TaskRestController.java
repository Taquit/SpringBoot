package com.bedu.ex1.controller;

import com.bedu.ex1.model.Task;
import com.bedu.ex1.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskRestController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public Iterable<Task> getTasks(){
        return taskService.getTasks();
    }

    @PostMapping("/")
    public void addTask(@RequestBody Task newTask){
        taskService.createTask(newTask);
    }

    @PutMapping("/")
    public void updateTask(@RequestBody Task updatetask){
        taskService.updateTask(updatetask);
    }
    @DeleteMapping("/{id}")
    public void deletTask(@PathVariable Long id){
        taskService.deletTask(id);
    }
}
