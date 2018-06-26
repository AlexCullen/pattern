package com.douby.pattern.prototype.simple;

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
 * @Date: 2018/6/20 7:05
 * TODO:做一个浅克隆， 浅克隆只会把基础类型克隆出来，但是对象属性复制过来的指向了同一个地址，这是不对的，实际上原型模式应该是把旧对象复制过来，从内到外都是指向新的地址
 */
public class DemoTest {
    public static void main(String[] args) {
        Color color = new Color(124, 124, 122);
        Shape shape = new Shape("图形",color);
        System.out.println(shape.getName());
        System.out.println(shape.getColor().getR());

        Shape shapeClone = shape.clone();
        System.out.println(shapeClone.getName());
        System.out.println(shapeClone.getColor().getR());


        //当shap的color更改后， shapeClone的color也更改了 这说明 shape和shapeClone共用的是同一个color，这是错误的；
        // 克隆出来的对象是一个新的对象，所有的对象属性都应指向一个新的地址
        Color colorAnother = shape.getColor();
        colorAnother.setR(255);
        System.out.println(shape.getColor().getR());
        System.out.println(shapeClone.getColor().getR());


        System.out.println(shape.getColor().equals(shapeClone.getColor()));
    }
}
