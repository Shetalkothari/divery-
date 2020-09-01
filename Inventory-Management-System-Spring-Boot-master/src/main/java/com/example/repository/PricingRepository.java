package com.example.repository;

import com.example.entity.Pricing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricingRepository extends CrudRepository<Pricing, Integer> {


}
