import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Василий on 12.02.2019.
 */
public class Loader {
    public static void main(String[] args) throws IOException {
        int numContainer = 0;                                                                               //Контейнер
        int numBox = 0;                                                                                     //Ящик
        int numTrucks = 0;                                                                                  //Грузовик

        int containerInTrucks = 12;
        int boxInContainers = 27;
        int boxInTrucks = containerInTrucks * boxInContainers;    //Max количество коробок в грузовике

        //Ввод значения с клавиатуры
        System.out.println("Введите пожалуйста количество коробок гуманитарной помощи: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float box = Integer.parseInt(reader.readLine());


        //Определение количество грузовиков и контейнеров для гуманитарной помощи
        int trucks = (int) Math.ceil(box / boxInTrucks);
        int container = (int) Math.ceil(box / boxInContainers);
        System.out.println("Для перевозки нужно: " + trucks + " грузовика и " + container + " контейнеров");


        //Распределение ящиков и контейнеров по грузовикам
        for(int a = 1; a <= trucks; a++) {
            if(numTrucks < trucks) {
                numTrucks++;
                System.out.println("========== Грузовик ========== " + numTrucks);
                for(int c = 1; c <= containerInTrucks; c++) {
                    if (numContainer < container) {
                        numContainer++;
                        System.out.println("===== Контейнер ===== " + numContainer);
                        for(int b = 1; b <= boxInContainers; b++) {
                            if (numBox < box) {
                                numBox++;
                                System.out.println("Ящик " + numBox);
                            } else if(numBox >= box) {
                                System.out.println("Погрузка завершена " + numBox);
                                break;
                            }
                        }
                    } else break;
                }
            } else break;
        }

    }
}

