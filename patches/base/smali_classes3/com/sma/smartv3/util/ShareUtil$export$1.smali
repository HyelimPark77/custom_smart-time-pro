.class final Lcom/sma/smartv3/util/ShareUtil$export$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/ShareUtil;->XOO0ii0(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
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
    c = "com.sma.smartv3.util.ShareUtil$export$1"
    f = "ShareUtil.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x50
    }
    m = "invokeSuspend"
    n = {
        "fileText",
        "fileWriter",
        "file",
        "intent"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3"
    }
    v = 0x1
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $name:Ljava/lang/String;

.field final synthetic $textToExport:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/ShareUtil$export$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->$name:Ljava/lang/String;

    iput-object p2, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->$textToExport:Ljava/lang/String;

    iput-object p3, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->$context:Landroid/content/Context;

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

    new-instance p1, Lcom/sma/smartv3/util/ShareUtil$export$1;

    iget-object v0, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->$name:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->$textToExport:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->$context:Landroid/content/Context;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/sma/smartv3/util/ShareUtil$export$1;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/ShareUtil$export$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/util/ShareUtil$export$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/util/ShareUtil$export$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/ShareUtil$export$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->L$3:Ljava/lang/Object;

    check-cast v0, Landroid/content/Intent;

    iget-object v0, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->L$2:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    iget-object v0, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/io/FileWriter;

    iget-object v0, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    sget-object v1, Lcom/bestmafen/androidbase/io/Location;->EXTERNAL:Lcom/bestmafen/androidbase/io/Location;

    sget-object v3, Lcom/android/mltcode/paycertificationapi/hn1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/hn1$OXO1;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/hn1$OXO1;->O00()Lcom/android/mltcode/paycertificationapi/hn1;

    move-result-object v3

    const-string v4, "share"

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/hn1;->XIi00iiXO(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/hn1;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->$name:Ljava/lang/String;

    invoke-virtual {p1, v1, v3, v4}, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1(Lcom/bestmafen/androidbase/io/Location;Lcom/android/mltcode/paycertificationapi/hn1;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_2
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/io/File;)Z

    new-instance v3, Ljava/io/FileWriter;

    invoke-direct {v3, v1}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    iget-object v4, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->$textToExport:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/Writer;->close()V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/sz0;->XO0O10(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    new-instance v4, Landroid/content/Intent;

    const-string v5, "android.intent.action.SEND"

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v5, "android.intent.extra.TEXT"

    const-string v6, "Share txt"

    invoke-virtual {v4, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v5, "android.intent.extra.STREAM"

    invoke-virtual {v4, v5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v5, "*/*"

    invoke-virtual {v4, v5}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v5, 0x10000000

    invoke-virtual {v4, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->O00()Lcom/android/mltcode/paycertificationapi/g10;

    move-result-object v5

    new-instance v6, Lcom/sma/smartv3/util/ShareUtil$export$1$1;

    iget-object v7, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->$context:Landroid/content/Context;

    const/4 v8, 0x0

    invoke-direct {v6, v7, v4, v8}, Lcom/sma/smartv3/util/ShareUtil$export$1$1;-><init>(Landroid/content/Context;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)V

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->L$0:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->L$1:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->L$2:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->L$3:Ljava/lang/Object;

    iput v2, p0, Lcom/sma/smartv3/util/ShareUtil$export$1;->label:I

    invoke-static {v5, v6, p0}, Lcom/android/mltcode/paycertificationapi/I100X1;->I0IIOi(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v0, :cond_3

    return-object v0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
