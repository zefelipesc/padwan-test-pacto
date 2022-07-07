package com.padwan.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.padwan.test.domain.Jedi;

@Repository
public interface JediRepository extends JpaRepository<Jedi, Integer> {

    @Query(value = "SELECT obj FROM Jedi obj WHERE obj.mentor.id = :id_mentor", nativeQuery = true)
    List<Jedi> findAllJediByMentor(@Param(value = "id_mentor") Integer id_mentor);

    @Query(value = "SELECT obj.* FROM Jedi obj WHERE obj.midichlorians > 9000 ORDER BY obj.id", nativeQuery = true)
    List<Jedi> findAllJedisByMidichloriansHigherThan9000();

}
