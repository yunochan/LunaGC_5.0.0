// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BattlePassChangeRewardPlanReq.proto

package emu.grasscutter.net.proto;

public final class BattlePassChangeRewardPlanReqOuterClass {
  private BattlePassChangeRewardPlanReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BattlePassChangeRewardPlanReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BattlePassChangeRewardPlanReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_all_future_bp = 4;</code>
     * @return The isAllFutureBp.
     */
    boolean getIsAllFutureBp();

    /**
     * <code>uint32 default_reward_type = 1;</code>
     * @return The defaultRewardType.
     */
    int getDefaultRewardType();
  }
  /**
   * Protobuf type {@code BattlePassChangeRewardPlanReq}
   */
  public static final class BattlePassChangeRewardPlanReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BattlePassChangeRewardPlanReq)
      BattlePassChangeRewardPlanReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BattlePassChangeRewardPlanReq.newBuilder() to construct.
    private BattlePassChangeRewardPlanReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BattlePassChangeRewardPlanReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BattlePassChangeRewardPlanReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BattlePassChangeRewardPlanReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              defaultRewardType_ = input.readUInt32();
              break;
            }
            case 32: {

              isAllFutureBp_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.internal_static_BattlePassChangeRewardPlanReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.internal_static_BattlePassChangeRewardPlanReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq.class, emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq.Builder.class);
    }

    public static final int IS_ALL_FUTURE_BP_FIELD_NUMBER = 4;
    private boolean isAllFutureBp_;
    /**
     * <code>bool is_all_future_bp = 4;</code>
     * @return The isAllFutureBp.
     */
    @java.lang.Override
    public boolean getIsAllFutureBp() {
      return isAllFutureBp_;
    }

    public static final int DEFAULT_REWARD_TYPE_FIELD_NUMBER = 1;
    private int defaultRewardType_;
    /**
     * <code>uint32 default_reward_type = 1;</code>
     * @return The defaultRewardType.
     */
    @java.lang.Override
    public int getDefaultRewardType() {
      return defaultRewardType_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (defaultRewardType_ != 0) {
        output.writeUInt32(1, defaultRewardType_);
      }
      if (isAllFutureBp_ != false) {
        output.writeBool(4, isAllFutureBp_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (defaultRewardType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, defaultRewardType_);
      }
      if (isAllFutureBp_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isAllFutureBp_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq other = (emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq) obj;

      if (getIsAllFutureBp()
          != other.getIsAllFutureBp()) return false;
      if (getDefaultRewardType()
          != other.getDefaultRewardType()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + IS_ALL_FUTURE_BP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAllFutureBp());
      hash = (37 * hash) + DEFAULT_REWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getDefaultRewardType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code BattlePassChangeRewardPlanReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BattlePassChangeRewardPlanReq)
        emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.internal_static_BattlePassChangeRewardPlanReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.internal_static_BattlePassChangeRewardPlanReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq.class, emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isAllFutureBp_ = false;

        defaultRewardType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.internal_static_BattlePassChangeRewardPlanReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq build() {
        emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq buildPartial() {
        emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq result = new emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq(this);
        result.isAllFutureBp_ = isAllFutureBp_;
        result.defaultRewardType_ = defaultRewardType_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq) {
          return mergeFrom((emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq other) {
        if (other == emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq.getDefaultInstance()) return this;
        if (other.getIsAllFutureBp() != false) {
          setIsAllFutureBp(other.getIsAllFutureBp());
        }
        if (other.getDefaultRewardType() != 0) {
          setDefaultRewardType(other.getDefaultRewardType());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isAllFutureBp_ ;
      /**
       * <code>bool is_all_future_bp = 4;</code>
       * @return The isAllFutureBp.
       */
      @java.lang.Override
      public boolean getIsAllFutureBp() {
        return isAllFutureBp_;
      }
      /**
       * <code>bool is_all_future_bp = 4;</code>
       * @param value The isAllFutureBp to set.
       * @return This builder for chaining.
       */
      public Builder setIsAllFutureBp(boolean value) {
        
        isAllFutureBp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_all_future_bp = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAllFutureBp() {
        
        isAllFutureBp_ = false;
        onChanged();
        return this;
      }

      private int defaultRewardType_ ;
      /**
       * <code>uint32 default_reward_type = 1;</code>
       * @return The defaultRewardType.
       */
      @java.lang.Override
      public int getDefaultRewardType() {
        return defaultRewardType_;
      }
      /**
       * <code>uint32 default_reward_type = 1;</code>
       * @param value The defaultRewardType to set.
       * @return This builder for chaining.
       */
      public Builder setDefaultRewardType(int value) {
        
        defaultRewardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 default_reward_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDefaultRewardType() {
        
        defaultRewardType_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:BattlePassChangeRewardPlanReq)
    }

    // @@protoc_insertion_point(class_scope:BattlePassChangeRewardPlanReq)
    private static final emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq();
    }

    public static emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BattlePassChangeRewardPlanReq>
        PARSER = new com.google.protobuf.AbstractParser<BattlePassChangeRewardPlanReq>() {
      @java.lang.Override
      public BattlePassChangeRewardPlanReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BattlePassChangeRewardPlanReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BattlePassChangeRewardPlanReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BattlePassChangeRewardPlanReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassChangeRewardPlanReqOuterClass.BattlePassChangeRewardPlanReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BattlePassChangeRewardPlanReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BattlePassChangeRewardPlanReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#BattlePassChangeRewardPlanReq.proto\"V\n" +
      "\035BattlePassChangeRewardPlanReq\022\030\n\020is_all" +
      "_future_bp\030\004 \001(\010\022\033\n\023default_reward_type\030" +
      "\001 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BattlePassChangeRewardPlanReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BattlePassChangeRewardPlanReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BattlePassChangeRewardPlanReq_descriptor,
        new java.lang.String[] { "IsAllFutureBp", "DefaultRewardType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
