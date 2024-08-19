package vn.com.t3h.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.t3h.dto.ClaimDTO;
import vn.com.t3h.entity.ClaimEntity;
import vn.com.t3h.repository.ClaimRepository;
import vn.com.t3h.service.IClaimService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClaimServiceImpl implements IClaimService {

    // Khai báo claim repository
    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public List<ClaimDTO> getAllClaim() {
        // Viết hàm xử lý tại đây
        List<ClaimEntity> claimEntities = claimRepository.findAll();
        List<ClaimDTO> claimDTOS = new ArrayList<>();
        for (ClaimEntity claimEntity : claimEntities) {
            ClaimDTO claimDTO = new ClaimDTO();
            claimDTO.setId(claimEntity.getId());
            claimDTO.setClaimDate(claimEntity.getClaimDate());
            claimDTO.setClaimCode(claimDTO.getClaimCode());
            claimDTO.setAmount(claimEntity.getAmount());
            claimDTO.setDescription(claimEntity.getDescription());

            if (claimEntity.getInsuranceProductEntity() != null){
                claimDTO.setInsuranceProductName(claimEntity.getInsuranceProductEntity().getName());
            }
            if (claimEntity.getClaimStatus() != null){
                claimDTO.setStatus(claimEntity.getClaimStatus().getCode());
                claimDTO.setStatusDescription(claimEntity.getClaimStatus().getDescription());
            }
            if (claimEntity.getCustomerEntity() != null){
                claimDTO.setCustomerName(claimEntity.getCustomerEntity().getName());
            }
            claimDTOS.add(claimDTO);
        }
        return claimDTOS;
    }
}
