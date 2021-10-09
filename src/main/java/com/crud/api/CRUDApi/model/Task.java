package com.crud.api.CRUDApi.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public class Task {
        @Id
        @GeneratedValue
        @Column(updatable = false, nullable = false)
        Long id;
        @Column
        String taskTitle;
        @Column
        String taskDescription;
        @Column
        String taskBeginDate;
        @Column
        String taskEndDate;
        @Column
        String taskSupervisor;
        @Column
        String taskAllowance;
        @Column
        String taskBonus;
        @Column
        TaskStatus taskStatus;
        @CreationTimestamp
        @Column(updatable = false)
        Timestamp dateCreated;
        @UpdateTimestamp
        Timestamp lastModified;

    }
