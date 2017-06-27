package omq.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDownload<M extends BaseDownload<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setFileName(java.lang.String fileName) {
		set("fileName", fileName);
	}

	public java.lang.String getFileName() {
		return get("fileName");
	}

	public void setDescr(java.lang.String descr) {
		set("descr", descr);
	}

	public java.lang.String getDescr() {
		return get("descr");
	}

	public void setFileType(java.lang.String fileType) {
		set("fileType", fileType);
	}

	public java.lang.String getFileType() {
		return get("fileType");
	}

	public void setSize(java.lang.String size) {
		set("size", size);
	}

	public java.lang.String getSize() {
		return get("size");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("createDate", createDate);
	}

	public java.util.Date getCreateDate() {
		return get("createDate");
	}

	public void setPath(java.lang.String path) {
		set("path", path);
	}

	public java.lang.String getPath() {
		return get("path");
	}

	public void setDownloadCount(java.lang.Integer downloadCount) {
		set("downloadCount", downloadCount);
	}

	public java.lang.Integer getDownloadCount() {
		return get("downloadCount");
	}

	public void setIsShow(java.lang.Integer isShow) {
		set("isShow", isShow);
	}

	public java.lang.Integer getIsShow() {
		return get("isShow");
	}

}
