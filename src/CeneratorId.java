public class CeneratorId {

        static long id = 0;

        public static long generator() {
            return ++id;

        }
    }

