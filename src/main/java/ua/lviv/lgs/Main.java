package ua.lviv.lgs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws MyTimeException {
		/*Time time1 = new Time(9,5);
		Time time2 = new Time(15,15);
		Time time3 = new Time(2,15);
		Time time4 = new Time(1,55);
		Movie movie1 = new Movie("Матриця", time3);
		Movie movie2 = new Movie("Два", time4);
		Seance seans1 = new Seance(movie1, time1);
		Seance seans2 = new Seance(movie2, time2);
		Schedule s = new Schedule();
		s.addSeance(seans1);
		s.addSeance(seans2);
		
		System.out.println(s.toString());*/
		Cinema cinema = new Cinema();
		System.out.println("ЛАСКАВО ПРОСИМО В НАШ КІНОТЕАТР!!! \n \n");
		System.out.println("Введіть 1, щоб додати фільм у фільмотеку");
		System.out.println("Введіть 2, щоб додати сеанс в розклад на конкретний день");
		System.out.println("Введіть 3, щоб видалити фільм з фільмотеки");
		System.out.println("Введіть 4, щоб видалити сеанс в конкретний день");
		System.out.println("Введіть 5, щоб вивести розклад");
		System.out.println("Введіть 0, щоб вийти \n");
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = scan.next();
			switch (str) {
			case "1":
				System.out.println("Введіть назву фільму:");
				String name = scan.next();
				System.out.println("Введіть скільки годин триває фільм:");
				int hour = scan.nextInt();
				System.out.println("Введіть скільки хвилин триває фільм:");
				int min = scan.nextInt();
				
				Time timeDuration = new Time (hour, min);
				Movie mov = new Movie(name, timeDuration);
				cinema.addMovie(mov);
				System.out.println("Фільм додано!");
				break;
			case "2":
				System.out.println("Ведіть індекс фільму з фільмотеки:");
				int index = scan.nextInt();
				System.out.println("Коли почати сеанс? год:");
				int hour2 = scan.nextInt();
				System.out.println("Коли почати сеанс? хв:");
				int min2 = scan.nextInt();
				System.out.println("В який день почати? (вводити англійською)?");
				String day = scan.next();
				
				Time startTime = new Time (hour2, min2);
				Seance seans = new Seance(cinema.moviesLibrary.get(index),startTime);
				cinema.addSeance(seans, day);
				System.out.println("Сеанс додано!");
				break;
			case "3":
				System.out.println("Введіть індекс фільму:");
				int index3 = scan.nextInt();
				cinema.removeMovie(cinema.moviesLibrary.get(index3));
				break;
			case "5":
				System.out.println("Понеділок: \n" + cinema.schedules.get(Days.MONDAY));
				System.out.println("Вівторок: \n" + cinema.schedules.get(Days.TUESDAY));
				System.out.println("Середа: \n" + cinema.schedules.get(Days.WEDNESDAY));
				System.out.println("Четвер: \n" + cinema.schedules.get(Days.THURSDAY));
				System.out.println("П'ятниця: \n" + cinema.schedules.get(Days.FRIDAY));
				System.out.println("Субота: \n" + cinema.schedules.get(Days.SATURDAY));
				System.out.println("Неділя: \n" + cinema.schedules.get(Days.SUNDAY));
				break;

			case "0":
				System.exit(0);
			}
		}

	}

}
