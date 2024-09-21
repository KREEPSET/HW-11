import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("Ф.И.О. сотрудника - %s", fullName);
        System.out.println();
        System.out.println();
        System.out.println("Задача 2");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.printf("Данные Ф.И.О. сотрудника для заполнения отчета - %s\n", fullNameUpperCase);
        System.out.println();
        System.out.println("Задача 3");
        fullName = "Иванов Семён Семёнович";
        String result = fullName.replace("ё", "е");
        System.out.printf("Данные Ф.И.О. сотрудника - %s\n", result);





        }
    }
