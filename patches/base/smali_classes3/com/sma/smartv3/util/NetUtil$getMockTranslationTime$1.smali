.class final Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/NetUtil;->XIi00iiXO()Lcom/android/mltcode/paycertificationapi/ii0iIIX0;
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
        "Lcom/sma/smartv3/util/websocket/data/TranslationTime;",
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
    value = "SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getMockTranslationTime$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n19#2:165\n15#2:166\n16#3,6:167\n23#3,6:174\n1#4:173\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getMockTranslationTime$1\n*L\n47#1:165\n47#1:166\n51#1:167,6\n51#1:174,6\n51#1:173\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.util.NetUtil$getMockTranslationTime$1"
    f = "NetUtil.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x31,
        0x33,
        0x34
    }
    m = "invokeSuspend"
    n = {
        "$this$flow",
        "appUser",
        "$this$flow",
        "appUser",
        "$completion",
        "$i$f$safeApiCall",
        "$i$a$-safeApiCall-NetUtil$getMockTranslationTime$1$result$1",
        "$this$flow",
        "appUser",
        "result"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2",
        "I$0",
        "I$1",
        "L$0",
        "L$1",
        "L$2"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getMockTranslationTime$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n19#2:165\n15#2:166\n16#3,6:167\n23#3,6:174\n1#4:173\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getMockTranslationTime$1\n*L\n47#1:165\n47#1:166\n51#1:167,6\n51#1:174,6\n51#1:173\n*E\n"
    }
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field private synthetic L$0:Ljava/lang/Object;

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
            "Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance v0, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;

    invoke-direct {v0, p2}, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;-><init>(Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->L$0:Ljava/lang/Object;

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
            "Lcom/sma/smartv3/util/websocket/data/TranslationTime;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/IXiXI;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->invoke(Lcom/android/mltcode/paycertificationapi/IXiXI;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39

    move-object/from16 v3, p0

    iget-object v0, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->L$0:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/android/mltcode/paycertificationapi/IXiXI;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v7

    iget v0, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->label:I

    const/4 v8, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v8, :cond_0

    iget-object v0, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lcom/sma/smartv3/util/net/NetResult;

    iget-object v1, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/sma/smartv3/model/AppUser;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    iget-object v0, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->L$1:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/sma/smartv3/model/AppUser;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/net/http/HttpException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v0, p1

    goto/16 :goto_2

    :catch_0
    move-exception v0

    goto/16 :goto_4

    :catch_1
    move-exception v0

    goto/16 :goto_6

    :cond_2
    iget-object v0, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/sma/smartv3/model/AppUser;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v9, Lcom/sma/smartv3/model/AppUser;

    const v37, 0x7ffffff

    const/16 v38, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v9 .. v38}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    const-class v5, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    move-object v9, v0

    :goto_0
    move-object v0, v9

    check-cast v0, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_5

    new-instance v4, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    const-string v5, "User is not login"

    invoke-direct {v4, v5}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    iput-object v6, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->L$0:Ljava/lang/Object;

    iput-object v0, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->L$1:Ljava/lang/Object;

    iput v2, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->label:I

    invoke-interface {v6, v4, v3}, Lcom/android/mltcode/paycertificationapi/IXiXI;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_5

    goto/16 :goto_8

    :cond_5
    :goto_1
    move-object v9, v0

    :try_start_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1000;->OXO1:Lcom/android/mltcode/paycertificationapi/i1000;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i1000;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/iIX01Oi;

    move-result-object v0

    invoke-virtual {v9}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v2

    iput-object v6, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->L$0:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->L$1:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->L$2:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->I$0:I

    iput v4, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->I$1:I

    iput v1, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->label:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/iIX01Oi;->I0iXXO(Lcom/android/mltcode/paycertificationapi/iIX01Oi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Landroid/net/http/HttpException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    if-ne v0, v7, :cond_6

    goto/16 :goto_8

    :cond_6
    move-object v1, v9

    :goto_2
    :try_start_2
    check-cast v0, Lcom/sma/smartv3/util/net/ApiResponse;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/net/ApiResponse;->isSuccess()Z

    move-result v2

    if-eqz v2, :cond_7

    new-instance v2, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/net/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;-><init>(Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v0}, Lcom/sma/smartv3/util/net/ApiResponse;->getMesg()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_8

    const-string v0, "Business Error"

    :cond_8
    new-instance v2, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-direct {v2, v0}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/net/http/HttpException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_3
    move-object v0, v2

    goto :goto_7

    :catch_2
    move-exception v0

    move-object v1, v9

    goto :goto_4

    :catch_3
    move-object v1, v9

    goto :goto_5

    :catch_4
    move-exception v0

    move-object v1, v9

    goto :goto_6

    :goto_4
    new-instance v2, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_9

    const-string v0, "Unknown Error"

    :cond_9
    invoke-direct {v2, v0}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :catch_5
    :goto_5
    new-instance v0, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    const-string v2, "Network Error"

    invoke-direct {v0, v2}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :goto_6
    new-instance v2, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/o51;->OXO1(Landroid/net/http/HttpException;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Http "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_7
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->L$0:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->L$1:Ljava/lang/Object;

    iput-object v0, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->L$2:Ljava/lang/Object;

    iput v8, v3, Lcom/sma/smartv3/util/NetUtil$getMockTranslationTime$1;->label:I

    invoke-interface {v6, v0, v3}, Lcom/android/mltcode/paycertificationapi/IXiXI;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_a

    :goto_8
    return-object v7

    :cond_a
    :goto_9
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "TranslationTime Result :"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method
