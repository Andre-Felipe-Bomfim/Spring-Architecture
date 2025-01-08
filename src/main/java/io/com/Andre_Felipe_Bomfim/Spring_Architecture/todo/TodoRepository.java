package io.com.Andre_Felipe_Bomfim.Spring_Architecture.todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoRepository, Long> {
}
