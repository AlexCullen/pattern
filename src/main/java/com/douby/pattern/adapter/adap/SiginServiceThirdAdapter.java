package com.douby.pattern.adapter.adap;

import com.douby.pattern.adapter.dto.ResultMsg;

/**
 *                _ooOoo_
 *                o8888888o
 *                88" . "88
 *                (| -_- |)
 *                O\ = /O
 *              ____/`---'\____
 *            .   ' \\| |// `.
 *              / \\||| : |||// \
 *             / _||||| -:- |||||- \
 *              | | \\\ - /// | |
 *              | \_| ''\---/'' | |
 *            \ .-\__ `-` ___/-. /
 *            ___`. .' /--.--\ `. . __
 *          ."" '< `.___\_<|>_/___.' >'"".
 *         | | : `- \`.;`\ _ /`;.`/ - ` : | |
 *          \ \ `-. \_ __\ /__ _/ .-` / /
 * ======`-.____`-.___\_____/___.-`____.-'======
 *                `=---='
 * .............................................
 *      佛祖镇楼                  BUG辟易
 * 佛曰:
 *       写字楼里写字间，写字间里程序员；
 *       程序人员写程序，又拿程序换酒钱。
 *       酒醒只在网上坐，酒醉还来网下眠；
 *       酒醉酒醒日复日，网上网下年复年。
 *       但愿老死电脑间，不愿鞠躬老板前；
 *       奔驰宝马贵者趣，公交自行程序员。
 *       别人笑我忒疯癫，我笑自己命太贱；
 *       不见满街漂亮妹，哪个归得程序员？
 *
 * @Author: cpzh
 * @Date: 2018/7/4 8:01
 * TODO:第三方登录， 类适配器
 */
public class SiginServiceThirdAdapter extends SiginService{
    public ResultMsg loginForQQ(String openId) {
        System.out.println("第三方QQ登录");
        return login(openId, null);
    }

    public ResultMsg loginForWechat(String openId) {
        System.out.println("第三方微信登录");
        return login(openId, null);
    }

    public ResultMsg loginForRegist(String username, String password){
        System.out.println("不用注册，就能登录");
        super.regist(username,null);
        return super.login(username,null);
    }
}
