import java.util.*;

class Main {
  public static void main(String[] args) {
    int[] elements = { 21, 17, 60, 20, 56, 12 };
    // Initial Print
    System.out.println("Printing Unsorted Array");
    for (int num : elements) {
      System.out.print(num + " ");
    }
    System.out.println();
    System.out.println("Printing Each Pass Through The Selection Sort");
    // Selection Sort
    for (int j = 0; j < elements.length - 1; j++) {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++) {
        if (elements[k] < elements[minIndex]) {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
      for (int num : elements) {
        System.out.print(num + " ");
      }
      System.out.println();
    }

    // Insertion Sort
    int[] elements2 = { 21, 17, 60, 20, 56, 12 };
    // Initial Print
    System.out.println("Printing Unsorted Array");
    for (int num : elements2) {
      System.out.print(num + " ");
    }
    System.out.println();
    System.out.println("Printing Each Pass Through The Insertion Sort");
    for (int j = 1; j < elements2.length; j++) {
      int temp = elements2[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements2[possibleIndex - 1]) {
        elements2[possibleIndex] = elements2[possibleIndex - 1];
        possibleIndex--;

      }
      elements2[possibleIndex] = temp;
      for (int num : elements2) {
        System.out.print(num + " ");
      }
      System.out.println();
    }

    // String Selection Sort
    String[] letters = { "L", "Y", "R", "G", "O" };
    //Initial Print
    System.out.println("Printing Unsorted Array of Strings");
    for (String lit : letters) {
      System.out.print(lit + " ");
    }
    System.out.println();
    System.out.println("Printing Each Pass Through The Selection Sort");
    // Selection Sort
    for (int j = 0; j < letters.length - 1; j++) {
      int minIndex = j;
      for (int k = j + 1; k < letters.length; k++) {
        if (letters[k].compareTo(letters[minIndex]) < 0) {
          minIndex = k;
        }
      }
      String temp = letters[j];
      letters[j] = letters[minIndex];
      letters[minIndex] = temp;
      for (String lit : letters) {
        System.out.print(lit + " ");
      }
      System.out.println();
    }

    // String Insertion Sort
    String[] letters2 = { "L", "Y", "R", "G", "O" };
    // Initial Print
    System.out.println("Printing Unsorted Array of Strings");
    for (String lit : letters2) {
      System.out.print(lit + " ");
    }
    System.out.println();
    System.out.println("Printing Each Pass Through The Insertion Sort");
    for (int j = 1; j < letters2.length; j++) {
      String temp = letters2[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp.compareTo(letters2[possibleIndex - 1])<0) {
        letters2[possibleIndex] = letters2[possibleIndex - 1];
        possibleIndex--;
      }
      letters2[possibleIndex] = temp;
      for (String lit : letters2) {
        System.out.print(lit + " ");
      }
      System.out.println();
    }

//ARRAY LISTS

ArrayList<Integer> elements3 = new ArrayList<Integer>();
    elements3.add(21);
    elements3.add(17);
    elements3.add(60);
    elements3.add(20);
    elements3.add(56);
    elements3.add(12);
    // Initial Print
    System.out.println("Printing Unsorted ArrayList");
    for (int num : elements3) {
      System.out.print(num + " ");
    }
    System.out.println();
    
      System.out.println("Printing Each Pass Through The Selection Sort");
    // Selection Sort
    for (int j = 0; j < elements3.size() - 1; j++) {
      int minIndex = j;
      for (int k = j + 1; k < elements3.size(); k++) {
        if (elements3.get(k) < elements3.get(minIndex)) {
          minIndex = k;
        }
      }
      int temp = elements3.get(j);
      elements3.set(j, elements3.get(minIndex));
      elements3.set(minIndex, temp);
      for (int num : elements3) {
        System.out.print(num + " ");
      }
      System.out.println();
    }

    //Insertion Sort
    ArrayList<Integer> elements4 = new ArrayList<Integer>();
    elements4.add(21);
    elements4.add(17);
    elements4.add(60);
    elements4.add(20);
    elements4.add(56);
    elements4.add(12);
    // Initial Print
    System.out.println("Printing Unsorted ArrayList");
    for (int num : elements4) {
      System.out.print(num + " ");
    }
    System.out.println();
    System.out.println("Printing Each Pass Through The Insertion Sort");
  
    for (int j = 1; j < elements4.size(); j++) {
      int temp = elements4.get(j);
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements4.get(possibleIndex-1)){
        elements4.set(possibleIndex, elements4.get(possibleIndex-1));
        possibleIndex--;
      }
      elements4.set(possibleIndex,temp);
      for (int num : elements4) {
        System.out.print(num + " ");
      }
      System.out.println();
    }

    //String Selection Sort
    ArrayList<String> letters3 = new ArrayList<String>();
    letters3.add("L");
    letters3.add("Y");
    letters3.add("R");
    letters3.add("G");
    letters3.add("O");
    // Initial Print
    System.out.println("Printing Unsorted ArrayList of Strings");
    for (String lit : letters3) {
      System.out.print(lit + " ");
    }
    System.out.println();
    System.out.println("Printing Each Pass Through The Selection Sort");
    // Selection Sort
    for (int j = 0; j < letters3.size() - 1; j++) {
      int minIndex = j;
      for (int k = j + 1; k < letters3.size(); k++) {
        if (letters3.get(k).compareTo(letters3.get(minIndex))<0 ) {
          minIndex = k;
        }
      }
      String temp = letters3.get(j);
      letters3.set(j, letters3.get(minIndex));
      letters3.set(minIndex, temp);
      for (String lit : letters3) {
        System.out.print(lit + " ");
      }
      System.out.println();
    }

    
    // String Insertion Sort
   ArrayList<String> letters4 = new ArrayList<String>();
    letters4.add("L");
    letters4.add("Y");
    letters4.add("R");
    letters4.add("G");
    letters4.add("O");
    // Initial Print
    System.out.println("Printing Unsorted ArrayList of Strings");
    for (String lit : letters4) {
      System.out.print(lit + " ");
    }
    System.out.println();
    System.out.println("Printing Each Pass Through The Insertion Sort");
    for (int j = 1; j < letters4.size(); j++) {
      String temp = letters4.get(j);
      int possibleIndex = j;
      while (possibleIndex > 0 && temp.compareTo(letters4.get(possibleIndex-1))<0) {
        letters4.set(possibleIndex, letters4.get(possibleIndex-1));
        possibleIndex--;
      }
      letters4.set(possibleIndex, temp);
      for (String lit : letters4) {
        System.out.print(lit + " ");
      }
      System.out.println();
    }
    
  }
}