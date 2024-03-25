package org.developeranish.apexconnect.repository;

import org.developeranish.apexconnect.model.ApexChannel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ApexChannelRepository extends JpaRepository<ApexChannel, Long> {
}
