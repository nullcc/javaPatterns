package patterns.singleton;

//public class Singleton {
//    private Singleton() {}
//
//    private static Singleton _instcance = null;
//
//    public static Singleton getInstance() {
//        if (_instcance == null) {
//            _instcance = new Singleton();
//        }
//        return _instcance;
//    }
//}

//public class Singleton {
//    private Singleton() {}
//
//    private static Singleton _instcance = null;
//
//    public static synchronized Singleton getInstance() {
//        if (_instcance == null) {
//            _instcance = new Singleton();
//        }
//        return _instcance;
//    }
//}

//public class Singleton {
//    private Singleton() {}
//
//    private static Singleton _instcance = null;
//
//    public static Singleton getInstance() {
//        if (_instcance == null) {
//            synchronized(Singleton.class){
//                if (_instcance == null) {
//                    _instcance = new Singleton();
//                }
//            }
//
//        }
//        return _instcance;
//    }
//}

public class Singleton {

    private static class InnerClass{
        private static final Singleton _instance = new Singleton();
    }
    private Singleton() {}

    public static Singleton getInstance() {
        return InnerClass._instance;
    }
}