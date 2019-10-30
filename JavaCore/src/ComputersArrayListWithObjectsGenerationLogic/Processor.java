package ComputersArrayListWithObjectsGenerationLogic;

import java.util.Objects;

public class Processor {
    private String typeOfProcessor;
    private int numberOCore;
    private double frequency;
    private ProducingCountry country;

    public Processor(String typeOfProcessor, int numberOCore, double frequency, ProducingCountry country) {
        this.typeOfProcessor = typeOfProcessor;
        this.numberOCore = numberOCore;
        this.frequency = frequency;
        this.country = country;
    }

    public String getTypeOfProcessor() {
        return typeOfProcessor;
    }

    public int getNumberOCore() {
        return numberOCore;
    }

    public double getFrequency() {
        return frequency;
    }

    public ProducingCountry getCountry() {
        return country;
    }

    public void setTypeOfProcessor(String typeOfProcessor) {
        this.typeOfProcessor = typeOfProcessor;
    }

    public void setNumberOCore(int numberOCore) {
        this.numberOCore = numberOCore;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setCountry(ProducingCountry country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return numberOCore == processor.numberOCore &&
                Double.compare(processor.frequency, frequency) == 0 &&
                Objects.equals(typeOfProcessor, processor.typeOfProcessor) &&
                country == processor.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfProcessor, numberOCore, frequency, country);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "typeOfProcessor='" + typeOfProcessor + '\'' +
                ", numberOCore=" + numberOCore +
                ", frequency=" + frequency +
                ", country=" + country +
                '}';
    }
}
