package com.kd;

import java.util.ArrayList;

public class E1 {

	public static void main(String[] args) {
		ArrayList<String> lista=new ArrayList<String>();
		lista.add("Katana");//0
		lista.add("Nagitana");//1
		
		String wl;
		for(int w=0;w<lista.size();w++) {
			wl=lista.get(w);
			System.out.println(wl);
		}
	}

}
