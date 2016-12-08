package com.bonc.data.structure;

/**
 * 原字段
 * 
 * @author huh
 *
 */
public class Field {

	/**
	 * 字段名
	 */
	private String name;
	/**
	 * 字段类型
	 */
	private FieldType fieldType;
	/**
	 * 索引号
	 */
	private int indexNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FieldType getFieldType() {
		return fieldType;
	}

	public void setFieldType(FieldType fieldType) {
		this.fieldType = fieldType;
	}

	public int getIndexNo() {
		return indexNo;
	}

	public void setIndexNo(int indexNo) {
		this.indexNo = indexNo;
	}
}
