package todo.mju.domain.comment.controller.dto.response;

import lombok.Builder;
import lombok.Getter;
import todo.mju.domain.comment.entity.Comment;

@Getter
public class CommentDto {
    public final Long commentId;
    private final String content;

    @Builder
    public CommentDto(Long commentId, String content) {
        this.commentId = commentId;
        this.content = content;
    }

    public static CommentDto of(Comment comment) {
        return CommentDto.builder()
                .commentId(comment.getCommentId())
                .content(comment.getContent())
                .build();
    }
}
