package no.hvl.dat110.messaging;

import no.hvl.dat110.TODO;

import java.util.Arrays;

public class Message {

	// the up to 127 bytes of data (payload) that a message can hold
	private byte[] data;

	// construction a Message with the data provided
	public Message(byte[] data) {
		
		// TODO - START


		if (data.length > 127 || data == null) {
			throw new UnsupportedOperationException(TODO.constructor("Data er NULL eller over 127 bytes."));
		}
		// TODO - END
		this.data = Arrays.copyOf(data, data.length);
	}

	public byte[] getData() {
		return this.data;
	}

}
