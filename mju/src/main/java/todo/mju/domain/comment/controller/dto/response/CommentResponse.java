package todo.mju.domain.comment.controller.dto.response;

import lombok.Builder;
import todo.mju.domain.comment.entity.Comment;

@Builder
public class CommentResponse {
    private final String commentContent;

    @Builder
    public CommentResponse(String commentContent) {
        this.commentContent = commentContent;
    }

    public static CommentResponse from(Comment comment) {
        return CommentResponse.builder()
                .commentContent(comment.getCommentContent())
                .build();
    }
}
