package com.yoke.poseidon.web.itemShow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author yoke
 * @since 2018-11-22
 */
@TableName("db_panel")
public class Panel implements Serializable {

	private static final long serialVersionUID = 1L;

	@TableId(value = "panel_id", type = IdType.AUTO)
	private Integer panelId;

	private LocalDateTime createDate;

	private Integer limitNum;

	private String name;

	private String remark;

	private Integer sortOrder;

	private Integer status;

	private Integer type;

	private LocalDateTime modifyDate;

	private Long itemCatId;

	public Integer getPanelId() {
		return panelId;
	}

	public void setPanelId(Integer panelId) {
		this.panelId = panelId;
	}

	public Integer getLimitNum() {
		return limitNum;
	}

	public void setLimitNum(Integer limitNum) {
		this.limitNum = limitNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getItemCatId() {
		return itemCatId;
	}

	public void setItemCatId(Long itemCatId) {
		this.itemCatId = itemCatId;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(LocalDateTime modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Override
	public String toString() {
		return "Panel{" + "panelId=" + panelId + ", createDate=" + createDate
				+ ", limitNum=" + limitNum + ", name='" + name + '\'' + ", remark='"
				+ remark + '\'' + ", sortOrder=" + sortOrder + ", status=" + status
				+ ", type=" + type + ", modifyDate=" + modifyDate + ", itemCatId="
				+ itemCatId + '}';
	}

}
