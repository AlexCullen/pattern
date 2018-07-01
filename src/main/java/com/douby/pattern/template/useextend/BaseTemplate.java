package com.douby.pattern.template.useextend;

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
 * @Date: 2018/7/1 7:43
 * TODO: 以咖啡与茶为例; 1.把水煮沸 2.沸水煮咖啡（冲茶） 3：咖啡（茶）倒入杯子中 4:加牛奶（柠檬）
 */
public abstract class BaseTemplate {
    private boolean doAdd = true;

    public void init() {
        //把水煮沸
        getHotWater();

        //沸水冲泡
        watering();

        //导入杯子
        toGlass();

        if (doSomeThing()) {
            //添加调料
            addCOndiments();
        }
    }

    public abstract void getHotWater();

    public abstract void watering();

    public abstract void toGlass();

    public abstract void addCOndiments();

    public boolean doSomeThing(){
        return true;
    };

}
