package pokemon;

public class Pokemon{
	public Pokemon(String n){
		this.name = n;
	}
	/**********************
			Getters
	**********************/

	public int getSR(){ return this.softResets; }
	public String getName(){ return this.name; }

	/**********************
			Setters
	**********************/

	public void setSR(int sr){ this.softResets = sr; }
	public void setName(String n){ this.name = n; }

	/**********************
			Attributes
	**********************/

	private String name;
	private int softResets;
}