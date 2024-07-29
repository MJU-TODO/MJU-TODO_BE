package todo.mju.domain.diary.controller.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UpdateDiaryRequest {
    private String diaryTitle;
    private String diaryContent;
}
