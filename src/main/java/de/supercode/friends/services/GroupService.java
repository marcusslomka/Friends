package de.supercode.friends.services;

import de.supercode.friends.entities.Friend;
import de.supercode.friends.entities.Group;
import de.supercode.friends.repository.FriendsRepo;
import de.supercode.friends.repository.GroupRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupService {
    GroupRepo groupRepo;
    FriendsRepo friendsRepo;

    public GroupService(GroupRepo groupRepo, FriendsRepo friendsRepo) {
        this.groupRepo = groupRepo;
        this.friendsRepo = friendsRepo;
    }

    public Group createNewGroup(Group group){
        return groupRepo.save(group);
    }

    public void addFriendToFriendGroup(long friendID, int groupID){
        Group group = groupRepo.findById(groupID).get();
        Friend friend = friendsRepo.findById(friendID).get();
        group.getFriends().add(friend);
        //friend.setGroup(group);
        groupRepo.save(group);
        friendsRepo.save(friend);
    }
    public Group getGroup(int id){
        return groupRepo.findById(id).orElse(null);
    }
    public List<Group> getAllGroups(){
        return groupRepo.findAll();
    }
    public void deleteGroup(int id){
        groupRepo.deleteById(id);
    }
}
