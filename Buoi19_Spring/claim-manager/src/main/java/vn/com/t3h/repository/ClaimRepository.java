package vn.com.t3h.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.com.t3h.entity.ClaimEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClaimRepository extends JpaRepository<ClaimEntity,Long> {

    @Query("SELECT c FROM ClaimEntity c WHERE c.customerEntity.id = :customerId")
    List<ClaimEntity> findAllClaimsByCustomerId(@Param("customerId") Long customerId);

    @Query(value = "SELECT * FROM claim WHERE amount > :amount", nativeQuery = true)
    List<ClaimEntity> findClaimsWithAmountGreaterThanNative(@Param("amount") Double amount);

    Page<ClaimEntity> findAllByAmount(Double amount, Pageable pageable);


    @Query("SELECT c FROM ClaimEntity c WHERE c.id = :id")
    Optional<ClaimEntity> findClaimByIdOptional(@Param("id") Long id);

    @Query("SELECT c FROM ClaimEntity c WHERE c.id = :id")
    ClaimEntity findClaimById(@Param("id") Long id);


}
