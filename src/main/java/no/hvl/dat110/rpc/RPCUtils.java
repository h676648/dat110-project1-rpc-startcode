package no.hvl.dat110.rpc;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import no.hvl.dat110.TODO;

public class RPCUtils {
	
	public static byte[] encapsulate(byte rpcid, byte[] payload) {

		// TODO - START
		byte[] rpcmsg = new byte[1 + payload.length];
		rpcmsg[0] = rpcid;
		System.arraycopy(payload, 0, rpcmsg, 1, payload.length);
		// Encapsulate the rpcid and payload in a byte array according to the RPC message syntax / format
		
		// TODO - END
		
		return rpcmsg;
	}
	
	public static byte[] decapsulate(byte[] rpcmsg) {

		// TODO - START
		byte[] payload = new byte[rpcmsg.length - 1];
		System.arraycopy(rpcmsg, 1, payload, 0, payload.length);
		// Decapsulate the rpcid and payload in a byte array according to the RPC message syntax
		return payload;
		// TODO - END

	}

	// convert String to byte array
	public static byte[] marshallString(String str) {
		
		byte[] encoded = str.getBytes(StandardCharsets.UTF_8);
		
		// TODO - START
		// TODO - END
		
		return encoded;
	}

	// convert byte array to a String
	public static String unmarshallString(byte[] data) {

		// TODO - START 
		String decoded = new String(data, StandardCharsets.UTF_8);
		return decoded;
		// TODO - END

	}
	
	public static byte[] marshallVoid() {

		// TODO - START 
		byte[] encoded = new byte[0];
		return encoded;
		// TODO - END

	}
	
	public static void unmarshallVoid(byte[] data) {
		
		// TODO
		
	}

	// convert boolean to a byte array representation
	public static byte[] marshallBoolean(boolean b) {
		
		byte[] encoded = new byte[1];
				
		if (b) {
			encoded[0] = 1;
		} else
		{
			encoded[0] = 0;
		}
		
		return encoded;
	}

	// convert byte array to a boolean representation
	public static boolean unmarshallBoolean(byte[] data) {
		
		return (data[0] > 0);
		
	}

	// integer to byte array representation
	public static byte[] marshallInteger(int x) {

		// TODO - START 
		ByteBuffer buffer = ByteBuffer.allocate(4);
		buffer.putInt(x);
		return buffer.array();
		// TODO - END

	}
	
	// byte array representation to integer
	public static int unmarshallInteger(byte[] data) {

		// TODO - START 
		ByteBuffer buffer = ByteBuffer.wrap(data);
		return buffer.getInt();
		// TODO - END

	}
}
