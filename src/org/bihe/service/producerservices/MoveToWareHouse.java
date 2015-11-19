package org.bihe.service.producerservices;

import org.bihe.bean.Demand;
import org.bihe.service.HandleCommand;
import org.bihe.service.Service;

public class MoveToWareHouse implements Service {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1562395232868897343L;
	
	private Demand demand;

	public MoveToWareHouse(Demand demand) {
		this.demand=demand;
	}



	@Override
	public void execute() {
		HandleCommand.moveToWareHouse(demand);
		
	}

}
