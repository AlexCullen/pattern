package com.douby.pattern.prototype.deep;

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
 * TODO: 做一个深度克隆， 1：在克隆对象中手动深度克隆（把对象属性手动克隆一遍） 2：使用序列化来进行克隆
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


        //shape中手动实现了深度克隆， 所以当shape的color和shapeClone的color指向不同的地址
        //但是不管是手动实现深克隆还是序列化， 都要实现Clonable或者Serializable接口，对于老的类会有问题
        Color colorAnother = shape.getColor();
        colorAnother.setR(255);
        System.out.println(shape.getColor().getR());
        System.out.println(shapeClone.getColor().getR());


        System.out.println(shape.getColor().equals(shapeClone.getColor()));
    }
}
