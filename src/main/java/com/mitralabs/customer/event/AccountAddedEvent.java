package com.mitralabs.customer.event;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountAddedEvent implements CustomerEvent {

	private String accountId;
	private String accountType;
	private Date createdAt;

}
