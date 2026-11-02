package com.sma.smartv3.util.websocket.data;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class TranslateOrderItemEntity {

    @tb1
    private final Double amount;

    @tb1
    private final String buyerId;

    @tb1
    private final String createdAt;

    @tb1
    private final String createdBy;

    @tb1
    private final Object eleExtraId;

    @tb1
    private final Long eleId;

    @tb1
    private final Object elePath;

    @tb1
    private final Integer id;

    @tb1
    private final String orderNum;

    @tb1
    private final String orderType;

    @tb1
    private final String orderTypeName;

    @tb1
    private final String payStatus;

    @aa1
    private final String payStatusName;

    @tb1
    private final String payTime;

    @tb1
    private final String payType;

    @tb1
    private final String payTypeName;

    @tb1
    private final String priceUnit;

    @tb1
    private final Integer projectId;

    @tb1
    private final String projectName;

    @tb1
    private final Object refundedTime;

    @tb1
    private final String remark;

    @tb1
    private final Boolean sandboxFlag;

    @tb1
    private final Boolean sendProductFlag;

    @tb1
    private final String subject;

    @tb1
    private final String thirdUserId;

    @tb1
    private final String tradeNo;

    @tb1
    private final Double transAmount;

    @tb1
    private final String updateAt;

    @tb1
    private final Object updateBy;

    @tb1
    private final Integer userId;

    @tb1
    private final String userNickName;

    @tb1
    private final Integer valid;

    @tb1
    private final Integer version;

    public TranslateOrderItemEntity() {
        Double r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        Object r5 = null;
        Long r6 = null;
        Object r7 = null;
        Integer r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        String r16 = null;
        String r17 = null;
        Integer r18 = null;
        String r19 = null;
        Object r20 = null;
        String r21 = null;
        Boolean r22 = null;
        Boolean r23 = null;
        String r24 = null;
        String r25 = null;
        String r26 = null;
        Double r27 = null;
        String r28 = null;
        Object r29 = null;
        Integer r30 = null;
        String r31 = null;
        Integer r32 = null;
        Integer r33 = null;
        int r34 = -1;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, 1, null);
    }

    public static /* synthetic */ TranslateOrderItemEntity copy$default(TranslateOrderItemEntity r17, Double r18, String r19, String r20, String r21, Object r22, Long r23, Object r24, Integer r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, Integer r35, String r36, Object r37, String r38, Boolean r39, Boolean r40, String r41, String r42, String r43, Double r44, String r45, Object r46, Integer r47, String r48, Integer r49, Integer r50, int r51, int r52, Object r53) {
        if ((r51 & 1) == 0) goto L5;
        Double r2 = r17.amount;
    L7:
        if ((r51 & 2) == 0) goto L9;
        String r3 = r17.buyerId;
    L11:
        if ((r51 & 4) == 0) goto L13;
        String r4 = r17.createdAt;
    L15:
        if ((r51 & 8) == 0) goto L17;
        String r5 = r17.createdBy;
    L19:
        if ((r51 & 16) == 0) goto L21;
        Object r6 = r17.eleExtraId;
    L23:
        if ((r51 & 32) == 0) goto L25;
        Long r7 = r17.eleId;
    L27:
        if ((r51 & 64) == 0) goto L29;
        Object r8 = r17.elePath;
    L31:
        if ((r51 & 128) == 0) goto L33;
        Integer r9 = r17.id;
    L35:
        if ((r51 & 256) == 0) goto L37;
        String r10 = r17.orderNum;
    L39:
        if ((r51 & 512) == 0) goto L41;
        String r11 = r17.orderType;
    L43:
        if ((r51 & 1024) == 0) goto L45;
        String r12 = r17.orderTypeName;
    L47:
        if ((r51 & 2048) == 0) goto L49;
        String r13 = r17.payStatus;
    L51:
        if ((r51 & 4096) == 0) goto L53;
        String r14 = r17.payStatusName;
    L55:
        if ((r51 & 8192) == 0) goto L57;
        String r15 = r17.payTime;
    L58:
        Double r110 = r2;
        if ((r51 & 16384) == 0) goto L61;
        String r16 = r17.payType;
    L63:
        if ((r51 & 32768) == 0) goto L65;
        String r1 = r17.payTypeName;
    L66:
        String r111 = r1;
        if ((r51 & 65536) == 0) goto L69;
        String r54 = r17.priceUnit;
    L70:
        String r210 = r54;
        if ((r51 & 131072) == 0) goto L73;
        Integer r55 = r17.projectId;
    L74:
        Integer r211 = r55;
        if ((r51 & 262144) == 0) goto L77;
        String r56 = r17.projectName;
    L78:
        String r212 = r56;
        if ((r51 & 524288) == 0) goto L81;
        Object r57 = r17.refundedTime;
    L82:
        Object r213 = r57;
        if ((r51 & 1048576) == 0) goto L85;
        String r58 = r17.remark;
    L86:
        String r214 = r58;
        if ((r51 & 2097152) == 0) goto L89;
        Boolean r59 = r17.sandboxFlag;
    L90:
        Boolean r215 = r59;
        if ((r51 & 4194304) == 0) goto L93;
        Boolean r60 = r17.sendProductFlag;
    L94:
        Boolean r216 = r60;
        if ((r51 & 8388608) == 0) goto L97;
        String r61 = r17.subject;
    L98:
        String r217 = r61;
        if ((r51 & 16777216) == 0) goto L101;
        String r62 = r17.thirdUserId;
    L102:
        String r218 = r62;
        if ((r51 & 33554432) == 0) goto L105;
        String r63 = r17.tradeNo;
    L106:
        String r219 = r63;
        if ((r51 & 67108864) == 0) goto L109;
        Double r64 = r17.transAmount;
    L110:
        Double r310 = r64;
        if ((r51 & 134217728) == 0) goto L113;
        String r65 = r17.updateAt;
    L114:
        String r311 = r65;
        if ((r51 & 268435456) == 0) goto L117;
        Object r66 = r17.updateBy;
    L118:
        Object r312 = r66;
        if ((r51 & 536870912) == 0) goto L121;
        Integer r67 = r17.userId;
    L122:
        Integer r313 = r67;
        if ((r51 & 1073741824) == 0) goto L125;
        String r68 = r17.userNickName;
    L126:
        String r314 = r68;
        if ((r51 & Integer.MIN_VALUE) == 0) goto L129;
        Integer r69 = r17.valid;
    L131:
        if ((r52 & 1) == 0) goto L134;
        Integer r315 = r69;
        Integer r510 = r315;
        Integer r511 = r17.version;
    L136:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r210, r211, r212, r213, r214, r215, r216, r217, r218, r219, r310, r311, r312, r313, r314, r510, r511);
    L134:
        r511 = r50;
        r510 = r69;
        goto L136
    L129:
        r69 = r49;
        goto L131
    L125:
        r68 = r48;
        goto L126
    L121:
        r67 = r47;
        goto L122
    L117:
        r66 = r46;
        goto L118
    L113:
        r65 = r45;
        goto L114
    L109:
        r64 = r44;
        goto L110
    L105:
        r63 = r43;
        goto L106
    L101:
        r62 = r42;
        goto L102
    L97:
        r61 = r41;
        goto L98
    L93:
        r60 = r40;
        goto L94
    L89:
        r59 = r39;
        goto L90
    L85:
        r58 = r38;
        goto L86
    L81:
        r57 = r37;
        goto L82
    L77:
        r56 = r36;
        goto L78
    L73:
        r55 = r35;
        goto L74
    L69:
        r54 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    @tb1
    public final Double component1() {
        return this.amount;
    }

    @tb1
    public final String component10() {
        return this.orderType;
    }

    @tb1
    public final String component11() {
        return this.orderTypeName;
    }

    @tb1
    public final String component12() {
        return this.payStatus;
    }

    @aa1
    public final String component13() {
        return this.payStatusName;
    }

    @tb1
    public final String component14() {
        return this.payTime;
    }

    @tb1
    public final String component15() {
        return this.payType;
    }

    @tb1
    public final String component16() {
        return this.payTypeName;
    }

    @tb1
    public final String component17() {
        return this.priceUnit;
    }

    @tb1
    public final Integer component18() {
        return this.projectId;
    }

    @tb1
    public final String component19() {
        return this.projectName;
    }

    @tb1
    public final String component2() {
        return this.buyerId;
    }

    @tb1
    public final Object component20() {
        return this.refundedTime;
    }

    @tb1
    public final String component21() {
        return this.remark;
    }

    @tb1
    public final Boolean component22() {
        return this.sandboxFlag;
    }

    @tb1
    public final Boolean component23() {
        return this.sendProductFlag;
    }

    @tb1
    public final String component24() {
        return this.subject;
    }

    @tb1
    public final String component25() {
        return this.thirdUserId;
    }

    @tb1
    public final String component26() {
        return this.tradeNo;
    }

    @tb1
    public final Double component27() {
        return this.transAmount;
    }

    @tb1
    public final String component28() {
        return this.updateAt;
    }

    @tb1
    public final Object component29() {
        return this.updateBy;
    }

    @tb1
    public final String component3() {
        return this.createdAt;
    }

    @tb1
    public final Integer component30() {
        return this.userId;
    }

    @tb1
    public final String component31() {
        return this.userNickName;
    }

    @tb1
    public final Integer component32() {
        return this.valid;
    }

    @tb1
    public final Integer component33() {
        return this.version;
    }

    @tb1
    public final String component4() {
        return this.createdBy;
    }

    @tb1
    public final Object component5() {
        return this.eleExtraId;
    }

    @tb1
    public final Long component6() {
        return this.eleId;
    }

    @tb1
    public final Object component7() {
        return this.elePath;
    }

    @tb1
    public final Integer component8() {
        return this.id;
    }

    @tb1
    public final String component9() {
        return this.orderNum;
    }

    @aa1
    public final TranslateOrderItemEntity copy(@tb1 Double r36, @tb1 String r37, @tb1 String r38, @tb1 String r39, @tb1 Object r40, @tb1 Long r41, @tb1 Object r42, @tb1 Integer r43, @tb1 String r44, @tb1 String r45, @tb1 String r46, @tb1 String r47, @aa1 String r48, @tb1 String r49, @tb1 String r50, @tb1 String r51, @tb1 String r52, @tb1 Integer r53, @tb1 String r54, @tb1 Object r55, @tb1 String r56, @tb1 Boolean r57, @tb1 Boolean r58, @tb1 String r59, @tb1 String r60, @tb1 String r61, @tb1 Double r62, @tb1 String r63, @tb1 Object r64, @tb1 Integer r65, @tb1 String r66, @tb1 Integer r67, @tb1 Integer r68) {
        Intrinsics.X0O(r48, "payStatusName");
        return new TranslateOrderItemEntity(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TranslateOrderItemEntity) == true) goto L8;
        return false;
    L8:
        TranslateOrderItemEntity r6 = (TranslateOrderItemEntity) r5;
        if (Intrinsics.XOO0ii0(this.amount, r6.amount) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.buyerId, r6.buyerId) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.createdAt, r6.createdAt) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.createdBy, r6.createdBy) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.eleExtraId, r6.eleExtraId) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.eleId, r6.eleId) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.elePath, r6.elePath) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.id, r6.id) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.orderNum, r6.orderNum) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.orderType, r6.orderType) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.orderTypeName, r6.orderTypeName) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.payStatus, r6.payStatus) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.XOO0ii0(this.payStatusName, r6.payStatusName) == true) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.payTime, r6.payTime) == true) goto L51;
        return false;
    L51:
        if (Intrinsics.XOO0ii0(this.payType, r6.payType) == true) goto L54;
        return false;
    L54:
        if (Intrinsics.XOO0ii0(this.payTypeName, r6.payTypeName) == true) goto L57;
        return false;
    L57:
        if (Intrinsics.XOO0ii0(this.priceUnit, r6.priceUnit) == true) goto L60;
        return false;
    L60:
        if (Intrinsics.XOO0ii0(this.projectId, r6.projectId) == true) goto L63;
        return false;
    L63:
        if (Intrinsics.XOO0ii0(this.projectName, r6.projectName) == true) goto L66;
        return false;
    L66:
        if (Intrinsics.XOO0ii0(this.refundedTime, r6.refundedTime) == true) goto L69;
        return false;
    L69:
        if (Intrinsics.XOO0ii0(this.remark, r6.remark) == true) goto L72;
        return false;
    L72:
        if (Intrinsics.XOO0ii0(this.sandboxFlag, r6.sandboxFlag) == true) goto L75;
        return false;
    L75:
        if (Intrinsics.XOO0ii0(this.sendProductFlag, r6.sendProductFlag) == true) goto L78;
        return false;
    L78:
        if (Intrinsics.XOO0ii0(this.subject, r6.subject) == true) goto L81;
        return false;
    L81:
        if (Intrinsics.XOO0ii0(this.thirdUserId, r6.thirdUserId) == true) goto L84;
        return false;
    L84:
        if (Intrinsics.XOO0ii0(this.tradeNo, r6.tradeNo) == true) goto L87;
        return false;
    L87:
        if (Intrinsics.XOO0ii0(this.transAmount, r6.transAmount) == true) goto L90;
        return false;
    L90:
        if (Intrinsics.XOO0ii0(this.updateAt, r6.updateAt) == true) goto L93;
        return false;
    L93:
        if (Intrinsics.XOO0ii0(this.updateBy, r6.updateBy) == true) goto L96;
        return false;
    L96:
        if (Intrinsics.XOO0ii0(this.userId, r6.userId) == true) goto L99;
        return false;
    L99:
        if (Intrinsics.XOO0ii0(this.userNickName, r6.userNickName) == true) goto L102;
        return false;
    L102:
        if (Intrinsics.XOO0ii0(this.valid, r6.valid) == true) goto L105;
        return false;
    L105:
        if (Intrinsics.XOO0ii0(this.version, r6.version) == true) goto L107;
        return false;
    L107:
        return true;
    }

    @tb1
    public final Double getAmount() {
        return this.amount;
    }

    @tb1
    public final String getBuyerId() {
        return this.buyerId;
    }

    @tb1
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @tb1
    public final String getCreatedBy() {
        return this.createdBy;
    }

    @tb1
    public final Object getEleExtraId() {
        return this.eleExtraId;
    }

    @tb1
    public final Long getEleId() {
        return this.eleId;
    }

    @tb1
    public final Object getElePath() {
        return this.elePath;
    }

    @tb1
    public final Integer getId() {
        return this.id;
    }

    @tb1
    public final String getOrderNum() {
        return this.orderNum;
    }

    @tb1
    public final String getOrderType() {
        return this.orderType;
    }

    @tb1
    public final String getOrderTypeName() {
        return this.orderTypeName;
    }

    @tb1
    public final String getPayStatus() {
        return this.payStatus;
    }

    @aa1
    public final String getPayStatusName() {
        return this.payStatusName;
    }

    @tb1
    public final String getPayTime() {
        return this.payTime;
    }

    @tb1
    public final String getPayType() {
        return this.payType;
    }

    @tb1
    public final String getPayTypeName() {
        return this.payTypeName;
    }

    @tb1
    public final String getPriceUnit() {
        return this.priceUnit;
    }

    @tb1
    public final Integer getProjectId() {
        return this.projectId;
    }

    @tb1
    public final String getProjectName() {
        return this.projectName;
    }

    @tb1
    public final Object getRefundedTime() {
        return this.refundedTime;
    }

    @tb1
    public final String getRemark() {
        return this.remark;
    }

    @tb1
    public final Boolean getSandboxFlag() {
        return this.sandboxFlag;
    }

    @tb1
    public final Boolean getSendProductFlag() {
        return this.sendProductFlag;
    }

    @tb1
    public final String getSubject() {
        return this.subject;
    }

    @tb1
    public final String getThirdUserId() {
        return this.thirdUserId;
    }

    @tb1
    public final String getTradeNo() {
        return this.tradeNo;
    }

    @tb1
    public final Double getTransAmount() {
        return this.transAmount;
    }

    @tb1
    public final String getUpdateAt() {
        return this.updateAt;
    }

    @tb1
    public final Object getUpdateBy() {
        return this.updateBy;
    }

    @tb1
    public final Integer getUserId() {
        return this.userId;
    }

    @tb1
    public final String getUserNickName() {
        return this.userNickName;
    }

    @tb1
    public final Integer getValid() {
        return this.valid;
    }

    @tb1
    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Double r0 = this.amount;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        String r4 = this.buyerId;
        if (r4 != null) goto L9;
        int r5 = 0;
    L10:
        int r6 = (r3 + r5) * 31;
        String r7 = this.createdAt;
        if (r7 != null) goto L13;
        int r8 = 0;
    L14:
        int r9 = (r6 + r8) * 31;
        String r10 = this.createdBy;
        if (r10 != null) goto L17;
        int r11 = 0;
    L18:
        int r12 = (r9 + r11) * 31;
        Object r13 = this.eleExtraId;
        if (r13 != null) goto L21;
        int r14 = 0;
    L22:
        int r15 = (r12 + r14) * 31;
        Long r16 = this.eleId;
        if (r16 != null) goto L25;
        int r17 = 0;
    L26:
        int r18 = (r15 + r17) * 31;
        Object r19 = this.elePath;
        if (r19 != null) goto L29;
        int r20 = 0;
    L30:
        int r21 = (r18 + r20) * 31;
        Integer r22 = this.id;
        if (r22 != null) goto L33;
        int r23 = 0;
    L34:
        int r24 = (r21 + r23) * 31;
        String r25 = this.orderNum;
        if (r25 != null) goto L37;
        int r26 = 0;
    L38:
        int r27 = (r24 + r26) * 31;
        String r28 = this.orderType;
        if (r28 != null) goto L41;
        int r29 = 0;
    L42:
        int r30 = (r27 + r29) * 31;
        String r31 = this.orderTypeName;
        if (r31 != null) goto L45;
        int r32 = 0;
    L46:
        int r33 = (r30 + r32) * 31;
        String r34 = this.payStatus;
        if (r34 != null) goto L49;
        int r35 = 0;
    L50:
        int r36 = (((r33 + r35) * 31) + this.payStatusName.hashCode()) * 31;
        String r37 = this.payTime;
        if (r37 != null) goto L53;
        int r38 = 0;
    L54:
        int r39 = (r36 + r38) * 31;
        String r40 = this.payType;
        if (r40 != null) goto L57;
        int r41 = 0;
    L58:
        int r42 = (r39 + r41) * 31;
        String r43 = this.payTypeName;
        if (r43 != null) goto L61;
        int r44 = 0;
    L62:
        int r45 = (r42 + r44) * 31;
        String r46 = this.priceUnit;
        if (r46 != null) goto L65;
        int r47 = 0;
    L66:
        int r48 = (r45 + r47) * 31;
        Integer r49 = this.projectId;
        if (r49 != null) goto L69;
        int r50 = 0;
    L70:
        int r51 = (r48 + r50) * 31;
        String r52 = this.projectName;
        if (r52 != null) goto L73;
        int r53 = 0;
    L74:
        int r54 = (r51 + r53) * 31;
        Object r55 = this.refundedTime;
        if (r55 != null) goto L77;
        int r56 = 0;
    L78:
        int r57 = (r54 + r56) * 31;
        String r58 = this.remark;
        if (r58 != null) goto L81;
        int r59 = 0;
    L82:
        int r60 = (r57 + r59) * 31;
        Boolean r61 = this.sandboxFlag;
        if (r61 != null) goto L85;
        int r62 = 0;
    L86:
        int r63 = (r60 + r62) * 31;
        Boolean r64 = this.sendProductFlag;
        if (r64 != null) goto L89;
        int r65 = 0;
    L90:
        int r66 = (r63 + r65) * 31;
        String r67 = this.subject;
        if (r67 != null) goto L93;
        int r68 = 0;
    L94:
        int r69 = (r66 + r68) * 31;
        String r70 = this.thirdUserId;
        if (r70 != null) goto L97;
        int r71 = 0;
    L98:
        int r72 = (r69 + r71) * 31;
        String r73 = this.tradeNo;
        if (r73 != null) goto L101;
        int r74 = 0;
    L102:
        int r75 = (r72 + r74) * 31;
        Double r76 = this.transAmount;
        if (r76 != null) goto L105;
        int r77 = 0;
    L106:
        int r78 = (r75 + r77) * 31;
        String r79 = this.updateAt;
        if (r79 != null) goto L109;
        int r80 = 0;
    L110:
        int r81 = (r78 + r80) * 31;
        Object r82 = this.updateBy;
        if (r82 != null) goto L113;
        int r83 = 0;
    L114:
        int r84 = (r81 + r83) * 31;
        Integer r85 = this.userId;
        if (r85 != null) goto L117;
        int r86 = 0;
    L118:
        int r87 = (r84 + r86) * 31;
        String r88 = this.userNickName;
        if (r88 != null) goto L121;
        int r89 = 0;
    L122:
        int r90 = (r87 + r89) * 31;
        Integer r91 = this.valid;
        if (r91 != null) goto L125;
        int r92 = 0;
    L126:
        int r93 = (r90 + r92) * 31;
        Integer r94 = this.version;
        if (r94 == null) goto L131;
        r1 = r94.hashCode();
    L131:
        return r93 + r1;
    L125:
        r92 = r91.hashCode();
        goto L126
    L121:
        r89 = r88.hashCode();
        goto L122
    L117:
        r86 = r85.hashCode();
        goto L118
    L113:
        r83 = r82.hashCode();
        goto L114
    L109:
        r80 = r79.hashCode();
        goto L110
    L105:
        r77 = r76.hashCode();
        goto L106
    L101:
        r74 = r73.hashCode();
        goto L102
    L97:
        r71 = r70.hashCode();
        goto L98
    L93:
        r68 = r67.hashCode();
        goto L94
    L89:
        r65 = r64.hashCode();
        goto L90
    L85:
        r62 = r61.hashCode();
        goto L86
    L81:
        r59 = r58.hashCode();
        goto L82
    L77:
        r56 = r55.hashCode();
        goto L78
    L73:
        r53 = r52.hashCode();
        goto L74
    L69:
        r50 = r49.hashCode();
        goto L70
    L65:
        r47 = r46.hashCode();
        goto L66
    L61:
        r44 = r43.hashCode();
        goto L62
    L57:
        r41 = r40.hashCode();
        goto L58
    L53:
        r38 = r37.hashCode();
        goto L54
    L49:
        r35 = r34.hashCode();
        goto L50
    L45:
        r32 = r31.hashCode();
        goto L46
    L41:
        r29 = r28.hashCode();
        goto L42
    L37:
        r26 = r25.hashCode();
        goto L38
    L33:
        r23 = r22.hashCode();
        goto L34
    L29:
        r20 = r19.hashCode();
        goto L30
    L25:
        r17 = r16.hashCode();
        goto L26
    L21:
        r14 = r13.hashCode();
        goto L22
    L17:
        r11 = r10.hashCode();
        goto L18
    L13:
        r8 = r7.hashCode();
        goto L14
    L9:
        r5 = r4.hashCode();
        goto L10
    L5:
        r2 = r0.hashCode();
        goto L6
    }

    @aa1
    public String toString() {
        return "TranslateOrderItemEntity(amount=" + this.amount + ", buyerId=" + this.buyerId + ", createdAt=" + this.createdAt + ", createdBy=" + this.createdBy + ", eleExtraId=" + this.eleExtraId + ", eleId=" + this.eleId + ", elePath=" + this.elePath + ", id=" + this.id + ", orderNum=" + this.orderNum + ", orderType=" + this.orderType + ", orderTypeName=" + this.orderTypeName + ", payStatus=" + this.payStatus + ", payStatusName=" + this.payStatusName + ", payTime=" + this.payTime + ", payType=" + this.payType + ", payTypeName=" + this.payTypeName + ", priceUnit=" + this.priceUnit + ", projectId=" + this.projectId + ", projectName=" + this.projectName + ", refundedTime=" + this.refundedTime + ", remark=" + this.remark + ", sandboxFlag=" + this.sandboxFlag + ", sendProductFlag=" + this.sendProductFlag + ", subject=" + this.subject + ", thirdUserId=" + this.thirdUserId + ", tradeNo=" + this.tradeNo + ", transAmount=" + this.transAmount + ", updateAt=" + this.updateAt + ", updateBy=" + this.updateBy + ", userId=" + this.userId + ", userNickName=" + this.userNickName + ", valid=" + this.valid + ", version=" + this.version + I000IiI1O.iO.iO;
    }

    public TranslateOrderItemEntity(@tb1 Double r2, @tb1 String r3, @tb1 String r4, @tb1 String r5, @tb1 Object r6, @tb1 Long r7, @tb1 Object r8, @tb1 Integer r9, @tb1 String r10, @tb1 String r11, @tb1 String r12, @tb1 String r13, @aa1 String r14, @tb1 String r15, @tb1 String r16, @tb1 String r17, @tb1 String r18, @tb1 Integer r19, @tb1 String r20, @tb1 Object r21, @tb1 String r22, @tb1 Boolean r23, @tb1 Boolean r24, @tb1 String r25, @tb1 String r26, @tb1 String r27, @tb1 Double r28, @tb1 String r29, @tb1 Object r30, @tb1 Integer r31, @tb1 String r32, @tb1 Integer r33, @tb1 Integer r34) {
        Intrinsics.X0O(r14, "payStatusName");
        this.amount = r2;
        this.buyerId = r3;
        this.createdAt = r4;
        this.createdBy = r5;
        this.eleExtraId = r6;
        this.eleId = r7;
        this.elePath = r8;
        this.id = r9;
        this.orderNum = r10;
        this.orderType = r11;
        this.orderTypeName = r12;
        this.payStatus = r13;
        this.payStatusName = r14;
        this.payTime = r15;
        this.payType = r16;
        this.payTypeName = r17;
        this.priceUnit = r18;
        this.projectId = r19;
        this.projectName = r20;
        this.refundedTime = r21;
        this.remark = r22;
        this.sandboxFlag = r23;
        this.sendProductFlag = r24;
        this.subject = r25;
        this.thirdUserId = r26;
        this.tradeNo = r27;
        this.transAmount = r28;
        this.updateAt = r29;
        this.updateBy = r30;
        this.userId = r31;
        this.userNickName = r32;
        this.valid = r33;
        this.version = r34;
    }

    public /* synthetic */ TranslateOrderItemEntity(Double r33, String r34, String r35, String r36, Object r37, Long r38, Object r39, Integer r40, String r41, String r42, String r43, String r44, String r45, String r46, String r47, String r48, String r49, Integer r50, String r51, Object r52, String r53, Boolean r54, Boolean r55, String r56, String r57, String r58, Double r59, String r60, Object r61, Integer r62, String r63, Integer r64, Integer r65, int r66, int r67, DefaultConstructorMarker r68) {
        if ((r66 & 1) == 0) goto L5;
        Double r1 = null;
    L7:
        if ((r66 & 2) == 0) goto L9;
        String r3 = null;
    L10:
        String r5 = "";
        if ((r66 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r66 & 8) == 0) goto L17;
        String r6 = null;
    L19:
        if ((r66 & 16) == 0) goto L21;
        Object r7 = null;
    L23:
        if ((r66 & 32) == 0) goto L25;
        Long r8 = null;
    L27:
        if ((r66 & 64) == 0) goto L29;
        Object r9 = null;
    L31:
        if ((r66 & 128) == 0) goto L33;
        Integer r10 = null;
    L35:
        if ((r66 & 256) == 0) goto L37;
        String r11 = "";
    L39:
        if ((r66 & 512) == 0) goto L41;
        String r12 = null;
    L43:
        if ((r66 & 1024) == 0) goto L45;
        String r13 = null;
    L47:
        if ((r66 & 2048) == 0) goto L49;
        String r14 = null;
    L51:
        if ((r66 & 4096) == 0) goto L53;
        String r15 = "";
    L55:
        if ((r66 & 8192) == 0) goto L57;
        String r2 = null;
    L58:
        Double r310 = r1;
        if ((r66 & 16384) == 0) goto L61;
        String r16 = null;
    L63:
        if ((r66 & 32768) == 0) goto L65;
        String r17 = null;
    L67:
        if ((r66 & 65536) == 0) goto L69;
        String r18 = "";
    L71:
        if ((r66 & 131072) == 0) goto L73;
        Integer r19 = null;
    L75:
        if ((r66 & 262144) == 0) goto L77;
        String r110 = null;
    L79:
        if ((r66 & 524288) == 0) goto L81;
        Object r20 = null;
    L83:
        if ((r66 & 1048576) == 0) goto L85;
        String r21 = null;
    L87:
        if ((r66 & 2097152) == 0) goto L89;
        Boolean r22 = null;
    L91:
        if ((r66 & 4194304) == 0) goto L93;
        Boolean r23 = null;
    L95:
        if ((r66 & 8388608) != 0) goto L99;
        r5 = r56;
    L99:
        if ((r66 & 16777216) == 0) goto L101;
        String r24 = null;
    L103:
        if ((r66 & 33554432) == 0) goto L105;
        String r25 = null;
    L107:
        if ((r66 & 67108864) == 0) goto L109;
        Double r26 = null;
    L111:
        if ((r66 & 134217728) == 0) goto L113;
        String r27 = null;
    L115:
        if ((r66 & 268435456) == 0) goto L117;
        Object r28 = null;
    L119:
        if ((r66 & 536870912) == 0) goto L121;
        Integer r29 = null;
    L123:
        if ((r66 & 1073741824) == 0) goto L125;
        String r30 = null;
    L127:
        if ((r66 & Integer.MIN_VALUE) == 0) goto L129;
        Integer r0 = null;
    L131:
        if ((r67 & 1) == 0) goto L134;
        Integer r69 = null;
    L135:
        this(r310, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r18, r19, r110, r20, r21, r22, r23, r5, r24, r25, r26, r27, r28, r29, r30, r0, r69);
        return;
    L134:
        r69 = r65;
        goto L135
    L129:
        r0 = r64;
        goto L131
    L125:
        r30 = r63;
        goto L127
    L121:
        r29 = r62;
        goto L123
    L117:
        r28 = r61;
        goto L119
    L113:
        r27 = r60;
        goto L115
    L109:
        r26 = r59;
        goto L111
    L105:
        r25 = r58;
        goto L107
    L101:
        r24 = r57;
        goto L103
    L93:
        r23 = r55;
        goto L95
    L89:
        r22 = r54;
        goto L91
    L85:
        r21 = r53;
        goto L87
    L81:
        r20 = r52;
        goto L83
    L77:
        r110 = r51;
        goto L79
    L73:
        r19 = r50;
        goto L75
    L69:
        r18 = r49;
        goto L71
    L65:
        r17 = r48;
        goto L67
    L61:
        r16 = r47;
        goto L63
    L57:
        r2 = r46;
        goto L58
    L53:
        r15 = r45;
        goto L55
    L49:
        r14 = r44;
        goto L51
    L45:
        r13 = r43;
        goto L47
    L41:
        r12 = r42;
        goto L43
    L37:
        r11 = r41;
        goto L39
    L33:
        r10 = r40;
        goto L35
    L29:
        r9 = r39;
        goto L31
    L25:
        r8 = r38;
        goto L27
    L21:
        r7 = r37;
        goto L23
    L17:
        r6 = r36;
        goto L19
    L13:
        r4 = r35;
        goto L15
    L9:
        r3 = r34;
        goto L10
    L5:
        r1 = r33;
        goto L7
    }
}
