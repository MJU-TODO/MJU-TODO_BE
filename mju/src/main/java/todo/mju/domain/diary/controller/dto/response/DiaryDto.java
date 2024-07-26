package todo.mju.domain.diary.controller.dto.response;

import lombok.Builder;
import lombok.Getter;
import todo.mju.domain.diary.entity.Diary;

import java.time.LocalDateTime;

@Getter
public class DiaryDto {
    public final Long diaryId;
    private final String title;
    private final String content;
    private final LocalDateTime createdAt;

    @Builder
    public DiaryDto(Long diaryId, String title, String content, LocalDateTime createdAt) {
        this.diaryId = diaryId;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
    }

    public static DiaryDto of(Diary diary) {
        return DiaryDto.builder()
                .diaryId(diary.getDiaryId())
                .title(diary.getTitle())
                .content(diary.getContent())
                .createdAt(diary.getCreatedAt())
                .build();
    }
}
