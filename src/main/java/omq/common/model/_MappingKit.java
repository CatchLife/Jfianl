package omq.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("account", "id", Account.class);
		arp.addMapping("auth_code", "id", AuthCode.class);
		// Composite Primary Key order: mainMenu,subMenu
		arp.addMapping("document", "mainMenu,subMenu", Document.class);
		arp.addMapping("download", "id", Download.class);
		arp.addMapping("download_log", "id", DownloadLog.class);
		arp.addMapping("favorite", "id", Favorite.class);
		arp.addMapping("feedback", "id", Feedback.class);
		arp.addMapping("feedback_reply", "id", FeedbackReply.class);
		arp.addMapping("message", "id", Message.class);
		arp.addMapping("news_feed", "id", NewsFeed.class);
		arp.addMapping("project", "id", Project.class);
		arp.addMapping("refer_me", "id", ReferMe.class);
		arp.addMapping("remind", "accountId", Remind.class);
		arp.addMapping("session", "id", Session.class);
		arp.addMapping("share", "id", Share.class);
		arp.addMapping("share_reply", "id", ShareReply.class);
		arp.addMapping("task_list", "id", TaskList.class);
	}
}

