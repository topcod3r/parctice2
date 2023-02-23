package com.test;

import com.IssueService;

public class IssueTestServiceImple implements IssueService {

	@Override
	public String udpdateIssue(String method) {
		System.out.println("com.test.IssueTestServiceImple method of IssueService");
		return null;
	}

	@Override
	public String saveIssue(String method) {
		System.out.println("com.test.IssueTestServiceImple method of IssueServiceImpl");
		return null;
	}

}
