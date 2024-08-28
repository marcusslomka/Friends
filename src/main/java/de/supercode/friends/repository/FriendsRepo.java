package de.supercode.friends.repository;

import de.supercode.friends.entities.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendsRepo extends JpaRepository<Friend,Long> {

}
