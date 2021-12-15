public class NextDayCalculator {
    public static int getNextDay(int day, int month, int year) {
        if (month == 12 && day >= 31) {
            day = 1;
            return day;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day >= 31) {
                        day = 1;
                        return day;
                    } else {
                        day += 1;
                        return day;
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day >= 30) {
                        day = 1;
                        return day;
                    } else {
                        day += 1;
                        return day;
                    }
                case 2:
                    boolean isLeap = false;
                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            if (year % 400 == 0) {
                                isLeap = true;
                            }
                        } else {
                            isLeap = true;
                        }
                    }
                    if (isLeap) {
                        if (day >= 29) {
                            day = 1;
                            return day;
                        } else {
                            day += 1;
                            return day;
                        }
                    } else {
                        if (day >= 28) {
                            day = 1;
                            return day;
                        } else {
                            day += 1;
                            return day;
                        }
                    }
            }
        }
        return day;
    }

    public static int nextMonth(int day, int month, int year) {
        if (month == 12 && day >= 31) {
            month = 1;
            return month;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day >= 31) {
                        month += 1;
                        return month;
                    } else {
                        return month;
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day >= 30) {
                        month += 1;
                        return day;
                    } else {
                        return month;
                    }
                case 2:
                    boolean isLeap = false;
                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            if (year % 400 == 0) {
                                isLeap = true;
                            }
                        } else {
                            isLeap = true;
                        }
                    }
                    if (isLeap) {
                        if (day >= 29) {
                            month += 1;
                            return month;
                        } else {
                            return month;
                        }
                    } else {
                        if (day >= 28) {
                            month += 1;
                            return month;
                        } else {
                            return month;
                        }
                    }
            }
        }
        return month;
    }
    public static int nextYear(int day, int month, int year) {
        if (month == 12 && day >= 31) {
            year += 1;
            return year;
        } else {
            return year;
        }
    }
}
