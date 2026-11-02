package com.sma.smartv3.util;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.Iii1I;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.m94;
import com.android.mltcode.paycertificationapi.ry0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty0;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AiChatAnswerData;
import com.sma.smartv3.model.AiChatQuestionData;
import com.sma.smartv3.network.GetAIChat;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.util.audio_play.MediaPlayManager;
import com.sma.smartv3.util.tts.ServerTTSStrategy;
import com.sma.smartv3.util.tts.TTSData;
import com.sma.smartv3.util.tts.TTSManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nChatWithQWManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatWithQWManager.kt\ncom/sma/smartv3/util/ChatWithQWManager\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,138:1\n17#2:139\n19#2:143\n46#3:140\n51#3:142\n105#4:141\n*S KotlinDebug\n*F\n+ 1 ChatWithQWManager.kt\ncom/sma/smartv3/util/ChatWithQWManager\n*L\n37#1:139\n37#1:143\n37#1:140\n37#1:142\n37#1:141\n*E\n"})
public final class ChatWithQWManager {
    public long I0IIOi;

    @aa1
    public final MediaPlayManager I0iXXO;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final TTSManager f54894IO;
    public int IiI10X;

    @aa1
    public final ii0iIIX0<AiChatAnswerData> O00;

    @aa1
    public final ServerTTSStrategy OIX0iXi;
    public final long OIi0;

    @aa1
    public final String OXO1 = "ChatWithQWManager";

    @aa1
    public final ty0<Iii1I> XIi00iiXO;

    @aa1
    public final ry0<AiChatAnswerData> XO0O10;
    public final int XOO0ii0;

    /* JADX INFO: renamed from: iO */
    @aa1
    public final k85<Iii1I> f54895iO;

