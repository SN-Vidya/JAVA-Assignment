
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


 class Lesson1 {
 
  public void runExercises() {
    System.out.println("question5 solution...");
    question5();
    System.out.println("question6 solution...");
    question6();
    System.out.println("question7 solution...");
    question7();
    System.out.println("question8 solution...");
    question8();
  }

  
  private void question5() {
    List<String> list = Arrays.asList(
        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

   
    StringBuilder firstLetters = new StringBuilder();
    list.forEach(s -> firstLetters.append(s.substring(0, 1)) );
    System.out.println(firstLetters);
  }

  
  
  
  private void question6() {
    List<String> list = new ArrayList<>(Arrays.asList(
        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

    
    list.replaceAll(s -> s.toUpperCase());
    System.out.println(list);
  }

 
  private void question7() {
    Map<String, Integer> map = new TreeMap<>();
    map.put("c", 3);
    map.put("b", 2);
    map.put("a", 1);

   
    StringBuilder stringResult = new StringBuilder();
    map.forEach((k, v) -> stringResult.append(k).append("=").append(v).append(", "));
    System.out.println(stringResult.substring(0, stringResult.length() - 2));
  }

  
  private void question8() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    
    new Thread(() -> list.forEach(n -> System.out.println(n))).start();
  }

  
  public static void main(String[] args) {
    Lesson1 lesson = new Lesson1();
    lesson.runExercises();
  }
}
