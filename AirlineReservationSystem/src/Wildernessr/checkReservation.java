package Wildernessr;

import java.util.Iterator;
import java.util.Set;

public class checkReservation {
   // private Map<String, MemberMNG> member;

   public void check() {
      System.out.println("=====================================");
      System.out.println(" 이름 \t 항공편\t ");
      System.out.println("=====================================");

      Set<String> set = Join.memberMap.keySet();

      Iterator<String> it = set.iterator();

      while (it.hasNext()) {
         MemberMNG mng = Join.memberMap.get(it.next());
         System.out.println(mng.getID() + mng.getBirth());

      }
   }
   public void remov() {
      System.out.println("");
   }
}