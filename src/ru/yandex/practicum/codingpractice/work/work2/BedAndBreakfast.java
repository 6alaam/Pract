package ru.yandex.practicum.codingpractice.work.work2;

public class BedAndBreakfast {
    private int capacity = 10;
    private  boolean full = false;
     // число свободных номеров (10) сохраните в переменную capacity

           // сохраните в переменную full значение false - есть номера в наличии

  public   void book() { // метод для бронирования комнат
        if (!full) { // если есть свободные номера
            System.out.println("Забронирован ещё один номер!");
            capacity --; // уменьшите количество свободных номеров на один
            printRooms();
            if (capacity == 0) {
                full = true;
            }
        } else {
            System.out.println("Свободных номеров нет!");
        }
    }

   private void printRooms() {
        System.out.println("Свободных номеров - " + capacity);
    }

   public void free() { // метод для освобождения комнат
        if (capacity < 10) { // если свободных комнат меньше 10
            capacity ++; // увеличиваем количество свободных мест на одно
            System.out.println("Освободился номер!");
            printRooms();
            full = false;
        } else {
            System.out.println("В гостинице только 10 номеров.");
        }
    }

    boolean isFull() {
      if (capacity == 0) {
          return true;
      } return  false;
    }
}
