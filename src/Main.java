import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Уважаемый наставник представляю Вашему вниманию домашнее задание "
                + "к уроку за 2 марта 2026г. ");
        System.out.println();

        System.out.println("Задача №1 ");
        int[] inputArray1 = {800, 1500, 600, 7850, 1590};
        int[] outputArray1 = new int[4];
        int i = 0;
        for (int payments : inputArray1) {
            outputArray1[0] = outputArray1[0] + payments;
            if (outputArray1[1] < payments) {
                outputArray1[1] = payments;
            }
            if (i != (inputArray1.length - 1) && inputArray1[i] < inputArray1[i + 1]) {
                outputArray1[2] = inputArray1[i];
            }
            i++;
        }
        outputArray1[3] = outputArray1[0] / inputArray1.length;
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));

        System.out.println();
        System.out.println("Задача №2 ");
        int[] inputArray2 = {800, 1500, 600, 7850, 1590};
        float[] outputArray2 = new float[5];
        i = 0;
        for (int nalog : inputArray2) {
            outputArray2[i] = inputArray2[i] * 13 / 100;
            i++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        System.out.println();
        System.out.println("Задача №3 ");
        int[] inputArray3 = {8000, 5000, 600, 7850, 1590};
        boolean[] outputArray3 = new boolean[5];
        i = 0;
        for (int bonus : inputArray3) {
            if (bonus > 5000) {
                outputArray3[i] = true;
            } else {
                outputArray3[i] = false;
            }
            i++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        System.out.println();
        System.out.println("Задача №4 ");
        int[] inputArray4 = {8000, 5000, -600, 7850, 1590};
        boolean[] outputArray4 = new boolean[5];
        boolean outputFlag = false;
        i = 0;
        for (int ballance : inputArray4) {
            if (ballance >= 0) {
                outputArray4[i] = true;
            } else {
                outputArray4[i] = false;
            }
            if (outputArray4[i] == false) {
                outputFlag = false;
                break;
            }
            i++;
        }
        System.out.println("Просрочек не было - " + outputFlag);
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));

        System.out.println();
        System.out.println("Задача №5 ");
        int[] inputArray5 = {8000, 5000, -600, 7850, -1590};
        boolean[] outputArray5 = new boolean[5];
        int profitMonth = 0;
        i = 0;
        for (int profit : inputArray5) {
            if (profit > 0) {
                profitMonth++;
                outputArray5[i] = true;
            } else {
                outputArray5[i] = false;
            }
            i++;
        }
        System.out.println("Прибыльных месяцев было - " + profitMonth);
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));


    }
}