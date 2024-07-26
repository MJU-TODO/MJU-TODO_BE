package todo.mju.domain.comment.controller.dto.request;

import lombok.Getter;
import todo.mju.domain.comment.entity.Comment;

@Getter
public class RegisterCommentRequest {

    private String commentContent;

    public Comment toEntity() {
        return Comment.builer()
                .content(commentContent)
                .build();
    }
}
