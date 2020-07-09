package com.algo.dynamic;

import java.util.HashMap;
import java.util.Map;

public class Test {
	static public void main(String args[]) {
		Map<C,String> map= new HashMap<>();
		C c1= new C();
		C c2= new C();
		map.put(c1, "YES");
		map.put(c2, "NO");
		System.out.println(map.get(c2));
		if (C.C.equals(C.C.C)) {
			System.out.println("Hi Shoeb");
		}else {
			System.out.println("You are NOT Shoeb");
		}
	}
	static class C
	{
		static C C =new C();
		/*String name;
		C(String name)
		{
			this.name= name;
		}*/
		@Override
		public boolean equals(Object obj) {
			if(obj==this)
			{
				return true;
			}
			return false;
		}
		
	}
}

