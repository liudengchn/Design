package memo;

import java.util.HashMap;

public class Original {
    private HashMap<String, String> store;

    public Original() {
        store = new HashMap<>();
    }

    public MemotoIF createMemo() {
        return new Memoto(store);
    }

    public void test1() {
        store.put("1", "11");
        store.put("2", "22");
        store.put("3", "3");
    }

    public void test2() {
        store.put("01", "011");
        store.put("02", "022");
        store.put("03", "03");
    }

    public void show() {
        System.out.println(store.toString());
    }

    public void retrieve(MemotoIF memotoIF) {
        store = ((Memoto)memotoIF).getTarget();
    }


    private class Memoto implements MemotoIF {
        private HashMap<String, String> target;

        public Memoto(HashMap target) {
            this.target = new HashMap(target);
        }

        public HashMap<String, String> getTarget() {
            return target;
        }

        public void setTarget(HashMap<String, String> target) {
            this.target = target;
        }
    }
}
