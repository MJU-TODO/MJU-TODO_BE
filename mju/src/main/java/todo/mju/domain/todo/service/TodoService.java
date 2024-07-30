package todo.mju.domain.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todo.mju.domain.todo.controller.TodoDto;
import todo.mju.domain.todo.entity.Todo;
import todo.mju.domain.todo.repository.TodoRepository;

import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) { this.todoRepository = todoRepository; }

    //아래로 전부 구현X
    public Todo save(TodoDto requestDto) {
        return todoRepository.save(requestDto.toEntity());
    }

    public List<Todo> findAll() {
        return null;
    }

    public Todo findTodoById(Long id) {
        return null;
    }

    public Todo update(long id, TodoDto requestDto) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당하는 Todo가 없습니다. id = " + id));
        todo.update(requestDto.getTodo(), requestDto.getIsFinish());
        return todo;
    }
}
