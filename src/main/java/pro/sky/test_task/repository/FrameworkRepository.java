package pro.sky.test_task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.test_task.model.FrameworkModel;

import java.util.List;

@Repository
public interface FrameworkRepository extends JpaRepository<FrameworkModel, Long> {
    List<FrameworkModel> findAllByLanguage(String language);
}
