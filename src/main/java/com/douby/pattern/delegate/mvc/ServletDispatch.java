package com.douby.pattern.delegate.mvc;

import com.douby.pattern.delegate.mvc.controller.MemberAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

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
 * @Date: 2018/7/4 7:33
 * TODO:
 */
public class ServletDispatch {
    private List<Handler> handlerMapping = new ArrayList<>();

    public ServletDispatch(){
        Class<?> memberAction = MemberAction.class;
        try {
            handlerMapping.add(new Handler().setController(memberAction.newInstance())
                    .setMethod(memberAction.getMethod("getMemberById",new Class[]{String.class}))
                    .setUrl("/web/getMember.json"));
        }catch (Exception e){

        }
    }

    public void doService(HttpServletRequest req, HttpServletResponse res){
        doDispatch(req, res);
    }
    private void doDispatch(HttpServletRequest req, HttpServletResponse res){
        String uri = req.getRequestURI();
        Handler handler = null;
        for(Handler h : handlerMapping){
            if (h.getUrl().equals(uri)){
                handler = h;
                break;
            }
        }

        try {
            handler.getMethod().invoke(handler.getController(),req.getParameter("mid"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    class Handler{
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
