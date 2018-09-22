package org.itlabel.cabinet.repository;


import org.itlabel.cabinet.model.GroupModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<GroupModel, Long> {

}
