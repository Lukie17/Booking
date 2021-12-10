/*
 * Luke T
 * BookingServer.java
 * 07/12/21 
 */

package grpc.ca.Booking;

import java.io.IOException;

import javax.swing.JOptionPane;

import grpc.ca.Booking.BookingSystemGrpc.BookingSystemImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class BookingServer extends BookingSystemImplBase {

	public static void main(String[] args) throws InterruptedException, IOException {

		int port = 50051;

		BookingServer server1 = new BookingServer();

		JmDNSRegistration reg = new JmDNSRegistration();

		// unary
		System.out.println("Starting gRPC Booking Server");
		reg.run("_booking._tcp.local.", "Booking", port, "the booking system");
		// server streaming
		System.out.println("Starting gRPC Booking Third Party Server");
		reg.run("_bookingThirdParty._tcp.local.", "BookingThirdParty", port, "the bookingThirdParty system");

		try {
			Server server = ServerBuilder.forPort(port).addService(server1).build().start();

			System.out.println("Server is running on: " + port);
			server.awaitTermination();

		} catch (Exception e) {
			e.printStackTrace();

		}
		

	}

	// unary
	@Override
	public void getBooking(HelloRequest1 request1, StreamObserver<HelloReply1> responseObserver) {

		System.out.println("You called the server");

		Object[] options = { "A hotel?", "A flight?", "A rental car?" };
		int reservation = JOptionPane.showOptionDialog(null, "What will you book today?", "Reservation",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

		if (reservation == 0) {

			HelloReply1 reply1 = HelloReply1.newBuilder()
					.setMessage1("Hello Luke, you have chose to book a hotel, " + request1.getName1()).build();
			responseObserver.onNext(reply1);
			JOptionPane.showMessageDialog(null, "You have chose a hotel");
		} else if (reservation == 1) {
			HelloReply1 reply1 = HelloReply1.newBuilder()
					.setMessage1("Hello Luke, you have chose to book a flight, " + request1.getName1()).build();
			responseObserver.onNext(reply1);
			JOptionPane.showMessageDialog(null, "You have chose a flight");
		} else if (reservation == 2) {
			HelloReply1 reply1 = HelloReply1.newBuilder()
					.setMessage1("Hello Luke, you have chose to book a rental car, " + request1.getName1()).build();
			responseObserver.onNext(reply1);
			JOptionPane.showMessageDialog(null, "You have chose a rental car");
		}

		responseObserver.onCompleted();

	}

	// server streaming
	@Override
	public void getBookingThirdParty(HelloRequest2 request2, StreamObserver<HelloReply2> responseObserver) {

		System.out.println("You called the server for server streaming");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		HelloReply2 reply2 = HelloReply2.newBuilder().setMessage2("Hello Luke " + request2.getName2()).build();

		responseObserver.onNext(reply2);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		HelloReply2 reply2_1 = HelloReply2.newBuilder()
				.setMessage2("Your reservation is confirmed " + request2.getName2()).build();
		responseObserver.onNext(reply2_1);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		HelloReply2 reply2_2 = HelloReply2.newBuilder().setMessage2(
				"If there is anything we can help with for example, shuttle service, or recommendations on where to go, please let us know "
						+ request2.getName2())
				.build();
		responseObserver.onNext(reply2_2);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		HelloReply2 reply2_3 = HelloReply2.newBuilder()
				.setMessage2(
						"How was your stay, we would love if you could rate your experience with gRPC Bookings.org "
								+ request2.getName2())
				.build();
		responseObserver.onNext(reply2_3);

		responseObserver.onCompleted();

	}

}