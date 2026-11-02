.class public final Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHykyModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyModel.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyModel\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,233:1\n126#2,11:234\n146#2:253\n176#2,11:256\n196#2:275\n771#2,16:276\n802#2:292\n200#3,7:245\n218#3:252\n252#3,7:267\n270#3:274\n11#4,2:254\n*S KotlinDebug\n*F\n+ 1 HykyModel.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyModel\n*L\n68#1:234,11\n68#1:253\n143#1:256,11\n143#1:275\n209#1:276,16\n209#1:292\n68#1:245,7\n68#1:252\n143#1:267,7\n143#1:274\n135#1:254,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHykyModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyModel.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyModel\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,233:1\n126#2,11:234\n146#2:253\n176#2,11:256\n196#2:275\n771#2,16:276\n802#2:292\n200#3,7:245\n218#3:252\n252#3,7:267\n270#3:274\n11#4,2:254\n*S KotlinDebug\n*F\n+ 1 HykyModel.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyModel\n*L\n68#1:234,11\n68#1:253\n143#1:256,11\n143#1:275\n209#1:276,16\n209#1:292\n68#1:245,7\n68#1:252\n143#1:267,7\n143#1:274\n135#1:254,2\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final scope:Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, Lcom/android/mltcode/paycertificationapi/ng5;->iO(Lkotlinx/coroutines/XiOIO;ILjava/lang/Object;)Lkotlinx/coroutines/O00;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->scope:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    const-string v0, "HykyModel"

    iput-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->TAG:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->TAG:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final bindDevice(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 15
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move/from16 v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-instance v3, Lkotlin/coroutines/SafeContinuation;

    invoke-static/range {p6 .. p6}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v4

    invoke-direct {v3, v4}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    sget-object v4, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;

    move-object/from16 v11, p3

    invoke-virtual {v4, v11}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getDeviceID(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_1

    sget-object v4, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    if-eqz v0, :cond_0

    move v12, v2

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    move v12, v4

    :goto_0
    new-instance v5, Lcom/sma/smartv3/biz/fitness_site/hyky/BindDeviceHYKY$BodyData;

    const/4 v13, 0x2

    const/4 v14, 0x0

    const/4 v7, 0x0

    move-object/from16 v6, p2

    move-object/from16 v10, p4

    move-object/from16 v9, p5

    invoke-direct/range {v5 .. v14}, Lcom/sma/smartv3/biz/fitness_site/hyky/BindDeviceHYKY$BodyData;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDevice$2$1$1;

    invoke-direct {v4, p0, v0, v3}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDevice$2$1$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;ZLkotlin/coroutines/Continuation;)V

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;->getBASE_URL_HYKY()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/ac-health-data/thirdPlatform/userDevice/general/bindState"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v6, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->Companion:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;

    invoke-virtual {v6}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;->getInstance()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    move-result-object v7

    invoke-virtual {v7}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->getToken()Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    move-result-object v7

    invoke-virtual {v7}, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->getTokenType()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;->getInstance()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    move-result-object v6

    invoke-virtual {v6}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->getToken()Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    move-result-object v6

    invoke-virtual {v6}, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->getAccessToken()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " "

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v7

    const-string v8, "Authorization"

    invoke-virtual {v7, v8, v6}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addApplicationJsonBody(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v5, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v5}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/reflect/Type;

    const-class v5, Ljava/lang/String;

    aput-object v5, v2, v1

    const-class v1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyResponse;

    invoke-static {v1, v2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDevice$lambda$0$0$$inlined$postHyky$1;

    invoke-direct {v2, v4}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDevice$lambda$0$0$$inlined$postHyky$1;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    goto :goto_1

    :cond_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v3}, Lkotlin/coroutines/SafeContinuation;->XIi00iiXO()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    invoke-static/range {p6 .. p6}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_2
    return-object v0
.end method

.method public final bindDeviceToHyky(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p6, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;

    iget v1, v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->label:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;

    invoke-direct {v0, p0, p6}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;Lkotlin/coroutines/Continuation;)V

    goto :goto_0

    :goto_1
    iget-object p6, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v4, :cond_2

    if-ne v1, v3, :cond_1

    iget-object p1, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p6}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    return-object p6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p1, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->Z$0:Z

    iget-object p2, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$3:Ljava/lang/Object;

    move-object p5, p2

    check-cast p5, Ljava/lang/String;

    iget-object p2, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$2:Ljava/lang/Object;

    move-object p4, p2

    check-cast p4, Ljava/lang/String;

    iget-object p2, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$1:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Ljava/lang/String;

    iget-object p2, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$0:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-static {p6}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    :cond_3
    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    goto :goto_2

    :cond_4
    invoke-static {p6}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    sget-object p6, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->TAG:Ljava/lang/String;

    sget-object v5, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/q62;->iIIX0XI()Z

    move-result v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " bindDevice : "

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p6, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/q62;->iIIX0XI()Z

    move-result p6

    if-eqz p6, :cond_b

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p6

    if-nez p6, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p6

    if-nez p6, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result p6

    if-nez p6, :cond_7

    goto :goto_4

    :cond_7
    invoke-interface {p5}, Ljava/lang/CharSequence;->length()I

    move-result p6

    if-nez p6, :cond_8

    goto :goto_4

    :cond_8
    iput-object p2, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$0:Ljava/lang/Object;

    iput-object p3, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$1:Ljava/lang/Object;

    iput-object p4, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$2:Ljava/lang/Object;

    iput-object p5, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$3:Ljava/lang/Object;

    iput-boolean p1, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->Z$0:Z

    iput v4, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->label:I

    invoke-virtual {p0, v7}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->refreshToken(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p6

    if-ne p6, v0, :cond_3

    goto :goto_3

    :goto_2
    check-cast p6, Ljava/lang/Boolean;

    invoke-virtual {p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_9

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_9
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$0:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$1:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$2:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->L$3:Ljava/lang/Object;

    iput-boolean p1, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->Z$0:Z

    iput v3, v7, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDeviceToHyky$1;->label:I

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    invoke-virtual/range {v1 .. v7}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->bindDevice(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    :goto_3
    return-object v0

    :cond_a
    return-object p1

    :cond_b
    :goto_4
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final checkAuthStatus(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlin/coroutines/SafeContinuation;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    const-string v2, "projectId"

    const-string v3, "58"

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->OXO1(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const-string v3, "phone"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->OXO1(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    filled-new-array {v2, p1}, [Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/OXO1;->XXX11i([Lkotlin/Pair;)Ljava/util/HashMap;

    move-result-object p1

    new-instance v2, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$checkAuthStatus$2$1;

    invoke-direct {v2, p0, v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$checkAuthStatus$2$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;Lkotlin/coroutines/Continuation;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v4

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/kangyang/auth/get"

    invoke-virtual {v1, v5, v6}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7, p1}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v5, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$checkAuthStatus$lambda$0$$inlined$post$default$1;

    invoke-direct {v5, v3, v2, v4}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$checkAuthStatus$lambda$0$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Lcom/sma/smartv3/network/GetAuthStatusHYKY$ResStatus;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v2, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$checkAuthStatus$lambda$0$$inlined$post$default$2;

    invoke-direct {v2, v5}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$checkAuthStatus$lambda$0$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    invoke-virtual {v0}, Lkotlin/coroutines/SafeContinuation;->XIi00iiXO()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method

.method public final getScope()Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->scope:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    return-object v0
.end method

.method public final getSnInfo(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlin/coroutines/SafeContinuation;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    const-string v2, "mac"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->OXO1(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    filled-new-array {p1}, [Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/OXO1;->XXX11i([Lkotlin/Pair;)Ljava/util/HashMap;

    move-result-object p1

    new-instance v2, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$getSnInfo$2$1;

    invoke-direct {v2, p0, v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$getSnInfo$2$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;Lkotlin/coroutines/Continuation;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v4

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/kangyang/get/3code"

    invoke-virtual {v1, v5, v6}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7, p1}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v5, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$getSnInfo$lambda$0$$inlined$get$default$1;

    invoke-direct {v5, v3, v2, v4}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$getSnInfo$lambda$0$$inlined$get$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->get(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->addQueryParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object p1

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v2, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$getSnInfo$lambda$0$$inlined$get$default$2;

    invoke-direct {v2, v5}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$getSnInfo$lambda$0$$inlined$get$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    invoke-virtual {v0}, Lkotlin/coroutines/SafeContinuation;->XIi00iiXO()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method

.method public final refreshToken(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x1

    const-class v1, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    new-instance v2, Lkotlin/coroutines/SafeContinuation;

    invoke-static {p1}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v3

    invoke-direct {v2, v3}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->iIIX0XI()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " refreshToken : return"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    sget-object v3, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->Companion:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;

    invoke-virtual {v3}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;->getInstance()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->getToken()Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->isExpired()Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " refreshToken : token\u672a\u8fc7\u671f return"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_1
    iget-object v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->TAG:Ljava/lang/String;

    const-string v5, "refreshToken"

    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v3, 0x0

    :try_start_0
    sget-object v5, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;

    invoke-virtual {v5}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;->getBASE_URL_HYKY()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/ac-health-user/oauth/token"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v5

    const-string v6, "HykyManager getToken"

    invoke-virtual {v5, v6}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v5

    sget-object v6, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v5, v6}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v5

    invoke-virtual {v5}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v5

    const-class v6, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyResponse;

    new-array v7, v0, [Ljava/lang/reflect/Type;

    aput-object v1, v7, v4

    invoke-static {v6, v7}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/androidnetworking/common/ANRequest;->executeForParsed(Lcom/google/gson/reflect/TypeToken;)Lcom/androidnetworking/common/ANResponse;

    move-result-object v5

    sget-object v6, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v7, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->TAG:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " refreshToken : response = "

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v5}, Lcom/androidnetworking/common/ANResponse;->isSuccess()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5}, Lcom/androidnetworking/common/ANResponse;->getResult()Ljava/lang/Object;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type com.sma.smartv3.biz.fitness_site.hyky.HykyResponse<com.sma.smartv3.biz.fitness_site.hyky.GetTokenHYKY.HykyTokenData>"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v5

    :catch_0
    :cond_2
    sget-object v5, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v6, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " refreshToken : newToken = "

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyResponse;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    if-eqz v3, :cond_3

    sget-object v4, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->Companion:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;->getInstance()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->setToken(Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;)V

    sget-object v4, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v4

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v5, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v1, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v2}, Lkotlin/coroutines/SafeContinuation;->XIi00iiXO()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_4

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_4
    return-object v0
.end method

.method public final uploadDeviceInfoToHyky(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlin/coroutines/SafeContinuation;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->scope:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v5, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;

    const/4 v1, 0x0

    invoke-direct {v5, p0, p1, v0, v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    invoke-virtual {v0}, Lkotlin/coroutines/SafeContinuation;->XIi00iiXO()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method
