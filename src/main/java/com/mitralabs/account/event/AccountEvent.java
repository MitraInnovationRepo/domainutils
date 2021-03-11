package com.mitralabs.account.event;

import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity = "com.mitralabs.account.AccountAggregate")
public interface AccountEvent extends Event {

}
