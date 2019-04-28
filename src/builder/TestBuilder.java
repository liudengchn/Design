package builder;

public class TestBuilder {
    public static void main(String[] args) {
        BuilderSelf builderSelf = new BuilderSelf("2019-4-28");
        builderSelf.addEvent("去大理").addHotel("七天酒店").addTicket("动物园");

        builderSelf.addDay();
        builderSelf.addEvent("去大理1").addHotel("七天酒店1").addTicket("动物园1");

        builderSelf.addDay();
        builderSelf.addEvent("去大理2").addHotel("七天酒店2").addTicket("动物园2").getVacation();
    }
}
