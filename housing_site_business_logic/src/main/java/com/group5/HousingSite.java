// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HousingSite.proto

package com.group5;

public final class HousingSite {
  private HousingSite() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_GetUserByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_GetUserByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_GetUserByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_GetUserByIdResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021HousingSite.proto\022\ncom.group5\"$\n\022GetUs" +
      "erByIdRequest\022\016\n\006userId\030\001 \001(\003\"O\n\023GetUser" +
      "ByIdResponse\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\017" +
      "\n\007surname\030\003 \001(\t\022\r\n\005email\030\004 \001(\t2]\n\013UserSe" +
      "rvice\022N\n\013getUserById\022\036.com.group5.GetUse" +
      "rByIdRequest\032\037.com.group5.GetUserByIdRes" +
      "ponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_group5_GetUserByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_group5_GetUserByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_GetUserByIdRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_com_group5_GetUserByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_group5_GetUserByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_GetUserByIdResponse_descriptor,
        new java.lang.String[] { "Id", "Name", "Surname", "Email", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}