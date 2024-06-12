package org.example.Domain;

public class Phone {

    private String modelName;
    private String make;
    private int storageInGb;

    public Phone() {
    }

    public Phone(String modelName, String make, int storageInGb) {
        this.modelName = modelName;
        this.make = make;
        this.storageInGb = storageInGb;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getStorageInGb() {
        return storageInGb;
    }

    public void setStorageInGb(int storageInGb) {
        this.storageInGb = storageInGb;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "modelName='" + modelName + '\'' +
                ", make='" + make + '\'' +
                ", storageInGb=" + storageInGb +
                '}';
    }
}
