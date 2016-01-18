package cwl;
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class RecordSchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RecordSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Record_symbol\",\"symbols\":[\"record\"]},\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"RecordField\",\"doc\":\"A field of a record.\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The name of the field\\n\",\"jsonldPredicate\":\"@id\"},{\"name\":\"doc\",\"type\":[\"null\",\"string\"],\"doc\":\"A documentation string for this field\\n\",\"jsonldPredicate\":\"sld:doc\"},{\"name\":\"type\",\"type\":[{\"type\":\"enum\",\"name\":\"PrimitiveType\",\"symbols\":[\"null\",\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\"]},\"RecordSchema\",{\"type\":\"record\",\"name\":\"EnumSchema\",\"doc\":\"Define an enumerated type.\\n\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}},{\"name\":\"symbols\",\"type\":[{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true}}]},{\"type\":\"record\",\"name\":\"ArraySchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Array_symbol\",\"symbols\":[\"array\"]},\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}},{\"name\":\"items\",\"type\":[\"PrimitiveType\",\"RecordSchema\",\"EnumSchema\",\"ArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"RecordSchema\",\"EnumSchema\",\"ArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"}}]},\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"RecordSchema\",\"EnumSchema\",\"ArraySchema\",\"string\"]}],\"doc\":\"The field type\\n\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"}}]}}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Must be `record` */
  @Deprecated public Record_symbol type;
  /** Defines the fields of the record. */
  @Deprecated public java.util.List<RecordField> fields;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public RecordSchema() {}

  /**
   * All-args constructor.
   */
  public RecordSchema(Record_symbol type, java.util.List<RecordField> fields) {
    this.type = type;
    this.fields = fields;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return fields;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (Record_symbol)value$; break;
    case 1: fields = (java.util.List<RecordField>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * Must be `record`   */
  public Record_symbol getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * Must be `record`   * @param value the value to set.
   */
  public void setType(Record_symbol value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'fields' field.
   * Defines the fields of the record.   */
  public java.util.List<RecordField> getFields() {
    return fields;
  }

  /**
   * Sets the value of the 'fields' field.
   * Defines the fields of the record.   * @param value the value to set.
   */
  public void setFields(java.util.List<RecordField> value) {
    this.fields = value;
  }

  /** Creates a new RecordSchema RecordBuilder */
  public static RecordSchema.Builder newBuilder() {
    return new RecordSchema.Builder();
  }
  
  /** Creates a new RecordSchema RecordBuilder by copying an existing Builder */
  public static RecordSchema.Builder newBuilder(RecordSchema.Builder other) {
    return new RecordSchema.Builder(other);
  }
  
  /** Creates a new RecordSchema RecordBuilder by copying an existing RecordSchema instance */
  public static RecordSchema.Builder newBuilder(RecordSchema other) {
    return new RecordSchema.Builder(other);
  }
  
  /**
   * RecordBuilder for RecordSchema instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RecordSchema>
    implements org.apache.avro.data.RecordBuilder<RecordSchema> {

    private Record_symbol type;
    private java.util.List<RecordField> fields;

    /** Creates a new Builder */
    private Builder() {
      super(RecordSchema.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(RecordSchema.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.fields)) {
        this.fields = data().deepCopy(fields()[1].schema(), other.fields);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing RecordSchema instance */
    private Builder(RecordSchema other) {
            super(RecordSchema.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.fields)) {
        this.fields = data().deepCopy(fields()[1].schema(), other.fields);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public Record_symbol getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public RecordSchema.Builder setType(Record_symbol value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'type' field */
    public RecordSchema.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'fields' field */
    public java.util.List<RecordField> getFields() {
      return fields;
    }
    
    /** Sets the value of the 'fields' field */
    public RecordSchema.Builder setFields(java.util.List<RecordField> value) {
      validate(fields()[1], value);
      this.fields = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'fields' field has been set */
    public boolean hasFields() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'fields' field */
    public RecordSchema.Builder clearFields() {
      fields = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public RecordSchema build() {
      try {
        RecordSchema record = new RecordSchema();
        record.type = fieldSetFlags()[0] ? this.type : (Record_symbol) defaultValue(fields()[0]);
        record.fields = fieldSetFlags()[1] ? this.fields : (java.util.List<RecordField>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}