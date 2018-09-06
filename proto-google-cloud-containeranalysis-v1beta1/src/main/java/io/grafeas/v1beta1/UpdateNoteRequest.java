// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

package io.grafeas.v1beta1;

/**
 * <pre>
 * Request to update a note.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.UpdateNoteRequest}
 */
public  final class UpdateNoteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.UpdateNoteRequest)
    UpdateNoteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateNoteRequest.newBuilder() to construct.
  private UpdateNoteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateNoteRequest() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateNoteRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            io.grafeas.v1beta1.Note.Builder subBuilder = null;
            if (note_ != null) {
              subBuilder = note_.toBuilder();
            }
            note_ = input.readMessage(io.grafeas.v1beta1.Note.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(note_);
              note_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
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
    return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_UpdateNoteRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_UpdateNoteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.UpdateNoteRequest.class, io.grafeas.v1beta1.UpdateNoteRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The name of the note in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the note in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOTE_FIELD_NUMBER = 2;
  private io.grafeas.v1beta1.Note note_;
  /**
   * <pre>
   * The updated note.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Note note = 2;</code>
   */
  public boolean hasNote() {
    return note_ != null;
  }
  /**
   * <pre>
   * The updated note.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Note note = 2;</code>
   */
  public io.grafeas.v1beta1.Note getNote() {
    return note_ == null ? io.grafeas.v1beta1.Note.getDefaultInstance() : note_;
  }
  /**
   * <pre>
   * The updated note.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Note note = 2;</code>
   */
  public io.grafeas.v1beta1.NoteOrBuilder getNoteOrBuilder() {
    return getNote();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (note_ != null) {
      output.writeMessage(2, getNote());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (note_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNote());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof io.grafeas.v1beta1.UpdateNoteRequest)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.UpdateNoteRequest other = (io.grafeas.v1beta1.UpdateNoteRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (hasNote() == other.hasNote());
    if (hasNote()) {
      result = result && getNote()
          .equals(other.getNote());
    }
    result = result && (hasUpdateMask() == other.hasUpdateMask());
    if (hasUpdateMask()) {
      result = result && getUpdateMask()
          .equals(other.getUpdateMask());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasNote()) {
      hash = (37 * hash) + NOTE_FIELD_NUMBER;
      hash = (53 * hash) + getNote().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.UpdateNoteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.UpdateNoteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.UpdateNoteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.UpdateNoteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.UpdateNoteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.UpdateNoteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.UpdateNoteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.UpdateNoteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.UpdateNoteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.UpdateNoteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.UpdateNoteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.UpdateNoteRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grafeas.v1beta1.UpdateNoteRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * Request to update a note.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.UpdateNoteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.UpdateNoteRequest)
      io.grafeas.v1beta1.UpdateNoteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_UpdateNoteRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_UpdateNoteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.UpdateNoteRequest.class, io.grafeas.v1beta1.UpdateNoteRequest.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.UpdateNoteRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      name_ = "";

      if (noteBuilder_ == null) {
        note_ = null;
      } else {
        note_ = null;
        noteBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_UpdateNoteRequest_descriptor;
    }

    public io.grafeas.v1beta1.UpdateNoteRequest getDefaultInstanceForType() {
      return io.grafeas.v1beta1.UpdateNoteRequest.getDefaultInstance();
    }

    public io.grafeas.v1beta1.UpdateNoteRequest build() {
      io.grafeas.v1beta1.UpdateNoteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grafeas.v1beta1.UpdateNoteRequest buildPartial() {
      io.grafeas.v1beta1.UpdateNoteRequest result = new io.grafeas.v1beta1.UpdateNoteRequest(this);
      result.name_ = name_;
      if (noteBuilder_ == null) {
        result.note_ = note_;
      } else {
        result.note_ = noteBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1beta1.UpdateNoteRequest) {
        return mergeFrom((io.grafeas.v1beta1.UpdateNoteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.UpdateNoteRequest other) {
      if (other == io.grafeas.v1beta1.UpdateNoteRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasNote()) {
        mergeNote(other.getNote());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grafeas.v1beta1.UpdateNoteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.UpdateNoteRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of the note in the form of
     * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the note in the form of
     * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the note in the form of
     * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the note in the form of
     * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the note in the form of
     * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private io.grafeas.v1beta1.Note note_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grafeas.v1beta1.Note, io.grafeas.v1beta1.Note.Builder, io.grafeas.v1beta1.NoteOrBuilder> noteBuilder_;
    /**
     * <pre>
     * The updated note.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 2;</code>
     */
    public boolean hasNote() {
      return noteBuilder_ != null || note_ != null;
    }
    /**
     * <pre>
     * The updated note.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 2;</code>
     */
    public io.grafeas.v1beta1.Note getNote() {
      if (noteBuilder_ == null) {
        return note_ == null ? io.grafeas.v1beta1.Note.getDefaultInstance() : note_;
      } else {
        return noteBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The updated note.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 2;</code>
     */
    public Builder setNote(io.grafeas.v1beta1.Note value) {
      if (noteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        note_ = value;
        onChanged();
      } else {
        noteBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The updated note.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 2;</code>
     */
    public Builder setNote(
        io.grafeas.v1beta1.Note.Builder builderForValue) {
      if (noteBuilder_ == null) {
        note_ = builderForValue.build();
        onChanged();
      } else {
        noteBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The updated note.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 2;</code>
     */
    public Builder mergeNote(io.grafeas.v1beta1.Note value) {
      if (noteBuilder_ == null) {
        if (note_ != null) {
          note_ =
            io.grafeas.v1beta1.Note.newBuilder(note_).mergeFrom(value).buildPartial();
        } else {
          note_ = value;
        }
        onChanged();
      } else {
        noteBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The updated note.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 2;</code>
     */
    public Builder clearNote() {
      if (noteBuilder_ == null) {
        note_ = null;
        onChanged();
      } else {
        note_ = null;
        noteBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The updated note.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 2;</code>
     */
    public io.grafeas.v1beta1.Note.Builder getNoteBuilder() {
      
      onChanged();
      return getNoteFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The updated note.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 2;</code>
     */
    public io.grafeas.v1beta1.NoteOrBuilder getNoteOrBuilder() {
      if (noteBuilder_ != null) {
        return noteBuilder_.getMessageOrBuilder();
      } else {
        return note_ == null ?
            io.grafeas.v1beta1.Note.getDefaultInstance() : note_;
      }
    }
    /**
     * <pre>
     * The updated note.
     * </pre>
     *
     * <code>.grafeas.v1beta1.Note note = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grafeas.v1beta1.Note, io.grafeas.v1beta1.Note.Builder, io.grafeas.v1beta1.NoteOrBuilder> 
        getNoteFieldBuilder() {
      if (noteBuilder_ == null) {
        noteBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.Note, io.grafeas.v1beta1.Note.Builder, io.grafeas.v1beta1.NoteOrBuilder>(
                getNote(),
                getParentForChildren(),
                isClean());
        note_ = null;
      }
      return noteBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.UpdateNoteRequest)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.UpdateNoteRequest)
  private static final io.grafeas.v1beta1.UpdateNoteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.UpdateNoteRequest();
  }

  public static io.grafeas.v1beta1.UpdateNoteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateNoteRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateNoteRequest>() {
    public UpdateNoteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdateNoteRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateNoteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateNoteRequest> getParserForType() {
    return PARSER;
  }

  public io.grafeas.v1beta1.UpdateNoteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

