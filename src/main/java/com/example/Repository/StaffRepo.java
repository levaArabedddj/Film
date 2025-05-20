package com.example.Repository;


import com.example.DTO.DtoStaff;

import java.util.List;


public interface StaffRepo {

    List<DtoStaff> findAllStaff();
}

