package ComputersArrayListWithObjectsGenerationLogic;

import java.util.Objects;

public class Computer {
    private String model;
    private int graduationYear;
    private int memoryCapacity;
    private long price;
    private HardDrive hardDrive;
    private Processor processor;


    public static ProducingCountry randomCountry () {
        int randNum = (int)(Math.random() * 4);
        if(randNum == 0){
            return ProducingCountry.CHINA;
        }else if(randNum == 1){
            return ProducingCountry.INDIA;
        }else if(randNum == 2){
            return ProducingCountry.INDIA;
        }else {
            return ProducingCountry.USA;
        }
    }

    public static int randomCapacity (){
        int randomeCapacity = (int)(128 + Math.random() * 1300);
        if(randomeCapacity < 255){
            return 128;
        }else if(randomeCapacity > 255 && randomeCapacity < 511){
            return 256;
        }else if(randomeCapacity > 511 && randomeCapacity < 1023){
            return 512;
        }else {
            return 1024;
        }

    }

    public static int price (int capacity){
//        int randomeCapacity = (int)(128 + Math.random() * 896);
        if(capacity < 255){
            return 200;
        }else if(capacity < 511){
            return 300;
        }else if(capacity < 1023){
            return 400;
        }else {
            return 500;
        }

    }

    public Computer() {
    }

    public Computer(String model, int graduationYear, int memoryCapacity, long price, HardDrive hardDrive, Processor processor) {
        this.model = model;
        this.graduationYear = graduationYear;
        this.memoryCapacity = memoryCapacity;
        this.price = price;
        this.hardDrive = hardDrive;
        this.processor = processor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return graduationYear == computer.graduationYear &&
                memoryCapacity == computer.memoryCapacity &&
                price == computer.price &&
                Objects.equals(model, computer.model) &&
                Objects.equals(hardDrive, computer.hardDrive) &&
                Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, graduationYear, memoryCapacity, price, hardDrive, processor);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", graduationYear=" + graduationYear +
                ", memoryCapacity=" + memoryCapacity +
                ", price=" + price +
                ", hardDrive=" + hardDrive +
                ", processor=" + processor +
                '}';
    }
}
