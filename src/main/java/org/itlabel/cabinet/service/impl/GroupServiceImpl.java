package org.itlabel.cabinet.service.impl;

import org.itlabel.cabinet.model.GroupModel;
import org.itlabel.cabinet.repository.GroupRepository;
import org.itlabel.cabinet.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GroupServiceImpl implements GroupService {

    private GroupRepository groupRepository;

    @Autowired
    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public GroupModel findGroupById(Long id) {
        return groupRepository.getOne(id);
    }

    @Override
    public List<GroupModel> findAllGroups() {
        return groupRepository.findAll();
    }
}
