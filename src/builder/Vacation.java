package builder;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Vacation {
    private ArrayList<VacationDay> vacationDays;
    private Date mdate;//起始日期
    private int mDays;
    private VacationDay mVacationDay;

    public Vacation(String tDate) {
        vacationDays = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            mdate = simpleDateFormat.parse(tDate);
            mVacationDay = new VacationDay(mdate);
            vacationDays.add(mVacationDay);
            mDays++;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void setHotel(String hotel) {
        mVacationDay.setmHotel(hotel);
    }

    public void setEvent(String event) {
        mVacationDay.setmEvents(event);
    }

    public void setTicket(String ticket) {
        mVacationDay.setTickets(ticket);
    }

    public void addDay() {
        mVacationDay = new VacationDay(next(mDays));
        vacationDays.add(mVacationDay);
        mDays++;
    }

    public Date next(int mDays) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(mdate);
        calendar.add(Calendar.DATE, mDays);
        return calendar.getTime();
    }

    public void showInfo() {
        for (int i = 0; i < vacationDays.size(); i++) {
            System.out.println("****" + i + "天*****");
            vacationDays.get(i).showInfo();
        }
    }
}
