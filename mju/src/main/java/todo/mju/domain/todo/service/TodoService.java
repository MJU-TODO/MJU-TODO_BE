package todo.mju.domain.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todo.mju.domain.todo.repository.TodoRepository;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) { this.todoRepository = todoRepository; }
}
