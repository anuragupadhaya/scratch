package com.eanurag.scratch;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

public class MessageTemplate {

	public static void main(String[] args) {
		// Using MessageFormat
		// String text = "The user {0} has email address {1}";
		MessageFormat template = new MessageFormat(
				"The user {0} has email address {1}");
		Object[] params = { "anurag",""};
		// String message = MessageFormat.format(text, params);
		String result = template.format(params);

		System.out.println(result);
	}

}
