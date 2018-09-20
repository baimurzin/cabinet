package org.itlabel.cabinet.repository;

import org.itlabel.cabinet.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
@Query(value="select * from tasks order by id", nativeQuery = true)
    List<Task> findAllByIdOrderById();
}

