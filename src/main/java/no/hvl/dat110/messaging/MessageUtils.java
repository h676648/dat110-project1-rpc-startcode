package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;
	public static int MESSAGINGPORT = 8080;
	public static String MESSAGINGHOST = "localhost";

	public static byte[] encapsulate(Message message) {
		
		byte[] segment = new byte[128];
		byte[] data = message.getData();
		
		// TODO - START
		
		// encapulate/encode the payload data of the message and form a segment
		// according to the segment format for the messaging layer
		
		if (data.length > 128) {
			throw new UnsupportedOperationException(TODO.method());
		}
		segment[0] = (byte) data.length; // Første byte inneholder lengden
		System.arraycopy(data, 0,segment, 1, data.length); //Kopierer dataen

		// TODO - END
		return segment;
	}

	public static Message decapsulate(byte[] segment) {

		Message message = null;
		int length = segment[0];
		byte[] data = new byte[length];


		// TODO - START
		// decapsulate segment and put received payload data into a message
		System.arraycopy(segment, 1, data, 0, length);
		if (length > 127 || length < 0) {
			throw new UnsupportedOperationException(TODO.method());
		}
		System.arraycopy(segment, 1, data, 0, length);

		message = new Message(data);
		// TODO - END
		
		return message;
		
	}
	
}
