// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/StockHistory.proto

package dalalstreet.api.models;

/**
 * Protobuf type {@code proto.StockHistory}
 */
public  final class StockHistory extends
    com.google.protobuf.GeneratedMessageLite<
            StockHistory, StockHistory.Builder> implements
    // @@protoc_insertion_point(message_implements:proto.StockHistory)
        StockHistoryOrBuilder {
  private StockHistory() {
    createdAt_ = "";
  }
  public static final int STOCK_ID_FIELD_NUMBER = 1;
  private int stockId_;
  /**
   * <code>optional uint32 stock_id = 1;</code>
   */
  public int getStockId() {
    return stockId_;
  }
  /**
   * <code>optional uint32 stock_id = 1;</code>
   */
  private void setStockId(int value) {

    stockId_ = value;
  }
  /**
   * <code>optional uint32 stock_id = 1;</code>
   */
  private void clearStockId() {

    stockId_ = 0;
  }

  public static final int STOCK_PRICE_FIELD_NUMBER = 2;
  private int stockPrice_;
  /**
   * <code>optional uint32 stock_price = 2;</code>
   */
  public int getStockPrice() {
    return stockPrice_;
  }
  /**
   * <code>optional uint32 stock_price = 2;</code>
   */
  private void setStockPrice(int value) {

    stockPrice_ = value;
  }
  /**
   * <code>optional uint32 stock_price = 2;</code>
   */
  private void clearStockPrice() {

    stockPrice_ = 0;
  }

  public static final int CREATED_AT_FIELD_NUMBER = 3;
  private String createdAt_;
  /**
   * <code>optional string created_at = 3;</code>
   */
  public String getCreatedAt() {
    return createdAt_;
  }
  /**
   * <code>optional string created_at = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCreatedAtBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(createdAt_);
  }
  /**
   * <code>optional string created_at = 3;</code>
   */
  private void setCreatedAt(
      String value) {
    if (value == null) {
    throw new NullPointerException();
  }

    createdAt_ = value;
  }
  /**
   * <code>optional string created_at = 3;</code>
   */
  private void clearCreatedAt() {

    createdAt_ = getDefaultInstance().getCreatedAt();
  }
  /**
   * <code>optional string created_at = 3;</code>
   */
  private void setCreatedAtBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

    createdAt_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (stockId_ != 0) {
      output.writeUInt32(1, stockId_);
    }
    if (stockPrice_ != 0) {
      output.writeUInt32(2, stockPrice_);
    }
    if (!createdAt_.isEmpty()) {
      output.writeString(3, getCreatedAt());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (stockId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, stockId_);
    }
    if (stockPrice_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, stockPrice_);
    }
    if (!createdAt_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getCreatedAt());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static StockHistory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static StockHistory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static StockHistory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static StockHistory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static StockHistory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static StockHistory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static StockHistory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static StockHistory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static StockHistory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static StockHistory parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(StockHistory prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code proto.StockHistory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
              StockHistory, Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.StockHistory)
          StockHistoryOrBuilder {
    // Construct using dalalstreet.api.models.StockHistory.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional uint32 stock_id = 1;</code>
     */
    public int getStockId() {
      return instance.getStockId();
    }
    /**
     * <code>optional uint32 stock_id = 1;</code>
     */
    public Builder setStockId(int value) {
      copyOnWrite();
      instance.setStockId(value);
      return this;
    }
    /**
     * <code>optional uint32 stock_id = 1;</code>
     */
    public Builder clearStockId() {
      copyOnWrite();
      instance.clearStockId();
      return this;
    }

    /**
     * <code>optional uint32 stock_price = 2;</code>
     */
    public int getStockPrice() {
      return instance.getStockPrice();
    }
    /**
     * <code>optional uint32 stock_price = 2;</code>
     */
    public Builder setStockPrice(int value) {
      copyOnWrite();
      instance.setStockPrice(value);
      return this;
    }
    /**
     * <code>optional uint32 stock_price = 2;</code>
     */
    public Builder clearStockPrice() {
      copyOnWrite();
      instance.clearStockPrice();
      return this;
    }

    /**
     * <code>optional string created_at = 3;</code>
     */
    public String getCreatedAt() {
      return instance.getCreatedAt();
    }
    /**
     * <code>optional string created_at = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCreatedAtBytes() {
      return instance.getCreatedAtBytes();
    }
    /**
     * <code>optional string created_at = 3;</code>
     */
    public Builder setCreatedAt(
        String value) {
      copyOnWrite();
      instance.setCreatedAt(value);
      return this;
    }
    /**
     * <code>optional string created_at = 3;</code>
     */
    public Builder clearCreatedAt() {
      copyOnWrite();
      instance.clearCreatedAt();
      return this;
    }
    /**
     * <code>optional string created_at = 3;</code>
     */
    public Builder setCreatedAtBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCreatedAtBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:proto.StockHistory)
  }
  protected final Object dynamicMethod(
      MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new StockHistory();
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
        StockHistory other = (StockHistory) arg1;
        stockId_ = visitor.visitInt(stockId_ != 0, stockId_,
            other.stockId_ != 0, other.stockId_);
        stockPrice_ = visitor.visitInt(stockPrice_ != 0, stockPrice_,
            other.stockPrice_ != 0, other.stockPrice_);
        createdAt_ = visitor.visitString(!createdAt_.isEmpty(), createdAt_,
            !other.createdAt_.isEmpty(), other.createdAt_);
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

                stockId_ = input.readUInt32();
                break;
              }
              case 16: {

                stockPrice_ = input.readUInt32();
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                createdAt_ = s;
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
        if (PARSER == null) {    synchronized (StockHistory.class) {
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


  // @@protoc_insertion_point(class_scope:proto.StockHistory)
  private static final StockHistory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new StockHistory();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static StockHistory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<StockHistory> PARSER;

  public static com.google.protobuf.Parser<StockHistory> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
