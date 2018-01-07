// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datastreams/StockExchange.proto

package dalalstreet.api.datastreams;

/**
 * Protobuf type {@code proto.StockExchangeDataPoint}
 */
public  final class StockExchangeDataPoint extends
    com.google.protobuf.GeneratedMessageLite<
            StockExchangeDataPoint, StockExchangeDataPoint.Builder> implements
    // @@protoc_insertion_point(message_implements:proto.StockExchangeDataPoint)
        StockExchangeDataPointOrBuilder {
  private StockExchangeDataPoint() {
  }
  public static final int PRICE_FIELD_NUMBER = 1;
  private int price_;
  /**
   * <code>optional uint32 price = 1;</code>
   */
  public int getPrice() {
    return price_;
  }
  /**
   * <code>optional uint32 price = 1;</code>
   */
  private void setPrice(int value) {

    price_ = value;
  }
  /**
   * <code>optional uint32 price = 1;</code>
   */
  private void clearPrice() {

    price_ = 0;
  }

  public static final int STOCKS_IN_EXCHANGE_FIELD_NUMBER = 2;
  private int stocksInExchange_;
  /**
   * <code>optional uint32 stocks_in_exchange = 2;</code>
   */
  public int getStocksInExchange() {
    return stocksInExchange_;
  }
  /**
   * <code>optional uint32 stocks_in_exchange = 2;</code>
   */
  private void setStocksInExchange(int value) {

    stocksInExchange_ = value;
  }
  /**
   * <code>optional uint32 stocks_in_exchange = 2;</code>
   */
  private void clearStocksInExchange() {

    stocksInExchange_ = 0;
  }

  public static final int STOCKS_IN_MARKET_FIELD_NUMBER = 3;
  private int stocksInMarket_;
  /**
   * <code>optional uint32 stocks_in_market = 3;</code>
   */
  public int getStocksInMarket() {
    return stocksInMarket_;
  }
  /**
   * <code>optional uint32 stocks_in_market = 3;</code>
   */
  private void setStocksInMarket(int value) {

    stocksInMarket_ = value;
  }
  /**
   * <code>optional uint32 stocks_in_market = 3;</code>
   */
  private void clearStocksInMarket() {

    stocksInMarket_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (price_ != 0) {
      output.writeUInt32(1, price_);
    }
    if (stocksInExchange_ != 0) {
      output.writeUInt32(2, stocksInExchange_);
    }
    if (stocksInMarket_ != 0) {
      output.writeUInt32(3, stocksInMarket_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (price_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, price_);
    }
    if (stocksInExchange_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, stocksInExchange_);
    }
    if (stocksInMarket_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, stocksInMarket_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static StockExchangeDataPoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static StockExchangeDataPoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static StockExchangeDataPoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static StockExchangeDataPoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static StockExchangeDataPoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static StockExchangeDataPoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static StockExchangeDataPoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static StockExchangeDataPoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static StockExchangeDataPoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static StockExchangeDataPoint parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(StockExchangeDataPoint prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code proto.StockExchangeDataPoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
              StockExchangeDataPoint, Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.StockExchangeDataPoint)
          StockExchangeDataPointOrBuilder {
    // Construct using dalalstreet.api.datastreams.StockExchangeDataPoint.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional uint32 price = 1;</code>
     */
    public int getPrice() {
      return instance.getPrice();
    }
    /**
     * <code>optional uint32 price = 1;</code>
     */
    public Builder setPrice(int value) {
      copyOnWrite();
      instance.setPrice(value);
      return this;
    }
    /**
     * <code>optional uint32 price = 1;</code>
     */
    public Builder clearPrice() {
      copyOnWrite();
      instance.clearPrice();
      return this;
    }

    /**
     * <code>optional uint32 stocks_in_exchange = 2;</code>
     */
    public int getStocksInExchange() {
      return instance.getStocksInExchange();
    }
    /**
     * <code>optional uint32 stocks_in_exchange = 2;</code>
     */
    public Builder setStocksInExchange(int value) {
      copyOnWrite();
      instance.setStocksInExchange(value);
      return this;
    }
    /**
     * <code>optional uint32 stocks_in_exchange = 2;</code>
     */
    public Builder clearStocksInExchange() {
      copyOnWrite();
      instance.clearStocksInExchange();
      return this;
    }

    /**
     * <code>optional uint32 stocks_in_market = 3;</code>
     */
    public int getStocksInMarket() {
      return instance.getStocksInMarket();
    }
    /**
     * <code>optional uint32 stocks_in_market = 3;</code>
     */
    public Builder setStocksInMarket(int value) {
      copyOnWrite();
      instance.setStocksInMarket(value);
      return this;
    }
    /**
     * <code>optional uint32 stocks_in_market = 3;</code>
     */
    public Builder clearStocksInMarket() {
      copyOnWrite();
      instance.clearStocksInMarket();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:proto.StockExchangeDataPoint)
  }
  protected final Object dynamicMethod(
      MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new StockExchangeDataPoint();
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
        StockExchangeDataPoint other = (StockExchangeDataPoint) arg1;
        price_ = visitor.visitInt(price_ != 0, price_,
            other.price_ != 0, other.price_);
        stocksInExchange_ = visitor.visitInt(stocksInExchange_ != 0, stocksInExchange_,
            other.stocksInExchange_ != 0, other.stocksInExchange_);
        stocksInMarket_ = visitor.visitInt(stocksInMarket_ != 0, stocksInMarket_,
            other.stocksInMarket_ != 0, other.stocksInMarket_);
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

                price_ = input.readUInt32();
                break;
              }
              case 16: {

                stocksInExchange_ = input.readUInt32();
                break;
              }
              case 24: {

                stocksInMarket_ = input.readUInt32();
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
        if (PARSER == null) {    synchronized (StockExchangeDataPoint.class) {
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


  // @@protoc_insertion_point(class_scope:proto.StockExchangeDataPoint)
  private static final StockExchangeDataPoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new StockExchangeDataPoint();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static StockExchangeDataPoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<StockExchangeDataPoint> PARSER;

  public static com.google.protobuf.Parser<StockExchangeDataPoint> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

