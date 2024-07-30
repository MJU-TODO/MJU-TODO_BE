package todo.mju.domain.todo.repository;

import org.springframework.stereotype.Repository;
import todo.mju.domain.todo.entity.Todo;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {

    private static long sequence = 0L;

//    public Todo save(Todo todo) {
//        todo.setTodoId(++sequence);
//    }
//
//    public List<Todo> findAll() {
//        return new ArrayList<Todo>();
//    }
}
