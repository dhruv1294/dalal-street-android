// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: actions/GetTransactions.proto

package dalalstreet.api.actions;

public interface GetTransactionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GetTransactionsRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * 0 for latest transactions
   * </pre>
   *
   * <code>optional uint32 last_transaction_id = 1;</code>
   */
  int getLastTransactionId();

  /**
   * <pre>
   * Set to 0 for getting max transactions allowed.
   * </pre>
   *
   * <code>optional uint32 count = 2;</code>
   */
  int getCount();
}
