.class final Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->uploadDeviceInfoToHyky(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHykyModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyModel.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n*L\n1#1,233:1\n771#2,16:234\n802#2:250\n*S KotlinDebug\n*F\n+ 1 HykyModel.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1\n*L\n41#1:234,16\n41#1:250\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.biz.fitness_site.hyky.HykyModel$uploadDeviceInfoToHyky$2$1"
    f = "HykyModel.kt"
    i = {
        0x1,
        0x1,
        0x1
    }
    l = {
        0x21,
        0x26
    }
    m = "invokeSuspend"
    n = {
        "snInfo",
        "deviceID",
        "$i$a$-let-HykyModel$uploadDeviceInfoToHyky$2$1$1"
    }
    s = {
        "L$0",
        "L$2",
        "I$0"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHykyModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyModel.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n*L\n1#1,233:1\n771#2,16:234\n802#2:250\n*S KotlinDebug\n*F\n+ 1 HykyModel.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1\n*L\n41#1:234,16\n41#1:250\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $continuation:Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/coroutines/Continuation<",
            "Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $mac:Ljava/lang/String;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    iput-object p2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->$mac:Ljava/lang/String;

    iput-object p3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->$continuation:Lkotlin/coroutines/Continuation;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->$mac:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->$continuation:Lkotlin/coroutines/Continuation;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v2

    iget v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->label:I

    const/4 v4, 0x2

    if-eqz v3, :cond_2

    if-eq v3, v0, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    iget-object v4, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    move-object v10, v4

    move-object v4, v2

    move-object v2, v10

    move-object v10, v3

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    iget-object v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->$mac:Ljava/lang/String;

    iput v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->label:I

    invoke-virtual {p1, v3, p0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->getSnInfo(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    iget-object v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->$continuation:Lkotlin/coroutines/Continuation;

    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3, v5}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;->deviceInfoExists()Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v3, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;

    const/4 v5, 0x0

    invoke-static {v3, v5, v0, v5}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getDeviceID$default(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_6

    iget-object v5, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->L$1:Ljava/lang/Object;

    iput-object v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->L$2:Ljava/lang/Object;

    iput v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->I$0:I

    iput v4, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->label:I

    invoke-virtual {v5, p0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->refreshToken(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_4

    :goto_1
    return-object v2

    :cond_4
    move-object v2, p1

    move-object p1, v4

    move-object v10, v5

    move-object v4, v3

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_3

    :cond_5
    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    sget-object p1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getDeviceMac(Z)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;->getCmei()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;->getSn()Ljava/lang/String;

    move-result-object v6

    new-instance v2, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadDeviceHYKY$BodyData;

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadDeviceHYKY$BodyData;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1$1$1;

    invoke-direct {p1, v10}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1$1$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;)V

    sget-object v3, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;

    invoke-virtual {v3}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;->getBASE_URL_HYKY()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/ac-health-data/thirdPlatform/userDevice/general/dataReport/deviceSn"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->Companion:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;->getInstance()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->getToken()Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->getTokenType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;->getInstance()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->getToken()Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;->getAccessToken()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v5

    const-string v6, "Authorization"

    invoke-virtual {v5, v6, v4}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addApplicationJsonBody(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    sget-object v3, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v2, v3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v3, Ljava/lang/String;

    aput-object v3, v0, v1

    const-class v1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyResponse;

    invoke-static {v1, v0}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1$invokeSuspend$lambda$0$$inlined$postHyky$1;

    invoke-direct {v1, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1$invokeSuspend$lambda$0$$inlined$postHyky$1;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v2, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
