package com.mitralabs.account.command;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountCreatedCommand implements AccountCommand {

	private String ownerId;
	private String accountId;
	private String accountType;
	private String status;
	private Date createdAt;

}
