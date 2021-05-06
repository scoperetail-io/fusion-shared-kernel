package com.scoperetail.fusion.shared.kernel.events;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DomainEvent {
	private String eventId; // hash key using attributes
	private Event event;
	private Map<String, String> keyMap;
	private String payload;
//	@Builder.Default
//	//@JsonFormat(pattern="yyyy-MM-dd")
//	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
//	//private LocalDateTime timestamp = LocalDateTime.now();
}
