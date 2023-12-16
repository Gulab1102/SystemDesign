package org.system.design.parkinglot;

public class Ticket {
    String ticketNumber;
    long startTime;
    long endTime;
    Vehicle vehicle;
    ParkingSlot parkingSlot;

    public String getTicketNumber() {
        return ticketNumber;
    }

    public Ticket setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;

        return this;
    }

    public long getStartTime() {
        return startTime;
    }

    public Ticket setStartTime(long startTime) {
        this.startTime = startTime;
        return this;
    }

    public long getEndTime() {
        return endTime;
    }

    public Ticket setEndTime(long endTime) {
        this.endTime = endTime;

        return this;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Ticket setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public Ticket setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
        return this;
    }

    public static Ticket createTicket(Vehicle vehicle,ParkingSlot parkingSlot){
        Ticket ticket=new Ticket();
        ticket.setParkingSlot(parkingSlot)
                .setVehicle(vehicle)
                .setStartTime(System.currentTimeMillis())
                .setTicketNumber(vehicle.getVehicleNumber()+System.currentTimeMillis());

        return   ticket;
    }

}
