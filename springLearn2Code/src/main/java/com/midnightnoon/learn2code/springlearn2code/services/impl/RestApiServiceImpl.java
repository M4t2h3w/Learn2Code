package com.midnightnoon.learn2code.springlearn2code.services.impl;

import com.midnightnoon.learn2code.springlearn2code.model.Employee;
import com.midnightnoon.learn2code.springlearn2code.model.Todo;
import com.midnightnoon.learn2code.springlearn2code.model.TodoList;
import com.midnightnoon.learn2code.springlearn2code.services.RestApiService;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RestApiServiceImpl implements RestApiService {

    RestTemplate restTemplate;

    public RestApiServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public Employee getEmployee(Long id) {

        //vytvorim REST template zo Springu

        //z restTemplate zavolam getForObject s adresou odkial (Api) + aky typ dat chcem
        Employee employee =
                restTemplate.getForObject("http://dummy.restapiexample.com/api/v1/employee/3", Employee.class);

        return employee;
    }

    @Override
    public Todo getTodo(Long id) {

        Todo todo = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1", Todo.class);
        return todo;
    }



    @Override
    public List<Todo> getTodos() {

        //ziskam responseEntity cez Api pomocou funkcie exchange
        ResponseEntity<List<Todo>> responseEntity = restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/todos", //url pre Api
                HttpMethod.GET, //typ HTML metody
                null,   //request entity
                new ParameterizedTypeReference<List<Todo>>() {} //parametre pre typy, teraz prazdne
        );

        List<Todo> todos = responseEntity.getBody(); //ziskam z responseEntity Body co je vlastne List Todos
        return todos;
    }

    //toto nefunguje pretoze navratovy format dat nie je zawrapovany do nejakeho objektu navrchu
//    @Override
//    public TodoList getTodoList() {
//        RestTemplate restTemplate = new RestTemplate();
//        TodoList todoList =
//                restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos", TodoList.class);
//        return todoList;
//    }

//    public static void main(String[] args) {
//        RestApiService restApiService = new RestApiServiceImpl();
//        Employee employee = restApiService.getEmployee(3L);
//        System.out.println(employee.getData().getEmployeeName());
//        System.out.println(employee.getData().getEmployeeSalary());
//
//        Todo todo = restApiService.getTodo(1L);
//        System.out.println(todo.getTitle());
//
//        System.out.println(restApiService.getTodos());
//    }
}
