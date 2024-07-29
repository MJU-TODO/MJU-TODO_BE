package todo.mju.domain.diary.controller.dto.response;

import lombok.Builder;
import lombok.Getter;
import todo.mju.domain.diary.entity.Diary;

import java.time.LocalDateTime;

@Getter
public class DiaryDto {
    public final Long diaryId;
    private final String diaryTitle;
    private final String diaryContent;
    private final LocalDateTime createdAt;

    @Builder
    public DiaryDto(Long diaryId, String diaryTitle, String diaryContent, LocalDateTime createdAt) {
        this.diaryId = diaryId;
        this.diaryTitle = diaryTitle;
        this.diaryContent = diaryContent;
        this.createdAt = createdAt;
    }

    public static DiaryDto of(Diary diary) {
        return DiaryDto.builder()
                .diaryId(diary.getDiaryId())
                .diaryTitle(diary.getDiaryTitle())
                .content(diary.getDiaryContent())
                .createdAt(diary.getCreatedAt())
                .build();
    }
}
