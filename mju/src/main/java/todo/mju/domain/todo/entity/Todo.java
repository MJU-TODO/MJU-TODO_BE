package todo.mju.domain.todo.entity;

import lombok.Getter;
import lombok.Builder;

@Getter
@Builder
public class Todo {
    public final Long todoId;
    private final String todo;
    private final Boolean isFinish;
}

