package mediator;

import java.util.HashMap;

public class ConcreteMediator implements Mediator {
    private HashMap<String, Colleague> hashMap;
    private HashMap<String, String> inMap;

    public ConcreteMediator() {
        hashMap = new HashMap<>();
        inMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        hashMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            inMap.put("Alarm", colleagueName);
        } else if(colleague instanceof TV) {
            inMap.put("TV", colleagueName);
        }
    }

    @Override
    public void getMessage(int state, String colleagueName) {
        if (hashMap.get(colleagueName) instanceof Alarm) {
            if (state == 0) {
                ((TV)hashMap.get(inMap.get("TV"))).TVon();
            } else if(state == 1) {
                ((TV)hashMap.get(inMap.get("TV"))).TVshut();
            }
        }
    }

    @Override
    public void sendMessage() {

    }
}
