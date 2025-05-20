package org.example.film.Repository;


import com.example.Entity.Castings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CastingsRepo extends JpaRepository<Castings, Integer> {


    List<Castings> findByMovieId(long movieId);
}