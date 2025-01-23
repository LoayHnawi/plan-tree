package net.technovisions.plantree.repos;

import net.technovisions.plantree.model.RatingPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RatingPlanRepository extends JpaRepository<RatingPlan, UUID> {
    List<RatingPlan> findAllByOrderByParentIdDescName();
}
