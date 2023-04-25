package spravcePojisteni.models.services;

import spravcePojisteni.models.dto.InsuranceDTO;

import java.util.List;

public interface InsuranceService {
    void create(InsuranceDTO insurance);
    List<InsuranceDTO> getAll();
    InsuranceDTO getById(long insuranceId);
    void edit(InsuranceDTO insurance);
    void remove(long insuranceId);
}
