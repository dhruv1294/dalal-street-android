// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: actions/Logout.proto

package dalalstreet.api.actions;

public interface LogoutResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.LogoutResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .proto.LogoutResponse.StatusCode status_code = 1;</code>
   */
  int getStatusCodeValue();
  /**
   * <code>optional .proto.LogoutResponse.StatusCode status_code = 1;</code>
   */
  LogoutResponse.StatusCode getStatusCode();

  /**
   * <code>optional string status_message = 2;</code>
   */
  String getStatusMessage();
  /**
   * <code>optional string status_message = 2;</code>
   */
  com.google.protobuf.ByteString
      getStatusMessageBytes();
}
