package todo.mju.domain.diary.controller.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class DiaryAllResponse {
    private final List<DiaryDto> diaryDtos;

    @Builder
    public DiaryAllResponse(final List<DiaryDto> diaryDtos) {
        this.diaryDtos = diaryDtos;
    }

    public static DiaryAllResponse of(List<DiaryDto> diaryDtos) {
        return DiaryAllResponse.builder()
                .diaryDtos(diaryDtos)
                .build();
    }
}
