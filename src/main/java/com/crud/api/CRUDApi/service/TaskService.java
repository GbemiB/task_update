package com.crud.api.CRUDApi.service;
import com.crud.api.CRUDApi.model.Task;
import java.util.List;


public interface TaskService {
    List<Task> getTask();
    Task getTaskById(Long id);
    Task insertTask(Task task);
    void updateTask(Long id, Task task);
    void deleteTask(Long taskId);
}
