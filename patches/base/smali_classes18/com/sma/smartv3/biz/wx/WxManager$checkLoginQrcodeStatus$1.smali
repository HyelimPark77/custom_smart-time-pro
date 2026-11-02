.class final Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/wx/WxManager;->iOO1ii1()Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.biz.wx.WxManager$checkLoginQrcodeStatus$1"
    f = "WxManager.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $key:Ljava/lang/String;

.field final synthetic $loginStatus:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;",
            ">;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;->$key:Ljava/lang/String;

    iput-object p2, p0, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;->$loginStatus:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;->$key:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;->$loginStatus:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v1, p0, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;->label:I

    if-nez v1, :cond_8

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    invoke-static {p1}, Lcom/sma/smartv3/biz/wx/WxManager;->I0IIOi(Lcom/sma/smartv3/biz/wx/WxManager;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/androidnetworking/AndroidNetworking;->get(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object p1

    const-string v1, "key"

    iget-object v2, p0, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;->$key:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object p1

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-array v1, v0, [Ljava/lang/reflect/Type;

    const-class v2, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/sma/smartv3/biz/wx/data/WxResponse;

    invoke-static {v2, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest;->executeForParsed(Lcom/google/gson/reflect/TypeToken;)Lcom/androidnetworking/common/ANResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANResponse;->isSuccess()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANResponse;->getResult()Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.biz.wx.data.WxResponse<com.sma.smartv3.biz.wx.data.WxLoginQrCodeStatus>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/biz/wx/data/WxResponse;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WxManager checkLoginQrcodeStatus onResponse -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;->$loginStatus:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/WxResponse;->getData()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/WxResponse;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->getState()I

    move-result v2

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/WxResponse;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->getMsg()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u8bf7\u63d0\u4ea4\u9a8c\u8bc1\u7801\u540e\u767b\u5f55"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Verification:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/WxResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->getState()I

    move-result p1

    if-eqz p1, :cond_4

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    sget-object p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Unknown:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->ExitScanning:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Scanned:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    goto :goto_0

    :cond_3
    sget-object p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Scanning:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    goto :goto_0

    :cond_4
    sget-object p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->NotScanned:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    goto :goto_0

    :cond_5
    sget-object p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Error:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    :goto_0
    iput-object p1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Lcom/androidnetworking/common/ANResponse;->getError()Lcom/androidnetworking/error/ANError;

    move-result-object p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/androidnetworking/error/ANError;->getErrorDetail()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_7
    const/4 p1, 0x0

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WxManager checkLoginQrcodeStatus -> network error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;->$loginStatus:Lkotlin/jvm/internal/Ref$ObjectRef;

    sget-object v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Error:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    iput-object v0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    :goto_2
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
