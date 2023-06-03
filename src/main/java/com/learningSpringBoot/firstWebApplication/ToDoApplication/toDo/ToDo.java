package com.learningSpringBoot.firstWebApplication.ToDoApplication.toDo;

import java.time.LocalDate;

public class ToDo {

	private int id;
	private String user;
	private String task;
	private LocalDate dueDate;
	private boolean completed;

	public ToDo(int id, String user, String task, LocalDate dueDate, boolean completed) {
		super();
		this.id = id;
		this.user = user;
		this.task = task;
		this.dueDate = dueDate;
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", user=" + user + ", task=" + task + ", dueDate=" + dueDate + ", completed="
				+ completed + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}