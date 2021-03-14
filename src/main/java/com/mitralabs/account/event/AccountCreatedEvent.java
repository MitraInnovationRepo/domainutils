package com.mitralabs.account.event;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountCreatedEvent implements AccountEvent {

	private String ownerId;
	private String accountId;
	private String accountType;
	private String status;
	private Date createdAt;

}
