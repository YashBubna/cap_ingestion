package com.capestone.ingestion.main.repository;

import com.capestone.ingestion.main.model.Info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngestionRepo extends JpaRepository<Info, Integer> {
}
