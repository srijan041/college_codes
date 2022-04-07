
class HrsException extends Exception {
    public HrsException(String str) {
        super(str);
    }
}

class MinException extends Exception {
    public MinException(String str) {
        super(str);
    }
}

class SecException extends Exception {
    public SecException(String str) {
        super(str);
    }
}

public class Time {
    int hours, minutes, seconds;

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static void main(String[] args) {

        Time t = new Time(-9, 77, 78);

        try {
            if (t.hours > 24 || t.hours < 0)
                throw new HrsException("Invalid hour");
            else if (t.minutes > 60 || t.minutes < 0)
                throw new MinException("Invalid minute");
            else if (t.seconds > 60 || t.seconds < 0)
                throw new SecException("Invalid second");
            else
                throw new SecException("Valid time");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
