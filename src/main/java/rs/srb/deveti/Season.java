package rs.srb.deveti;

import java.time.LocalDate;
import java.time.MonthDay;

public enum Season{
   Spring("Prolece",MonthDay.of(3,21),MonthDay.of(6,20)) ,
   Summer("Leto",MonthDay.of(6,21),MonthDay.of(9,21)),
    Autumn("Jesen",MonthDay.of(9,21),MonthDay.of(12,21)),
    Winter("Zima",MonthDay.of(12,22),MonthDay.of(3,20))
    ;

    private String name;
    private MonthDay startDate;
    private MonthDay endDate;
private Season(String name, MonthDay startDate, MonthDay endDate){
    this.name=name;
    this.startDate = startDate;
        this.endDate = endDate;
    }

    public MonthDay getStartDate() {
        return startDate;
    }

    public void setStartDate(MonthDay startDate) {
        this.startDate = startDate;
    }

    public MonthDay getEndDate() {
        return endDate;
    }

    public void setEndDate(MonthDay endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

