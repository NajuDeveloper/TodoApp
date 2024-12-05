package com.kotlin.todoapp.addtasks.dominio

import com.kotlin.todoapp.addtasks.data.TaskRepository
import com.kotlin.todoapp.addtasks.ui.model.TaskModel
import javax.inject.Inject

class UpdateTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    suspend operator fun invoke(taskModel: TaskModel){
        taskRepository.update(taskModel)
    }
}