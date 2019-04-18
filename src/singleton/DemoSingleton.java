package singleton;

/*
 * @Author newton
 * @Description
 * @Date 14:38 2019-04-18
 * @Param
 * @return
 **/
public class DemoSingleton {
    /*
     * @Author newton
     * @Description 懒汉 1
     * @Date 14:39 2019-04-18
     * @Param
     * @return
     **/
    /*private static DemoSingleton singleton = null;

    private DemoSingleton() {

    }

    public static DemoSingleton getInstance() {
        if (singleton == null) {
            singleton = new DemoSingleton();
        }
        return singleton;
    }*/

    /*
     * @Author newton
     * @Description 懒汉+synchronize 2
     * @Date 14:41 2019-04-18
     * @Param
     * @return
     **/
    /*private static DemoSingleton singleton = null;

    private DemoSingleton() {

    }

    public static synchronized DemoSingleton getInstance() {
        if (singleton == null) {
            singleton = new DemoSingleton();
        }
        return singleton;
    }*/

    /*
     * @Author newton
     * @Description 懒汉+双重校验 3
     * @Date 14:43 2019-04-18
     * @Param
     * @return
     **/
    /*private static DemoSingleton singleton = null;

    private DemoSingleton() {

    }

    public static DemoSingleton getInstance() {
        if (singleton == null) {
            synchronized (DemoSingleton.class) {
                if (singleton == null) {
                    singleton = new DemoSingleton();
                }
            }
        }
        return singleton;
    }*/

    /*
     * @Author newton
     * @Description 懒汉+volatile 4
     * @Date 14:45 2019-04-18
     * @Param
     * @return
     **/
    /*private static volatile DemoSingleton singleton = null;

    private DemoSingleton() {

    }

    public static DemoSingleton getInstance() {
        if (singleton == null) {
            synchronized (DemoSingleton.class) {
                if (singleton == null) {
                    singleton = new DemoSingleton();
                }
            }
        }
        return singleton;
    }*/

    /*
     * @Author newton
     * @Description 饿汉 6
     * @Date 14:47 2019-04-18
     * @Param
     * @return
     **/
    /*private static DemoSingleton singleton = new DemoSingleton();

    private DemoSingleton() {

    }

    public static DemoSingleton getInstance() {
        return singleton;
    }*/

    /*
     * @Author newton
     * @Description 饿汉+静态内部类 7
     * @Date 14:48 2019-04-18
     * @Param
     * @return
     **/
    private static class SingletonHolder{
        private static DemoSingleton singleton = new DemoSingleton();
    }
    private DemoSingleton() {

    }

    public static DemoSingleton getInstance() {
        return SingletonHolder.singleton;
    }


}
