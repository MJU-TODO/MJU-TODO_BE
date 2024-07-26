package todo.mju.domain.comment.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import todo.mju.domain.comment.controller.dto.request.RegisterCommentRequest;
import todo.mju.domain.comment.controller.dto.request.UpdateCommentRequest;
import todo.mju.domain.comment.controller.dto.response.CommentAllResponse;
import todo.mju.domain.comment.entity.Comment;

@RequiredArgsConstructor
@RestController
public class CommentController {

    private final CommentController commentController;

    @PostMapping("/api/comments")
    public ResponseEntity<Comment> registerComment(@RequestBody RegisterCommentRequest request) {
        Comment savedComment = commentService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedComment);
    }

    @GetMapping("/api/comments")
    public ResponseEntity<CommentAllResponse> findAllComments() {
        return ResponseEntity.ok()
                .body(commentService.findDiaries());
    }

    @GetMapping("/api/comments/{commentId}")
    public void findComments(@PathVariable long commentId) {
        Comment comment = commentService.findComment(commentId);
    }

    @PatchMapping("/api/comments/{commentId}")
    public ResponseEntity<Comment> updateComment(@PathVariable long commentId, @RequestBody UpdateCommentRequest request) {
        Comment updateComment = commentService.update(commentId, request);

        return ResponseEntity.ok()
                .body(updateComment);
    }
}
