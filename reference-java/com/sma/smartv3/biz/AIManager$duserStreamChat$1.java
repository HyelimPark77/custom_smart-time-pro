package com.sma.smartv3.biz;

import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.google.gson.Gson;
import com.ironsource.C12056Ne;
import com.ironsource.C12616d4;
import com.sma.smartv3.biz.AIManager$duserStreamChat$1;
import com.sma.smartv3.biz.dcs.DcsData;
import com.sma.smartv3.biz.dcs.DcsStruct;
import com.sma.smartv3.biz.dcs.Directive;
import com.sma.smartv3.biz.dcs.ResponseData;
import com.sma.smartv3.biz.voice.DcsTtsPlayer;
import com.sma.smartv3.biz.voice.VoicePlayer;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.AIFunctionType;
import com.szabh.smable3.component.BleConnector;
import java.io.IOException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class AIManager$duserStreamChat$1 implements O1XIiIO<String> {
    public final /* synthetic */ AIFunctionType OXO1;

    public AIManager$duserStreamChat$1(AIFunctionType aIFunctionType) {
        this.OXO1 = aIFunctionType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: iO */
    public static final Unit m38072iO(Ref.ObjectRef objectRef, boolean z) throws IOException {
        if (z) {
            VoicePlayer.play$default(VoicePlayer.INSTANCE, (String) objectRef.element, null, 2, null);
        }
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
    public void handleResponse(String str) {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("AIManager duserStreamChat line -> " + str);
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            int i = jSONObject.getInt(C12616d4.i.f34369g0);
            if (Intrinsics.XOO0ii0(string, C12056Ne.f29563n)) {
                String answer = ((ResponseData) new Gson().fromJson(jSONObject.getJSONObject("data").toString(), ResponseData.class)).getAnswer();
                AIAnswer aIAnswer = new AIAnswer(this.OXO1, answer, i, null, null, 24, null);
                AIManager aIManager = AIManager.OXO1;
                O1XIiIO<AIAnswer> o1XIiIOIIiiO = aIManager.iIiiO();
                if (o1XIiIOIIiiO != null) {
                    o1XIiIOIIiiO.handleResponse(aIAnswer);
                }
                if (i == 1 && aIManager.iX1O1()) {
                    DcsTtsPlayer.play$default(DcsTtsPlayer.INSTANCE, answer, false, q62.OXO1.OiX(), null, null, "duserStreamChat", 26, null);
                    return;
                }
                q62 q62Var = q62.OXO1;
                if (q62Var.OiX() && aIManager.iX1O1() && answer.length() > aIManager.IXXOO()) {
                    aIManager.i11I(aIManager.IXXOO() + aIManager.IXXOO());
                    DcsTtsPlayer.play$default(DcsTtsPlayer.INSTANCE, answer, false, q62Var.OiX(), null, null, "duserStreamChat2", 26, null);
                    return;
                }
                return;
            }
            if (Intrinsics.XOO0ii0(string, "dcs")) {
                DcsData dcsData = (DcsData) new Gson().fromJson(jSONObject.getJSONObject("data").toString(), DcsData.class);
                i1o0oxo1o.OXO1("AIManager duserStreamChat dcsData -> " + dcsData);
                String text = dcsData.getTts().getText();
                AIAnswer aIAnswer2 = new AIAnswer(this.OXO1, text, i, (String) objectRef.element, null, 16, null);
                AIManager aIManager2 = AIManager.OXO1;
                O1XIiIO<AIAnswer> o1XIiIOIIiiO2 = aIManager2.iIiiO();
                if (o1XIiIOIIiiO2 != null) {
                    o1XIiIOIIiiO2.handleResponse(aIAnswer2);
                }
                if (i == 1 || (q62.OXO1.OiX() && text.length() > aIManager2.IXXOO())) {
                    aIManager2.i11I(aIManager2.IXXOO() + aIManager2.IXXOO());
                    BleConnector.INSTANCE.setDisableStreamLog(true);
                    if (aIManager2.iX1O1()) {
                        DcsStruct dcsStruct = (DcsStruct) CollectionsKt___CollectionsKt.OI1O(dcsData.getDcs(), 0);
                        Directive directive = dcsStruct != null ? dcsStruct.getDirective() : null;
                        if (directive == null) {
                            DcsTtsPlayer.play$default(DcsTtsPlayer.INSTANCE, text, false, q62.OXO1.OiX(), null, null, "dcs3", 26, null);
                        } else if (!Intrinsics.XOO0ii0(directive.getHeader().getName(), "Play")) {
                            DcsTtsPlayer.play$default(DcsTtsPlayer.INSTANCE, text, false, q62.OXO1.OiX(), null, null, "dcs2", 26, null);
                        } else {
                            objectRef.element = directive.getPayload().getAudioItem().getStream().getUrl();
                            DcsTtsPlayer.play$default(DcsTtsPlayer.INSTANCE, text, false, q62.OXO1.OiX(), new Function1() { // from class: com.android.mltcode.paycertificationapi.I11X11OX
                                @Override // kotlin.jvm.functions.Function1
                                /* JADX INFO: renamed from: invoke */
                                public final Object invoke2(Object obj) {
                                    return AIManager$duserStreamChat$1.m38072iO(objectRef, ((Boolean) obj).booleanValue());
                                }
                            }, null, "dcs1", 18, null);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (str == null) {
                i1O0OXO1O.OXO1.OXO1("AIManager duserStreamChat -> error: empty");
                O1XIiIO<AIAnswer> o1XIiIOIIiiO3 = AIManager.OXO1.iIiiO();
                if (o1XIiIOIIiiO3 != null) {
                    o1XIiIOIIiiO3.handleError("null");
                }
            } else {
                O1XIiIO<AIAnswer> o1XIiIOIIiiO4 = AIManager.OXO1.iIiiO();
                if (o1XIiIOIIiiO4 != null) {
                    o1XIiIOIIiiO4.handleError(str);
                }
            }
            DcsTtsPlayer.INSTANCE.clearSegmentation();
        }
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public void handleError(String error) {
        Intrinsics.X0O(error, "error");
        AIManager aIManager = AIManager.OXO1;
        if (aIManager.iX1O1()) {
            DcsTtsPlayer.INSTANCE.stop();
        }
        i1O0OXO1O.OXO1.OXO1("AIManager duserStreamChat -> error:" + error);
        O1XIiIO<AIAnswer> o1XIiIOIIiiO = aIManager.iIiiO();
        if (o1XIiIOIIiiO != null) {
            o1XIiIOIIiiO.handleError(error);
        }
    }
}
