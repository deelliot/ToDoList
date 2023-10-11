package com.delliott.todolist

interface TaskItemClickListener {

    fun editTaskItem(taskItem: TaskItem)
    fun completeTaskItem(taskItem: TaskItem)
}