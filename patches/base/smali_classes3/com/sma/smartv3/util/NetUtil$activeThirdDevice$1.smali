.class final Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/NetUtil;->OXO1(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/ii0iIIX0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/mltcode/paycertificationapi/IXiXI<",
        "-",
        "Lcom/sma/smartv3/util/net/NetResult<",
        "+",
        "Lcom/sma/smartv3/dto/ThirdPartyDeviceData;",
        ">;>;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$activeThirdDevice$1\n+ 2 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n16#2,6:165\n23#2,6:172\n1#3:171\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$activeThirdDevice$1\n*L\n149#1:165,6\n149#1:172,6\n149#1:171\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.util.NetUtil$activeThirdDevice$1"
    f = "NetUtil.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x95,
        0x96
    }
    m = "invokeSuspend"
    n = {
        "$this$flow",
        "$completion",
        "$i$f$safeApiCall",
        "$i$a$-safeApiCall-NetUtil$activeThirdDevice$1$result$1",
        "$this$flow",
        "result"
    }
    s = {
        "L$0",
        "L$1",
        "I$0",
        "I$1",
        "L$0",
        "L$1"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$activeThirdDevice$1\n+ 2 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n16#2,6:165\n23#2,6:172\n1#3:171\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$activeThirdDevice$1\n*L\n149#1:165,6\n149#1:172,6\n149#1:171\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $text:Ljava/lang/String;

.field I$0:I

.field I$1:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->$text:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v0, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;

    iget-object v1, p0, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->$text:Ljava/lang/String;

    invoke-direct {v0, v1, p2}, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lcom/android/mltcode/paycertificationapi/IXiXI;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/IXiXI<",
            "-",
            "Lcom/sma/smartv3/util/net/NetResult<",
            "Lcom/sma/smartv3/dto/ThirdPartyDeviceData;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/IXiXI;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->invoke(Lcom/android/mltcode/paycertificationapi/IXiXI;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/android/mltcode/paycertificationapi/IXiXI;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v2

    iget v0, p0, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v4, :cond_1

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/sma/smartv3/util/net/NetResult;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    move-object v7, p0

    goto/16 :goto_8

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/net/http/HttpException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v7, p0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v7, p0

    goto/16 :goto_3

    :catch_1
    move-object v7, p0

    goto/16 :goto_4

    :catch_2
    move-exception v0

    move-object p1, v0

    move-object v7, p0

    goto/16 :goto_5

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object v5, p0, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->$text:Ljava/lang/String;

    :try_start_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1000;->OXO1:Lcom/android/mltcode/paycertificationapi/i1000;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i1000;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/iIX01Oi;

    move-result-object p1

    iput-object v1, p0, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->L$0:Ljava/lang/Object;

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->L$1:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->I$0:I

    iput v0, p0, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->I$1:I

    iput v4, p0, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->label:I
    :try_end_1
    .catch Landroid/net/http/HttpException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5

    const/4 v6, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object v7, p0

    move-object v4, p1

    :try_start_2
    invoke-static/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/iIX01Oi;->OIi0(Lcom/android/mltcode/paycertificationapi/iIX01Oi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    goto/16 :goto_7

    :cond_3
    :goto_0
    check-cast p1, Lcom/sma/smartv3/util/net/ApiResponse;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/net/ApiResponse;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/net/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;-><init>(Ljava/lang/Object;)V

    goto :goto_6

    :catch_3
    move-exception v0

    :goto_1
    move-object p1, v0

    goto :goto_3

    :catch_4
    move-exception v0

    :goto_2
    move-object p1, v0

    goto :goto_5

    :cond_4
    invoke-virtual {p1}, Lcom/sma/smartv3/util/net/ApiResponse;->getMesg()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_5

    const-string p1, "Business Error"

    :cond_5
    new-instance v0, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/net/http/HttpException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_6

    :catch_5
    move-exception v0

    move-object v7, p0

    goto :goto_1

    :catch_6
    move-exception v0

    move-object v7, p0

    goto :goto_2

    :goto_3
    new-instance v0, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_6

    const-string p1, "Unknown Error"

    :cond_6
    invoke-direct {v0, p1}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :catch_7
    :goto_4
    new-instance v0, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    const-string p1, "Network Error"

    invoke-direct {v0, p1}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :goto_5
    new-instance v0, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/o51;->OXO1(Landroid/net/http/HttpException;)Ljava/lang/String;

    move-result-object p1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Http "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    :goto_6
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v7, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->L$0:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v7, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->L$1:Ljava/lang/Object;

    iput v3, v7, Lcom/sma/smartv3/util/NetUtil$activeThirdDevice$1;->label:I

    invoke-interface {v1, v0, p0}, Lcom/android/mltcode/paycertificationapi/IXiXI;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_7

    :goto_7
    return-object v2

    :cond_7
    :goto_8
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
