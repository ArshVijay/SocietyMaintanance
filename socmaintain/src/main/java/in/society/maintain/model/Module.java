package in.society.maintain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="MODULE_TOP")
public class Module {

	@Id
	@Column(name = "MODULE_TOP_ID", unique = true, nullable = false)
	private Integer moduleTopId;
	@Column(name = "MODULE_TOP_NAME")
	private String moduleTopName;
	@Column(name = "MODULE_TOP_SORT_INDEX")
	private String moduleTopSortIndex;

	public Integer getModuleTopId() {
		return moduleTopId;
	}

	public void setModuleTopId(Integer moduleTopId) {
		this.moduleTopId = moduleTopId;
	}

	public String getModuleTopName() {
		return moduleTopName;
	}

	public void setModuleTopName(String moduleTopName) {
		this.moduleTopName = moduleTopName;
	}

	public String getModuleTopSortIndex() {
		return moduleTopSortIndex;
	}

	public void setModuleTopSortIndex(String moduleTopSortIndex) {
		this.moduleTopSortIndex = moduleTopSortIndex;
	}

}
