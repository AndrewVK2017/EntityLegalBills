package com.andrewvk.resk.entitylegalbills.repository;

import com.andrewvk.resk.entitylegalbills.model.Contract;

import java.util.List;

public interface ContractRepository {

    List<Contract> getAll (int idDepartment);
}