    public ChatWithQWManager() {
        ty0<Iii1I> ty0VarOXO1 = l85.OXO1(Iii1I.XIi00iiXO.OXO1);
        this.XIi00iiXO = ty0VarOXO1;
        this.f54895iO = iX0XiO.XXI(ty0VarOXO1);
        ry0<AiChatAnswerData> ry0VarXIi00iiXO = m94.XIi00iiXO(0, 64, null, 5, null);
        this.XO0O10 = ry0VarXIi00iiXO;
        final l94 l94VarI0iXXO = iX0XiO.I0iXXO(ry0VarXIi00iiXO);
        this.O00 = new ii0iIIX0<AiChatAnswerData>() { // from class: com.sma.smartv3.util.ChatWithQWManager$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.sma.smartv3.util.ChatWithQWManager$special$$inlined$filter$1$2 */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ChatWithQWManager.kt\ncom/sma/smartv3/util/ChatWithQWManager\n*L\n1#1,218:1\n18#2:219\n19#2:221\n37#3:220\n*E\n"})
            public static final class C190472<T> implements IXiXI {

                /* JADX INFO: renamed from: I1 */
                public final /* synthetic */ ChatWithQWManager f54899I1;

                /* JADX INFO: renamed from: IO */
                public final /* synthetic */ IXiXI f54900IO;

                /* JADX INFO: renamed from: com.sma.smartv3.util.ChatWithQWManager$special$$inlined$filter$1$2$1 */
                @DebugMetadata(m39465c = "com.sma.smartv3.util.ChatWithQWManager$special$$inlined$filter$1$2", m39466f = "ChatWithQWManager.kt", m39467i = {0, 0, 0, 0, 0}, m39468l = {219}, m39469m = "emit", m39470n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m39472s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m39473v = 1)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @tb1
                    public final Object invokeSuspend(@aa1 Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C190472.this.emit(null, this);
                    }
                }

                public C190472(IXiXI iXiXI, ChatWithQWManager chatWithQWManager) {
                    this.f54900IO = iXiXI;
                    this.f54899I1 = chatWithQWManager;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // com.android.mltcode.paycertificationapi.IXiXI
                @tb1
                public final Object emit(Object obj, @aa1 Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objI0iXXO = C2798pb.I0iXXO();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.X1ii(obj2);
                        IXiXI iXiXI = this.f54900IO;
                        if (this.f54899I1.IiI10X((AiChatAnswerData) obj)) {
                            anonymousClass1.L$0 = SpillingKt.OXO1(obj);
                            anonymousClass1.L$1 = SpillingKt.OXO1(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.OXO1(obj);
                            anonymousClass1.L$3 = SpillingKt.OXO1(iXiXI);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (iXiXI.emit(obj, anonymousClass1) == objI0iXXO) {
                                return objI0iXXO;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.X1ii(obj2);
                    }
                    return Unit.OXO1;
                }
            }

            @Override // com.android.mltcode.paycertificationapi.ii0iIIX0
            @tb1
            public Object collect(@aa1 IXiXI<? super AiChatAnswerData> iXiXI, @aa1 Continuation continuation) {
                Object objCollect = l94VarI0iXXO.collect(new C190472(iXiXI, this), continuation);
                return objCollect == C2798pb.I0iXXO() ? objCollect : Unit.OXO1;
            }
        };
        this.XOO0ii0 = 5;
        this.OIi0 = 60L;
        this.f54894IO = new TTSManager();
        this.OIX0iXi = new ServerTTSStrategy();
        this.I0iXXO = new MediaPlayManager(null, 1, null);
    }

    @aa1
    public final k85<Iii1I> I0IIOi() {
        return this.f54895iO;
    }

    /* JADX INFO: renamed from: IO */
    public final void m38804IO() {
        this.f54894IO.m38865iO();
    }

    public final boolean IiI10X(AiChatAnswerData aiChatAnswerData) {
        boolean z = true;
        if (System.currentTimeMillis() - this.I0IIOi <= this.OIi0 && aiChatAnswerData.getEnded() != 1 && aiChatAnswerData.getText().length() - this.IiI10X <= this.XOO0ii0) {
            z = false;
        }
        if (z) {
            this.I0IIOi = System.currentTimeMillis();
            this.IiI10X = aiChatAnswerData.getText().length();
        }
        return z;
    }

    @aa1
    public final AiChatQuestionData O00(@aa1 String data) {
        Intrinsics.X0O(data, "data");
        return new AiChatQuestionData(data, false, null, 6, null);
    }

    public final void OIX0iXi(@aa1 AiChatQuestionData chatQuestion) {
        Intrinsics.X0O(chatQuestion, "chatQuestion");
        this.f54894IO.IiI10X(this.OIX0iXi).O00(this.I0iXXO).XO0O10(new TTSData(chatQuestion.getText(), chatQuestion.getModel(), TTSData.TTSType.Server));
    }

    public final void OIi0(@aa1 String data) {
        Intrinsics.X0O(data, "data");
        final AiChatQuestionData aiChatQuestionDataO00 = O00(data);
        final StringBuilder sb = new StringBuilder();
        final Gson gson = new Gson();
        String json = gson.toJson(aiChatQuestionDataO00);
        this.XIi00iiXO.setValue(Iii1I.C2166iO.OXO1);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        Intrinsics.XXI(json);
        NetWorkUtils.postStreamRequest$default(netWorkUtils, GetAIChat.URL, null, json, new O1XIiIO<String>() { // from class: com.sma.smartv3.util.ChatWithQWManager$sendText$1
            /* JADX WARN: Code duplicated, block: B:14:0x0046 A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:3:0x0002, B:5:0x0021, B:9:0x002d, B:10:0x0030, B:15:0x004e, B:13:0x0038, B:14:0x0046, B:17:0x007c, B:19:0x0085, B:22:0x009a, B:23:0x00ac, B:24:0x00c2), top: B:31:0x0002 }] */
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                String strValueOf;
                try {
                    Object objFromJson = gson.fromJson(str, TypeToken.getParameterized(Response.class, AiChatAnswerData.class));
                    Intrinsics.X1ii(objFromJson, "null cannot be cast to non-null type com.sma.androidnetworklib.model.Response<com.sma.smartv3.model.AiChatAnswerData>");
                    Response response = (Response) objFromJson;
                    if (response.getData() != null) {
                        AiChatAnswerData aiChatAnswerData = (AiChatAnswerData) response.getData();
                        if (aiChatAnswerData != null) {
                            StringBuilder sb2 = sb;
                            ChatWithQWManager chatWithQWManager = this;
                            AiChatQuestionData aiChatQuestionData = aiChatQuestionDataO00;
                            sb2.append(aiChatAnswerData.getText());
                            if (aiChatAnswerData.getEnded() == 1) {
                                String string = sb2.toString();
                                Intrinsics.O10IXXX0X(string, "toString(...)");
                                chatWithQWManager.OIX0iXi(AiChatQuestionData.copy$default(aiChatQuestionData, string, false, null, 6, null));
                            }
                            ry0 ry0Var = chatWithQWManager.XO0O10;
                            String string2 = sb2.toString();
                            Intrinsics.O10IXXX0X(string2, "toString(...)");
                            ry0Var.mo3016iO(AiChatAnswerData.copy$default(aiChatAnswerData, string2, 0, null, 6, null));
                        }
                        this.XIi00iiXO.setValue(Iii1I.OXO1.XIi00iiXO.OXO1);
                        return;
                    }
                    int code = response.getCode();
                    if (code == 4006) {
                        strValueOf = String.valueOf(response.getCode());
                    } else if (code != 4009) {
                        switch (code) {
                            case 5001:
                            case 5002:
                            case 5003:
                                strValueOf = String.valueOf(response.getCode());
                                break;
                            default:
                                strValueOf = response.getMesg();
                                break;
                        }
                    } else {
                        ToastUtils.showLong(response.getMesg(), new Object[0]);
                        strValueOf = response.getMesg();
                    }
                    i1O0OXO1O.OXO1.OXO1(this.OXO1 + " Response Message:" + strValueOf);
                    this.XIi00iiXO.setValue(new Iii1I.OXO1.C21828OXO1(strValueOf));
                } catch (Exception e) {
                    e.printStackTrace();
                    if (str == null) {
                        str = "null";
                    }
                    this.XIi00iiXO.setValue(new Iii1I.OXO1.C21828OXO1(str));
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1(this.OXO1 + "  handleError-> error:" + error);
                this.XIi00iiXO.setValue(new Iii1I.OXO1.C21828OXO1(error));
            }
        }, 2, null);
    }

    @aa1
    public final ii0iIIX0<AiChatAnswerData> XOO0ii0() {
        return this.O00;
    }
}
