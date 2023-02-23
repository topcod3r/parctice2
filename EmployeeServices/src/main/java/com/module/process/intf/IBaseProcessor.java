package com.module.process.intf;

public interface IBaseProcessor {

	void validateParameters();
	void resolveParameters();
	void execute();
	void storageMessage();
}
