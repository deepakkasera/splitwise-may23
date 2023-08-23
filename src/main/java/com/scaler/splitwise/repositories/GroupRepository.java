package com.scaler.splitwise.repositories;

import com.scaler.splitwise.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
