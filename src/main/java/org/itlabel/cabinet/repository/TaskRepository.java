package org.itlabel.cabinet.repository;


import org.itlabel.cabinet.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel, Long> {

    @Query(nativeQuery = true, value = "select * from task where program_model_id=:id")
    List<TaskModel> findAllByProgramId(@Param("id") Long id);

}
