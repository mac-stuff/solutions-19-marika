package pl.coderstrust.array;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> myList = new MyArrayList<>();

    System.out.println(myList.add("ABC"));
    System.out.println(myList.add("CBD"));
    System.out.println(myList.add("THC"));

    System.out.println("size: " + myList.size());

    for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }

    List<String> myList1 = new MyArrayList<>();

    System.out.println(myList1.add("ABCABC"));
    System.out.println(myList1.add("CBDCBD"));
    System.out.println(myList1.add("THCTHC"));

    System.out.println("saizik: " + myList1.size());

    myList.addAll(myList1);

    for (int i = 0; i < myList1.size(); i++) {
      System.out.println(myList1.get(i));
    }

    /*
    System.out.println(myList.remove("CBD"));

    System.out.println("contains false: " + myList.contains("ABS"));
    System.out.println("contains true: " + myList.contains("ABC"));

    System.out.println("index Of: " + myList.indexOf("THC"));
    System.out.println("size after remove: " + myList.size());

    myList.set(1, "DUPA");
    for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }

    myList.add("ABS");
    myList.add(0, "ABS");

    for (int i = 0; i < myList.size(); i++) {
      System.out.println("aa: " + myList.get(i));
    }
    System.out.println("index Of: " + myList.indexOf("ABS"));
    System.out.println("last index Of: " + myList.lastIndexOf("ABS"));

    System.out.println("contains: " + myList.contains("CBD"));

    System.out.println("is empty: " + myList.isEmpty());

    System.out.println("sub list: " + myList.subList(1, 3));
    for (int i = 0; i < myList.size(); i++) {
      System.out.println(">>> " + myList.get(i));
    }

    myList.clear();

    System.out.println("size: " + myList.size());
    System.out.println("is empty: " + myList.isEmpty());

    myList.add("ASD");
    myList.add("OOP");
    myList.add("DUA");

    List<String> myList3 = new ArrayList<>();
    myList3.add("ASD");
    myList3.add("OOP");
    myList3.add("DUA");

    System.out.println("contains all : " + myList.containsAll(myList3));

    HashSet<String> hs = new HashSet<String>() ;

    hs.add("India");
    hs.add ("America");
    hs.add("Japan");

    myList.addAll(hs);

    System.out.println("ADD ALL /n");

    for (int i = 0; i < myList.size() ; i++) {
      System.out.println( myList.get(i));
    }

    System.out.println("size after add all " + myList.size());

    HashSet<String> ms = new HashSet<String>();

    ms.add("Indiana Johns");
    ms.add ("American Beauty");
    ms.add("Japan Style");
    ms.add("Barry White");

    myList.addAll(2, ms);

    for (int i = 0; i < myList.size() ; i++) {
      System.out.println( "* " + myList.get(i));
    }

    System.out.println(myList.size());

    /*
    myList.removeAll(ms);

    for (int i = 0; i < myList.size() ; i++) {
      System.out.println( "$ " + myList.get(i));
    }

     */

  }

}