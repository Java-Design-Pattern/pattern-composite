package patterncomp;

public class app {

	public static void main(String[] args) {
	
		Folder root = new Folder("DESIGN PATTERN");
		Folder f1= (Folder)root.addComponent(new Folder("Comportement"));
		Folder f2= (Folder)root.addComponent(new Folder("Structure"));
		Folder f3= (Folder)root.addComponent(new Folder("Creation"));
		//root.show();
		f1.addComponent(new File("file1.pdf"));
		f1.addComponent(new File("file2.pdf"));
		f2.addComponent(new File("file3.pdf"));
		//root.show();
		f3.addComponent(new File("file4.pdf"));
		Folder f11= (Folder)root.addComponent(new Folder("docs"));
		Folder f22= (Folder)root.addComponent(new Folder("zip	"));
		Folder f34= (Folder)root.addComponent(new Folder("Videos"));
		root.show();
	}

}
