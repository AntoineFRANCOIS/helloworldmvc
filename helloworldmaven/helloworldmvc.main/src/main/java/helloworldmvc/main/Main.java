package helloworldmvc.main;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new Controller(new View(), new Model());
		c.run();
	}

}
