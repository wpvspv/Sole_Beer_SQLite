package com.example.mh.sole_beer;


import android.graphics.Color;
import android.graphics.Typeface;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;
import java.util.Date;

public class Decorator_Today implements DayViewDecorator {

    private CalendarDay date;

    public Decorator_Today() {
        date = CalendarDay.today();
    }

    @Override
    public boolean shouldDecorate(CalendarDay day) {
        return date != null && day.equals(date);
    }

    @Override
    public void decorate(DayViewFacade view) {
        view.addSpan(new StyleSpan(Typeface.BOLD));
        view.addSpan(new RelativeSizeSpan(2f));
        view.addSpan(new ForegroundColorSpan(Color.YELLOW));
    }

    public void setDate(Date date) {
        this.date = CalendarDay.from(date);
    }
}