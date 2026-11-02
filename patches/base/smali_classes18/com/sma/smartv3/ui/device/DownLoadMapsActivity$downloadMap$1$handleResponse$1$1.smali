.class final Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.device.DownLoadMapsActivity$downloadMap$1$handleResponse$1$1"
    f = "DownLoadMapsActivity.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $mFileName:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;->$mFileName:Ljava/lang/String;

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

    new-instance p1, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;->$mFileName:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    new-instance p1, Ljava/io/File;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMapDir()Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;->$mFileName:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsDir(Ljava/io/File;)Z

    new-instance p1, Ljava/io/File;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMapDir()Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;->$mFileName:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".zip"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMapDir()Ljava/io/File;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1$handleResponse$1$1;->$mFileName:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ZipUtils;->unzipFile(Ljava/io/File;Ljava/io/File;)Ljava/util/List;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
