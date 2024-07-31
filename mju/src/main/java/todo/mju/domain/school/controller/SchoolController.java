package todo.mju.domain.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import todo.mju.domain.school.entity.School;
import todo.mju.domain.school.service.SchoolService;

import java.util.List;

@RestController
public class SchoolController {

    private final SchoolService schoolService;

    @Autowired
    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping("/api/school")
    public ResponseEntity<School> addSchool(@RequestBody SchoolDto requestDto) {
        School savedSchool = schoolService.save(requestDto);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedSchool);
    }

    @GetMapping("/api/school")
    public ResponseEntity<List<School>> getAllSchool() {
        return ResponseEntity.ok().body(schoolService.findAll());
    }

    @PatchMapping("/api/school/{schoolId}")
    public ResponseEntity<School> updateSchool(@PathVariable Long schoolId, @RequestBody SchoolDto requestDto) {
        School updateSchool = schoolService.update(schoolId, requestDto);
        return ResponseEntity.ok().body(updateSchool);
    }

    @DeleteMapping("/api/school/{schoolId}")
    public ResponseEntity<Void> deleteTodo(@PathVariable long todoId) {
        try {
            schoolService.delete(todoId);
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.noContent().build();
    }
}
