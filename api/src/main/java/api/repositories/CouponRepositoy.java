package api.repositories;

import java.util.UUID;
import api.domain.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepositoy extends JpaRepository<Coupon, UUID>{

}