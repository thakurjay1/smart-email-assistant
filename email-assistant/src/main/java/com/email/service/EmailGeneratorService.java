package com.email.service;

import com.email.pojo.EmailRequest;

public interface EmailGeneratorService {

	public String generateEmailReply(EmailRequest emailRequest);
}
