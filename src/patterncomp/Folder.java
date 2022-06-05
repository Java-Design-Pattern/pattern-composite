package patterncomp;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
 protected List<Component> childs = new  ArrayList<Component>();
	public Folder(String name) {
		super(name);
		
	}
	public Component addComponent(Component comp)
	{comp.level=level+1;
		childs.add(comp);
		return comp;
		
	}

	@Override
	public void show() {
		System.out.println(tab()+"+ "+Name);
		for(Component child:childs )
			child.show();
		
		
	}

}
