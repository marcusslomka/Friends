package de.supercode.friends.services;

import de.supercode.friends.entities.Friend;
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

    public Friend
}
