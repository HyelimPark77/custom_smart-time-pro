package com.sma.smartv3.biz;

import com.android.mltcode.paycertificationapi.I11X11OX;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.google.gson.Gson;
import com.ironsource.C2985d4;
import com.ironsource.Ne;
import com.sma.smartv3.biz.dcs.DcsData;
import com.sma.smartv3.biz.dcs.DcsStruct;
import com.sma.smartv3.biz.dcs.Directive;
import com.sma.smartv3.biz.dcs.ResponseData;
import com.sma.smartv3.biz.voice.DcsTtsPlayer;
import com.sma.smartv3.biz.voice.VoicePlayer;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.AIFunctionType;
import com.szabh.smable3.component.BleConnector;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class AIManager$duserStreamChat$1 implements O1XIiIO<String> {
    public final /* synthetic */ AIFunctionType OXO1;

    public AIManager$duserStreamChat$1(AIFunctionType r1) {
        this.OXO1 = r1;
    }

    public static /* synthetic */ Unit OXO1(Ref.ObjectRef r0, boolean r1) {
        return iO(r0, r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit iO(Ref.ObjectRef r2, boolean r3) {
        if (r3 == false) goto L5;
        VoicePlayer.play$default(VoicePlayer.INSTANCE, (String) r2.element, null, 2, null);
    L5:
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
    public void XIi00iiXO(String r26) {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1("AIManager duserStreamChat line -> " + r26);
        final Ref.ObjectRef r3 = new Ref.ObjectRef();     // Catch: Exception -> L9
        r3.element = "";     // Catch: Exception -> L9
        JSONObject r4 = new JSONObject(r26);     // Catch: Exception -> L9
        String r5 = r4.getString("type");     // Catch: Exception -> L9
        int r10 = r4.getInt(C2985d4.i.g0);     // Catch: Exception -> L9
        if (Intrinsics.XOO0ii0(r5, Ne.n) == false) goto L25;
        String r17 = ((ResponseData) new Gson().fromJson(r4.getJSONObject("data").toString(), ResponseData.class)).getAnswer();     // Catch: Exception -> L9
        AIAnswer r7 = new AIAnswer(this.OXO1, r17, r10, null, null, 24, null);     // Catch: Exception -> L9
        AIManager r1 = AIManager.OXO1;     // Catch: Exception -> L9
        O1XIiIO<AIAnswer> r6 = r1.iIiiO();     // Catch: Exception -> L9
        if (r6 == null) goto L11;
        r6.handleResponse(r7);     // Catch: Exception -> L9
    L11:
        if (r10 == 1) goto L13;
    L16:
        q62 r8 = q62.OXO1;     // Catch: Exception -> L9
        if (r8.OiX() == true) goto L19;
        return;
    L19:
        if (r1.iX1O1() == true) goto L21;
        return;
    L21:
        if (r17.length() <= r1.IXXOO()) goto L62;
        r1.i11I(r1.IXXOO() + r1.IXXOO());     // Catch: Exception -> L9
        DcsTtsPlayer.play$default(DcsTtsPlayer.INSTANCE, r17, false, r8.OiX(), null, null, "duserStreamChat2", 26, null);     // Catch: Exception -> L9
        return;
    L62:
        return;
    L13:
        if (r1.iX1O1() == false) goto L16;
        DcsTtsPlayer.play$default(DcsTtsPlayer.INSTANCE, r17, false, q62.OXO1.OiX(), null, null, "duserStreamChat", 26, null);     // Catch: Exception -> L9
        return;
    L25:
        if (Intrinsics.XOO0ii0(r5, "dcs") == false) goto L63;
        DcsData r9 = (DcsData) new Gson().fromJson(r4.getJSONObject("data").toString(), DcsData.class);     // Catch: Exception -> L9
        r0.OXO1("AIManager duserStreamChat dcsData -> " + r9);     // Catch: Exception -> L9
        String r18 = r9.getTts().getText();     // Catch: Exception -> L9
        AIAnswer r11 = new AIAnswer(this.OXO1, r18, r10, (String) r3.element, null, 16, null);     // Catch: Exception -> L9
        AIManager r2 = AIManager.OXO1;     // Catch: Exception -> L9
        O1XIiIO<AIAnswer> r12 = r2.iIiiO();     // Catch: Exception -> L9
        if (r12 == null) goto L29;
        r12.handleResponse(r11);     // Catch: Exception -> L9
    L29:
        if (r10 != 1) goto L31;
    L34:
        r2.i11I(r2.IXXOO() + r2.IXXOO());     // Catch: Exception -> L9
        BleConnector.INSTANCE.setDisableStreamLog(true);     // Catch: Exception -> L9
        if (r2.iX1O1() == false) goto L66;
        DcsStruct r13 = (DcsStruct) CollectionsKt___CollectionsKt.OI1O(r9.getDcs(), 0);     // Catch: Exception -> L9
        if (r13 == null) goto L39;
        Directive r14 = r13.getDirective();     // Catch: Exception -> L9
    L40:
        if (r14 != null) goto L42;
        DcsTtsPlayer.play$default(DcsTtsPlayer.INSTANCE, r18, false, q62.OXO1.OiX(), null, null, "dcs3", 26, null);     // Catch: Exception -> L9
        return;
    L42:
        if (Intrinsics.XOO0ii0(r14.getHeader().getName(), "Play") == false) goto L45;
        r3.element = r14.getPayload().getAudioItem().getStream().getUrl();     // Catch: Exception -> L9
        DcsTtsPlayer.play$default(DcsTtsPlayer.INSTANCE, r18, false, q62.OXO1.OiX(), new I11X11OX(r3), null, "dcs1", 18, null);     // Catch: Exception -> L9
        return;
    L45:
        DcsTtsPlayer.play$default(DcsTtsPlayer.INSTANCE, r18, false, q62.OXO1.OiX(), null, null, "dcs2", 26, null);     // Catch: Exception -> L9
        return;
    L39:
        r14 = null;
        goto L40
    L66:
        return;
    L31:
        if (q62.OXO1.OiX() == true) goto L33;
        return;
    L33:
        if (r18.length() > r2.IXXOO()) goto L34;
        return;
    L63:
        return;
    L9:
        e = move-exception;
        e.printStackTrace();
        if (r26 != null) goto L54;
        i1O0OXO1O.OXO1.OXO1("AIManager duserStreamChat -> error: empty");
        O1XIiIO<AIAnswer> r15 = AIManager.OXO1.iIiiO();
        if (r15 == null) goto L57;
        r15.handleError("null");
    L57:
        DcsTtsPlayer.INSTANCE.clearSegmentation();
        return;
    L54:
        O1XIiIO<AIAnswer> r16 = AIManager.OXO1.iIiiO();
        if (r16 == null) goto L57;
        r16.handleError(r26);
        goto L57
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public void handleError(String r5) {
        Intrinsics.X0O(r5, "error");
        AIManager r0 = AIManager.OXO1;
        if (r0.iX1O1() == false) goto L5;
        DcsTtsPlayer.INSTANCE.stop();
    L5:
        i1O0OXO1O.OXO1.OXO1("AIManager duserStreamChat -> error:" + r5);
        O1XIiIO<AIAnswer> r1 = r0.iIiiO();
        if (r1 == null) goto L9;
        r1.handleError(r5);
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public /* bridge */ /* synthetic */ void handleResponse(String r1) {
        XIi00iiXO(r1);
    }
}
