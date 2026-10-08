/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roueplanner.model;

/**
 *
 * @author HP
 */
public class RoutePlanner {

    private float timeRoute;
    private float distanceRoute;
    private String nameSections[];
    private int lenghtSections[];
    private int vehicleID;
    private String infoVehicle;
    private int codeRoute;
    private String nameRoute;
    private String driverID;
    private String nameDriver;
    private boolean availability;

    public RoutePlanner(float timeRoute, float distanceRoute, String[] nameSections, int[] lenghtSections, int vehicleID, String infoVehicle, int codeRoute, String nameRoute, String driverID, String nameDriver, boolean availability) {
        this.timeRoute = timeRoute;
        this.distanceRoute = distanceRoute;
        this.nameSections = nameSections;
        this.lenghtSections = lenghtSections;
        this.vehicleID = vehicleID;
        this.infoVehicle = infoVehicle;
        this.codeRoute = codeRoute;
        this.nameRoute = nameRoute;
        this.driverID = driverID;
        this.nameDriver = nameDriver;
        this.availability = availability;
    }

    public float getTimeRoute() {
        return timeRoute;
    }

    public void setTimeRoute(float timeRoute) {
        this.timeRoute = timeRoute;
    }

    public float getDistanceRoute() {
        return distanceRoute;
    }

    public void setDistanceRoute(float distanceRoute) {
        this.distanceRoute = distanceRoute;
    }

    public String[] getNameSections() {
        return nameSections;
    }

    public void setNameSections(String[] nameSections) {
        this.nameSections = nameSections;
    }

    public int[] getLenghtSections() {
        return lenghtSections;
    }

    public void setLenghtSections(int[] lenghtSections) {
        this.lenghtSections = lenghtSections;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getInfoVehicle() {
        return infoVehicle;
    }

    public void setInfoVehicle(String infoVehicle) {
        this.infoVehicle = infoVehicle;
    }

    public int getCodeRoute() {
        return codeRoute;
    }

    public void setCodeRoute(int codeRoute) {
        this.codeRoute = codeRoute;
    }

    public String getNameRoute() {
        return nameRoute;
    }

    public void setNameRoute(String nameRoute) {
        this.nameRoute = nameRoute;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void calculate_time() {

    }

}
