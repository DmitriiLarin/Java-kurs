package com.example.developer.repositories;

import com.example.developer.models.Apartment;
import com.example.developer.models.Building;
import lombok.NonNull;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingRepository extends JpaRepository<Building, Integer> {
    List<Building> findByTitleStartsWith(String prefix);
    List<Building> findBuildingsByDistanceBetween(int min, int max);
    Building findBuildingByTitle(String title);
    @NonNull
    List<Building> findAll(@NonNull Sort sorted);
}