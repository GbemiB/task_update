package com.crud.api.CRUDApi.Service;
import com.crud.api.CRUDApi.Model.Todo;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


public interface TodoService {
    List<Todo> getTodos();
    Todo getTodoById(Long id);
    Todo insert(Todo todo);
    void updateTodo(Long id, Todo todo);
    void deleteTodo(Long todoId);
}
