package de.supercode.friends.services;

import de.supercode.friends.entities.Friend;
import de.supercode.friends.entities.FriendsGroup;
import de.supercode.friends.repository.FriendsRepo;
import de.supercode.friends.repository.FriendsGroupRepo;
import org.springframework.stereotype.Service;

@Service
public class FriendsGroupService {
    FriendsGroupRepo friendsGroupRepo;
    FriendsRepo friendsRepo;

    public FriendsGroupService(FriendsGroupRepo friendsGroupRepo, FriendsRepo friendsRepo) {
        this.friendsGroupRepo = friendsGroupRepo;
        this.friendsRepo = friendsRepo;
    }

    public FriendsGroup createNewGroup(FriendsGroup friendsGroup){
        return friendsGroupRepo.save(friendsGroup);
    }

    public void addFriendToFriendGoup(long friendID, long friendsgroupID){
        FriendsGroup friendsGroup = friendsGroupRepo.findById(friendsgroupID).get();
        Friend friend = friendsRepo.findById(friendID).get();
        friendsGroup.getFriends().add(friend);
        friend.setGroup(friendsGroup);
        friendsGroupRepo.save(friendsGroup);
        friendsRepo.save(friend);
    }
}
