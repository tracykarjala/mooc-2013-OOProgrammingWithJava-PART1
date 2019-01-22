public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        if (this.year == comparedDate.year) {
            return 0;
        }
        MyDate thisDate = new MyDate(this.day, this.month, this.year);
        int years = 0;
        if (thisDate.earlier(comparedDate)) {
            years = comparedDate.year - thisDate.year - 1;
            if (comparedDate.month > thisDate.month || comparedDate.month == thisDate.month && comparedDate.day > thisDate.day) {
                years++;
            }
            if (thisDate.month == comparedDate.month && thisDate.day == comparedDate.day) {
                years++;
            }
        } else if (comparedDate.earlier(thisDate)) {
            years = thisDate.year - comparedDate.year - 1;
            if (thisDate.month > comparedDate.month || comparedDate.month == thisDate.month && thisDate.day > comparedDate.day) {
                years++;
            }
            if (thisDate.month == comparedDate.month && thisDate.day == comparedDate.day) {
                years++;
            }
        }
        return years;
    }

}
