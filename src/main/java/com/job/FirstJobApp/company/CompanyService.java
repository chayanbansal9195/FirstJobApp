package com.job.FirstJobApp.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();

    boolean updateCompany(Company updateCompany, Long id);

    void createCompany(Company company);

    boolean deleteCompanyById(Long id);

    Company getCompanyById(Long id);
}
