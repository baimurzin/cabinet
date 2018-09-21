package org.itlabel.cabinet.repository;


import org.itlabel.cabinet.model.Progress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.itlabel.cabinet.model.enums.TaskStatus;

import java.util.List;

@Repository
public interface ProgressRepository extends JpaRepository<Progress, Long> {

    @Query(nativeQuery = true,
            value = "select * from progress join task on progress.task_id = task.id where task.program_model_id=:id and progress.status='DONE'")
    List<Progress> findAllDoneTasksByGroupId(@Param("id") Long id);

    @Query(nativeQuery = true,
            value = "select * from progress join task on progress.task_id = task.id where task.program_model_id=:id")
    List<Progress> findAllTasksByGroupId(@Param("id") Long id);
//    @Query(nativeQuery = true,
//            value = "select * from progress join task on progress.task_id = task.id where task.program_model_id=:id and task.task_status=DONE")
//    List<Progress> findAllDoneTasksByGroupId(Long id);

}
