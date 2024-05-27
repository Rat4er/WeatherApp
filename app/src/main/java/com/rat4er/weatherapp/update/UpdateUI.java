package com.rat4er.weatherapp.update;

import android.content.Context;

import com.rat4er.weatherapp.R;

public class UpdateUI {

    public static String getIconID(int condition, long update_time, long sunrise, long sunset) {
        if (condition >= 200 && condition <= 232)
            return "thunderstorm";
        else if (condition >= 300 && condition <= 321)
            return "drizzle";
        else if (condition >= 500 && condition <= 531)
            return "rain";
        else if (condition >= 600 && condition <= 622)
            return "snow";
        else if (condition >= 701 && condition <= 781)
            return "wind";
        else if (condition == 800) {
            if (update_time >= sunrise && update_time <= sunset)
                return "clear_day";
            else
                return "clear_night";
        } else if (condition == 801) {
            if (update_time >= sunrise && update_time <= sunset)
                return "few_clouds_day";
            else
                return "few_clouds_night";
        } else if (condition == 802)
            return "scattered_clouds";
        else if (condition == 803 || condition == 804)
            return "broken_clouds";
        return null;
    }

    public static String TranslateDay(String dayToBeTranslated, Context context) {
        switch (dayToBeTranslated.trim()) {
            case "Monday":
                return context.getResources().getString(R.string.monday);
            case "Tuesday":
                return context.getResources().getString(R.string.tuesday);
            case "Wednesday":
                return context.getResources().getString(R.string.wednesday);
            case "Thursday":
                return context.getResources().getString(R.string.thursday);
            case "Friday":
                return context.getResources().getString(R.string.friday);
            case "Saturday":
                return context.getResources().getString(R.string.saturday);
            case "Sunday":
                return context.getResources().getString(R.string.sunday);
        }
        return dayToBeTranslated;
    }

    public static String TranslateDescription(String descriptionToBeTranslated, Context context) {
        switch (descriptionToBeTranslated.trim()) {
            case "Mist":
                return context.getResources().getString(R.string.mist);
            case "Thuderstorm":
                return context.getResources().getString(R.string.thunderstorm);
            case "Drizzle":
                return  context.getResources().getString(R.string.drizzle);
            case "Rain":
                return context.getResources().getString(R.string.rain);
            case "Snow":
                return context.getResources().getString(R.string.snow);
            case "Smoke":
                return context.getResources().getString(R.string.smoke);
            case "Haze":
                return context.getResources().getString(R.string.haze);
            case "Dust":
                return context.getResources().getString(R.string.dust);
            case "Fog":
                return context.getResources().getString(R.string.fog);
            case "Sand":
                return context.getResources().getString(R.string.sand);
            case "Ash":
                return context.getResources().getString(R.string.ash);
            case "Squall":
                return context.getResources().getString(R.string.squall);
            case "Tornado":
                return context.getResources().getString(R.string.tornado);
            case "Clear":
                return context.getResources().getString(R.string.clear);
            case "Clouds":
                return context.getResources().getString(R.string.clouds);
        }
        return descriptionToBeTranslated;
    }
}
