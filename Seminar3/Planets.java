package Seminar3;

// Задание №2.1
// Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков
// Задание №2.2 (если выполнено первое задание)
// Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Planets {
public static void main(String[] args) {
List<String> planets = getPlanets();
printCountPlanets(planets);
deleteRepeatPlanet(planets);
System.out.println(planets);
}

private static List<String> getPlanets() {
List<String> planets = new ArrayList<>();
planets.add("Меркурий");
planets.add("Венера");
planets.add("Марс");
planets.add("Земля");
planets.add("Юпитер");
planets.add("Меркурий");
planets.add("Меркурий");
planets.add("Меркурий");
planets.add("Сатурн");
planets.add("Уран");
planets.add("Нептун");
planets.add("Земля");
planets.add("Сатурн");
planets.add("Венера");
planets.add("Юпитер");
return planets;
}

public static void printCountPlanets(List<String> planets) {
List<String> sortedPlanets = new ArrayList<>(planets);
Collections.sort(sortedPlanets);
System.out.println(sortedPlanets);
String prevPlanet = "";
int count = 0;
for (String planet : sortedPlanets) {
if (!planet.equals(prevPlanet) && count > 0) {

System.out.println(prevPlanet + " > " + count);
count = 1;
} else {
count++;
}

prevPlanet = planet;
}
System.out.println(prevPlanet + " > " + count);
}

public static void deleteRepeatPlanet(List<String> planets) {
for (int i = 0; i < planets.size(); i++) {
for (int j = i + 1; j < planets.size(); j++) {
if (planets.get(j).equals(planets.get(i))) {
planets.remove(j);
j--;
}
}
}
}
}