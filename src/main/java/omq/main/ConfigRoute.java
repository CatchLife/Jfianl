package omq.main;

import com.jfinal.config.Routes;

import omq.index.IndexController;
import omq.login.LoginController;
import omq.my.favorite.FavoriteController;
import omq.my.feedback.MyFeedbackController;
import omq.my.newsfeed.NewsFeedController;
import omq.my.project.MyProjectController;
import omq.my.setting.MySettingController;
import omq.my.share.MyShareController;
import omq.reg.RegController;

public class ConfigRoute extends Routes{

	public void config() {
		setBaseViewPath("/view");
		
		add("/",IndexController.class,"/index");
		add("/my",NewsFeedController.class,"/my/newsfeed");
		add("/my/favorite",FavoriteController.class);
		add("/my/setting", MySettingController.class);
		//add("/my/setting/password", MySettingController.class);
		
		
		add("/reg",RegController.class);
		add("/login",LoginController.class);
	}

}
