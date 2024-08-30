package de.supercode.friends.controller;

import de.supercode.friends.entities.Group;
import de.supercode.friends.services.GroupService;
import org.hibernate.query.criteria.JpaInPredicate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/groups")
public class GroupsController {

    GroupService groupService;

    public GroupService getGroupService() {
        return groupService;
    }

    public GroupsController(GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping
    public ResponseEntity<Group> createGroup (@RequestBody Group group){
        return ResponseEntity.status(HttpStatus.CREATED).body(groupService.createNewGroup(group));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Group> getGroup(@PathVariable long id){
        return ResponseEntity.status(HttpStatus.FOUND).body(groupService.getGroup(id));
    }
    @GetMapping
    public ResponseEntity<List<Group>> getAllGroup(){
        return ResponseEntity.status(HttpStatus.FOUND).body(groupService.getAllGroups());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGroup (@PathVariable long id){
        groupService.deleteGroup(id);
        return ResponseEntity.noContent().build();
    }
}
