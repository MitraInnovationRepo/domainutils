package com.mitralabs.customer.command;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountAddedCommand implements CustomerCommand {

	private String accountId;
	private String accountType;
	private Date createdAt;

}
