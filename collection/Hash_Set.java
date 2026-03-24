import java.util.HashSet;

public class Hash_Set {
  public static void main(String[] args) {
    HashSet<Integer> hashSet = new HashSet<>();

    hashSet.add(1);
    hashSet.add(2);
    hashSet.add(3);
    hashSet.add(4);
    hashSet.add(1);
    hashSet.add(2);

    System.out.println(hashSet);

    // Union of two Set
    HashSet<Integer> hashSet1 = new HashSet<>();

    hashSet1.add(1);
    hashSet1.add(2);
    hashSet1.add(3);
    hashSet1.add(4);

    HashSet<Integer> hashSet2 = new HashSet<>();

    hashSet2.add(1);
    hashSet2.add(2);
    hashSet2.add(3);
    hashSet2.add(4);

    HashSet<Integer> FinalHashset = new HashSet<>();

    // for(int i=0;i<hashSet1.size();i++){
    // FinalHashset.add(hashSet1.);
    // }

    for (Integer ele : hashSet1) {
      FinalHashset.add(ele);
    }

    for (Integer ele : hashSet2) {
      FinalHashset.add(ele);
    }

    System.out.println(FinalHashset);

    // Intersection Point
    hashSet1.retainAll(hashSet2);
    System.out.println(hashSet1);

    // Compare two set
    boolean res = hashSet1.equals(hashSet2);
    System.out.println(res);

  }
}
