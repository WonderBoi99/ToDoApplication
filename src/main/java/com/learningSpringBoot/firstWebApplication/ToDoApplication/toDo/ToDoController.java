package com.learningSpringBoot.firstWebApplication.ToDoApplication.toDo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class ToDoController{
	
	private ToDoService todoService;
	
	
	
	public ToDoController(ToDoService service) {
		super();
		this.todoService = service;
	}


	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<ToDo> todos = todoService.findByUsername("Nikhil");
		model.put("todos", todos);
		return "listTodos";
	}
	
}