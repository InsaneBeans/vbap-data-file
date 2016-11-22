package React.h2memory.dbconfig;

/**
 * 数据表字段
 * 
 * @author huh
 *
 */
public class DbField {
	
	/**
	 * 字段名称
	 */
	private String name;
	/**
	 * 字段类型
	 */
	private FieldType type;
	
	public DbField(String name, FieldType type, int maxLength) {
		this.name = name;
		this.type = type;
	}
	
	public DbField(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FieldType getType() {
		return type;
	}

	public void setType(FieldType type) {
		this.type = type;
	}
}