package de.supercode.friends.repository;

import de.supercode.friends.entities.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FriendsRepo extends JpaRepository<Friend,Long> {
    List<Friend> findByVerdienstGreaterThan(Long verdienst);
}
