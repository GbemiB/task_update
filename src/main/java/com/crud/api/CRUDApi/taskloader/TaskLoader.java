package com.crud.api.CRUDApi.taskloader;
import com.crud.api.CRUDApi.model.Task;
import com.crud.api.CRUDApi.model.TaskStatus;
import com.crud.api.CRUDApi.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

    @Component
    public class TaskLoader implements CommandLineRunner {
        public final TaskRepository todoRepository;

        public TaskLoader(TaskRepository todoRepository) {
            this.todoRepository = todoRepository;
        }

        @Override
        public void run(String... args) throws Exception {
            loadTask();
        }

        private void loadTask() {
            if (todoRepository.count() == 0) {
                todoRepository.save(
                        Task.builder()
                                .taskTitle("Updating customer profile")
                                .taskDescription("Agent should generated profile for all clients and " +
                                        "updated them in company's database. This should be done with all" +
                                        "accuracy")
                                .taskStatus(TaskStatus.COMPLETED)
                                .taskAllowance("$3000")
                                .taskBonus("$80")
                                .taskBeginDate("2021-10-01")
                                .taskEndDate("2021-10-08")
                                .taskSupervisor("Dr Yaruna (phD)")
                                .build()
                );

                todoRepository.save(
                        Task.builder()
                                .taskTitle("Updating customer profile")
                                .taskDescription("Agent should generated profile for all clients and " +
                                        "updated them in company's database. This should be done with all" +
                                        "accuracy")
                                .taskStatus(TaskStatus.NOT_COMPLETED)
                                .taskAllowance("$0")
                                .taskBonus("$10")
                                .taskBeginDate("2021-10-01")
                                .taskEndDate("2021-10-08")
                                .taskSupervisor("Dr Karmalunes (phD)")
                                .build()
                );

                todoRepository.save(
                        Task.builder()
                                .taskTitle("Updating customer profile")
                                .taskDescription("Agent should generated profile for all clients and " +
                                        "updated them in company's database. This should be done with all" +
                                        "accuracy")
                                .taskStatus(TaskStatus.PENDING)
                                .taskAllowance("$0")
                                .taskBonus("$20")
                                .taskBeginDate("2021-10-01")
                                .taskEndDate("2021-10-08")
                                .taskSupervisor("Dr Jamesules (phD)")
                                .build()
                );

                todoRepository.save(
                        Task.builder()
                                .taskTitle("Updating customer profile")
                                .taskDescription("Agent should generated profile for all clients and " +
                                        "updated them in company's database. This should be done with all" +
                                        "accuracy")
                                .taskStatus(TaskStatus.OVERDUE)
                                .taskAllowance("$0")
                                .taskBonus("$10")
                                .taskBeginDate("2021-10-01")
                                .taskEndDate("2021-10-08")
                                .taskSupervisor("Dr Lokeusbnm (phD)")
                                .build()
                );

                todoRepository.save(
                        Task.builder()
                                .taskTitle("Updating customer profile")
                                .taskDescription("Agent should generated profile for all clients and " +
                                        "updated them in company's database. This should be done with all" +
                                        "accuracy")
                                .taskStatus(TaskStatus.OVERDUE)
                                .taskAllowance("$0")
                                .taskBonus("$0")
                                .taskBeginDate("2021-10-01")
                                .taskEndDate("2021-10-08")
                                .taskSupervisor("Dr Kumes (phD)")
                                .build()
                );
                System.out.println("Sample Todos Loaded");
            }
        }
    }

