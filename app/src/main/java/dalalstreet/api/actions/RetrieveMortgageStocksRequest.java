// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: actions/RetrieveMortgageStocks.proto

package dalalstreet.api.actions;

/**
 * Protobuf type {@code proto.RetrieveMortgageStocksRequest}
 */
public  final class RetrieveMortgageStocksRequest extends
    com.google.protobuf.GeneratedMessageLite<
            RetrieveMortgageStocksRequest, RetrieveMortgageStocksRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:proto.RetrieveMortgageStocksRequest)
        RetrieveMortgageStocksRequestOrBuilder {
  private RetrieveMortgageStocksRequest() {
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

  public static final int STOCK_QUANTITY_FIELD_NUMBER = 2;
  private int stockQuantity_;
  /**
   * <code>optional uint32 stock_quantity = 2;</code>
   */
  public int getStockQuantity() {
    return stockQuantity_;
  }
  /**
   * <code>optional uint32 stock_quantity = 2;</code>
   */
  private void setStockQuantity(int value) {

    stockQuantity_ = value;
  }
  /**
   * <code>optional uint32 stock_quantity = 2;</code>
   */
  private void clearStockQuantity() {

    stockQuantity_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (stockId_ != 0) {
      output.writeUInt32(1, stockId_);
    }
    if (stockQuantity_ != 0) {
      output.writeUInt32(2, stockQuantity_);
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
    if (stockQuantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, stockQuantity_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static RetrieveMortgageStocksRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static RetrieveMortgageStocksRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static RetrieveMortgageStocksRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static RetrieveMortgageStocksRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static RetrieveMortgageStocksRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static RetrieveMortgageStocksRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static RetrieveMortgageStocksRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static RetrieveMortgageStocksRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static RetrieveMortgageStocksRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static RetrieveMortgageStocksRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(RetrieveMortgageStocksRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code proto.RetrieveMortgageStocksRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
              RetrieveMortgageStocksRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.RetrieveMortgageStocksRequest)
          RetrieveMortgageStocksRequestOrBuilder {
    // Construct using dalalstreet.api.actions.RetrieveMortgageStocksRequest.newBuilder()
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
     * <code>optional uint32 stock_quantity = 2;</code>
     */
    public int getStockQuantity() {
      return instance.getStockQuantity();
    }
    /**
     * <code>optional uint32 stock_quantity = 2;</code>
     */
    public Builder setStockQuantity(int value) {
      copyOnWrite();
      instance.setStockQuantity(value);
      return this;
    }
    /**
     * <code>optional uint32 stock_quantity = 2;</code>
     */
    public Builder clearStockQuantity() {
      copyOnWrite();
      instance.clearStockQuantity();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:proto.RetrieveMortgageStocksRequest)
  }
  protected final Object dynamicMethod(
      MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new RetrieveMortgageStocksRequest();
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
        RetrieveMortgageStocksRequest other = (RetrieveMortgageStocksRequest) arg1;
        stockId_ = visitor.visitInt(stockId_ != 0, stockId_,
            other.stockId_ != 0, other.stockId_);
        stockQuantity_ = visitor.visitInt(stockQuantity_ != 0, stockQuantity_,
            other.stockQuantity_ != 0, other.stockQuantity_);
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

                stockQuantity_ = input.readUInt32();
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
        if (PARSER == null) {    synchronized (RetrieveMortgageStocksRequest.class) {
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


  // @@protoc_insertion_point(class_scope:proto.RetrieveMortgageStocksRequest)
  private static final RetrieveMortgageStocksRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RetrieveMortgageStocksRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static RetrieveMortgageStocksRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<RetrieveMortgageStocksRequest> PARSER;

  public static com.google.protobuf.Parser<RetrieveMortgageStocksRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

