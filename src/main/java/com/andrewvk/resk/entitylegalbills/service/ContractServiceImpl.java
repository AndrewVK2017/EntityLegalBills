package com.andrewvk.resk.entitylegalbills.service;

import com.andrewvk.resk.entitylegalbills.model.Contract;
import com.andrewvk.resk.entitylegalbills.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {

    private ContractRepository contractRepository;

    @Autowired
    public ContractServiceImpl(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public List<Contract> getAll(int idDepartment) {
        return contractRepository.getAll(idDepartment);
    }
}
