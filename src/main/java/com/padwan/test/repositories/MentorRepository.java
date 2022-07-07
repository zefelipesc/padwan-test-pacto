package com.padwan.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.padwan.test.domain.Mentor;

@Repository
public interface MentorRepository extends JpaRepository<Mentor, Integer> {

    @Query(value = "SELECT me.* FROM Mentor me", nativeQuery = true)
    List<Mentor> findAllMentorsAndJedis();
}
