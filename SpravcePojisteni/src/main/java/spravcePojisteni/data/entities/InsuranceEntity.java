package spravcePojisteni.data.entities;

import jakarta.persistence.*;

@Entity
public class InsuranceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long insuranceId;


    @Column(nullable = false)
    private String insuranceName;

    @Column(nullable = false)
    private String insuranceItem;

    @Column(nullable = false)
    private String insuranceStartDate;
    @Column(nullable = false)
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
