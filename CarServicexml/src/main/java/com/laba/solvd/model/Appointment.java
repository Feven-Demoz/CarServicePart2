package com.laba.solvd.model;
import java.util.Date;
import java.util.Objects;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class Appointment {
    @JsonProperty("id")
    @XmlElement
    private int id;
    @JsonProperty("carId")
    @XmlElement
    private int carId;
    @JsonProperty("appointmentDate")
    @XmlElement
    private Date appointmentDate;
    @JsonProperty("serviceType")
    @XmlElement
    private String serviceType;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", carId=" + carId +
                ", appointmentDate=" + appointmentDate +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }
}
