package todo.mju.domain.diary.controller.dto.response;

import lombok.Builder;
import todo.mju.domain.diary.entity.Diary;

@Builder
public class DiaryResponse {
    private final String diaryTitle;
    private final String diaryContent;

    @Builder
    public DiaryResponse(String diaryTitle, String diaryContent) {
        this.diaryTitle = diaryTitle;
        this.diaryContent = diaryContent;
    }

    public static DiaryResponse from(Diary diary) {
        return DiaryResponse.builder()
                .diaryTitle(diary.getDiaryTitle())
                .diaryContent(diary.getDiaryContent())
                .build();
    }
}
