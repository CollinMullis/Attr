package edu.saintjoe.cs.brianc.attr;

public class ColorAttrDriver {
	
	public static void main(String[] args ) {
		
		ColorAttr testOne, testTwo, testThree, testFive;
		Attr testFour;
		
		// We need this object for the third ColorAttr constructor
		ScreenColor newColor = new ScreenColor("green");
		
		// Test out our constructors
		
		// Number one
		testOne = new ColorAttr("ColorOne","red");
		System.out.println(testOne.toString());
		
		// Number two
		testTwo = new ColorAttr("ColorTwo");
		System.out.println(testTwo.toString());
		
		// Number three
		// The reason that testThree prints differently, is because it is a Color Attr, so it will take the conditions youre
		// giving it, and use it in the way it knows how to as a Color Attr, taking previous constructors from Attr
		testThree = new ColorAttr("ColorThree", newColor);
		System.out.println(testThree.toString());
	
		// Number four
		// The reason testFour prints differenlty from testThree is because testFour is a Attr, and not a color Attr, 
		// so it doesn't have the data member that Attr needs to get the color. 
		testFour = new Attr("ColorFour", "yellow");
		System.out.println(testFour.toString());
		
		testFive = new ColorAttr("ColorFour", "crimson");
		System.out.println(testFive.toString());
		
	} // end main
}
