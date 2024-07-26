package todo.mju.domain.diary.controller.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class DiaryAllResponse {
    private final int diaryCount;
    private final List<DiaryDto> diaryDtos;

    @Builder
    public DiaryAllResponse(final int diaryCount, final List<DiaryDto> diaryDtos) {
        this.diaryCount = diaryCount;
        this.diaryDtos = diaryDtos;
    }

    public static DiaryAllResponse of(List<DiaryDto> diaryDtos) {
        return DiaryAllResponse.builder()
                .diaryCount(diaryDtos.size())
                .diaryDtos(diaryDtos)
                .build();
    }
}
