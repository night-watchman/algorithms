package sword.offer;

public class Singleton {

    /**
     * 将构造函数设为私有，在需要的时候创建。线程不安全
     */
    public static class Singleton1 {

        private Singleton1() {

        }
        private static Singleton1 INSTANCE = null;

        public static Singleton1 getINSTANCE() {
            if (INSTANCE == null) {
                INSTANCE = new Singleton1();
            }
            return INSTANCE;
        }
    }

    /**
     * 将构造函数设为私有，在需要的时候创建。在获取实例时加锁，线程安全
     */
    public static class Singleton2 {

        private Singleton2() {

        }
        private static Singleton2 INSTANCE = null;

        public static synchronized Singleton2 getINSTANCE() {
            if (INSTANCE == null) {
                INSTANCE = new Singleton2();
            }
            return INSTANCE;
        }
    }

    /**
     * 将构造函数设为私有，在需要的时候创建。细化锁的粒度，线程安全
     */
    public static class Singleton3 {

        private static Object lockObject = new Object();

        private Singleton3() {

        }
        private static Singleton3 INSTANCE = null;

        public static synchronized Singleton3 getINSTANCE() {
            if (INSTANCE == null) {

                synchronized (lockObject) {
                    // 防止多个线程同时创建对象
                    if (INSTANCE == null) {
                        INSTANCE = new Singleton3();
                    }
                }

            }
            return INSTANCE;
        }
    }

    /**
     * 将构造函数设为私有，在static代码块中创建对象。
     */
    public static class Singleton4 {

        private Singleton4() {

        }
        private static Singleton4 INSTANCE = null;

        static {
            INSTANCE = new Singleton4();
        }

        public static synchronized Singleton4 getINSTANCE() {
            return INSTANCE;
        }
    }

    /**
     * 将构造函数设为私有，使用静态内部类初始化实例，解决Singleton4
     * 中会在类加载时就初始化实例的问题。
     */
    public static class Singleton5 {

        private Singleton5() {

        }

        public static synchronized Singleton5 getINSTANCE() {
            return Nested.INSTANCE;
        }

        // 静态内部类，不会在调用外部类的时候初始化static变量，只有在类被加载时才会初始化static
        static class Nested{
            private static Singleton5 INSTANCE = new Singleton5();
        }
    }
}
