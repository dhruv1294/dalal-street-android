// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: actions/GetNotifications.proto

package dalalstreet.api.actions;

import dalalstreet.api.models.Notification;
import dalalstreet.api.models.NotificationOrBuilder;

/**
 * Protobuf type {@code proto.GetNotificationsResponse}
 */
public  final class GetNotificationsResponse extends
    com.google.protobuf.GeneratedMessageLite<
            GetNotificationsResponse, GetNotificationsResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:proto.GetNotificationsResponse)
        GetNotificationsResponseOrBuilder {
  private GetNotificationsResponse() {
    statusMessage_ = "";
    notifications_ = emptyProtobufList();
  }
  /**
   * Protobuf enum {@code proto.GetNotificationsResponse.StatusCode}
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

    // @@protoc_insertion_point(enum_scope:proto.GetNotificationsResponse.StatusCode)
  }

  private int bitField0_;
  public static final int STATUS_CODE_FIELD_NUMBER = 1;
  private int statusCode_;
  /**
   * <code>optional .proto.GetNotificationsResponse.StatusCode status_code = 1;</code>
   */
  public int getStatusCodeValue() {
    return statusCode_;
  }
  /**
   * <code>optional .proto.GetNotificationsResponse.StatusCode status_code = 1;</code>
   */
  public GetNotificationsResponse.StatusCode getStatusCode() {
    GetNotificationsResponse.StatusCode result = GetNotificationsResponse.StatusCode.forNumber(statusCode_);
    return result == null ? GetNotificationsResponse.StatusCode.UNRECOGNIZED : result;
  }
  /**
   * <code>optional .proto.GetNotificationsResponse.StatusCode status_code = 1;</code>
   */
  private void setStatusCodeValue(int value) {
      statusCode_ = value;
  }
  /**
   * <code>optional .proto.GetNotificationsResponse.StatusCode status_code = 1;</code>
   */
  private void setStatusCode(GetNotificationsResponse.StatusCode value) {
    if (value == null) {
      throw new NullPointerException();
    }

    statusCode_ = value.getNumber();
  }
  /**
   * <code>optional .proto.GetNotificationsResponse.StatusCode status_code = 1;</code>
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

  public static final int MORE_EXISTS_FIELD_NUMBER = 3;
  private boolean moreExists_;
  /**
   * <code>optional bool more_exists = 3;</code>
   */
  public boolean getMoreExists() {
    return moreExists_;
  }
  /**
   * <code>optional bool more_exists = 3;</code>
   */
  private void setMoreExists(boolean value) {

    moreExists_ = value;
  }
  /**
   * <code>optional bool more_exists = 3;</code>
   */
  private void clearMoreExists() {

    moreExists_ = false;
  }

  public static final int NOTIFICATIONS_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.ProtobufList<Notification> notifications_;
  /**
   * <code>repeated .proto.Notification notifications = 4;</code>
   */
  public java.util.List<Notification> getNotificationsList() {
    return notifications_;
  }
  /**
   * <code>repeated .proto.Notification notifications = 4;</code>
   */
  public java.util.List<? extends NotificationOrBuilder>
      getNotificationsOrBuilderList() {
    return notifications_;
  }
  /**
   * <code>repeated .proto.Notification notifications = 4;</code>
   */
  public int getNotificationsCount() {
    return notifications_.size();
  }
  /**
   * <code>repeated .proto.Notification notifications = 4;</code>
   */
  public Notification getNotifications(int index) {
    return notifications_.get(index);
  }
  /**
   * <code>repeated .proto.Notification notifications = 4;</code>
   */
  public NotificationOrBuilder getNotificationsOrBuilder(
      int index) {
    return notifications_.get(index);
  }
  private void ensureNotificationsIsMutable() {
    if (!notifications_.isModifiable()) {
      notifications_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(notifications_);
     }
  }

  /**
   * <code>repeated .proto.Notification notifications = 4;</code>
   */
  private void setNotifications(
      int index, Notification value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureNotificationsIsMutable();
    notifications_.set(index, value);
  }
  /**
   * <code>repeated .proto.Notification notifications = 4;</code>
   */
  private void setNotifications(
      int index, Notification.Builder builderForValue) {
    ensureNotificationsIsMutable();
    notifications_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .proto.Notification notifications = 4;</code>
   */
  private void addNotifications(Notification value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureNotificationsIsMutable();
    notifications_.add(value);
  }
  /**
   * <code>repeated .proto.Notification notifications = 4;</code>
   */
  private void addNotifications(
      int index, Notification value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureNotificationsIsMutable();
    notifications_.add(index, value);
  }
  /**
   * <code>repeated .proto.Notification notifications = 4;</code>
   */
  private void addNotifications(
      Notification.Builder builderForValue) {
    ensureNotificationsIsMutable();
    notifications_.add(builderForValue.build());
  }
  /**
   * <code>repeated .proto.Notification notifications = 4;</code>
   */
  private void addNotifications(
      int index, Notification.Builder builderForValue) {
    ensureNotificationsIsMutable();
    notifications_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .proto.Notification notifications = 4;</code>
   */
  private void addAllNotifications(
      Iterable<? extends Notification> values) {
    ensureNotificationsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, notifications_);
  }
  /**
   * <code>repeated .proto.Notification notifications = 4;</code>
   */
  private void clearNotifications() {
    notifications_ = emptyProtobufList();
  }
  /**
   * <code>repeated .proto.Notification notifications = 4;</code>
   */
  private void removeNotifications(int index) {
    ensureNotificationsIsMutable();
    notifications_.remove(index);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (statusCode_ != GetNotificationsResponse.StatusCode.OK.getNumber()) {
      output.writeEnum(1, statusCode_);
    }
    if (!statusMessage_.isEmpty()) {
      output.writeString(2, getStatusMessage());
    }
    if (moreExists_ != false) {
      output.writeBool(3, moreExists_);
    }
    for (int i = 0; i < notifications_.size(); i++) {
      output.writeMessage(4, notifications_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (statusCode_ != GetNotificationsResponse.StatusCode.OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, statusCode_);
    }
    if (!statusMessage_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getStatusMessage());
    }
    if (moreExists_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, moreExists_);
    }
    for (int i = 0; i < notifications_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, notifications_.get(i));
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static GetNotificationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static GetNotificationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static GetNotificationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static GetNotificationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static GetNotificationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static GetNotificationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static GetNotificationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static GetNotificationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static GetNotificationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static GetNotificationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(GetNotificationsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code proto.GetNotificationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
              GetNotificationsResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.GetNotificationsResponse)
          GetNotificationsResponseOrBuilder {
    // Construct using dalalstreet.api.actions.GetNotificationsResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .proto.GetNotificationsResponse.StatusCode status_code = 1;</code>
     */
    public int getStatusCodeValue() {
      return instance.getStatusCodeValue();
    }
    /**
     * <code>optional .proto.GetNotificationsResponse.StatusCode status_code = 1;</code>
     */
    public Builder setStatusCodeValue(int value) {
      copyOnWrite();
      instance.setStatusCodeValue(value);
      return this;
    }
    /**
     * <code>optional .proto.GetNotificationsResponse.StatusCode status_code = 1;</code>
     */
    public GetNotificationsResponse.StatusCode getStatusCode() {
      return instance.getStatusCode();
    }
    /**
     * <code>optional .proto.GetNotificationsResponse.StatusCode status_code = 1;</code>
     */
    public Builder setStatusCode(GetNotificationsResponse.StatusCode value) {
      copyOnWrite();
      instance.setStatusCode(value);
      return this;
    }
    /**
     * <code>optional .proto.GetNotificationsResponse.StatusCode status_code = 1;</code>
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

    /**
     * <code>optional bool more_exists = 3;</code>
     */
    public boolean getMoreExists() {
      return instance.getMoreExists();
    }
    /**
     * <code>optional bool more_exists = 3;</code>
     */
    public Builder setMoreExists(boolean value) {
      copyOnWrite();
      instance.setMoreExists(value);
      return this;
    }
    /**
     * <code>optional bool more_exists = 3;</code>
     */
    public Builder clearMoreExists() {
      copyOnWrite();
      instance.clearMoreExists();
      return this;
    }

    /**
     * <code>repeated .proto.Notification notifications = 4;</code>
     */
    public java.util.List<Notification> getNotificationsList() {
      return java.util.Collections.unmodifiableList(
          instance.getNotificationsList());
    }
    /**
     * <code>repeated .proto.Notification notifications = 4;</code>
     */
    public int getNotificationsCount() {
      return instance.getNotificationsCount();
    }/**
     * <code>repeated .proto.Notification notifications = 4;</code>
     */
    public Notification getNotifications(int index) {
      return instance.getNotifications(index);
    }
    /**
     * <code>repeated .proto.Notification notifications = 4;</code>
     */
    public Builder setNotifications(
        int index, Notification value) {
      copyOnWrite();
      instance.setNotifications(index, value);
      return this;
    }
    /**
     * <code>repeated .proto.Notification notifications = 4;</code>
     */
    public Builder setNotifications(
        int index, Notification.Builder builderForValue) {
      copyOnWrite();
      instance.setNotifications(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .proto.Notification notifications = 4;</code>
     */
    public Builder addNotifications(Notification value) {
      copyOnWrite();
      instance.addNotifications(value);
      return this;
    }
    /**
     * <code>repeated .proto.Notification notifications = 4;</code>
     */
    public Builder addNotifications(
        int index, Notification value) {
      copyOnWrite();
      instance.addNotifications(index, value);
      return this;
    }
    /**
     * <code>repeated .proto.Notification notifications = 4;</code>
     */
    public Builder addNotifications(
        Notification.Builder builderForValue) {
      copyOnWrite();
      instance.addNotifications(builderForValue);
      return this;
    }
    /**
     * <code>repeated .proto.Notification notifications = 4;</code>
     */
    public Builder addNotifications(
        int index, Notification.Builder builderForValue) {
      copyOnWrite();
      instance.addNotifications(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .proto.Notification notifications = 4;</code>
     */
    public Builder addAllNotifications(
        Iterable<? extends Notification> values) {
      copyOnWrite();
      instance.addAllNotifications(values);
      return this;
    }
    /**
     * <code>repeated .proto.Notification notifications = 4;</code>
     */
    public Builder clearNotifications() {
      copyOnWrite();
      instance.clearNotifications();
      return this;
    }
    /**
     * <code>repeated .proto.Notification notifications = 4;</code>
     */
    public Builder removeNotifications(int index) {
      copyOnWrite();
      instance.removeNotifications(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:proto.GetNotificationsResponse)
  }
  protected final Object dynamicMethod(
      MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new GetNotificationsResponse();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        notifications_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        GetNotificationsResponse other = (GetNotificationsResponse) arg1;
        statusCode_ = visitor.visitInt(statusCode_ != 0, statusCode_,    other.statusCode_ != 0, other.statusCode_);
        statusMessage_ = visitor.visitString(!statusMessage_.isEmpty(), statusMessage_,
            !other.statusMessage_.isEmpty(), other.statusMessage_);
        moreExists_ = visitor.visitBoolean(moreExists_ != false, moreExists_,
            other.moreExists_ != false, other.moreExists_);
        notifications_= visitor.visitList(notifications_, other.notifications_);
        if (visitor == MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
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
              case 24: {

                moreExists_ = input.readBool();
                break;
              }
              case 34: {
                if (!notifications_.isModifiable()) {
                  notifications_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(notifications_);
                }
                notifications_.add(
                    input.readMessage(Notification.parser(), extensionRegistry));
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
        if (PARSER == null) {    synchronized (GetNotificationsResponse.class) {
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


  // @@protoc_insertion_point(class_scope:proto.GetNotificationsResponse)
  private static final GetNotificationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GetNotificationsResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static GetNotificationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetNotificationsResponse> PARSER;

  public static com.google.protobuf.Parser<GetNotificationsResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

