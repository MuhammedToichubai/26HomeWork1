package homeWork1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /**Car деген класс тузунуз (Id, номер авто)
         Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
         HashMap тузунуз ключ - машина, маани - машинанын данныйлары
         HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.
         * */
        Map<Car, CarInformation> map = new HashMap<>();
        map.put(new Car(425,"06kg 333 AAO"),new CarInformation(2001,"Mercedes-Benz",7000,"white"));
        map.put(new Car(570,"02kg 777 MMM"),new CarInformation(2021,"Lexus",50000,"black"));
        map.put(new Car(250,"01kg 555 ABC"),new CarInformation(2006,"Hyundai",5000,"blue"));
        map.put(new Car(600,"08kg 111 RRR"),new CarInformation(2002,"Toyota",10000,"silver"));
        map.put(new Car(160,"03kg 000 YES"),new CarInformation(1995,"Lada",2000,"red"));

        for (Map.Entry<Car, CarInformation> carCarInformationEntry : map.entrySet()) {
            System.out.println(carCarInformationEntry.getKey() + " "+ carCarInformationEntry.getValue());

        }
    }
}
