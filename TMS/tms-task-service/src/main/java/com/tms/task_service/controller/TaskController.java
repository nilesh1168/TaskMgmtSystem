package com.tms.task_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tms.task_service.service.TaskService;

import commons.dto.IdDTO;
import commons.dto.TaskDTO;

@RestController
@RequestMapping("/tms/api/v1")
public class TaskController {
	
	@Autowired
	TaskService taskService;
	
	@GetMapping("/tasks")
	public List<TaskDTO> getAllTasks(){
		return taskService.getAllTasks();
	}
	
	@PostMapping("/tasks/create")
	public IdDTO createTask(@RequestBody TaskDTO task) {
		return taskService.createTask(task);
	}
	
	@PutMapping("/tasks/update")
	public TaskDTO updateTask(@RequestParam Long id, @RequestBody TaskDTO task) {
		return taskService.updateTask(id,task);
	}
	
	@DeleteMapping("/tasks/delete")
	public Boolean deleteTask(@RequestParam Long id) {
		return taskService.deleteTask(id);
	}
}
