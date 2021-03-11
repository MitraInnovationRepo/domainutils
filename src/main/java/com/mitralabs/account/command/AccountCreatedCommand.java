package com.mitralabs.account.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountCreatedCommand implements AccountCommand {

	private String accountType;

}
