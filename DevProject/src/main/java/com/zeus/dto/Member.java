package com.zeus.dto;

import jakarta.validation.constraints.NotBlank; // 1. 누락된 import 추가
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import lombok.Data; 

@Data
public class Member {
    @NotBlank
    private String userId; 
    private String password; 
    private String userName; 
    private String email; 
    private String introduction; 
    private LocalDate dateOfBirth;
    private Boolean foreigner;
    
    // 주신 틀 유지
    private List<String> hobbyList2;
    private List<String> hobbyValue;
    private Map<String, String> hobbyMap;
}