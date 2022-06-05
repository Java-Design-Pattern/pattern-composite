package patterncomp;

public abstract class Component {
	protected int level=0;
	protected String Name;
	public Component(String name) {this.Name = name;}
	public abstract void  show();
	public String tab() {
		String tab="";
		for (int i=0 ;i <level;i++)
			tab +="\t";
			return tab;
	}
	

}
