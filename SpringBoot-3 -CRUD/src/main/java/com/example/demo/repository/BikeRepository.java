package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, String>
{

}
