package extra;

import java.util.Scanner;

public class SSS {
	static int price = 0;
	
	Scanner sc = new Scanner(System.in);
	public String Go = "아직 정해지지 않았습니다.";
	public String Back = "아직 정해지지 않았습니다.";
	
	String f1 = "출발 7:00~ 도착 9:00";
	String f2 = "출발 10:00~ 도착 13:00";
	String f3 = "출발 16:00~ 도착 18:00";
	String g = "가는편비행기";
	String c = "오는편비행기";
	int p1 = 70000;
	int p2 = 80000;
	int p3 = 90000;
	int p4 = 100000;
	int p5 = 110000;
	
	

	
	//가는편 비행기	
	//비행기 가격은 price 에 저장된다.

	public void Plane() {
		try {
		
	System.out.println(g);
	System.out.println("time table");
	System.out.println("1.");
	System.out.println("┎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┒");
	System.out.println("	"+f1+"        ");
	System.out.println("┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┚");
	System.out.println("2.");
	System.out.println("┎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┒");
	System.out.println("	"+f2+" ");
	System.out.println("┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┚");
	System.out.println("3.");
	System.out.println("┎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┒");
	System.out.println("	"+f3+"");
	System.out.println("┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┚");
	
	System.out.println();
	System.out.println("이용하실 비행편을 선택해 주세요");
	String num=sc.nextLine();
	if(num.equals("1")) {
		Go = "f1";
		price += p1;
		
		System.out.println();
		System.out.println(f1+"가격:"+price+"원");
	}else if (num.equals("2")){
		Go = "f2";
		price += p2;
	
		System.out.println();
		System.out.println(f2+"가격:"+price+"원");
	}else if (num.equals("3")){
		Go = "f3";
		price +=p3;
		
		System.out.println();
		System.out.println(f3+"가격:"+price+"원");
	}
	System.out.println();
	System.out.println();
	System.out.println();
		}catch(Exception e ) {}
	}

	void PlaneT() {
		System.out.println();
		System.out.println("");
		System.out.println("이용하시는 비행편은\n가는편 비행기"+Go+"\n오는편 비행기"+Back+"입니다.");
		System.out.println();
		System.out.println("총 결제금액은 "+price+"원 입니다.");
		System.out.println("추가결제창으로 넘어갑니다.");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

	@Override
	public String toString() {
		return 
		""+g+"\n"+
		"time table"+
		"1."+
		"┎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┒\n"+
		"	"+f1+"        \n"+
		"┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┚\n"+
		"2."+
		"┎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┒\n"+
		"	"+f1+"        \n"+
		"┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┚\n"+
		"3."+
		"┎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┒\n"+
		"	"+f1+"        \n"+
		"┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┚\n";
		
		System.out.println();
		System.out.println("이용하실 비행편을 선택해 주세요");
		String num=sc.nextLine();
		if(num.equals("1")) {
			Go = "f1";
			price += p1;
			
			System.out.println();
			System.out.println(f1+"가격:"+price+"원");
		}else if (num.equals("2")){
			Go = "f2";
			price += p2;
		
			System.out.println();
			System.out.println(f2+"가격:"+price+"원");
		}else if (num.equals("3")){
			Go = "f3";
			price +=p3;
			
			System.out.println();
			System.out.println(f3+"가격:"+price+"원");
	}

}


	
