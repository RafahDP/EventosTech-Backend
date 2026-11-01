package com.eventostec.api.repositories;

import java.util.UUID;
import com.eventostec.api.domain.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepositoy extends JpaRepository<Coupon, UUID>{

}