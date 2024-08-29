package de.supercode.friends.repository;

import de.supercode.friends.entities.FriendsGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendsGroupRepo extends JpaRepository<FriendsGroup,Long> {
}
