package todo.mju.domain.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import todo.mju.domain.todo.service.TodoService;
import todo.mju.domain.todo.entity.Todo;

import java.util.List;

@RestController
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/api/todo")
    public ResponseEntity<Todo> addTodo(@RequestBody TodoDto requestDto) {
        Todo savedTodo = todoService.save(requestDto);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedTodo);
    }

    @GetMapping("/api/todo")
    public ResponseEntity<List<Todo>> getAllTodo(){
        return ResponseEntity.ok().body(todoService.findAll());
    }

    @GetMapping("/api/todo/{todoId}")
    public void getTodo(@PathVariable Long todoId){
        Todo todo = todoService.findTodoById(todoId);
    }

    @PatchMapping("/api/todo/{todoId}")
    public ResponseEntity<Todo> updateTodo(@PathVariable long todoId, @RequestBody TodoDto requestDto){
        Todo updateTodo = todoService.update(todoId, requestDto);
        return ResponseEntity.ok().body(updateTodo);
    }

    @DeleteMapping("/api/todo/{todoId}")
    public ResponseEntity<Void> deleteTodo(@PathVariable long todoId) {
        try {
            todoService.delete(todoId);
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.noContent().build();
    }
}
