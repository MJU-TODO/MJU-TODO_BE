package todo.mju.domain.diary.controller.dto.response;

import lombok.Builder;
import todo.mju.domain.diary.entity.Diary;

@Builder
public class DiaryResponse {
    private final String title;
    private final String content;

    @Builder
    public DiaryResponse(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public static DiaryResponse from(Diary diary) {
        return DiaryResponse.builder()
                .title(diary.getTitle())
                .content(diary.getContent())
                .build();
    }
}
