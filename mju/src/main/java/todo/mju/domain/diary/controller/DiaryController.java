package todo.mju.domain.diary.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import todo.mju.domain.diary.controller.dto.request.RegisterDiaryRequest;
import todo.mju.domain.diary.controller.dto.request.UpdateDiaryRequest;
import todo.mju.domain.diary.controller.dto.response.DiaryAllResponse;
import todo.mju.domain.diary.entity.Diary;

@RequiredArgsConstructor
@RestController
public class DiaryController {

    private final DiaryController diaryController;

    @PostMapping("/api/diaries")
    public ResponseEntity<Diary> registerDiary(@RequestBody RegisterDiaryRequest request) {
        Diary savedDiary = diaryService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedDiary);
    }

    @GetMapping("/api/diaries")
    public ResponseEntity<DiaryAllResponse> findAllDiaries() {
        return ResponseEntity.ok()
                .body(diaiesService.findDiaries());
    }

    @GetMapping("/api/diaries/{diaryId}")
    public void findDiaries(@PathVariable long diaryId) {
        Diary diary = diaryService.findDiary(diaryId);
    }

    @PatchMapping("/api/diaries/{diaryId}")
    public ResponseEntity<Diary> updateDiary(@PathVariable long diaryId, @RequestBody UpdateDiaryRequest request) {
        Diary updateDiary = diaryService.update(diaryId, request);

        return ResponseEntity.ok()
                .body(updateDiary);
    }
}
