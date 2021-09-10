package ch14_2_streamLib;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;



public class ObjectStreamExample {
	public static void main(String[] args) throws Exception {
		
		BoardUtil util = new BoardUtil();
		
		System.out.println(util);
		System.out.println();
		System.out.println(util.read());
		System.out.println();
		
		
		//리스트 직렬화
		util.write();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//리스트 역 직렬화
		for (Board b : util.read()) {
			System.out.printf("%d\t%s\t%s\t%s\t%s\n",
					b.getBno(),b.getTitle(),b.getContent(),b.getWriter(),sdf.format(b.getDate())
			);	
		}
}
}