.class final Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/NetUtil;->XO0O10(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    value = "SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2\n+ 2 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n16#2,6:165\n23#2,6:172\n1#3:171\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2\n*L\n119#1:165,6\n119#1:172,6\n119#1:171\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.util.NetUtil$getThirdDeviceInfo$2"
    f = "NetUtil.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x77
    }
    m = "invokeSuspend"
    n = {
        "bleInfo",
        "mac",
        "$completion",
        "$i$f$safeApiCall",
        "$i$a$-safeApiCall-NetUtil$getThirdDeviceInfo$2$result$1"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "I$0",
        "I$1"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2\n+ 2 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n16#2,6:165\n23#2,6:172\n1#3:171\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2\n*L\n119#1:165,6\n119#1:172,6\n119#1:171\n*E\n"
    }
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 0
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

    new-instance p1, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;

    invoke-direct {p1, p2}, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;-><init>(Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;->L$2:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    iget-object v0, p0, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/sma/smartv3/dto/OXO1;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/net/http/HttpException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_2

    :catch_1
    move-exception v0

    move-object p1, v0

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    :try_start_1
    sget-object p1, Lcom/sma/smartv3/dto/OXO1;->I0iXXO:Lcom/sma/smartv3/dto/OXO1$OXO1;

    invoke-virtual {p1}, Lcom/sma/smartv3/dto/OXO1$OXO1;->XIi00iiXO()Lcom/sma/smartv3/dto/OXO1;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/sma/smartv3/dto/OXO1;->XiOIii1()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    const-string v5, ":"

    const-string v6, ""

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_0

    :catch_2
    move-exception v0

    move-object p1, v0

    goto/16 :goto_5

    :cond_2
    :goto_0
    const-string p1, ""
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :cond_3
    :try_start_2
    sget-object v4, Lcom/android/mltcode/paycertificationapi/i1000;->OXO1:Lcom/android/mltcode/paycertificationapi/i1000;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/i1000;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/iIX01Oi;

    move-result-object v4

    iput-object v1, p0, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;->L$0:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;->L$1:Ljava/lang/Object;

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;->L$2:Ljava/lang/Object;

    iput v3, p0, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;->I$0:I

    iput v3, p0, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;->I$1:I

    iput v2, p0, Lcom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2;->label:I

    invoke-interface {v4, p1, p0}, Lcom/android/mltcode/paycertificationapi/iIX01Oi;->OXO1(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    check-cast p1, Lcom/sma/smartv3/util/net/ApiResponse;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/net/ApiResponse;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/net/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;-><init>(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Lcom/sma/smartv3/util/net/ApiResponse;->getMesg()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_6

    const-string p1, "Business Error"

    :cond_6
    new-instance v0, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/net/http/HttpException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :goto_2
    :try_start_3
    new-instance v0, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_7

    const-string p1, "Unknown Error"

    :cond_7
    invoke-direct {v0, p1}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :catch_3
    new-instance v0, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    const-string p1, "Network Error"

    invoke-direct {v0, p1}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    new-instance v0, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/o51;->OXO1(Landroid/net/http/HttpException;)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Http "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    :goto_4
    instance-of p1, v0, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    if-eqz p1, :cond_8

    check-cast v0, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/net/NetResult$OXO1;->XO0O10()Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_6

    :cond_8
    instance-of p1, v0, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;

    if-eqz p1, :cond_a

    if-eqz v1, :cond_9

    move-object p1, v0

    check-cast p1, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;->XO0O10()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/dto/ThirdPartyDeviceData;

    invoke-virtual {v1, p1}, Lcom/sma/smartv3/dto/OXO1;->i010I(Lcom/sma/smartv3/dto/ThirdPartyDeviceData;)V

    :cond_9
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    check-cast v0, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;->XO0O10()Ljava/lang/Object;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ThirdDeviceInfo:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto :goto_6

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :goto_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_6
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
