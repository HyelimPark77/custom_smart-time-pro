package com.jieli.jl_rcsp.model.device;

import android.graphics.Color;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class LightControlInfo {
    public static final int LIGHT_MODE_COLOURFUL = 0;
    public static final int LIGHT_MODE_SCENE = 2;
    public static final int LIGHT_MODE_TWINKLE = 1;
    public static final int SCENE_MODE_BEAUTIFUL_SUNSET = 10;
    public static final int SCENE_MODE_BLUE_BREATHING = 8;
    public static final int SCENE_MODE_CANDLELIGHT = 2;
    public static final int SCENE_MODE_COLORFUL_BREATHING = 5;
    public static final int SCENE_MODE_GREEN_BREATHING = 7;
    public static final int SCENE_MODE_GREEN_MOOD = 9;
    public static final int SCENE_MODE_HEARTBEAT = 1;
    public static final int SCENE_MODE_MUSIC_RHYTHM = 11;
    public static final int SCENE_MODE_NIGHT_LIGHT = 3;
    public static final int SCENE_MODE_RAINBOW = 0;
    public static final int SCENE_MODE_RED_BREATHING = 6;
    public static final int SCENE_MODE_STAGE = 4;
    public static final int STATE_OFF = 0;
    public static final int STATE_ON = 1;
    public static final int STATE_SETTING = 2;
    public static final int TWINKLE_FREQ_BREATHE = 2;
    public static final int TWINKLE_FREQ_FAST = 0;
    public static final int TWINKLE_FREQ_MUSIC = 3;
    public static final int TWINKLE_FREQ_SLOW = 1;
    public static final int TWINKLE_MODE_BLUE = 6;
    public static final int TWINKLE_MODE_COLORFUL = 0;
    public static final int TWINKLE_MODE_CYAN = 5;
    public static final int TWINKLE_MODE_GREEN = 4;
    public static final int TWINKLE_MODE_ORANGE = 2;
    public static final int TWINKLE_MODE_PURPLE = 7;
    public static final int TWINKLE_MODE_RED = 1;
    public static final int TWINKLE_MODE_YELLOW = 3;
    private int color;
    private int hue;
    private int lightMode;
    private int luminance;
    private int saturation;
    private int sceneMode;
    private int switchState;
    private int twinkleFreq;
    private int twinkleMode;

    public LightControlInfo() {
    }

    public int getColor() {
        return this.color;
    }

    public int getHue() {
        return this.hue;
    }

    public int getLightMode() {
        return this.lightMode;
    }

    public int getLuminance() {
        return this.luminance;
    }

    public int getSaturation() {
        return this.saturation;
    }

    public int getSceneMode() {
        return this.sceneMode;
    }

    public int getSwitchState() {
        return this.switchState;
    }

    public int getTwinkleFreq() {
        return this.twinkleFreq;
    }

    public int getTwinkleMode() {
        return this.twinkleMode;
    }

    public LightControlInfo setColor(int r1) {
        this.color = r1;
        return this;
    }

    public LightControlInfo setHue(int r1) {
        this.hue = r1;
        return this;
    }

    public LightControlInfo setLightMode(int r1) {
        this.lightMode = r1;
        return this;
    }

    public LightControlInfo setLuminance(int r1) {
        this.luminance = r1;
        return this;
    }

    public LightControlInfo setSaturation(int r1) {
        this.saturation = r1;
        return this;
    }

    public LightControlInfo setSceneMode(int r1) {
        this.sceneMode = r1;
        return this;
    }

    public LightControlInfo setSwitchState(int r1) {
        this.switchState = r1;
        return this;
    }

    public LightControlInfo setTwinkleFreq(int r1) {
        this.twinkleFreq = r1;
        return this;
    }

    public LightControlInfo setTwinkleMode(int r1) {
        this.twinkleMode = r1;
        return this;
    }

    public byte[] toByteArray() {
        int r1 = this.switchState | (this.lightMode << 2);
        byte[] r2 = CHexConver.int2byte2(this.hue);
        byte[] r0 = {CHexConver.intToByte(r1), CHexConver.intToByte(Color.red(this.color)), CHexConver.intToByte(Color.green(this.color)), CHexConver.intToByte(Color.blue(this.color)), CHexConver.intToByte(this.twinkleMode), CHexConver.intToByte(this.twinkleFreq), CHexConver.intToByte(this.sceneMode), 0, 0, CHexConver.intToByte(this.saturation), CHexConver.intToByte(this.luminance)};
        System.arraycopy(r2, 0, r0, 7, r2.length);
        return r0;
    }

    public String toString() {
        return "LightControlInfo{switchState=" + this.switchState + ", lightMode=" + this.lightMode + ", color=" + this.color + ", twinkleMode=" + this.twinkleMode + ", twinkleFreq=" + this.twinkleFreq + ", hue=" + this.hue + ", saturation=" + this.saturation + ", luminance=" + this.luminance + i0XO1.IO;
    }
}
