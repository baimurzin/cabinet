package org.itlabel.cabinet.repository;


import org.itlabel.cabinet.model.GroupModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GroupRepository extends JpaRepository<GroupModel, Long> {

    @Query(nativeQuery = true,
            value = "select group_model_id from user_model where group_model_id=program_model_id and program_model_id=:id")
    Long findGroupIdByProgram(@Param("id") Long id);

}
