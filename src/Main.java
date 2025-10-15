//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен  " + age + " он совершеннолетний");
        } else {
            System.out.println(" «Если возраст человека равен  " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача 2");
        int temp = 7;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов " + "нужно надеть шапку ");
        }
        else  {
            System.out.println("На улице " + temp + " градусов " + " можно идти без шапки");
        }

        System.out.println("Задача 3");
        int speed = 70;
        if (speed < 60  ) {
            System.out.println("Если скорость "  + speed + " можно ездить спокойно");}
        else if  (speed == 60){
            System.out.println("Если скорость " + speed + " можно ездить спокойно ");
        }
        else {
            System.out.println("Если скорость" + speed + " придется заплатить штраф");
        }

        System.out.println("Задача 4");
        int agepeople = 3;
        if (agepeople > 2 && agepeople < 6) {
            System.out.println("Если возраст человека равен " + agepeople + " то ему нужно ходить в детский сад");
        }
        if (agepeople > 6 && agepeople < 17) {
            System.out.println("Если возраст человека равен " + agepeople + " то ему нужно ходить в школу");
        }
        if (agepeople >= 18 && agepeople <= 24) {
            System.out.println("Если возраст человека равен " + agepeople + " то его место в университете");
        }
        if (agepeople > 24) {
            System.out.println("Если возраст человека равен " + agepeople + " то ему пора ходить на работу ");
        }

        System.out.println("Задача 5");
        int agechild = 5;
        if (agechild < 5) {
            System.out.println("Если возраст ребенка равен " + agechild + " то он не может кататься на аттракционе ");
        }
        if (agechild > 4 && agechild < 15) {
            System.out.println("Если возраст ребенка равен " + agechild + " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя. ");
        }
        if (agechild > 14) {
            System.out.println("Если возраст ребенка равен " + agechild + " то он может кататься без сопровождения взрослого");
        }

        System.out.println("Задача 6");
        int van = 50;
        if (van <= 60) {
            System.out.println( "Если билет под номером № " + van+ " у вас место сидячее.");
        } else if (van <= 102) {
            System.out.println("Если билет под номером № " + van + " у вас место стоячее.");
        } else {
            System.out.println("Мест больше нет");
        }
        System.out.println("Задача 7");
        int one= 7;
        int two =10;
        int three =15 ;
        if (one > two && one > three) {
            System.out.println("Число one больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число two больше остальных");
        } else {
            System.out.println("Число three больше остальных");
        }





    }
}