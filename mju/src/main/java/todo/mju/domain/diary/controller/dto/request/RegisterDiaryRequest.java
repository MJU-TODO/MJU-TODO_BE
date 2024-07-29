package todo.mju.domain.diary.controller.dto.request;

import lombok.Getter;
import todo.mju.domain.diary.entity.Diary;

@Getter
public class RegisterDiaryRequest {

    private String diaryTitle;
    private String diaryContent;

    public Diary toEntity() {
        return Diary.builder()
                .diaryTitle(diaryTitle)
                .diaryContent(diaryContent)
                .build();
    }
}
