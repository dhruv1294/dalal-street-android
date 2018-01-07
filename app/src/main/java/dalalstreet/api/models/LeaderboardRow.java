// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/LeaderboardRow.proto

package dalalstreet.api.models;

/**
 * Protobuf type {@code proto.LeaderboardRow}
 */
public  final class LeaderboardRow extends
    com.google.protobuf.GeneratedMessageLite<
            LeaderboardRow, LeaderboardRow.Builder> implements
    // @@protoc_insertion_point(message_implements:proto.LeaderboardRow)
        LeaderboardRowOrBuilder {
  private LeaderboardRow() {
    userName_ = "";
  }
  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>optional uint32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }
  /**
   * <code>optional uint32 id = 1;</code>
   */
  private void setId(int value) {

    id_ = value;
  }
  /**
   * <code>optional uint32 id = 1;</code>
   */
  private void clearId() {

    id_ = 0;
  }

  public static final int USER_ID_FIELD_NUMBER = 2;
  private int userId_;
  /**
   * <code>optional uint32 user_id = 2;</code>
   */
  public int getUserId() {
    return userId_;
  }
  /**
   * <code>optional uint32 user_id = 2;</code>
   */
  private void setUserId(int value) {

    userId_ = value;
  }
  /**
   * <code>optional uint32 user_id = 2;</code>
   */
  private void clearUserId() {

    userId_ = 0;
  }

  public static final int USER_NAME_FIELD_NUMBER = 3;
  private String userName_;
  /**
   * <code>optional string user_name = 3;</code>
   */
  public String getUserName() {
    return userName_;
  }
  /**
   * <code>optional string user_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUserNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(userName_);
  }
  /**
   * <code>optional string user_name = 3;</code>
   */
  private void setUserName(
      String value) {
    if (value == null) {
    throw new NullPointerException();
  }

    userName_ = value;
  }
  /**
   * <code>optional string user_name = 3;</code>
   */
  private void clearUserName() {

    userName_ = getDefaultInstance().getUserName();
  }
  /**
   * <code>optional string user_name = 3;</code>
   */
  private void setUserNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

    userName_ = value.toStringUtf8();
  }

  public static final int RANK_FIELD_NUMBER = 4;
  private int rank_;
  /**
   * <code>optional uint32 rank = 4;</code>
   */
  public int getRank() {
    return rank_;
  }
  /**
   * <code>optional uint32 rank = 4;</code>
   */
  private void setRank(int value) {

    rank_ = value;
  }
  /**
   * <code>optional uint32 rank = 4;</code>
   */
  private void clearRank() {

    rank_ = 0;
  }

  public static final int CASH_FIELD_NUMBER = 5;
  private int cash_;
  /**
   * <code>optional uint32 cash = 5;</code>
   */
  public int getCash() {
    return cash_;
  }
  /**
   * <code>optional uint32 cash = 5;</code>
   */
  private void setCash(int value) {

    cash_ = value;
  }
  /**
   * <code>optional uint32 cash = 5;</code>
   */
  private void clearCash() {

    cash_ = 0;
  }

  public static final int DEBT_FIELD_NUMBER = 6;
  private int debt_;
  /**
   * <code>optional uint32 debt = 6;</code>
   */
  public int getDebt() {
    return debt_;
  }
  /**
   * <code>optional uint32 debt = 6;</code>
   */
  private void setDebt(int value) {

    debt_ = value;
  }
  /**
   * <code>optional uint32 debt = 6;</code>
   */
  private void clearDebt() {

    debt_ = 0;
  }

  public static final int STOCK_WORTH_FIELD_NUMBER = 7;
  private int stockWorth_;
  /**
   * <code>optional int32 stock_worth = 7;</code>
   */
  public int getStockWorth() {
    return stockWorth_;
  }
  /**
   * <code>optional int32 stock_worth = 7;</code>
   */
  private void setStockWorth(int value) {

    stockWorth_ = value;
  }
  /**
   * <code>optional int32 stock_worth = 7;</code>
   */
  private void clearStockWorth() {

    stockWorth_ = 0;
  }

  public static final int TOTAL_WORTH_FIELD_NUMBER = 8;
  private int totalWorth_;
  /**
   * <code>optional int32 total_worth = 8;</code>
   */
  public int getTotalWorth() {
    return totalWorth_;
  }
  /**
   * <code>optional int32 total_worth = 8;</code>
   */
  private void setTotalWorth(int value) {

    totalWorth_ = value;
  }
  /**
   * <code>optional int32 total_worth = 8;</code>
   */
  private void clearTotalWorth() {

    totalWorth_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeUInt32(1, id_);
    }
    if (userId_ != 0) {
      output.writeUInt32(2, userId_);
    }
    if (!userName_.isEmpty()) {
      output.writeString(3, getUserName());
    }
    if (rank_ != 0) {
      output.writeUInt32(4, rank_);
    }
    if (cash_ != 0) {
      output.writeUInt32(5, cash_);
    }
    if (debt_ != 0) {
      output.writeUInt32(6, debt_);
    }
    if (stockWorth_ != 0) {
      output.writeInt32(7, stockWorth_);
    }
    if (totalWorth_ != 0) {
      output.writeInt32(8, totalWorth_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, id_);
    }
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, userId_);
    }
    if (!userName_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getUserName());
    }
    if (rank_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, rank_);
    }
    if (cash_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, cash_);
    }
    if (debt_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, debt_);
    }
    if (stockWorth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, stockWorth_);
    }
    if (totalWorth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, totalWorth_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static LeaderboardRow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static LeaderboardRow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static LeaderboardRow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static LeaderboardRow parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static LeaderboardRow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static LeaderboardRow parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static LeaderboardRow parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static LeaderboardRow parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static LeaderboardRow parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static LeaderboardRow parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(LeaderboardRow prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code proto.LeaderboardRow}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
              LeaderboardRow, Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.LeaderboardRow)
          LeaderboardRowOrBuilder {
    // Construct using dalalstreet.api.models.LeaderboardRow.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional uint32 id = 1;</code>
     */
    public int getId() {
      return instance.getId();
    }
    /**
     * <code>optional uint32 id = 1;</code>
     */
    public Builder setId(int value) {
      copyOnWrite();
      instance.setId(value);
      return this;
    }
    /**
     * <code>optional uint32 id = 1;</code>
     */
    public Builder clearId() {
      copyOnWrite();
      instance.clearId();
      return this;
    }

    /**
     * <code>optional uint32 user_id = 2;</code>
     */
    public int getUserId() {
      return instance.getUserId();
    }
    /**
     * <code>optional uint32 user_id = 2;</code>
     */
    public Builder setUserId(int value) {
      copyOnWrite();
      instance.setUserId(value);
      return this;
    }
    /**
     * <code>optional uint32 user_id = 2;</code>
     */
    public Builder clearUserId() {
      copyOnWrite();
      instance.clearUserId();
      return this;
    }

    /**
     * <code>optional string user_name = 3;</code>
     */
    public String getUserName() {
      return instance.getUserName();
    }
    /**
     * <code>optional string user_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      return instance.getUserNameBytes();
    }
    /**
     * <code>optional string user_name = 3;</code>
     */
    public Builder setUserName(
        String value) {
      copyOnWrite();
      instance.setUserName(value);
      return this;
    }
    /**
     * <code>optional string user_name = 3;</code>
     */
    public Builder clearUserName() {
      copyOnWrite();
      instance.clearUserName();
      return this;
    }
    /**
     * <code>optional string user_name = 3;</code>
     */
    public Builder setUserNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUserNameBytes(value);
      return this;
    }

    /**
     * <code>optional uint32 rank = 4;</code>
     */
    public int getRank() {
      return instance.getRank();
    }
    /**
     * <code>optional uint32 rank = 4;</code>
     */
    public Builder setRank(int value) {
      copyOnWrite();
      instance.setRank(value);
      return this;
    }
    /**
     * <code>optional uint32 rank = 4;</code>
     */
    public Builder clearRank() {
      copyOnWrite();
      instance.clearRank();
      return this;
    }

    /**
     * <code>optional uint32 cash = 5;</code>
     */
    public int getCash() {
      return instance.getCash();
    }
    /**
     * <code>optional uint32 cash = 5;</code>
     */
    public Builder setCash(int value) {
      copyOnWrite();
      instance.setCash(value);
      return this;
    }
    /**
     * <code>optional uint32 cash = 5;</code>
     */
    public Builder clearCash() {
      copyOnWrite();
      instance.clearCash();
      return this;
    }

    /**
     * <code>optional uint32 debt = 6;</code>
     */
    public int getDebt() {
      return instance.getDebt();
    }
    /**
     * <code>optional uint32 debt = 6;</code>
     */
    public Builder setDebt(int value) {
      copyOnWrite();
      instance.setDebt(value);
      return this;
    }
    /**
     * <code>optional uint32 debt = 6;</code>
     */
    public Builder clearDebt() {
      copyOnWrite();
      instance.clearDebt();
      return this;
    }

    /**
     * <code>optional int32 stock_worth = 7;</code>
     */
    public int getStockWorth() {
      return instance.getStockWorth();
    }
    /**
     * <code>optional int32 stock_worth = 7;</code>
     */
    public Builder setStockWorth(int value) {
      copyOnWrite();
      instance.setStockWorth(value);
      return this;
    }
    /**
     * <code>optional int32 stock_worth = 7;</code>
     */
    public Builder clearStockWorth() {
      copyOnWrite();
      instance.clearStockWorth();
      return this;
    }

    /**
     * <code>optional int32 total_worth = 8;</code>
     */
    public int getTotalWorth() {
      return instance.getTotalWorth();
    }
    /**
     * <code>optional int32 total_worth = 8;</code>
     */
    public Builder setTotalWorth(int value) {
      copyOnWrite();
      instance.setTotalWorth(value);
      return this;
    }
    /**
     * <code>optional int32 total_worth = 8;</code>
     */
    public Builder clearTotalWorth() {
      copyOnWrite();
      instance.clearTotalWorth();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:proto.LeaderboardRow)
  }
  protected final Object dynamicMethod(
      MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new LeaderboardRow();
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
        LeaderboardRow other = (LeaderboardRow) arg1;
        id_ = visitor.visitInt(id_ != 0, id_,
            other.id_ != 0, other.id_);
        userId_ = visitor.visitInt(userId_ != 0, userId_,
            other.userId_ != 0, other.userId_);
        userName_ = visitor.visitString(!userName_.isEmpty(), userName_,
            !other.userName_.isEmpty(), other.userName_);
        rank_ = visitor.visitInt(rank_ != 0, rank_,
            other.rank_ != 0, other.rank_);
        cash_ = visitor.visitInt(cash_ != 0, cash_,
            other.cash_ != 0, other.cash_);
        debt_ = visitor.visitInt(debt_ != 0, debt_,
            other.debt_ != 0, other.debt_);
        stockWorth_ = visitor.visitInt(stockWorth_ != 0, stockWorth_,
            other.stockWorth_ != 0, other.stockWorth_);
        totalWorth_ = visitor.visitInt(totalWorth_ != 0, totalWorth_,
            other.totalWorth_ != 0, other.totalWorth_);
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

                id_ = input.readUInt32();
                break;
              }
              case 16: {

                userId_ = input.readUInt32();
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                userName_ = s;
                break;
              }
              case 32: {

                rank_ = input.readUInt32();
                break;
              }
              case 40: {

                cash_ = input.readUInt32();
                break;
              }
              case 48: {

                debt_ = input.readUInt32();
                break;
              }
              case 56: {

                stockWorth_ = input.readInt32();
                break;
              }
              case 64: {

                totalWorth_ = input.readInt32();
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
        if (PARSER == null) {    synchronized (LeaderboardRow.class) {
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


  // @@protoc_insertion_point(class_scope:proto.LeaderboardRow)
  private static final LeaderboardRow DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new LeaderboardRow();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static LeaderboardRow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<LeaderboardRow> PARSER;

  public static com.google.protobuf.Parser<LeaderboardRow> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

