package com.padwan.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.padwan.test.domain.Jedi;

@Repository
public interface JediCategoryDTORepository extends JpaRepository<Jedi, Integer> {

    //@Query(value = "SELECT obj.status, COUNT(*) FROM Jedi obj GROUP BY obj.status", nativeQuery = true)
    //@Query(value = "SELECT COUNT(obj.id) FROM Jedi obj GROUP BY obj.status", nativeQuery = true)
    //@Query(value = "SELECT COUNT(jedis.*) FROM Jedi jedis", nativeQuery = true)
    //@Query(value = "SELECT obj.status FROM (SELECT status, COUNT(obj.id) FROM Jedi obj GROUP BY obj.status) t JOIN Jedi obj ON obj.status = t.status", nativeQuery = true)
    List<Jedi> findJediQuantityByStatus();
}
