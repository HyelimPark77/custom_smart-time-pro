package com.diz.sw01.mindisland;

import android.os.SystemClock;
import org.json.JSONObject;

/** Sends one explicit reminder through the app's existing BLE queue. No audio changes. */
final class WatchReminder {
    private static long lastQueued=-30000;
    static synchronized JSONObject send(String packageName) {
        try {
            long now=SystemClock.elapsedRealtime();
            if(now-lastQueued<30000)return result("wait","잠시 기다린 뒤 다시 보내 주세요. 알림은 30초에 한 번 보낼 수 있어요.");
            Class<?> connectorClass=Class.forName("com.szabh.smable3.component.BleConnector");
            Object connector=connectorClass.getField("INSTANCE").get(null);
            if(!Boolean.TRUE.equals(connectorClass.getMethod("isAvailable").invoke(connector)))
                return result("disconnected","워치가 연결되어 있지 않아요. ‘내 워치’에서 연결한 뒤 다시 보내 주세요.");
            Class<?> keyClass=Class.forName("com.szabh.smable3.BleKey");
            Class<?> flagClass=Class.forName("com.szabh.smable3.BleKeyFlag");
            Class<?> notificationClass=Class.forName("com.szabh.smable3.entity.BleNotification");
            Class<?> bufferClass=Class.forName("com.bestmafen.baseble.data.BleBuffer");
            Object notification=notificationClass.getConstructor(int.class,long.class,String.class,String.class,String.class)
                .newInstance(127,System.currentTimeMillis(),packageName,"마음섬 · 잠깐 쉬어갈까요?","하던 일을 잠시 내려놓고, 편안하게 숨을 골라요. 쉼 알림 연결 시험입니다.");
            Object queued=connectorClass.getMethod("sendObject",keyClass,flagClass,bufferClass,boolean.class,boolean.class)
                .invoke(connector,keyClass.getField("NOTIFICATION").get(null),flagClass.getField("UPDATE").get(null),notification,false,false);
            if(!Boolean.TRUE.equals(queued))return result("failed","알림을 보내지 못했어요. 워치 연결을 확인한 뒤 다시 보내 주세요.");
            lastQueued=now;
            return result("queued","워치로 알림 전송을 요청했어요. 워치 화면에 메시지가 보이고 진동하는지 확인해 주세요.");
        } catch(Exception e) {
            return result("failed","알림을 보내지 못했어요. 앱의 워치 연결을 확인한 뒤 다시 보내 주세요.");
        }
    }
    private static JSONObject result(String code,String message) {
        JSONObject out=new JSONObject();
        try{out.put("code",code).put("message",message);}catch(Exception ignored){}
        return out;
    }
}
