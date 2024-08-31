package RailwaySchedule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FIndMyTrainApp {
    public static void main(String[] args) {
        TrainSystem system = new TrainSystem();

        //adding new stations
        Station station1 = new Station("St001","Jalna");
        Station station2 = new Station("St002","Odisha");

        //Adding new Trains
        Train train1 = new Train("Tr001","RajDhani Express","Express");
        Train train2 = new Train("Tr002","VandeBharat Express","SupeFast");

        Platform p1 = new Platform(1);
        Platform p2 = new Platform(2);

        p1.setTrain(train1);
        p2.setTrain(train2);

        List<Platform> platformList = new ArrayList<>();
        platformList.add(p1);
        platformList.add(p2);

        station1.setPlatformList(platformList);

        Schedule s1 = new Schedule(train1,station1,"9 AM","9.30 AM",p1);
        Schedule s2 = new Schedule(train2,station2,"11 AM","11.30 AM",p2);

        system.addStations(station1);
        system.addStations(station2);

        system.addTrains(train1);
        system.addTrains(train2);

        system.addSchedules(s1);
        system.addSchedules(s2);

        //Findout train between stations
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting station ");
        String Source = sc.next();
        System.out.println("Enter the destination ");
        String des = sc.next();

        List<Schedule> myTrains = system.FindMyTrain(Source, des);
        System.out.println("Your Trains between "+ Source + " and "+ des);
        Schedule schedule = myTrains.get(0);
        Train train = schedule.getTrain();
        System.out.println(train);

    }
}
