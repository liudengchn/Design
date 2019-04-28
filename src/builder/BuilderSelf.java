package builder;

public class BuilderSelf {
    public Vacation vacation;

    public BuilderSelf(String tdate) {
        vacation = new Vacation(tdate);
    }

    public BuilderSelf addDay() {
        vacation.addDay();
        return this;
    }

    public BuilderSelf addHotel(String hotel) {
        vacation.setHotel(hotel);
        return this;
    }

    public BuilderSelf addTicket(String ticket) {
        vacation.setTicket(ticket);
        return this;
    }

    public BuilderSelf addEvent(String event) {
        vacation.setEvent(event);
        return this;
    }

    public void getVacation() {
        vacation.showInfo();
    }
}
