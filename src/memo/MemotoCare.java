package memo;

import java.util.HashMap;

public class MemotoCare {
    private HashMap<String, MemotoIF> memoStore;

    public MemotoCare() {
        memoStore = new HashMap<>();
    }

    public MemotoIF retrieveMemo(String name) {
        return memoStore.get(name);
    }

    public void saveMemo(String name, MemotoIF memotoIF) {
        memoStore.put(name, memotoIF);
    }
}
