package de.supercode.friends.controller;

import de.supercode.friends.entities.Friend;
import de.supercode.friends.services.FriendsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/friends")
public class FriendsController {
    FriendsService friendsService;

    public FriendsController(FriendsService friendsService) {
        this.friendsService = friendsService;
    }

    @PostMapping
    public ResponseEntity<Friend> createFriend (@RequestBody Friend friend){
        return ResponseEntity.status(HttpStatus.CREATED).body(friendsService.createFriend(friend));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Friend> getFriend (@PathVariable long id){
        return ResponseEntity.status(HttpStatus.FOUND).body(friendsService.getFriend(id));
    }
    @GetMapping
    public List<Friend> getAllFriends(){
        return friendsService.getAllFriends();
    }
    @PutMapping
    public ResponseEntity<Friend> updateFriend(long id, Friend friend){
        return ResponseEntity.status(HttpStatus.CREATED).body(friendsService.updateFriend(id,friend));
    }
}
