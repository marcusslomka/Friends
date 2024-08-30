package de.supercode.friends.repository;

import de.supercode.friends.entities.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepo extends JpaRepository<Group,Integer> {
}
