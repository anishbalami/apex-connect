package org.developeranish.apexconnect.repository;

import org.developeranish.apexconnect.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends JpaRepository<Post, Long>
{

}
