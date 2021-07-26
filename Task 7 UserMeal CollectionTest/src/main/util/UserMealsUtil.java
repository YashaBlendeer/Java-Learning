package main.util;

import main.model.UserMeal;
import main.model.UserMealWithExceed;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * GKislin
 * 31.05.2015.
 */
public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,13,0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,20,0), "Ужин", 500),

                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,10,0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,20,0), "Ужин", 510)
        );
        getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000);
//        .toLocalDate();
//        .toLocalTime();
    }

    public static List<UserMealWithExceed>  getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        // TODO return filtered list with correctly exceeded field
        //оно должно вернуть список с приемом пищи за заданный временной промежуток
        // с описанием + калориями за день + ексид
        List<UserMeal> list =
                mealList.stream()
                        .filter(o -> o.getDateTime().getHour() > startTime.getHour() &&
                                o.getDateTime().getHour() < endTime.getHour())
                        .collect(Collectors.toList());

//        System.out.println(list);

        Map<Object, Integer> mapCalories = mealList.stream()
                .collect(Collectors.groupingBy(o -> o.getDateTime().getDayOfMonth(),
                Collectors.reducing(0, UserMeal::getCalories, Integer::sum)));

//        System.out.println("mapCalories: " + mapCalories);

        List<UserMealWithExceed> exceedList =
                list.stream()
                        .map(t -> new UserMealWithExceed(
                                t.getDateTime(),
                                t.getDescription(),
                                mapCalories.get(t.getDateTime().getDayOfMonth()),
                                mapCalories.get(t.getDateTime().getDayOfMonth()) > caloriesPerDay))
                        .collect(Collectors.toList());
        System.out.println(exceedList);
        return exceedList;
    }
}
