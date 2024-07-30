package todo.mju.domain.school.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class School {
    public final Long schoolId;
    private final String schoolTitle;

    public void update(String title) {
        //구현 X
    }
}
