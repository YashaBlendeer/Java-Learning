public class Exmpl5 {
    public static void main(String[] args) {

        //finally-секция не может «предотвратить» выход из метода, если try-блок вызвал return
        // («more» — не выводится в консоль)
        try {
            System.err.println("try");
            if (true) {return;}
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");

        //Однако finally-секция может «перебить» throw/return при помощи другого throw/return:
        System.err.println(f());
    }

    //result: 1
    public static int f() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }

    //result: 1
    public static int f1() {
        try {
            throw new RuntimeException();
        } finally {
            return 1;
        }
    }

    //result: RuntimeException();
    public static int f2() {
        try {
            return 0;
        } finally {
            throw new RuntimeException();
        }
    }

    //result: RuntimeException();
    public static int f3() {
        try {
            throw new Error();
        } finally {
            throw new RuntimeException();
        }
    }
}
