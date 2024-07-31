package todo.mju.domain.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todo.mju.domain.school.controller.SchoolDto;
import todo.mju.domain.school.entity.School;
import todo.mju.domain.school.repository.SchoolRepository;

import java.util.List;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;

    @Autowired
    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public School save(SchoolDto schoolDto) {
        return schoolRepository.save(schoolDto.toEntity());
    }

    public List<School> findAll() {
        return null;
    }
    public School findById(Long id) {
        return null;
    }
    public School update(long id, SchoolDto requestDto) {
        School school = schoolRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당하는 학사일정이 없습니다. id = " + id));
        school.update(requestDto.getSchoolTitle());
        return school;
    }
    public void delete(long id) { }
}
