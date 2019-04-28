package builder;

import java.util.ArrayList;
import java.util.Date;

public class VacationDay {
    private Date mdate;
    private String mHotel;
    private ArrayList<String> mTickets;
    private ArrayList<String> mEvents;

    public VacationDay(Date date) {
        mdate = date;
        mTickets = new ArrayList<>();
        mEvents = new ArrayList<>();
    }

    public void setmHotel(String hotel) {
        mHotel = hotel;
    }

    public void setTickets(String tickets) {
        mTickets.add(tickets);
    }

    public void setmEvents(String events) {
        mEvents.add(events);
    }

    public void showInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("出发日期：" + this.mdate + "--");
        stringBuilder.append("居住酒店：" + this.mHotel + "--");
        stringBuilder.append("景点票：" + this.mTickets.toString() + "--");
        stringBuilder.append("规划事情：" + this.mEvents.toString() + "--");
        System.out.println(stringBuilder.toString());

    }

}
