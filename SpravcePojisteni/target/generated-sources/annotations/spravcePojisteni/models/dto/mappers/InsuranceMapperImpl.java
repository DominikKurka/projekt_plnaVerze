package spravcePojisteni.models.dto.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import spravcePojisteni.data.entities.InsuranceEntity;
import spravcePojisteni.models.dto.InsuranceDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-25T17:29:56+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Eclipse Adoptium)"
)
@Component
public class InsuranceMapperImpl implements InsuranceMapper {

    @Override
    public InsuranceEntity toEntity(InsuranceDTO source) {
        if ( source == null ) {
            return null;
        }

        InsuranceEntity insuranceEntity = new InsuranceEntity();

        insuranceEntity.setInsuranceId( source.getInsuranceId() );
        insuranceEntity.setInsuranceName( source.getInsuranceName() );
        insuranceEntity.setInsuranceItem( source.getInsuranceItem() );
        insuranceEntity.setInsuranceStartDate( source.getInsuranceStartDate() );
        insuranceEntity.setInsuranceEndDate( source.getInsuranceEndDate() );

        return insuranceEntity;
    }

    @Override
    public InsuranceDTO toDTO(InsuranceEntity source) {
        if ( source == null ) {
            return null;
        }

        InsuranceDTO insuranceDTO = new InsuranceDTO();

        insuranceDTO.setInsuranceId( source.getInsuranceId() );
        insuranceDTO.setInsuranceName( source.getInsuranceName() );
        insuranceDTO.setInsuranceItem( source.getInsuranceItem() );
        insuranceDTO.setInsuranceStartDate( source.getInsuranceStartDate() );
        insuranceDTO.setInsuranceEndDate( source.getInsuranceEndDate() );

        return insuranceDTO;
    }

    @Override
    public void updateInsuranceDTO(InsuranceDTO source, InsuranceDTO target) {
        if ( source == null ) {
            return;
        }

        target.setInsuranceId( source.getInsuranceId() );
        target.setInsuranceName( source.getInsuranceName() );
        target.setInsuranceItem( source.getInsuranceItem() );
        target.setInsuranceStartDate( source.getInsuranceStartDate() );
        target.setInsuranceEndDate( source.getInsuranceEndDate() );
    }

    @Override
    public void updateInsuranceEntity(InsuranceDTO source, InsuranceEntity target) {
        if ( source == null ) {
            return;
        }

        target.setInsuranceId( source.getInsuranceId() );
        target.setInsuranceName( source.getInsuranceName() );
        target.setInsuranceItem( source.getInsuranceItem() );
        target.setInsuranceStartDate( source.getInsuranceStartDate() );
        target.setInsuranceEndDate( source.getInsuranceEndDate() );
    }
}
