// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datastreams/MarketDepth.proto

package dalalstreet.api.datastreams;

/**
 * Protobuf type {@code proto.Trade}
 */
public  final class Trade extends
    com.google.protobuf.GeneratedMessageLite<
            Trade, Trade.Builder> implements
    // @@protoc_insertion_point(message_implements:proto.Trade)
        TradeOrBuilder {
  private Trade() {
    tradeTime_ = "";
  }
  public static final int TRADE_PRICE_FIELD_NUMBER = 1;
  private int tradePrice_;
  /**
   * <code>optional uint32 trade_price = 1;</code>
   */
  public int getTradePrice() {
    return tradePrice_;
  }
  /**
   * <code>optional uint32 trade_price = 1;</code>
   */
  private void setTradePrice(int value) {

    tradePrice_ = value;
  }
  /**
   * <code>optional uint32 trade_price = 1;</code>
   */
  private void clearTradePrice() {

    tradePrice_ = 0;
  }

  public static final int TRADE_QUANTITY_FIELD_NUMBER = 2;
  private int tradeQuantity_;
  /**
   * <code>optional uint32 trade_quantity = 2;</code>
   */
  public int getTradeQuantity() {
    return tradeQuantity_;
  }
  /**
   * <code>optional uint32 trade_quantity = 2;</code>
   */
  private void setTradeQuantity(int value) {

    tradeQuantity_ = value;
  }
  /**
   * <code>optional uint32 trade_quantity = 2;</code>
   */
  private void clearTradeQuantity() {

    tradeQuantity_ = 0;
  }

  public static final int TRADE_TIME_FIELD_NUMBER = 3;
  private String tradeTime_;
  /**
   * <code>optional string trade_time = 3;</code>
   */
  public String getTradeTime() {
    return tradeTime_;
  }
  /**
   * <code>optional string trade_time = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTradeTimeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(tradeTime_);
  }
  /**
   * <code>optional string trade_time = 3;</code>
   */
  private void setTradeTime(
      String value) {
    if (value == null) {
    throw new NullPointerException();
  }

    tradeTime_ = value;
  }
  /**
   * <code>optional string trade_time = 3;</code>
   */
  private void clearTradeTime() {

    tradeTime_ = getDefaultInstance().getTradeTime();
  }
  /**
   * <code>optional string trade_time = 3;</code>
   */
  private void setTradeTimeBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

    tradeTime_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (tradePrice_ != 0) {
      output.writeUInt32(1, tradePrice_);
    }
    if (tradeQuantity_ != 0) {
      output.writeUInt32(2, tradeQuantity_);
    }
    if (!tradeTime_.isEmpty()) {
      output.writeString(3, getTradeTime());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (tradePrice_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, tradePrice_);
    }
    if (tradeQuantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, tradeQuantity_);
    }
    if (!tradeTime_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getTradeTime());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static Trade parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static Trade parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static Trade parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static Trade parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static Trade parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static Trade parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static Trade parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static Trade parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static Trade parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static Trade parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Trade prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code proto.Trade}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
              Trade, Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.Trade)
          TradeOrBuilder {
    // Construct using dalalstreet.api.datastreams.Trade.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional uint32 trade_price = 1;</code>
     */
    public int getTradePrice() {
      return instance.getTradePrice();
    }
    /**
     * <code>optional uint32 trade_price = 1;</code>
     */
    public Builder setTradePrice(int value) {
      copyOnWrite();
      instance.setTradePrice(value);
      return this;
    }
    /**
     * <code>optional uint32 trade_price = 1;</code>
     */
    public Builder clearTradePrice() {
      copyOnWrite();
      instance.clearTradePrice();
      return this;
    }

    /**
     * <code>optional uint32 trade_quantity = 2;</code>
     */
    public int getTradeQuantity() {
      return instance.getTradeQuantity();
    }
    /**
     * <code>optional uint32 trade_quantity = 2;</code>
     */
    public Builder setTradeQuantity(int value) {
      copyOnWrite();
      instance.setTradeQuantity(value);
      return this;
    }
    /**
     * <code>optional uint32 trade_quantity = 2;</code>
     */
    public Builder clearTradeQuantity() {
      copyOnWrite();
      instance.clearTradeQuantity();
      return this;
    }

    /**
     * <code>optional string trade_time = 3;</code>
     */
    public String getTradeTime() {
      return instance.getTradeTime();
    }
    /**
     * <code>optional string trade_time = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTradeTimeBytes() {
      return instance.getTradeTimeBytes();
    }
    /**
     * <code>optional string trade_time = 3;</code>
     */
    public Builder setTradeTime(
        String value) {
      copyOnWrite();
      instance.setTradeTime(value);
      return this;
    }
    /**
     * <code>optional string trade_time = 3;</code>
     */
    public Builder clearTradeTime() {
      copyOnWrite();
      instance.clearTradeTime();
      return this;
    }
    /**
     * <code>optional string trade_time = 3;</code>
     */
    public Builder setTradeTimeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTradeTimeBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:proto.Trade)
  }
  protected final Object dynamicMethod(
      MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new Trade();
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
        Trade other = (Trade) arg1;
        tradePrice_ = visitor.visitInt(tradePrice_ != 0, tradePrice_,
            other.tradePrice_ != 0, other.tradePrice_);
        tradeQuantity_ = visitor.visitInt(tradeQuantity_ != 0, tradeQuantity_,
            other.tradeQuantity_ != 0, other.tradeQuantity_);
        tradeTime_ = visitor.visitString(!tradeTime_.isEmpty(), tradeTime_,
            !other.tradeTime_.isEmpty(), other.tradeTime_);
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

                tradePrice_ = input.readUInt32();
                break;
              }
              case 16: {

                tradeQuantity_ = input.readUInt32();
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                tradeTime_ = s;
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
        if (PARSER == null) {    synchronized (Trade.class) {
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


  // @@protoc_insertion_point(class_scope:proto.Trade)
  private static final Trade DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Trade();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static Trade getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Trade> PARSER;

  public static com.google.protobuf.Parser<Trade> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

