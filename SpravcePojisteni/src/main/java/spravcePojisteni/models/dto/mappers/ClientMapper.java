package spravcePojisteni.models.dto.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import spravcePojisteni.data.entities.ClientEntity;
import spravcePojisteni.models.dto.ClientDTO;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientEntity toEntity(ClientDTO source);
    ClientDTO toDTO(ClientEntity source);

    void updateClientDTO(ClientDTO source, @MappingTarget ClientDTO target);

    void updateClientEntity(ClientDTO source, @MappingTarget ClientEntity target);
}
