/*
 * Luke T
 * BookingClient.java
 * 07/12/21 
 */

package grpc.ca.Booking;

import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;

import grpc.ca.Booking.BookingSystemGrpc.BookingSystemBlockingStub;
import grpc.ca.Booking.BookingSystemGrpc.BookingSystemStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

//class
public class BookingClient {

	private static BookingSystemStub asyncStub;

	// main method
	public static void main(String[] args) throws InterruptedException {

		String host = "localhost";

		ServiceInfo serviceInfo = JmDNSDiscovery.run("_booking._tcp.local.");

		JmDNSDiscovery.run("_bookingThirdParty._tcp.local.");

		ManagedChannel channel1 = ManagedChannelBuilder.forAddress(host, serviceInfo.getPort()).usePlaintext().build();

		BookingSystemBlockingStub stub = BookingSystemGrpc.newBlockingStub(channel1);

		asyncStub = BookingSystemGrpc.newStub(channel1);

		try {

			// unary
			System.out.println("--Unary streaming--");
			HelloRequest1 request1 = HelloRequest1.newBuilder().setName1("reservation confirmed").build();
			HelloReply1 reply1 = stub.getBooking(request1);
			System.out.println(reply1.getMessage1());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			// server streaming
			System.out.println("--Server streaming--");
			getBookingThirdParty();

		} catch (StatusRuntimeException e) {
			e.printStackTrace();
		} finally {
			channel1.shutdown().awaitTermination(60, TimeUnit.SECONDS);
		}

	}

	// server streaming
	public static void getBookingThirdParty() {

		HelloRequest2 request = HelloRequest2.newBuilder().setName2("--Thank you for your business").build();

		StreamObserver<HelloReply2> responseObserver = new StreamObserver<HelloReply2>() {

			@Override
			public void onNext(HelloReply2 value) {
				System.out.println("Email from gRPC Bookings.org: " + value.getMessage2());

			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				System.out.println("Stream is completed, we hope you come back again");
			}

		};

		asyncStub.getBookingThirdParty(request, responseObserver);

		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
