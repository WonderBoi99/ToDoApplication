<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>
	<body>
		<div>
			<h1>Your Todos</h1>
			<table class="table">
				<thead>
					<tr>
						<th>id</th>
						<th>Description</th>
						<th>Target Date</th>
						<th>Is Done?</th>
					</tr>
				</thead>
				<tbody>		
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.id}</td>
							<td>${todo.task}</td>
							<td>${todo.dueDate}</td>
							<td>${todo.completed}</td>
						</tr>
					</c:forEach> 
				</tbody>
			</table>
			<a href="add-todo" class="btn">Add Todo</a>
		</div>
		
	</body>
</html>