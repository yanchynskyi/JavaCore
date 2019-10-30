package ComputersArrayListWithObjectsGenerationLogic;

import java.util.Objects;

public class HardDrive {
    private String hardDriveModel;
    private TypeOfHardDrive type;
    private int hardDriveVolume;
    private ProducingCountry country;



    public HardDrive(String hardDriveModel, TypeOfHardDrive type, int hardDriveVolume, ProducingCountry country) {
        this.hardDriveModel = hardDriveModel;
        this.type = type;
        this.hardDriveVolume = hardDriveVolume;
        this.country = country;
    }

    public String getHardDriveModel() {
        return hardDriveModel;
    }

    public void setHardDriveModel(String hardDriveModel) {
        this.hardDriveModel = hardDriveModel;
    }

    public TypeOfHardDrive getType() {
        return type;
    }

    public void setType(TypeOfHardDrive type) {
        this.type = type;
    }

    public int getHardDriveVolume() {
        return hardDriveVolume;
    }

    public void setHardDriveVolume(int hardDriveVolume) {
        this.hardDriveVolume = hardDriveVolume;
    }

    public ProducingCountry getCountry() {
        return country;
    }

    public void setCountry(ProducingCountry country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HardDrive hardDrive = (HardDrive) o;
        return hardDriveVolume == hardDrive.hardDriveVolume &&
                Objects.equals(hardDriveModel, hardDrive.hardDriveModel) &&
                type == hardDrive.type &&
                country == hardDrive.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hardDriveModel, type, hardDriveVolume, country);
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "hardDriveModel='" + hardDriveModel + '\'' +
                ", type=" + type +
                ", hardDriveVolume=" + hardDriveVolume +
                ", country=" + country +
                '}';
    }
}
