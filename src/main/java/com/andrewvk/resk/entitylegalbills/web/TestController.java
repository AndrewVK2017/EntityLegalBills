package com.andrewvk.resk.entitylegalbills.web;

import com.andrewvk.resk.entitylegalbills.model.Contract;
import com.andrewvk.resk.entitylegalbills.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.andrewvk.resk.entitylegalbills.web.SecurityUtil.*;


@RestController
@RequestMapping(value = "/test")
public class TestController {

    private ContractService contractService;

    @Autowired
    public TestController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping
    public List<Contract> getAll() {
        int idDepartment = authUserIdDepartment();
        return contractService.getAll(idDepartment);
    }
}
