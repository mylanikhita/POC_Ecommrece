package com.demo.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.demo.entity.Watches;
@Repository
public interface WatchesRepository extends JpaRepository<Watches, Long> {
//	 Watches findByList<Watches> findById(Long id);();
//	 List<Watches> findAll();
}
