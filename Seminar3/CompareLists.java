package Seminar3;

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareLists {
public static void main(String[] args) {
int count = 200_000;

System.out.println("Добавление в конец");
long start = System.currentTimeMillis();
getArrayListAddLast(count);
System.out.println(System.currentTimeMillis() - start);

start = System.currentTimeMillis();
getLinkedListAddLast(count);
System.out.println(System.currentTimeMillis() - start);

System.out.println();

System.out.println("Добавление в начало");
start = System.currentTimeMillis();
getArrayListAddFirst(count);
System.out.println(System.currentTimeMillis() - start);

start = System.currentTimeMillis();
getLinkedListAddFirst(count);
System.out.println(System.currentTimeMillis() - start);

System.out.println();

System.out.println("Добавление в середину");
start = System.currentTimeMillis();
getArrayListAddMiddle(count);
System.out.println(System.currentTimeMillis() - start);

start = System.currentTimeMillis();
getLinkedListAddMiddle(count);
System.out.println(System.currentTimeMillis() - start);


}

public static ArrayList<Integer> getArrayListAddLast(int count) {
ArrayList<Integer> arrayList = new ArrayList<>();
for (int i = 0; i < count; i++) {
arrayList.addLast(i);
}
return arrayList;
} 

public static LinkedList<Integer> getLinkedListAddLast(int count) {
LinkedList<Integer> linkedList = new LinkedList<>();
for (int i = 0; i < count; i++) {
linkedList.addLast(i);
}
return linkedList;
} 


public static ArrayList<Integer> getArrayListAddFirst(int count) {
ArrayList<Integer> arrayList = new ArrayList<>();
for (int i = 0; i < count; i++) {
arrayList.addFirst(i);
}
return arrayList;
} 

public static LinkedList<Integer> getLinkedListAddFirst(int count) {
LinkedList<Integer> linkedList = new LinkedList<>();
for (int i = 0; i < count; i++) {
linkedList.addFirst(i);
}
return linkedList;
} 

public static ArrayList<Integer> getArrayListAddMiddle(int count) {
ArrayList<Integer> arrayList = new ArrayList<>();
for (int i = 0; i < count; i++) {
arrayList.add(arrayList.size() / 2, i);
}
return arrayList;
} 

public static LinkedList<Integer> getLinkedListAddMiddle(int count) {
LinkedList<Integer> linkedList = new LinkedList<>();
for (int i = 0; i < count; i++) {
linkedList.add(linkedList.size() / 2, i);
}
return linkedList;
} 

}