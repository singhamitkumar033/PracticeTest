package important;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddress {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		System.out.println(InetAddress.getLocalHost());
		System.out.println(InetAddress.getLoopbackAddress());
		
	}

}
