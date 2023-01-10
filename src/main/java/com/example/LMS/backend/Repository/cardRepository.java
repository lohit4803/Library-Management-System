package com.example.LMS.backend.Repository;

import com.example.LMS.backend.models.card;
import com.sun.deploy.panel.JavaPanel;
import com.sun.prism.j2d.J2DPipeline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cardRepository extends JpaRepository<card,Integer> {
}
