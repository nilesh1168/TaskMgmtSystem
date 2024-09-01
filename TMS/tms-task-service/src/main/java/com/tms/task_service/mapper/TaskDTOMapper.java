package com.tms.task_service.mapper;

import java.util.function.Function;

import org.springframework.stereotype.Service;

import com.tms.task_service.entity.Task;

import commons.dto.TaskDTO;

@Service
public class TaskDTOMapper implements Function<Task, TaskDTO> {

	@Override
	public TaskDTO apply(Task task) {
		return new TaskDTO(task.getTaskName(), task.getTaskDescription(), task.getTaskStatus());
	}

}
