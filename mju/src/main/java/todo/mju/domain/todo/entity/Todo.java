package todo.mju.domain.todo.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Todo {
    public final Long todoId;
    private final String todo;
    private final Boolean isFinish;

    public void update(String todo, Boolean isFinish) {
        //구현 X
    }
}

