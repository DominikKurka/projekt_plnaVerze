package spravcePojisteni.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spravcePojisteni.data.entities.InsuranceEntity;
import spravcePojisteni.data.repositories.InsuranceRepository;
import spravcePojisteni.models.dto.InsuranceDTO;
import spravcePojisteni.models.dto.mappers.InsuranceMapper;

import java.util.List;
import java.util.stream.StreamSupport;
@Service
public class InsuranceServiceImpl implements InsuranceService{
    @Autowired
    private InsuranceRepository insuranceRepository;
    @Autowired
    private InsuranceMapper insuranceMapper;

    @Override
    public void create(InsuranceDTO insurance) {
        InsuranceEntity newInsurance = insuranceMapper.toEntity(insurance); // <-- Tímto řádkem jsme nahradili velkou část obsahu této metody

        insuranceRepository.save(newInsurance);
    }
    @Override
    public List<InsuranceDTO> getAll() {
        return StreamSupport.stream(insuranceRepository.findAll().spliterator(), false)
                .map(i -> insuranceMapper.toDTO(i))
                .toList();
    }
    @Override
    public InsuranceDTO getById(long insuranceId) {
        InsuranceEntity fetchedInsurance = getInsuranceOrThrow(insuranceId);

        return insuranceMapper.toDTO(fetchedInsurance);
    }

    @Override
    public void edit(InsuranceDTO insurance) {
        InsuranceEntity fetchedInsurance = getInsuranceOrThrow(insurance.getInsuranceId());

        insuranceMapper.updateInsuranceEntity(insurance, fetchedInsurance);
        insuranceRepository.save(fetchedInsurance);
    }

    private InsuranceEntity getInsuranceOrThrow(long insuranceId) {
        return insuranceRepository
                .findById(insuranceId)
                .orElseThrow();
    }

    @Override
    public void remove(long insuranceId) {
        InsuranceEntity fetchedEntity = getInsuranceOrThrow(insuranceId);
        insuranceRepository.delete(fetchedEntity);
    }
}
