package com.learningSpringBoot.firstWebApplication.ToDoApplication.toDo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToDoController{
	
	private ToDoService todoService;
	
	
	
	public ToDoController(ToDoService service) {
		super();
		this.todoService = service;
	}


	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<ToDo> todos = todoService.findByUsername("Nikhil");
		model.put("tasks", todos);
		return "listTodos";
	}
	
}