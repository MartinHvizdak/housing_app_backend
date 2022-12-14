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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_CreateHouseListingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_CreateHouseListingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_CreateHouseListingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_CreateHouseListingResponse_fieldAccessorTable;

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
      "\n\007surname\030\003 \001(\t\022\r\n\005email\030\004 \001(\t\"\244\002\n\031Creat" +
      "eHouseListingRequest\022\016\n\006street\030\001 \001(\t\022\022\n\n" +
      "postNumber\030\002 \001(\005\022\014\n\004city\030\003 \001(\t\022\017\n\007houseN" +
      "o\030\004 \001(\005\022\030\n\020constructionYear\030\005 \001(\005\022\023\n\013las" +
      "tRebuilt\030\006 \001(\005\022\025\n\rhasInspection\030\007 \001(\010\022\022\n" +
      "\ngroundArea\030\010 \001(\001\022\021\n\tfloorArea\030\t \001(\001\022\027\n\017" +
      "imageBase64Data\030\n \003(\t\022\030\n\020imageContentTyp" +
      "e\030\013 \003(\t\022\025\n\rimageFileName\030\014 \003(\t\022\r\n\005price\030" +
      "\r \001(\003\"\307\002\n\032CreateHouseListingResponse\022\n\n\002" +
      "id\030\001 \001(\003\022\016\n\006street\030\002 \001(\t\022\022\n\npostNumber\030\003" +
      " \001(\005\022\014\n\004city\030\004 \001(\t\022\017\n\007houseNo\030\005 \001(\005\022\030\n\020c" +
      "onstructionYear\030\006 \001(\005\022\023\n\013lastRebuilt\030\007 \001" +
      "(\005\022\025\n\rhasInspection\030\010 \001(\010\022\022\n\ngroundArea\030" +
      "\t \001(\001\022\021\n\tfloorArea\030\n \001(\001\022\027\n\017imageBase64D" +
      "ata\030\013 \003(\t\022\030\n\020imageContentType\030\014 \003(\t\022\025\n\ri" +
      "mageFileName\030\r \003(\t\022\r\n\005price\030\016 \001(\003\022\024\n\014cre" +
      "ationDate\030\017 \001(\t2]\n\013UserService\022N\n\013getUse" +
      "rById\022\036.com.group5.GetUserByIdRequest\032\037." +
      "com.group5.GetUserByIdResponse2p\n\016Listin" +
      "gService\022^\n\rcreateListing\022%.com.group5.C" +
      "reateHouseListingRequest\032&.com.group5.Cr" +
      "eateHouseListingResponseB\002P\001b\006proto3"
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
    internal_static_com_group5_CreateHouseListingRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_group5_CreateHouseListingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_CreateHouseListingRequest_descriptor,
        new java.lang.String[] { "Street", "PostNumber", "City", "HouseNo", "ConstructionYear", "LastRebuilt", "HasInspection", "GroundArea", "FloorArea", "ImageBase64Data", "ImageContentType", "ImageFileName", "Price", });
    internal_static_com_group5_CreateHouseListingResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_group5_CreateHouseListingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_CreateHouseListingResponse_descriptor,
        new java.lang.String[] { "Id", "Street", "PostNumber", "City", "HouseNo", "ConstructionYear", "LastRebuilt", "HasInspection", "GroundArea", "FloorArea", "ImageBase64Data", "ImageContentType", "ImageFileName", "Price", "CreationDate", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
