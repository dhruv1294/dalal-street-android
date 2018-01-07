// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/LeaderboardRow.proto

package dalalstreet.api.models;

public interface LeaderboardRowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.LeaderboardRow)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional uint32 id = 1;</code>
   */
  int getId();

  /**
   * <code>optional uint32 user_id = 2;</code>
   */
  int getUserId();

  /**
   * <code>optional string user_name = 3;</code>
   */
  String getUserName();
  /**
   * <code>optional string user_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>optional uint32 rank = 4;</code>
   */
  int getRank();

  /**
   * <code>optional uint32 cash = 5;</code>
   */
  int getCash();

  /**
   * <code>optional uint32 debt = 6;</code>
   */
  int getDebt();

  /**
   * <code>optional int32 stock_worth = 7;</code>
   */
  int getStockWorth();

  /**
   * <code>optional int32 total_worth = 8;</code>
   */
  int getTotalWorth();
}
