// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: actions/GetCompanyProfile.proto

package dalalstreet.api.actions;

public interface GetCompanyProfileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GetCompanyProfileRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional uint32 stock_id = 1;</code>
   */
  int getStockId();

  /**
   * <code>optional .proto.StockHistoryGranularity granularity = 2;</code>
   */
  int getGranularityValue();
  /**
   * <code>optional .proto.StockHistoryGranularity granularity = 2;</code>
   */
  StockHistoryGranularity getGranularity();

  /**
   * <code>optional bool getOnlyHistory = 3;</code>
   */
  boolean getGetOnlyHistory();
}