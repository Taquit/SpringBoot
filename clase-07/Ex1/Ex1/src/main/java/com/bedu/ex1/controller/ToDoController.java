package com.bedu.ex1.controller;

import com.bedu.ex1.model.Task;
import com.bedu.ex1.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class ToDoController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("tasks",taskService.findAll());
        model.addAttribute("newTask",new Task());
        return "index";
    }
    @PostMapping("/add")
    public String addTask(@ModelAttribute Task newTask){
        taskService.addTask(newTask);
        return "redirect:/";
    }
    @PostMapping("/delet/{id}")
    public String deletTask(@PathVariable Long id){
        taskService.deletTask(id);
        return "redirect:/";
    }

    @PostMapping("/update/{id}")
    public String editTask(@PathVariable Long id, @ModelAttribute Task updateTask){
        taskService.editTask(id, updateTask);
        return "redirect:/";
    }
}
