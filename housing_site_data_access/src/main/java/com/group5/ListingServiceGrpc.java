package com.group5;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: HousingSite.proto")
public final class ListingServiceGrpc {

  private ListingServiceGrpc() {}

  public static final String SERVICE_NAME = "com.group5.ListingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.group5.CreateHouseListingRequest,
      com.group5.CreateHouseListingResponse> getCreateListingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createListing",
      requestType = com.group5.CreateHouseListingRequest.class,
      responseType = com.group5.CreateHouseListingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.group5.CreateHouseListingRequest,
      com.group5.CreateHouseListingResponse> getCreateListingMethod() {
    io.grpc.MethodDescriptor<com.group5.CreateHouseListingRequest, com.group5.CreateHouseListingResponse> getCreateListingMethod;
    if ((getCreateListingMethod = ListingServiceGrpc.getCreateListingMethod) == null) {
      synchronized (ListingServiceGrpc.class) {
        if ((getCreateListingMethod = ListingServiceGrpc.getCreateListingMethod) == null) {
          ListingServiceGrpc.getCreateListingMethod = getCreateListingMethod =
              io.grpc.MethodDescriptor.<com.group5.CreateHouseListingRequest, com.group5.CreateHouseListingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createListing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.group5.CreateHouseListingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.group5.CreateHouseListingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListingServiceMethodDescriptorSupplier("createListing"))
              .build();
        }
      }
    }
    return getCreateListingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ListingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListingServiceStub>() {
        @java.lang.Override
        public ListingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListingServiceStub(channel, callOptions);
        }
      };
    return ListingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ListingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListingServiceBlockingStub>() {
        @java.lang.Override
        public ListingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListingServiceBlockingStub(channel, callOptions);
        }
      };
    return ListingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ListingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListingServiceFutureStub>() {
        @java.lang.Override
        public ListingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListingServiceFutureStub(channel, callOptions);
        }
      };
    return ListingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ListingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createListing(com.group5.CreateHouseListingRequest request,
        io.grpc.stub.StreamObserver<com.group5.CreateHouseListingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateListingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateListingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.group5.CreateHouseListingRequest,
                com.group5.CreateHouseListingResponse>(
                  this, METHODID_CREATE_LISTING)))
          .build();
    }
  }

  /**
   */
  public static final class ListingServiceStub extends io.grpc.stub.AbstractAsyncStub<ListingServiceStub> {
    private ListingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListingServiceStub(channel, callOptions);
    }

    /**
     */
    public void createListing(com.group5.CreateHouseListingRequest request,
        io.grpc.stub.StreamObserver<com.group5.CreateHouseListingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateListingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ListingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ListingServiceBlockingStub> {
    private ListingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.group5.CreateHouseListingResponse createListing(com.group5.CreateHouseListingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateListingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ListingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ListingServiceFutureStub> {
    private ListingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.group5.CreateHouseListingResponse> createListing(
        com.group5.CreateHouseListingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateListingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_LISTING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ListingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ListingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_LISTING:
          serviceImpl.createListing((com.group5.CreateHouseListingRequest) request,
              (io.grpc.stub.StreamObserver<com.group5.CreateHouseListingResponse>) responseObserver);
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

  private static abstract class ListingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ListingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.group5.HousingSite.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ListingService");
    }
  }

  private static final class ListingServiceFileDescriptorSupplier
      extends ListingServiceBaseDescriptorSupplier {
    ListingServiceFileDescriptorSupplier() {}
  }

  private static final class ListingServiceMethodDescriptorSupplier
      extends ListingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ListingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ListingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ListingServiceFileDescriptorSupplier())
              .addMethod(getCreateListingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
