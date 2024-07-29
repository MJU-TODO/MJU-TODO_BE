package todo.mju.domain.comment.controller.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class CommentAllResponse {
    private final int commentCount;
    private final List<CommentDto> commentDtos;

    @Builder
    public CommentAllResponse(final int commentCount, final List<CommentDto> commentDtos) {
        this.commentCount = commentCount;
        this.commentDtos = commentDtos;
    }

    public static CommentAllResponse of(List<CommentDto> commentDtos) {
        return CommentAllResponse.builder()
                .commentCount(commentDtos.size())
                .commentDtos(commentDtos)
                .build();
    }
}
