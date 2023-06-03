package com.learningSpringBoot.firstWebApplication.ToDoApplication.toDo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ToDoService{
	
	private static List<ToDo> todos = new ArrayList<>();
	
	
	
	static {
		todos.add(new ToDo(1, "Nikhil", "Learn Spring Boot", LocalDate.now().plusMonths(2), false));
		todos.add(new ToDo(2, "Nikhil", "Learn Vue", LocalDate.now().plusMonths(2), false));
		todos.add(new ToDo(3, "Nikhil", "Learn React", LocalDate.now().plusMonths(2), false));
		todos.add(new ToDo(4, "Nikhil", "Learn Docker", LocalDate.now().plusMonths(2), false));
	}
	
	public List<ToDo> findByUsername(String user){
		return todos;
	}
}