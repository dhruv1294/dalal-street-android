// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: actions/CancelOrder.proto

package dalalstreet.api.actions;

/**
 * Protobuf type {@code proto.CancelOrderResponse}
 */
public  final class CancelOrderResponse extends
    com.google.protobuf.GeneratedMessageLite<
            CancelOrderResponse, CancelOrderResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:proto.CancelOrderResponse)
        CancelOrderResponseOrBuilder {
  private CancelOrderResponse() {
    statusMessage_ = "";
  }
  /**
   * Protobuf enum {@code proto.CancelOrderResponse.StatusCode}
   */
  public enum StatusCode
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>OK = 0;</code>
     */
    OK(0),
    /**
     * <code>InternalServerError = 1;</code>
     */
    InternalServerError(1),
    /**
     * <code>MarketClosedError = 2;</code>
     */
    MarketClosedError(2),
    /**
     * <code>InvalidOrderId = 3;</code>
     */
    InvalidOrderId(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>OK = 0;</code>
     */
    public static final int OK_VALUE = 0;
    /**
     * <code>InternalServerError = 1;</code>
     */
    public static final int InternalServerError_VALUE = 1;
    /**
     * <code>MarketClosedError = 2;</code>
     */
    public static final int MarketClosedError_VALUE = 2;
    /**
     * <code>InvalidOrderId = 3;</code>
     */
    public static final int InvalidOrderId_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static StatusCode valueOf(int value) {
      return forNumber(value);
    }

    public static StatusCode forNumber(int value) {
      switch (value) {
        case 0: return OK;
        case 1: return InternalServerError;
        case 2: return MarketClosedError;
        case 3: return InvalidOrderId;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<StatusCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        StatusCode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<StatusCode>() {
            public StatusCode findValueByNumber(int number) {
              return StatusCode.forNumber(number);
            }
          };

    private final int value;

    private StatusCode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:proto.CancelOrderResponse.StatusCode)
  }

  public static final int STATUS_CODE_FIELD_NUMBER = 1;
  private int statusCode_;
  /**
   * <code>optional .proto.CancelOrderResponse.StatusCode status_code = 1;</code>
   */
  public int getStatusCodeValue() {
    return statusCode_;
  }
  /**
   * <code>optional .proto.CancelOrderResponse.StatusCode status_code = 1;</code>
   */
  public CancelOrderResponse.StatusCode getStatusCode() {
    CancelOrderResponse.StatusCode result = CancelOrderResponse.StatusCode.forNumber(statusCode_);
    return result == null ? CancelOrderResponse.StatusCode.UNRECOGNIZED : result;
  }
  /**
   * <code>optional .proto.CancelOrderResponse.StatusCode status_code = 1;</code>
   */
  private void setStatusCodeValue(int value) {
      statusCode_ = value;
  }
  /**
   * <code>optional .proto.CancelOrderResponse.StatusCode status_code = 1;</code>
   */
  private void setStatusCode(CancelOrderResponse.StatusCode value) {
    if (value == null) {
      throw new NullPointerException();
    }

    statusCode_ = value.getNumber();
  }
  /**
   * <code>optional .proto.CancelOrderResponse.StatusCode status_code = 1;</code>
   */
  private void clearStatusCode() {

    statusCode_ = 0;
  }

  public static final int STATUS_MESSAGE_FIELD_NUMBER = 2;
  private String statusMessage_;
  /**
   * <code>optional string status_message = 2;</code>
   */
  public String getStatusMessage() {
    return statusMessage_;
  }
  /**
   * <code>optional string status_message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getStatusMessageBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(statusMessage_);
  }
  /**
   * <code>optional string status_message = 2;</code>
   */
  private void setStatusMessage(
      String value) {
    if (value == null) {
    throw new NullPointerException();
  }

    statusMessage_ = value;
  }
  /**
   * <code>optional string status_message = 2;</code>
   */
  private void clearStatusMessage() {

    statusMessage_ = getDefaultInstance().getStatusMessage();
  }
  /**
   * <code>optional string status_message = 2;</code>
   */
  private void setStatusMessageBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

    statusMessage_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (statusCode_ != CancelOrderResponse.StatusCode.OK.getNumber()) {
      output.writeEnum(1, statusCode_);
    }
    if (!statusMessage_.isEmpty()) {
      output.writeString(2, getStatusMessage());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (statusCode_ != CancelOrderResponse.StatusCode.OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, statusCode_);
    }
    if (!statusMessage_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getStatusMessage());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static CancelOrderResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static CancelOrderResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static CancelOrderResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static CancelOrderResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static CancelOrderResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static CancelOrderResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static CancelOrderResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static CancelOrderResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static CancelOrderResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static CancelOrderResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(CancelOrderResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code proto.CancelOrderResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
              CancelOrderResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.CancelOrderResponse)
          CancelOrderResponseOrBuilder {
    // Construct using dalalstreet.api.actions.CancelOrderResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .proto.CancelOrderResponse.StatusCode status_code = 1;</code>
     */
    public int getStatusCodeValue() {
      return instance.getStatusCodeValue();
    }
    /**
     * <code>optional .proto.CancelOrderResponse.StatusCode status_code = 1;</code>
     */
    public Builder setStatusCodeValue(int value) {
      copyOnWrite();
      instance.setStatusCodeValue(value);
      return this;
    }
    /**
     * <code>optional .proto.CancelOrderResponse.StatusCode status_code = 1;</code>
     */
    public CancelOrderResponse.StatusCode getStatusCode() {
      return instance.getStatusCode();
    }
    /**
     * <code>optional .proto.CancelOrderResponse.StatusCode status_code = 1;</code>
     */
    public Builder setStatusCode(CancelOrderResponse.StatusCode value) {
      copyOnWrite();
      instance.setStatusCode(value);
      return this;
    }
    /**
     * <code>optional .proto.CancelOrderResponse.StatusCode status_code = 1;</code>
     */
    public Builder clearStatusCode() {
      copyOnWrite();
      instance.clearStatusCode();
      return this;
    }

    /**
     * <code>optional string status_message = 2;</code>
     */
    public String getStatusMessage() {
      return instance.getStatusMessage();
    }
    /**
     * <code>optional string status_message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStatusMessageBytes() {
      return instance.getStatusMessageBytes();
    }
    /**
     * <code>optional string status_message = 2;</code>
     */
    public Builder setStatusMessage(
        String value) {
      copyOnWrite();
      instance.setStatusMessage(value);
      return this;
    }
    /**
     * <code>optional string status_message = 2;</code>
     */
    public Builder clearStatusMessage() {
      copyOnWrite();
      instance.clearStatusMessage();
      return this;
    }
    /**
     * <code>optional string status_message = 2;</code>
     */
    public Builder setStatusMessageBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setStatusMessageBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:proto.CancelOrderResponse)
  }
  protected final Object dynamicMethod(
      MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new CancelOrderResponse();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        CancelOrderResponse other = (CancelOrderResponse) arg1;
        statusCode_ = visitor.visitInt(statusCode_ != 0, statusCode_,    other.statusCode_ != 0, other.statusCode_);
        statusMessage_ = visitor.visitString(!statusMessage_.isEmpty(), statusMessage_,
            !other.statusMessage_.isEmpty(), other.statusMessage_);
        if (visitor == MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 8: {
                int rawValue = input.readEnum();

                statusCode_ = rawValue;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                statusMessage_ = s;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (CancelOrderResponse.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:proto.CancelOrderResponse)
  private static final CancelOrderResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CancelOrderResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static CancelOrderResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CancelOrderResponse> PARSER;

  public static com.google.protobuf.Parser<CancelOrderResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

