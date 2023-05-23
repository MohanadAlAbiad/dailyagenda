package de.webtech.dailyagenda.repositories;

import de.webtech.dailyagenda.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {  
}