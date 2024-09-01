package com.tms.task_service.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tms.task_service.entity.Task;
import com.tms.task_service.mapper.TaskDTOMapper;
import com.tms.task_service.repository.TaskRepository;

import commons.dto.IdDTO;
import commons.dto.TaskDTO;

@Service
public class TaskService {
	@Autowired
	TaskRepository taskRepo;

	@Autowired
	TaskDTOMapper taskDTOMapper;
	
	public List<TaskDTO> getAllTasks() {
		return taskRepo.findAll().stream().map(taskDTOMapper).collect(Collectors.toList());
	}

	public IdDTO createTask(TaskDTO task) {
		Task newTask = new Task();
		newTask.setTaskDescription(task.taskDescription());
		newTask.setTaskName(task.taskName());
		newTask.setTaskStatus(task.taskStatus());
		newTask = taskRepo.save(newTask);
		
		return new IdDTO(newTask.getId());
	}

	public TaskDTO updateTask(Long taskId, TaskDTO task) {
		Optional<Task> optTask = taskRepo.findById(taskId);
		if(!optTask.isEmpty()) {
			Task currTask = optTask.get();
			currTask.setTaskDescription(task.taskDescription());
			currTask.setTaskName(task.taskName());
			currTask.setTaskStatus(task.taskStatus());
			Task updatedTask = taskRepo.save(currTask);
			return taskDTOMapper.apply(updatedTask);
		}
		
		return null;
	}

	public Boolean deleteTask(Long id) {
		taskRepo.deleteById(id);
		return true;
	}
	
	
}
