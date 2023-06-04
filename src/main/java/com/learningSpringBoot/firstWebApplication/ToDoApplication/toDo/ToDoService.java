package com.learningSpringBoot.firstWebApplication.ToDoApplication.toDo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ToDoService{
	
	private static List<ToDo> todos = new ArrayList<>();
	private static int todosCount = 0;
	
	
	
	static {
		todos.add(new ToDo(++todosCount, "Nikhil", "Learn Spring Boot", LocalDate.now().plusMonths(2), false));
		todos.add(new ToDo(++todosCount, "Nikhil", "Learn Vue", LocalDate.now().plusMonths(2), false));
		todos.add(new ToDo(++todosCount, "Nikhil", "Learn React", LocalDate.now().plusMonths(2), false));
		todos.add(new ToDo(++todosCount, "Nikhil", "Learn Docker", LocalDate.now().plusMonths(2), false));
	}
	
	public List<ToDo> findByUsername(String user){
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		ToDo temp = new ToDo(++todosCount, username, description, targetDate, done);
		todos.add(temp);
	}
}