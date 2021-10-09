package com.crud.api.CRUDApi.controller;
import com.crud.api.CRUDApi.service.TaskService;
import com.crud.api.CRUDApi.model.Task;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TodoController {

    TaskService todoService;

    public TodoController(TaskService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasksTotal = todoService.getTask();
        return new ResponseEntity<>(tasksTotal, HttpStatus.OK);
    }


    @GetMapping({"/{taskId}"})
    public ResponseEntity<Task> getTask(@PathVariable Long taskId) {
        return new ResponseEntity<>(todoService.getTaskById(taskId), HttpStatus.OK);
    }


    @PostMapping("")
    public ResponseEntity<Task> saveTask(@RequestBody Task todo) {
        HttpHeaders httpHeaders = new HttpHeaders();
        Task rawTask = todoService.insertTask(todo);
        httpHeaders.add("task",
                "/api/v1/task/" + rawTask.getId());
        return new ResponseEntity<>(rawTask, httpHeaders, HttpStatus.CREATED);
    }


    @PutMapping({"/{taskId}"})
    public ResponseEntity<Task> updateTask(@PathVariable("taskId") Long taskId, @RequestBody Task task) {
        todoService.updateTask(taskId, task);
        return new ResponseEntity<>(todoService.getTaskById(taskId), HttpStatus.OK);
    }


    @DeleteMapping({"/{taskId}"})
    public ResponseEntity<Task> deleteTask(@PathVariable("taskId") Long taskId) {
        todoService.deleteTask(taskId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
