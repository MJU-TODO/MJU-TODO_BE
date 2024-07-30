package todo.mju.domain.school.controller;

import lombok.Builder;
import lombok.Getter;
import todo.mju.domain.school.entity.School;

@Getter
public class SchoolDto {
    public final Long schoolId;
    private final String schoolTitle;

    @Builder
    public SchoolDto(Long schoolId, String schoolTitle) {
        this.schoolId = schoolId;
        this.schoolTitle = schoolTitle;
    }

    public School toEntity() {
        return School.builder()
                .schoolId(schoolId)
                .schoolTitle(schoolTitle)
                .build();
    }

    public static SchoolDto toDto(School school) {
        return SchoolDto.builder()
                .schoolId(school.getSchoolId())
                .schoolTitle(school.getSchoolTitle())
                .build();
    }
}