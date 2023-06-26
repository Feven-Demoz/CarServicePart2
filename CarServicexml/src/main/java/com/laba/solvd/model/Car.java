package com.laba.solvd.model;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
public class Car {
    @JsonProperty("id")
    @XmlElement
    private int id;
    @JsonProperty("licensePlate")
    @XmlElement
    private String licensePlate;
    @JsonProperty("make")
    @XmlElement
    private String make;
    @JsonProperty("year")
    @XmlElement
    private int year;
    @JsonProperty("Warranty")
    @XmlElement
    private Warranty warranty;
    @JsonProperty("serviceRecordList")
    @XmlElement
    private List<ServiceRecord> serviceRecordList;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Warranty getWarranty() {
        return warranty;
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<ServiceRecord> getServiceRecordList() {
        return serviceRecordList;
    }

    public void setServiceRecordList(List<ServiceRecord> serviceRecordList) {
        this.serviceRecordList = serviceRecordList;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", licensePlate='" + licensePlate + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", warranty=" + warranty +
                ", serviceRecordList=" + serviceRecordList +
                '}';
    }
}
