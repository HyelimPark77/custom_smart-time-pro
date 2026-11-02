package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleNaviInfo extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int NAME_MAX_LENGTH = 232;
    public static final int NAVI_END = 4;
    public static final int NAVI_GOING = 1;
    public static final int NAVI_PAUSE = 2;
    public static final int NAVI_RESUME = 3;
    public static final int NAVI_START = 0;
    public static final int TURN_ALONG = 0;
    public static final int TURN_BACK = 1;
    public static final int TURN_BACK_2BRANCH_LEFT = 2;
    public static final int TURN_BACK_2BRANCH_RIGHT = 3;
    public static final int TURN_BACK_3BRANCH_CENTER = 4;
    public static final int TURN_BACK_3BRANCH_LEFT = 5;
    public static final int TURN_BACK_3BRANCH_RIGHT = 6;
    public static final int TURN_BRANCH_CENTER = 7;
    public static final int TURN_BRANCH_LEFT = 8;
    public static final int TURN_BRANCH_LEFT_STRAIGHT = 9;
    public static final int TURN_BRANCH_RIGHT = 10;
    public static final int TURN_BRANCH_RIGHT_STRAIGHT = 11;
    public static final int TURN_DEST = 12;
    public static final int TURN_FRONT = 13;
    public static final int TURN_INFERRY = 14;
    public static final int TURN_LB_2BRANCH_LEFT = 15;
    public static final int TURN_LB_2BRANCH_RIGHT = 16;
    public static final int TURN_LB_3BRANCH_CENTER = 17;
    public static final int TURN_LB_3BRANCH_LEFT = 18;
    public static final int TURN_LB_3BRANCH_RIGHT = 19;
    public static final int TURN_LEFT = 20;
    public static final int TURN_LEFT_BACK = 21;
    public static final int TURN_LEFT_FRONT = 22;
    public static final int TURN_LEFT_SIDE = 23;
    public static final int TURN_LEFT_SIDE_IC = 24;
    public static final int TURN_LEFT_SIDE_MAIN = 25;
    public static final int TURN_LF_2BRANCH_LEFT = 26;
    public static final int TURN_LF_2BRANCH_RIGHT = 27;
    public static final int TURN_RB_2BRANCH_LEFT = 28;
    public static final int TURN_RB_2BRANCH_RIGHT = 29;
    public static final int TURN_RB_3BRANCH_CENTER = 30;
    public static final int TURN_RB_3BRANCH_LEFT = 31;
    public static final int TURN_RB_3BRANCH_RIGHT = 32;
    public static final int TURN_RF_2BRANCH_LEFT = 33;
    public static final int TURN_RF_2BRANCH_RIGHT = 34;
    public static final int TURN_RIGHT = 35;
    public static final int TURN_RIGHT_BACK = 36;
    public static final int TURN_RIGHT_FRONT = 37;
    public static final int TURN_RIGHT_SIDE = 38;
    public static final int TURN_RIGHT_SIDE_IC = 39;
    public static final int TURN_RIGHT_SIDE_MAIN = 40;
    public static final int TURN_RING = 41;
    public static final int TURN_RING_FRONT = 42;
    public static final int TURN_RING_LEFT = 43;
    public static final int TURN_RING_LEFTBACK = 44;
    public static final int TURN_RING_LEFTFRONT = 45;
    public static final int TURN_RING_RIGHT = 46;
    public static final int TURN_RING_RIGHTBACK = 47;
    public static final int TURN_RING_RIGHTFRONT = 48;
    public static final int TURN_RING_TURNBACK = 49;
    private int mDistance;
    private int mMode;
    private int mRemainDistance;
    private int mRemainTime;

    @aa1
    private String mRoadName;
    private int mSpeed;
    private int mState;
    private long mTime;
    private int mTurnType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public final int bdTurnIconNameToType(@aa1 String r2) {
            Intrinsics.X0O(r2, "turnIconName");
            switch(r2.hashCode()) {
                case -2118620201: goto L247;
                case -2042173033: goto L242;
                case -1890594296: goto L237;
                case -1856743837: goto L232;
                case -1799532762: goto L227;
                case -1736025363: goto L222;
                case -1655525354: goto L217;
                case -1549633778: goto L212;
                case -1420513952: goto L207;
                case -1123731332: goto L202;
                case -1069071681: goto L197;
                case -1039245827: goto L192;
                case -944844816: goto L187;
                case -878361000: goto L182;
                case -753402194: goto L177;
                case -569421649: goto L172;
                case -320878299: goto L167;
                case -99661865: goto L162;
                case -78988135: goto L157;
                case 13218200: goto L152;
                case 24534771: goto L147;
                case 191541781: goto L142;
                case 239499041: goto L137;
                case 255550837: goto L132;
                case 295314103: goto L127;
                case 431546042: goto L122;
                case 456824278: goto L120;
                case 534537823: goto L116;
                case 555916298: goto L111;
                case 587315852: goto L106;
                case 596201513: goto L101;
                case 692875795: goto L96;
                case 738223926: goto L91;
                case 823037398: goto L86;
                case 1032431398: goto L81;
                case 1154143729: goto L76;
                case 1203409972: goto L71;
                case 1219939652: goto L66;
                case 1290328722: goto L61;
                case 1341147280: goto L56;
                case 1422512962: goto L51;
                case 1507604519: goto L46;
                case 1510087856: goto L41;
                case 1521143647: goto L36;
                case 1622458916: goto L31;
                case 1804150631: goto L26;
                case 1832305287: goto L21;
                case 1888419746: goto L16;
                case 1933047139: goto L11;
                case 2117931147: goto L6;
                default: goto L253;
            };
        L120:
            r2.equals("turn_along.png");
            return 0;
        L253:
            return 0;
        L6:
            if (r2.equals("turn_branch_center.png") == false) goto L254;
            return 7;
        L254:
            return 0;
        L11:
            if (r2.equals("turn_back_2branch_left.png") == false) goto L255;
            return 2;
        L255:
            return 0;
        L16:
            if (r2.equals("turn_front.png") == false) goto L256;
            return 13;
        L256:
            return 0;
        L21:
            if (r2.equals("turn_left_side_ic.png") == false) goto L257;
            return 24;
        L257:
            return 0;
        L26:
            if (r2.equals("turn_right_back.png") == false) goto L258;
            return 36;
        L258:
            return 0;
        L31:
            if (r2.equals("turn_back.png") == false) goto L259;
            return 1;
        L259:
            return 0;
        L36:
            if (r2.equals("turn_rb_2branch_right.png") == false) goto L260;
            return 29;
        L260:
            return 0;
        L41:
            if (r2.equals("turn_lf_2branch_left.png") == false) goto L261;
            return 26;
        L261:
            return 0;
        L46:
            if (r2.equals("turn_rb_3branch_center.png") == false) goto L262;
            return 30;
        L262:
            return 0;
        L51:
            if (r2.equals("turn_back_3branch_left.png") == false) goto L263;
            return 5;
        L263:
            return 0;
        L56:
            if (r2.equals("turn_back_3branch_center.png") == false) goto L264;
            return 4;
        L264:
            return 0;
        L61:
            if (r2.equals("turn_branch_left_straight.png") == false) goto L265;
            return 9;
        L265:
            return 0;
        L66:
            if (r2.equals("turn_left.png") == false) goto L266;
            return 20;
        L266:
            return 0;
        L71:
            if (r2.equals("turn_lb_2branch_left.png") == false) goto L267;
            return 15;
        L267:
            return 0;
        L76:
            if (r2.equals("turn_ring_rightback.png") == false) goto L268;
            return 47;
        L268:
            return 0;
        L81:
            if (r2.equals("turn_lb_3branch_right.png") == false) goto L269;
            return 19;
        L269:
            return 0;
        L86:
            if (r2.equals("turn_back_2branch_right.png") == false) goto L270;
            return 3;
        L270:
            return 0;
        L91:
            if (r2.equals("turn_rf_2branch_left.png") == false) goto L271;
            return 33;
        L271:
            return 0;
        L96:
            if (r2.equals("turn_lb_3branch_left.png") == false) goto L272;
            return 18;
        L272:
            return 0;
        L101:
            if (r2.equals("turn_lf_2branch_right.png") == false) goto L273;
            return 27;
        L273:
            return 0;
        L106:
            if (r2.equals("turn_ring_turnback.png") == false) goto L274;
            return 49;
        L274:
            return 0;
        L111:
            if (r2.equals("turn_ring_right.png") == false) goto L275;
            return 46;
        L275:
            return 0;
        L116:
            if (r2.equals("turn_dest.png") == false) goto L276;
            return 12;
        L276:
            return 0;
        L122:
            if (r2.equals("turn_rb_2branch_left.png") == false) goto L277;
            return 28;
        L277:
            return 0;
        L127:
            if (r2.equals("turn_right_side_main.png") == false) goto L278;
            return 40;
        L278:
            return 0;
        L132:
            if (r2.equals("turn_ring_rightfront.png") == false) goto L279;
            return 48;
        L279:
            return 0;
        L137:
            if (r2.equals("turn_lb_3branch_center.png") == false) goto L280;
            return 17;
        L280:
            return 0;
        L142:
            if (r2.equals("turn_right.png") == false) goto L281;
            return 35;
        L281:
            return 0;
        L147:
            if (r2.equals("turn_branch_right_straight.png") == false) goto L282;
            return 11;
        L282:
            return 0;
        L152:
            if (r2.equals("turn_left_back.png") == false) goto L283;
            return 21;
        L283:
            return 0;
        L157:
            if (r2.equals("turn_rb_3branch_left.png") == false) goto L284;
            return 31;
        L284:
            return 0;
        L162:
            if (r2.equals("turn_right_side.png") == false) goto L285;
            return 38;
        L285:
            return 0;
        L167:
            if (r2.equals("turn_lb_2branch_right.png") == false) goto L286;
            return 16;
        L286:
            return 0;
        L172:
            if (r2.equals("turn_ring_left.png") == false) goto L287;
            return 43;
        L287:
            return 0;
        L177:
            if (r2.equals("turn_left_front.png") == false) goto L288;
            return 22;
        L288:
            return 0;
        L182:
            if (r2.equals("turn_right_side_ic.png") == false) goto L289;
            return 39;
        L289:
            return 0;
        L187:
            if (r2.equals("turn_ring_leftfront.png") == false) goto L290;
            return 45;
        L290:
            return 0;
        L192:
            if (r2.equals("turn_branch_left.png") == false) goto L291;
            return 8;
        L291:
            return 0;
        L197:
            if (r2.equals("turn_right_front.png") == false) goto L292;
            return 37;
        L292:
            return 0;
        L202:
            if (r2.equals("turn_branch_right.png") == false) goto L293;
            return 10;
        L293:
            return 0;
        L207:
            if (r2.equals("turn_rb_3branch_right.png") == false) goto L294;
            return 32;
        L294:
            return 0;
        L212:
            if (r2.equals("turn_inferry.png") == false) goto L295;
            return 14;
        L295:
            return 0;
        L217:
            if (r2.equals("turn_ring_leftback.png") == false) goto L296;
            return 44;
        L296:
            return 0;
        L222:
            if (r2.equals("turn_ring.png") == false) goto L297;
            return 41;
        L297:
            return 0;
        L227:
            if (r2.equals("turn_left_side_main.png") == false) goto L298;
            return 25;
        L298:
            return 0;
        L232:
            if (r2.equals("turn_rf_2branch_right.png") == false) goto L299;
            return 34;
        L299:
            return 0;
        L237:
            if (r2.equals("turn_left_side.png") == false) goto L300;
            return 23;
        L300:
            return 0;
        L242:
            if (r2.equals("turn_ring_front.png") == false) goto L301;
            return 42;
        L301:
            return 0;
        L247:
            if (r2.equals("turn_back_3branch_right.png") == false) goto L252;
            return 6;
        L252:
            return 0;
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleNaviInfo() {
        int r1 = 0;
        long r2 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        String r10 = null;
        this(r1, r2, r4, r5, r6, r7, r8, r9, r10, 511, null);
    }

    public static /* synthetic */ BleNaviInfo copy$default(BleNaviInfo r0, int r1, long r2, int r4, int r5, int r6, int r7, int r8, int r9, String r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.mState;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = r0.mTurnType;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = r0.mRemainDistance;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = r0.mRemainTime;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = r0.mDistance;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = r0.mSpeed;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = r0.mMode;
    L27:
        if ((r11 & 256) == 0) goto L29;
        r10 = r0.mRoadName;
    L29:
        int r13 = r9;
        String r14 = r10;
        int r15 = r7;
        int r16 = r8;
        int r17 = r6;
        int r18 = r4;
        long r19 = r2;
        int r3 = r1;
        return r0.copy(r3, r19, r18, r5, r17, r15, r16, r13, r14);
    }

    public final int component1() {
        return this.mState;
    }

    public final long component2() {
        return this.mTime;
    }

    public final int component3() {
        return this.mTurnType;
    }

    public final int component4() {
        return this.mRemainDistance;
    }

    public final int component5() {
        return this.mRemainTime;
    }

    public final int component6() {
        return this.mDistance;
    }

    public final int component7() {
        return this.mSpeed;
    }

    public final int component8() {
        return this.mMode;
    }

    @aa1
    public final String component9() {
        return this.mRoadName;
    }

    @aa1
    public final BleNaviInfo copy(int r13, long r14, int r16, int r17, int r18, int r19, int r20, int r21, @aa1 String r22) {
        Intrinsics.X0O(r22, "mRoadName");
        return new BleNaviInfo(r13, r14, r16, r17, r18, r19, r20, r21, r22);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mState = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mState);
        writeObject(BleTime.Companion.ofLocal(this.mTime));
        writeInt8(this.mTurnType);
        BleWritable.writeInt32$default(this, this.mRemainDistance, null, 2, null);
        BleWritable.writeInt32$default(this, this.mRemainTime, null, 2, null);
        BleWritable.writeInt32$default(this, this.mDistance, null, 2, null);
        writeInt8(this.mSpeed);
        writeInt8(this.mMode);
        byte[] r0 = this.mRoadName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        BleWritable.writeInt16$default(this, Math.min(r0.length, 232), null, 2, null);
        BleWritable.writeStringWithLimit$default(this, this.mRoadName, 232, null, true, 4, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleNaviInfo) == true) goto L8;
        return false;
    L8:
        BleNaviInfo r9 = (BleNaviInfo) r8;
        if (this.mState == r9.mState) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (this.mTurnType == r9.mTurnType) goto L18;
        return false;
    L18:
        if (this.mRemainDistance == r9.mRemainDistance) goto L21;
        return false;
    L21:
        if (this.mRemainTime == r9.mRemainTime) goto L24;
        return false;
    L24:
        if (this.mDistance == r9.mDistance) goto L27;
        return false;
    L27:
        if (this.mSpeed == r9.mSpeed) goto L30;
        return false;
    L30:
        if (this.mMode == r9.mMode) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mRoadName, r9.mRoadName) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] r0 = this.mRoadName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        return Math.min(r0.length, 232) + 24;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMRemainDistance() {
        return this.mRemainDistance;
    }

    public final int getMRemainTime() {
        return this.mRemainTime;
    }

    @aa1
    public final String getMRoadName() {
        return this.mRoadName;
    }

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public final int getMState() {
        return this.mState;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public final int getMTurnType() {
        return this.mTurnType;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.mState) * 31) + Long.hashCode(this.mTime)) * 31) + Integer.hashCode(this.mTurnType)) * 31) + Integer.hashCode(this.mRemainDistance)) * 31) + Integer.hashCode(this.mRemainTime)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mMode)) * 31) + this.mRoadName.hashCode();
    }

    public final void setMDistance(int r1) {
        this.mDistance = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMRemainDistance(int r1) {
        this.mRemainDistance = r1;
    }

    public final void setMRemainTime(int r1) {
        this.mRemainTime = r1;
    }

    public final void setMRoadName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRoadName = r2;
    }

    public final void setMSpeed(int r1) {
        this.mSpeed = r1;
    }

    public final void setMState(int r1) {
        this.mState = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMTurnType(int r1) {
        this.mTurnType = r1;
    }

    @aa1
    public String toString() {
        return "BleNaviInfo(mState=" + this.mState + ", mTime=" + this.mTime + ", mTurnType=" + this.mTurnType + ", mRemainDistance=" + this.mRemainDistance + ", mRemainTime=" + this.mRemainTime + ", mDistance=" + this.mDistance + ", mSpeed=" + this.mSpeed + ", mMode=" + this.mMode + ", mRoadName='" + this.mRoadName + "')";
    }

    public BleNaviInfo(int r2, long r3, int r5, int r6, int r7, int r8, int r9, int r10, @aa1 String r11) {
        Intrinsics.X0O(r11, "mRoadName");
        this.mState = r2;
        this.mTime = r3;
        this.mTurnType = r5;
        this.mRemainDistance = r6;
        this.mRemainTime = r7;
        this.mDistance = r8;
        this.mSpeed = r9;
        this.mMode = r10;
        this.mRoadName = r11;
    }

    public /* synthetic */ BleNaviInfo(int r2, long r3, int r5, int r6, int r7, int r8, int r9, int r10, String r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r7 = 0;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r8 = 0;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r9 = 0;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r10 = 0;
    L27:
        if ((r12 & 256) == 0) goto L29;
        r11 = "";
    L29:
        String r14 = r11;
        int r15 = r10;
        int r16 = r9;
        int r17 = r8;
        int r18 = r7;
        long r4 = r3;
        int r19 = r2;
        this(r19, r4, r5, r6, r18, r17, r16, r15, r14);
    }
}
