package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Mobiles;
@Repository
public interface MobileRepository extends JpaRepository<Mobiles, Long> {

}
