package omq.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDocument<M extends BaseDocument<M>> extends Model<M> implements IBean {

	public void setMainMenu(java.lang.Integer mainMenu) {
		set("mainMenu", mainMenu);
	}

	public java.lang.Integer getMainMenu() {
		return get("mainMenu");
	}

	public void setSubMenu(java.lang.Integer subMenu) {
		set("subMenu", subMenu);
	}

	public java.lang.Integer getSubMenu() {
		return get("subMenu");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return get("title");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}

	public java.lang.String getContent() {
		return get("content");
	}

	public void setUpdateAt(java.util.Date updateAt) {
		set("updateAt", updateAt);
	}

	public java.util.Date getUpdateAt() {
		return get("updateAt");
	}

	public void setCreateAt(java.util.Date createAt) {
		set("createAt", createAt);
	}

	public java.util.Date getCreateAt() {
		return get("createAt");
	}

	public void setPublish(java.lang.Integer publish) {
		set("publish", publish);
	}

	public java.lang.Integer getPublish() {
		return get("publish");
	}

}
