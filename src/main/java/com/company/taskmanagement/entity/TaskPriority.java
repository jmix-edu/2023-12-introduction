package com.company.taskmanagement.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;

public enum TaskPriority implements EnumClass<String> {

    LOW("L"),
    MEDIUM("M"),
    HIGH("H");

    private final String id;

    TaskPriority(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TaskPriority fromId(String id) {
        for (TaskPriority at : TaskPriority.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}