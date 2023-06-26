package com.laba.solvd.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ServiceRecord {
    private int id;
    private String description;
    private Date date;
    private Car car;
    private List<Mechanic> mechanicList;
    private List<Invoice> invoices;
    private List<Part>parts;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }
    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }


    @Override
    public String toString() {
        return "ServiceRecord{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", car=" + car +
                ", mechanicList=" + mechanicList +
                ", invoices=" + invoices +
                ", parts=" + parts +
                '}';
    }
}
