package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Computers;
@Repository
public interface ComputersRepository extends JpaRepository<Computers, Long> {

}
