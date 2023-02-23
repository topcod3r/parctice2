package com.module.process.intf;

import java.util.Map;

public interface IProcessmanager<T> {

	void setParameters(Map<String, Object> params);
	void performExecute();
	
}
