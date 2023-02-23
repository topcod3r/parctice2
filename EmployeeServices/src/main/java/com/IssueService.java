package com;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public interface IssueService {

	String udpdateIssue(String method);
	String saveIssue (String method);
}
