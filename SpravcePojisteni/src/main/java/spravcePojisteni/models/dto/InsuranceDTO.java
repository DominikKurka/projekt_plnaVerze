package spravcePojisteni.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class InsuranceDTO {
    private long insuranceId;
    @NotBlank(message = "Vyplňte jméno")
    @NotNull(message = "Vyplňte jméno")
    private String insuranceName;
    @NotBlank(message = "Vyplňte příjmení")
    @NotNull(message = "Vyplňte příjmení")
    private String insuranceItem;
    @NotBlank(message = "Vyplňte datum")
    @NotNull(message = "Vyplňte datum")
    private String insuranceStartDate;
    @NotBlank(message = "Vyplňte email")
    @NotNull(message = "Vyplňte email")
    private String insuranceEndDate;

    public long getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(long insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getInsuranceItem() {
        return insuranceItem;
    }

    public void setInsuranceItem(String insuranceItem) {
        this.insuranceItem = insuranceItem;
    }

    public String getInsuranceStartDate() {
        return insuranceStartDate;
    }

    public void setInsuranceStartDate(String insuranceStartDate) {
        this.insuranceStartDate = insuranceStartDate;
    }

    public String getInsuranceEndDate() {
        return insuranceEndDate;
    }

    public void setInsuranceEndDate(String insuranceEndDate) {
        this.insuranceEndDate = insuranceEndDate;
    }
}
