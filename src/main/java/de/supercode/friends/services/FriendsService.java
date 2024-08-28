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
    public Friend updateFriend (long id, Friend friend){
        Friend toUpdateFriend = friendsRepo.findById(id).orElse(null);
        toUpdateFriend.setBeruf(friend.getBeruf());
        toUpdateFriend.setEmail(friend.getEmail());
        toUpdateFriend.setFirstName(friend.getFirstName());
        toUpdateFriend.setGeburtstag(friend.getGeburtstag());
        toUpdateFriend.setHandynummer(friend.getHandynummer());
        toUpdateFriend.setGoodAtVolleyball(friend.getGoodAtVolleyball());
        toUpdateFriend.setLastName(friend.getLastName());
        toUpdateFriend.setVerdienst(friend.getVerdienst());
        return friendsRepo.save(toUpdateFriend);
    }

        public void deleteFriend(long id){
            friendsRepo.deleteById(id);
        }
}
