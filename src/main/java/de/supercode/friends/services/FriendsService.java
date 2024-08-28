package de.supercode.friends.services;

import de.supercode.friends.entities.Friend;
import de.supercode.friends.repository.FriendsRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendsService {

    FriendsRepo friendsRepo;

    public FriendsService(FriendsRepo friendsRepo) {
        this.friendsRepo = friendsRepo;
    }

    public Friend createFriend(Friend friend){
        return this.friendsRepo.save((friend));
    }
    public List<Friend> getAllFriends(){
        return friendsRepo.findAll();
    }
    public Friend getFriend(long id){
        return friendsRepo.findById(id).orElse(null);
    }
    public void updateFriend (long id, Friend friend){
        Friend toUpdateFriend = friendsRepo.findById(friend -> )
        }
}
