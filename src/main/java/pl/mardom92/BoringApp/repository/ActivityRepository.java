package pl.mardom92.BoringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mardom92.BoringApp.model.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

    boolean existsByKey(String key);
}
