package org.developeranish.apexconnect.repository;

import org.developeranish.apexconnect.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository  extends JpaRepository<Vote, Long> {
}
