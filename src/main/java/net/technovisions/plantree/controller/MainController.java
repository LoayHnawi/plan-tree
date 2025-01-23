package net.technovisions.plantree.controller;

import java.util.List;

import net.technovisions.plantree.model.RatingPlan;
import net.technovisions.plantree.repos.RatingPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("nodes")
public class MainController {

    @Autowired
    RatingPlanRepository ratingPlanRepository;

    @GetMapping
    public List<RatingPlan> nodes() {
        return ratingPlanRepository.findAllByOrderByParentIdDescName();
    }


}
