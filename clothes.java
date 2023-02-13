
public class clothes extends shirt {
	private String color;
	private char size;
	private String style;
	private String pants;
	
	
	
	public clothes () {
		
	}

	public clothes (String color, char size,String pants,String style) {
		this.color=color;
		this.size=size;
		this.pants=pants;
		this.style=style;
		
	}

	public String getcolor() {
		return color;
	}
	
	public char getSize() {
		return size;
	}
	public String getpants() {
		return pants;
	}
	public String getstyle() {
		return style;
	}
	public void setcolor(String color) {
		this.color = color;
	}


	public void setSize(char size) {
		this.size = size;
	}
	public void setpants(String pants) {
		this.pants = pants;
	}
	public void setstyle(String style) {
		this.style = style;
	}
	
	public void print() {
		System.out.println("clothes");
	}
}

