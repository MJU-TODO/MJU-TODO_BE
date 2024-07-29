package todo.mju.domain.todo.controller;

import lombok.Builder;
import lombok.Getter;
import todo.mju.domain.todo.entity.Todo;

@Getter
public class TodoDto {
    public final Long todoId;
    private final String todo;
    private final Boolean isFinish;

    @Builder
    public TodoDto(Long todoId, String todo, Boolean isFinish) {
        this.todoId = todoId;
        this.todo = todo;
        this.isFinish = isFinish;
    }

    public Todo toEntity() {
        return Todo.builder()
                .todoId(todoId)
                .todo(todo)
                .isFinish(isFinish)
                .build();
    }

    public static TodoDto toDto(Todo todo) {
        return TodoDto.builder()
                .todoId(todo.getTodoId())
                .todo(todo.getTodo())
                .isFinish(todo.getIsFinish())
                .build();
    }

}
