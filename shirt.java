
public  class shirt  {
 
public static String color;
 public static char size;
 public static String style;
 
  public shirt() {
	 
 }
  public shirt(String newcolor , char newsize){
	  this.setColor(color);
	  this.setSize(size);
  }
 
   shirt(String newcolor , char newsize,String newstyle, String style){
		  this.setColor(color);
		  this.setSize(size);
		  this.setstyle(style);
	  }
	
   public void setstyle(String newstyle) {
		 style = newstyle;
	}
	 public String getstyle() {
			return style;
		}
 
   
public static void putOn() {
	 System.out.println("the shirt in on!");
 }
 public static void takeOff() {
	 System.out.println("the shirt id off!");
 }

public static void setColor(String newcolor) {
	color = newcolor;
}

public void setSize(char newsize) {
	size = newsize;
}

public static String getColor() {
	return color;
}

public char getSize() {
	return size;
}

public void print() {
	System.out.println("shirt");
}

}
