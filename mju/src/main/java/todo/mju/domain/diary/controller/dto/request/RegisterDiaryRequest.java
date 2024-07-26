package todo.mju.domain.diary.controller.dto.request;

import lombok.Getter;
import todo.mju.domain.diary.entity.Diary;

@Getter
public class RegisterDiaryRequest {

    private String title;
    private String content;

    public Diary toEntity() {
        return Diary.builder()
                .title(title)
                .content(content)
                .build();
    }
}
