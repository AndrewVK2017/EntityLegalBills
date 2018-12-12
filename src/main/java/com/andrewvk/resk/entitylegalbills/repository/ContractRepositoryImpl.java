package com.andrewvk.resk.entitylegalbills.repository;

import com.andrewvk.resk.entitylegalbills.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContractRepositoryImpl implements ContractRepository{

    @Autowired
    private CrudContractRepository crudContractRepository;

    @Override
    public List<Contract> getAll(int idDepartment) {
        return crudContractRepository.findAllByIdDepartment(idDepartment);
    }
}
