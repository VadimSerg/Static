package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

public class CallStatic {

    public static void main(String[] args) {
	Static stat1 = new Static();
	Static stat2 = new Static();
	stat1.x =10;
	stat2.x =50;
	Static.y =15;

        System.out.println("stat1.x = "+stat1.x +" stat2.x = "+ stat2.x);
		System.out.println("y = " + Static.y);
		System.out.println("The summ stat1.x and common y will be equial "+ stat1.computeSumm());
		System.out.println("The summ stat2.x and common y will be equial "+ stat2.computeSumm());
		Static.y = 45;
		System.out.println("y is changed: "+ Static.y);
		System.out.println("The summ stat1.x and common y will be equial "+ stat1.computeSumm());
		System.out.println("The summ stat2.x and common y will be equial "+ stat2.computeSumm());
        // write your code here

		System.out.println();
		System.out.println("Creating a new object staticObject");
		Static2 staticObject = new Static2();
		System.out.println("staticObjet.val: "+Static2.val + " staticObject.b: "+Static2.b);
		System.out.println(Static2.caclulate_Val());


    }
}
