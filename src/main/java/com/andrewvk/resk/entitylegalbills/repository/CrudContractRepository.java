package com.andrewvk.resk.entitylegalbills.repository;

import com.andrewvk.resk.entitylegalbills.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface CrudContractRepository extends JpaRepository<Contract, Integer> {

    List<Contract> findAllByIdDepartment (int idDepartment);
}
