package org.itlabel.cabinet.service;


import org.itlabel.cabinet.model.GroupModel;

import java.util.List;

public interface GroupService {

    GroupModel findGroupById(Long id);

    List<GroupModel> findAllGroups();

}
