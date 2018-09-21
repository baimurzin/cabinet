package org.itlabel.cabinet.repository;

import org.itlabel.cabinet.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

    @Query(nativeQuery = true, value = "select * from user_model where program_model_id=:id")
    List<UserModel> findAllByProgramId(@Param("id") Long id);

}
