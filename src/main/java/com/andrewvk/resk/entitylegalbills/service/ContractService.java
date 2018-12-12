package com.andrewvk.resk.entitylegalbills.service;

import com.andrewvk.resk.entitylegalbills.model.Contract;

import java.util.List;

public interface ContractService {
    List<Contract> getAll (int idDepartment);

}
