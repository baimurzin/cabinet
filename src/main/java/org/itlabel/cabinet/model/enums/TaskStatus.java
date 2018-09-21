package org.itlabel.cabinet.model.enums;

public enum TaskStatus {
    NEW("новое"), DONE("закончен"), PROCESS("выполняется");

    private String taskStatus;

    TaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    String getTaskStatus() {
        return this.taskStatus;
    }
}
