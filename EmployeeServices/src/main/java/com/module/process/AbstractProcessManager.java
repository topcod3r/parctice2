package com.module.process;

import com.module.process.intf.IBaseProcessor;
import com.module.process.intf.IProcessmanager;

public abstract class AbstractProcessManager<T>  implements IBaseProcessor, IProcessmanager<T>{
	
	
	@Override
	public void performExecute() {
		validateParameters();
		resolveParameters();
		execute();
		storageMessage();
		
	}

}
