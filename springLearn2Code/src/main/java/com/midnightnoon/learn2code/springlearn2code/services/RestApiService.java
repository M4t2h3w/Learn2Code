package com.midnightnoon.learn2code.springlearn2code.services;

import com.midnightnoon.learn2code.springlearn2code.model.Employee;
import com.midnightnoon.learn2code.springlearn2code.model.Todo;
import com.midnightnoon.learn2code.springlearn2code.model.TodoList;

import java.util.List;

public interface RestApiService {
    Employee getEmployee(Long id);
    Todo getTodo(Long id);
    List<Todo> getTodos();
//    TodoList getTodoList();
}
