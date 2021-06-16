package com.crud.api.CRUDApi.Service;
import com.crud.api.CRUDApi.Model.Todo;
import com.crud.api.CRUDApi.Repository.TodoRepository;
import com.crud.api.CRUDApi.Service.TodoService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Component
public class TodoServiceImp {
    @Service
    public class TodoServiceImpl implements TodoService {

        TodoRepository todoRepository;

        public TodoServiceImpl(TodoRepository todoRepository) {
            this.todoRepository = todoRepository;
        }

        @Override
        public List<Todo> getTodos() {
            List<Todo> todos = new ArrayList<>();
            todoRepository.findAll().forEach(todos::add);
            return todos;
        }

        @Override
        public Todo getTodoById(Long id) {
            return todoRepository.findById(id).get();
        }

        @Override
        public Todo insert(Todo todo) {
            return todoRepository.save(todo);
        }

        @Override
        public void updateTodo(Long id, Todo todo) {
            Todo todoFromDb = todoRepository.findById(id).get();
            System.out.println(todoFromDb.toString());
            todoFromDb.setTodoStatus(todo.getTodoStatus());
            todoFromDb.setDescription(todo.getDescription());
            todoFromDb.setTitle(todo.getTitle());
            todoRepository.save(todoFromDb);
        }

        @Override
        public void deleteTodo(Long todoId) {
            todoRepository.deleteById(todoId);
        }
    }

}
