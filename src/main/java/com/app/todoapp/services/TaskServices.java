package com.app.todoapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.todoapp.models.Task;
import com.app.todoapp.repository.TaskRepository;

@Service
public class TaskServices {
	
	private final TaskRepository taskRepository;
	
	public  TaskServices(TaskRepository taskRepository) {
		this.taskRepository = taskRepository; 
	}

	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return taskRepository.findAll();
		
	}


	public void createTask(String title) {
		// TODO Auto-generated method stub
		Task task = new Task();
		task.setTitle(title);
		task.setCompleted(false);
		taskRepository.save(task);
	}

	public void deleteTask(Long id) {
		// TODO Auto-generated method stub
		taskRepository.deleteById(id);
		
	}

	public void toggleTask(Long id) {
		Task task = taskRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid task id"));
		task.setCompleted(!task.isCompleted());
		taskRepository.save(task);
	}

	



}
