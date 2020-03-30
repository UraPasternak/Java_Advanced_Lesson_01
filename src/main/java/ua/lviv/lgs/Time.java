package ua.lviv.lgs;

public class Time implements Comparable<Time> {
	private int min;
	private int hour;

	public Time(int hour, int min) throws MyTimeException {

		if (min < 0 || min >= 60)
			throw new MyTimeException("Хвилини не можуть бути менші 0 чи більше 60");
		this.min = min;
		if (hour < 0 || hour >= 24)
			throw new MyTimeException("Години не можуть бути менші 0 чи більше 24");
		this.hour = hour;
	}

	public Time plusTime(Time time) throws MyTimeException {
		Time plus = new Time(0, 0);
		if ((this.getMin() + time.getMin()) < 60) {
			plus.setMin(this.getMin() + time.getMin());
			plus.setHour(this.getHour() + time.getHour());
		} else {
			plus.setMin((this.getMin() + time.getMin()) - 60);
			plus.setHour(this.getHour() + time.getHour() + 1);
		}
		return plus;

	}

	@Override
	public String toString() {
		return hour + " год. " + min + " хв.";
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int compareTo(Time anouserTime) {
		if (this.hour == anouserTime.hour) {
			return 0;
		} else if (this.hour < anouserTime.hour) {
			return -1;
		} else {
			return 1;
		}

	}
}
