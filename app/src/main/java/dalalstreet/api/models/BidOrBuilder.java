// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/Bid.proto

package dalalstreet.api.models;

public interface BidOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Bid)
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
   * <code>optional uint32 stock_id = 3;</code>
   */
  int getStockId();

  /**
   * <code>optional uint32 price = 4;</code>
   */
  int getPrice();

  /**
   * <code>optional .proto.OrderType order_type = 5;</code>
   */
  int getOrderTypeValue();
  /**
   * <code>optional .proto.OrderType order_type = 5;</code>
   */
  OrderType getOrderType();

  /**
   * <code>optional uint32 stock_quantity = 6;</code>
   */
  int getStockQuantity();

  /**
   * <code>optional uint32 stock_quantity_fulfilled = 7;</code>
   */
  int getStockQuantityFulfilled();

  /**
   * <code>optional bool is_closed = 8;</code>
   */
  boolean getIsClosed();

  /**
   * <code>optional string created_at = 9;</code>
   */
  String getCreatedAt();
  /**
   * <code>optional string created_at = 9;</code>
   */
  com.google.protobuf.ByteString
      getCreatedAtBytes();

  /**
   * <code>optional string updated_at = 10;</code>
   */
  String getUpdatedAt();
  /**
   * <code>optional string updated_at = 10;</code>
   */
  com.google.protobuf.ByteString
      getUpdatedAtBytes();
}
