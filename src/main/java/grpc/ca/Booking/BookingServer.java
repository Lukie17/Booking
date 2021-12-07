package grpc.ca.Booking;

import grpc.ca.Booking.BookingSystemGrpc.BookingSystemImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class BookingServer extends BookingSystemImplBase {
	
	public static void main(String [] args) throws InterruptedException {
		
		int port = 50051;
		
		BookingServer server1 = new BookingServer();
		
		JmDNSRegistration reg = new JmDNSRegistration();
		
		//get two more classes like this and have different ports
		reg.run("_booking._tcp.local.", "Booking", 50051, "Running booking");
		reg.run("_bookingThirdParty._tcp.local.", "bookingThirdParty", 50051, "Running bookingThirdParty system");
		//reg.run("_chatSupport._tcp.local.", "chatSupport", 50002, "Running chatSupport system");
		
		try {
			Server server = ServerBuilder.forPort(port).addService(server1).build().start();
			
			System.out.println("Server is running on: " + port);	
			server.awaitTermination();
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
	
	//unary
	@Override
	public void getBooking(HelloRequest1 request1, StreamObserver<HelloReply1> responseObserver) {
		
		System.out.println("You called the server");
		
		HelloReply1 reply1 = HelloReply1.newBuilder().setMessage1("Hello Luke, " + request1.getName1()).build();
		
		responseObserver.onNext(reply1);
		responseObserver.onCompleted();
		
		
	}
	
	//server streaming
	@Override
	public void getBookingThirdParty(HelloRequest2 request2, StreamObserver<HelloReply2> responseObserver) {
		
		System.out.println("You called the server for server streaming");
		
		HelloReply2 reply2 = HelloReply2.newBuilder().setMessage2("Hello " + request2.getName2()).build();
		
		responseObserver.onNext(reply2);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HelloReply2 reply2_1 = HelloReply2.newBuilder().setMessage2("Your reservation is confirmed " + request2.getName2()).build();
		responseObserver.onNext(reply2_1);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HelloReply2 reply2_2 = HelloReply2.newBuilder().setMessage2("If there is anything we can help with for example, a rental car, shuttle service, or recommendations on where to go, please let us know " + request2.getName2()).build();
		responseObserver.onNext(reply2_2);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HelloReply2 reply2_3 = HelloReply2.newBuilder().setMessage2("How was your stay, we would love if you could rate your experience with Bookings.org " + request2.getName2()).build();
		responseObserver.onNext(reply2_3);
		
		
		responseObserver.onCompleted();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}