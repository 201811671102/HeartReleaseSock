// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PacketMode.proto

package com.cs.heart_release_sock.protocol;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mode.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string userName = 1;</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <code>string userName = 1;</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>string content = 2;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <code>string content = 2;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>string userPhoto = 3;</code>
   * @return The userPhoto.
   */
  java.lang.String getUserPhoto();
  /**
   * <code>string userPhoto = 3;</code>
   * @return The bytes for userPhoto.
   */
  com.google.protobuf.ByteString
      getUserPhotoBytes();

  /**
   * <code>.google.protobuf.Timestamp messageTime = 4;</code>
   * @return Whether the messageTime field is set.
   */
  boolean hasMessageTime();
  /**
   * <code>.google.protobuf.Timestamp messageTime = 4;</code>
   * @return The messageTime.
   */
  com.google.protobuf.Timestamp getMessageTime();
  /**
   * <code>.google.protobuf.Timestamp messageTime = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getMessageTimeOrBuilder();
}
