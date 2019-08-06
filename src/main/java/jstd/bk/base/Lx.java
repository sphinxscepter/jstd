package jstd.bk.base;

public class Lx {
	public static void main(String[] args){
		StringBuffer a=new StringBuffer("A");
		StringBuffer b=new StringBuffer("B");
		xy(a, b);
		System.out.println(a+","+b);
	}
	public static void xy(StringBuffer a,StringBuffer b){
		a.append(b);
		System.out.println(a);
		b=a;
		System.out.println(b);
		System.out.println(a+","+b);
	}
}
