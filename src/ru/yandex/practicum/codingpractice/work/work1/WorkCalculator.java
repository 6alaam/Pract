package ru.yandex.practicum.codingpractice.work.work1;

public class WorkCalculator {
    private int workingHours = 8;
    String workerName;
    public double coefficient;

    WorkCalculator(String newName) {
        workerName = newName;
    }

     String getWorkerName() {
        return workerName;
    }

    int calculate(int workDays) {
        return workDays * workingHours;
    }

    double calculateWithCoefficient(int workDays) {
        return workDays * workingHours * coefficient;
    }
}
