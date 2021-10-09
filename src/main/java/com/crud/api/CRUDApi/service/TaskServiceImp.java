package com.crud.api.CRUDApi.service;
import com.crud.api.CRUDApi.model.Task;
import com.crud.api.CRUDApi.repository.TaskRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskServiceImp {
    @Service
    public class TodoServiceImpl implements TaskService {

        TaskRepository todoRepository;

        public TodoServiceImpl(TaskRepository todoRepository) {
            this.todoRepository = todoRepository;
        }

        @Override
        public List<Task> getTask() {
            List<Task> task = new ArrayList<>();
            todoRepository.findAll().forEach(task::add);
            return task;
        }

        @Override
        public Task getTaskById(Long id) {
            return todoRepository.findById(id).get();
        }

        //TODO

        @Override
        public Task insertTask(Task task) {
            return todoRepository.save(task);
        }

        //TODO

        @Override
        public void updateTask(Long id, Task task) {
            Task taskFromDb = todoRepository.findById(id).get();
            System.out.println(taskFromDb.toString());
            taskFromDb.setTaskStatus(task.getTaskStatus());
            taskFromDb.setTaskDescription(task.getTaskDescription());
            taskFromDb.setTaskTitle(task.getTaskTitle());
            taskFromDb.setTaskAllowance(task.getTaskAllowance());
            taskFromDb.setTaskBonus(task.getTaskBonus());
            taskFromDb.setTaskBeginDate(task.getTaskBeginDate());
            taskFromDb.setTaskEndDate(task.getTaskEndDate());
            taskFromDb.setTaskSupervisor(task.getTaskSupervisor());
            todoRepository.save(taskFromDb);
        }


        @Override
        public void deleteTask(Long taskId) {
            todoRepository.deleteById(taskId);
        }

        //TODO
    }

}
