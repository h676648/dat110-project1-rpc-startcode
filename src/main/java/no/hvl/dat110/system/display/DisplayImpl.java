package no.hvl.dat110.system.display;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.RPCRemoteImpl;
import no.hvl.dat110.rpc.RPCUtils;
import no.hvl.dat110.rpc.RPCServer;

public class DisplayImpl extends RPCRemoteImpl {

	public DisplayImpl(byte rpcid, RPCServer rpcserver) {
		super(rpcid,rpcserver);
	}

	public void write(String message) {
		System.out.println("DISPLAY:" + message);
	}

	@Override
	public byte[] invoke(byte[] param) {

		// TODO - START: 
		// implement unmarshalling, call, and marshall for write RPC method
		// look at how this is done in the SensorImpl class for the read method
		String message = RPCUtils.unmarshallString(param);
		write(message);
		return new byte[0];
		// TODO - END

	}
}
