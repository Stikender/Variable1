public class Main {
    public static void main(String[] args)

    {

        // Exercise 1;
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Exercise 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Exercise 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Exercise 4

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Exercise 5

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Exercise 6

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес двух бойцов равен " + totalWeight + " кг");
        var weightDifference = boxer1 - boxer2;
        System.out.println("Разница в весе бойцов составляет " + weightDifference);
        // Exercise 7
        var weightDifference2 = boxer2 - boxer1;
        System.out.println("Разница веса бойцов вычетанием из большего меньшего составляет " + weightDifference2);
        var weightDifference3 = (boxer2 % boxer1);
        System.out.println("Разница веса бойцов функцией остатка деления равен " + weightDifference3);
        // Exercise 8

        var totalHoursWork = 640;
        var hoursPerWorker = 8;
        var companyEmpioyees = totalHoursWork / hoursPerWorker;
        System.out.println("Всего работников в компании - " + companyEmpioyees + " человек.");
        companyEmpioyees += 94;
        var totalHoursWork2 = companyEmpioyees * hoursPerWorker;
        System.out.println("Если в компании работает " + companyEmpioyees + " человек, то всего " + totalHoursWork2 + " часов работы может быть поделено между сотрудниками");

    }
}