package com.app.todoapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.todoapp.models.Task;
import com.app.todoapp.services.TaskServices;



@Controller
// @RequestMapping("/tasks")
public class TaskController {
  
	private final TaskServices taskServices;
	
	public TaskController( TaskServices taskServices) {
		this.taskServices = taskServices;
	
     }
	
	@GetMapping
	public String getTask(Model model) {	
		List<Task> tasks = taskServices.getAllTasks();
		model.addAttribute("tasks", tasks);	
		return "tasks";	
	}
	
	@PostMapping
	public String createTasks(@RequestParam String title) {	
		taskServices.createTask(title);
		return "redirect:/";	
	}
	
	
	@GetMapping("/{id}/delete")
	public String deleteTask(@PathVariable Long id) {	
		taskServices.deleteTask(id);
		return "redirect:/";
	}
	
	@GetMapping("/{id}/toggle")
	public String toggleTask(@PathVariable Long id) {	
		taskServices.toggleTask(id);
		return "redirect:/";
	}
	
}