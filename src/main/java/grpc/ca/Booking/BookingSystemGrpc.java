package grpc.ca.Booking;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: BookingSystem.proto")
public final class BookingSystemGrpc {

  private BookingSystemGrpc() {}

  public static final String SERVICE_NAME = "BookingSystem";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.ca.Booking.HelloRequest1,
      grpc.ca.Booking.HelloReply1> getGetBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBooking",
      requestType = grpc.ca.Booking.HelloRequest1.class,
      responseType = grpc.ca.Booking.HelloReply1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.ca.Booking.HelloRequest1,
      grpc.ca.Booking.HelloReply1> getGetBookingMethod() {
    io.grpc.MethodDescriptor<grpc.ca.Booking.HelloRequest1, grpc.ca.Booking.HelloReply1> getGetBookingMethod;
    if ((getGetBookingMethod = BookingSystemGrpc.getGetBookingMethod) == null) {
      synchronized (BookingSystemGrpc.class) {
        if ((getGetBookingMethod = BookingSystemGrpc.getGetBookingMethod) == null) {
          BookingSystemGrpc.getGetBookingMethod = getGetBookingMethod = 
              io.grpc.MethodDescriptor.<grpc.ca.Booking.HelloRequest1, grpc.ca.Booking.HelloReply1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookingSystem", "GetBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.Booking.HelloRequest1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.Booking.HelloReply1.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingSystemMethodDescriptorSupplier("GetBooking"))
                  .build();
          }
        }
     }
     return getGetBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.ca.Booking.HelloRequest2,
      grpc.ca.Booking.HelloReply2> getGetBookingThirdPartyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBookingThirdParty",
      requestType = grpc.ca.Booking.HelloRequest2.class,
      responseType = grpc.ca.Booking.HelloReply2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.ca.Booking.HelloRequest2,
      grpc.ca.Booking.HelloReply2> getGetBookingThirdPartyMethod() {
    io.grpc.MethodDescriptor<grpc.ca.Booking.HelloRequest2, grpc.ca.Booking.HelloReply2> getGetBookingThirdPartyMethod;
    if ((getGetBookingThirdPartyMethod = BookingSystemGrpc.getGetBookingThirdPartyMethod) == null) {
      synchronized (BookingSystemGrpc.class) {
        if ((getGetBookingThirdPartyMethod = BookingSystemGrpc.getGetBookingThirdPartyMethod) == null) {
          BookingSystemGrpc.getGetBookingThirdPartyMethod = getGetBookingThirdPartyMethod = 
              io.grpc.MethodDescriptor.<grpc.ca.Booking.HelloRequest2, grpc.ca.Booking.HelloReply2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BookingSystem", "GetBookingThirdParty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.Booking.HelloRequest2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.Booking.HelloReply2.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingSystemMethodDescriptorSupplier("GetBookingThirdParty"))
                  .build();
          }
        }
     }
     return getGetBookingThirdPartyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookingSystemStub newStub(io.grpc.Channel channel) {
    return new BookingSystemStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookingSystemBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookingSystemBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookingSystemFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookingSystemFutureStub(channel);
  }

  /**
   */
  public static abstract class BookingSystemImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void getBooking(grpc.ca.Booking.HelloRequest1 request,
        io.grpc.stub.StreamObserver<grpc.ca.Booking.HelloReply1> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBookingMethod(), responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void getBookingThirdParty(grpc.ca.Booking.HelloRequest2 request,
        io.grpc.stub.StreamObserver<grpc.ca.Booking.HelloReply2> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBookingThirdPartyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.ca.Booking.HelloRequest1,
                grpc.ca.Booking.HelloReply1>(
                  this, METHODID_GET_BOOKING)))
          .addMethod(
            getGetBookingThirdPartyMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.ca.Booking.HelloRequest2,
                grpc.ca.Booking.HelloReply2>(
                  this, METHODID_GET_BOOKING_THIRD_PARTY)))
          .build();
    }
  }

  /**
   */
  public static final class BookingSystemStub extends io.grpc.stub.AbstractStub<BookingSystemStub> {
    private BookingSystemStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingSystemStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingSystemStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingSystemStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void getBooking(grpc.ca.Booking.HelloRequest1 request,
        io.grpc.stub.StreamObserver<grpc.ca.Booking.HelloReply1> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void getBookingThirdParty(grpc.ca.Booking.HelloRequest2 request,
        io.grpc.stub.StreamObserver<grpc.ca.Booking.HelloReply2> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetBookingThirdPartyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookingSystemBlockingStub extends io.grpc.stub.AbstractStub<BookingSystemBlockingStub> {
    private BookingSystemBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingSystemBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingSystemBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingSystemBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public grpc.ca.Booking.HelloReply1 getBooking(grpc.ca.Booking.HelloRequest1 request) {
      return blockingUnaryCall(
          getChannel(), getGetBookingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public java.util.Iterator<grpc.ca.Booking.HelloReply2> getBookingThirdParty(
        grpc.ca.Booking.HelloRequest2 request) {
      return blockingServerStreamingCall(
          getChannel(), getGetBookingThirdPartyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookingSystemFutureStub extends io.grpc.stub.AbstractStub<BookingSystemFutureStub> {
    private BookingSystemFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingSystemFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingSystemFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingSystemFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ca.Booking.HelloReply1> getBooking(
        grpc.ca.Booking.HelloRequest1 request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBookingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BOOKING = 0;
  private static final int METHODID_GET_BOOKING_THIRD_PARTY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookingSystemImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookingSystemImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BOOKING:
          serviceImpl.getBooking((grpc.ca.Booking.HelloRequest1) request,
              (io.grpc.stub.StreamObserver<grpc.ca.Booking.HelloReply1>) responseObserver);
          break;
        case METHODID_GET_BOOKING_THIRD_PARTY:
          serviceImpl.getBookingThirdParty((grpc.ca.Booking.HelloRequest2) request,
              (io.grpc.stub.StreamObserver<grpc.ca.Booking.HelloReply2>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BookingSystemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookingSystemBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.ca.Booking.NewServiceImpl1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookingSystem");
    }
  }

  private static final class BookingSystemFileDescriptorSupplier
      extends BookingSystemBaseDescriptorSupplier {
    BookingSystemFileDescriptorSupplier() {}
  }

  private static final class BookingSystemMethodDescriptorSupplier
      extends BookingSystemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookingSystemMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BookingSystemGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookingSystemFileDescriptorSupplier())
              .addMethod(getGetBookingMethod())
              .addMethod(getGetBookingThirdPartyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
