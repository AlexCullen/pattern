package com.douby.pattern.proxy.staticproxy;

import com.douby.pattern.proxy.base.BaseInt;

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
 * @Date: 2018/6/24 7:41
 * TODO:
 */
public class BaseProxy {
    private BaseInt baseInt;

    public BaseProxy(BaseInt baseInt){
        this.baseInt = baseInt;
    }

    public void baseMethod_1(){
        System.out.println("静态代理 增强 开始。。。。。。");
        baseInt.baseMethod_1();
        System.out.println("静态代理 增强 结束。。。。。。");
    }

    public void baseMethod_2(){
        System.out.println("静态代理 增强 开始。。。。。。");
        baseInt.baseMethod_2();
        System.out.println("静态代理 增强 结束。。。。。。");
    }
}
