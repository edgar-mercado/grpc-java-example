package com.ps.grpc.messages;

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
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: pb/message.proto")
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetByBadgeNumberMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.GetByBadgeNumberRequest,
      com.ps.grpc.messages.Message.EmployeeResponse> METHOD_GET_BY_BADGE_NUMBER = getGetByBadgeNumberMethod();

  private static volatile io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.GetByBadgeNumberRequest,
      com.ps.grpc.messages.Message.EmployeeResponse> getGetByBadgeNumberMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.GetByBadgeNumberRequest,
      com.ps.grpc.messages.Message.EmployeeResponse> getGetByBadgeNumberMethod() {
    io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.GetByBadgeNumberRequest, com.ps.grpc.messages.Message.EmployeeResponse> getGetByBadgeNumberMethod;
    if ((getGetByBadgeNumberMethod = EmployeeServiceGrpc.getGetByBadgeNumberMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetByBadgeNumberMethod = EmployeeServiceGrpc.getGetByBadgeNumberMethod) == null) {
          EmployeeServiceGrpc.getGetByBadgeNumberMethod = getGetByBadgeNumberMethod = 
              io.grpc.MethodDescriptor.<com.ps.grpc.messages.Message.GetByBadgeNumberRequest, com.ps.grpc.messages.Message.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "GetByBadgeNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ps.grpc.messages.Message.GetByBadgeNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ps.grpc.messages.Message.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("GetByBadgeNumber"))
                  .build();
          }
        }
     }
     return getGetByBadgeNumberMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAllMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.GetAllRequest,
      com.ps.grpc.messages.Message.EmployeeResponse> METHOD_GET_ALL = getGetAllMethod();

  private static volatile io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.GetAllRequest,
      com.ps.grpc.messages.Message.EmployeeResponse> getGetAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.GetAllRequest,
      com.ps.grpc.messages.Message.EmployeeResponse> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.GetAllRequest, com.ps.grpc.messages.Message.EmployeeResponse> getGetAllMethod;
    if ((getGetAllMethod = EmployeeServiceGrpc.getGetAllMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetAllMethod = EmployeeServiceGrpc.getGetAllMethod) == null) {
          EmployeeServiceGrpc.getGetAllMethod = getGetAllMethod = 
              io.grpc.MethodDescriptor.<com.ps.grpc.messages.Message.GetAllRequest, com.ps.grpc.messages.Message.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "GetAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ps.grpc.messages.Message.GetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ps.grpc.messages.Message.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("GetAll"))
                  .build();
          }
        }
     }
     return getGetAllMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSaveMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.EmployeeRequest,
      com.ps.grpc.messages.Message.EmployeeResponse> METHOD_SAVE = getSaveMethod();

  private static volatile io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.EmployeeRequest,
      com.ps.grpc.messages.Message.EmployeeResponse> getSaveMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.EmployeeRequest,
      com.ps.grpc.messages.Message.EmployeeResponse> getSaveMethod() {
    io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.EmployeeRequest, com.ps.grpc.messages.Message.EmployeeResponse> getSaveMethod;
    if ((getSaveMethod = EmployeeServiceGrpc.getSaveMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getSaveMethod = EmployeeServiceGrpc.getSaveMethod) == null) {
          EmployeeServiceGrpc.getSaveMethod = getSaveMethod = 
              io.grpc.MethodDescriptor.<com.ps.grpc.messages.Message.EmployeeRequest, com.ps.grpc.messages.Message.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "Save"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ps.grpc.messages.Message.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ps.grpc.messages.Message.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("Save"))
                  .build();
          }
        }
     }
     return getSaveMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSaveAllMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.EmployeeRequest,
      com.ps.grpc.messages.Message.EmployeeResponse> METHOD_SAVE_ALL = getSaveAllMethod();

  private static volatile io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.EmployeeRequest,
      com.ps.grpc.messages.Message.EmployeeResponse> getSaveAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.EmployeeRequest,
      com.ps.grpc.messages.Message.EmployeeResponse> getSaveAllMethod() {
    io.grpc.MethodDescriptor<com.ps.grpc.messages.Message.EmployeeRequest, com.ps.grpc.messages.Message.EmployeeResponse> getSaveAllMethod;
    if ((getSaveAllMethod = EmployeeServiceGrpc.getSaveAllMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getSaveAllMethod = EmployeeServiceGrpc.getSaveAllMethod) == null) {
          EmployeeServiceGrpc.getSaveAllMethod = getSaveAllMethod = 
              io.grpc.MethodDescriptor.<com.ps.grpc.messages.Message.EmployeeRequest, com.ps.grpc.messages.Message.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "SaveAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ps.grpc.messages.Message.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ps.grpc.messages.Message.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("SaveAll"))
                  .build();
          }
        }
     }
     return getSaveAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    return new EmployeeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EmployeeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getByBadgeNumber(com.ps.grpc.messages.Message.GetByBadgeNumberRequest request,
        io.grpc.stub.StreamObserver<com.ps.grpc.messages.Message.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByBadgeNumberMethod(), responseObserver);
    }

    /**
     */
    public void getAll(com.ps.grpc.messages.Message.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.ps.grpc.messages.Message.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void save(com.ps.grpc.messages.Message.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.ps.grpc.messages.Message.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.ps.grpc.messages.Message.EmployeeRequest> saveAll(
        io.grpc.stub.StreamObserver<com.ps.grpc.messages.Message.EmployeeResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSaveAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetByBadgeNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ps.grpc.messages.Message.GetByBadgeNumberRequest,
                com.ps.grpc.messages.Message.EmployeeResponse>(
                  this, METHODID_GET_BY_BADGE_NUMBER)))
          .addMethod(
            getGetAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.ps.grpc.messages.Message.GetAllRequest,
                com.ps.grpc.messages.Message.EmployeeResponse>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getSaveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ps.grpc.messages.Message.EmployeeRequest,
                com.ps.grpc.messages.Message.EmployeeResponse>(
                  this, METHODID_SAVE)))
          .addMethod(
            getSaveAllMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.ps.grpc.messages.Message.EmployeeRequest,
                com.ps.grpc.messages.Message.EmployeeResponse>(
                  this, METHODID_SAVE_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeServiceStub extends io.grpc.stub.AbstractStub<EmployeeServiceStub> {
    private EmployeeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getByBadgeNumber(com.ps.grpc.messages.Message.GetByBadgeNumberRequest request,
        io.grpc.stub.StreamObserver<com.ps.grpc.messages.Message.EmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByBadgeNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.ps.grpc.messages.Message.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.ps.grpc.messages.Message.EmployeeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void save(com.ps.grpc.messages.Message.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.ps.grpc.messages.Message.EmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.ps.grpc.messages.Message.EmployeeRequest> saveAll(
        io.grpc.stub.StreamObserver<com.ps.grpc.messages.Message.EmployeeResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSaveAllMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeServiceBlockingStub extends io.grpc.stub.AbstractStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ps.grpc.messages.Message.EmployeeResponse getByBadgeNumber(com.ps.grpc.messages.Message.GetByBadgeNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetByBadgeNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.ps.grpc.messages.Message.EmployeeResponse> getAll(
        com.ps.grpc.messages.Message.GetAllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ps.grpc.messages.Message.EmployeeResponse save(com.ps.grpc.messages.Message.EmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeServiceFutureStub extends io.grpc.stub.AbstractStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ps.grpc.messages.Message.EmployeeResponse> getByBadgeNumber(
        com.ps.grpc.messages.Message.GetByBadgeNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByBadgeNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ps.grpc.messages.Message.EmployeeResponse> save(
        com.ps.grpc.messages.Message.EmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BY_BADGE_NUMBER = 0;
  private static final int METHODID_GET_ALL = 1;
  private static final int METHODID_SAVE = 2;
  private static final int METHODID_SAVE_ALL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BY_BADGE_NUMBER:
          serviceImpl.getByBadgeNumber((com.ps.grpc.messages.Message.GetByBadgeNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.ps.grpc.messages.Message.EmployeeResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.ps.grpc.messages.Message.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.ps.grpc.messages.Message.EmployeeResponse>) responseObserver);
          break;
        case METHODID_SAVE:
          serviceImpl.save((com.ps.grpc.messages.Message.EmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.ps.grpc.messages.Message.EmployeeResponse>) responseObserver);
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
        case METHODID_SAVE_ALL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.saveAll(
              (io.grpc.stub.StreamObserver<com.ps.grpc.messages.Message.EmployeeResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ps.grpc.messages.Message.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
              .addMethod(getGetByBadgeNumberMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getSaveMethod())
              .addMethod(getSaveAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
