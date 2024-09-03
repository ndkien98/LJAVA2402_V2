package vn.com.t3h.controller.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.com.t3h.dto.ClaimDTO;
import vn.com.t3h.service.IClaimService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/claim")
public class ClaimResourceController {
    // Khai baos claim service
    @Autowired
    private IClaimService claimService;
    // Khai bao ham getAllClaim
    @GetMapping("/all-claim")
    public ResponseEntity<List<ClaimDTO>> getAllClaims(
            // cách khai báo một param là dữ liệu truyền vào từ claim vào back-end
            @RequestParam(value = "claimCode",required = false) String claimCode,// required = false không bắt buộc truyền vào param
            @RequestParam(value = "fromDate",required = false) String fromDate,
            @RequestParam(value = "toDate",required = false) String toDate,
            @RequestParam(value = "statusCode",required = false) String statusCode
            ) {
        List<ClaimDTO> claimDTOS = claimService.getAllClaim();
        return ResponseEntity.ok(claimDTOS);
    }
}
