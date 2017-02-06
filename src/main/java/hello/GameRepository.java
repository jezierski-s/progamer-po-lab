package hello;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by slawek on 2017-01-20.
 */
public interface GameRepository extends JpaRepository<Game, Integer> {
}
