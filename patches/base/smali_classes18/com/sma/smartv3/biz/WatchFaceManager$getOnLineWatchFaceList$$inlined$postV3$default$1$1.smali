.class public final Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    value = "SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,925:1\n1#2:926\n315#3,2:927\n317#3,8:930\n325#3,13:939\n352#3:952\n216#4:929\n217#4:938\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1\n*L\n210#1:927,2\n210#1:930,8\n210#1:939,13\n210#1:952\n210#1:929\n210#1:938\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.network.NetWorkUtils$postV3$1$1"
    f = "NetWorkUtils.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,925:1\n1#2:926\n315#3,2:927\n317#3,8:930\n325#3,13:939\n352#3:952\n216#4:929\n217#4:938\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1\n*L\n210#1:927,2\n210#1:930,8\n210#1:939,13\n210#1:952\n210#1:929\n210#1:938\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $body:Ljava/util/Map;

.field final synthetic $callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

.field final synthetic $headers:Ljava/util/Map;

.field final synthetic $url:Ljava/lang/String;

.field final synthetic $weakActivity:Ljava/lang/ref/WeakReference;

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/ref/WeakReference;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$url:Ljava/lang/String;

    iput-object p2, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$body:Ljava/util/Map;

    iput-object p3, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$headers:Ljava/util/Map;

    iput-object p4, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$weakActivity:Ljava/lang/ref/WeakReference;

    iput-object p5, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;

    iget-object v1, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$url:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$body:Ljava/util/Map;

    iget-object v3, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$headers:Ljava/util/Map;

    iget-object v4, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$weakActivity:Ljava/lang/ref/WeakReference;

    iget-object v5, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/ref/WeakReference;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lkotlin/coroutines/Continuation;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v0, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->label:I

    if-nez v0, :cond_5

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    sget-object v0, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v0}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$url:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$url:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$body:Ljava/util/Map;

    invoke-static {v2}, Lkotlin/collections/OXO1;->X111IO(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$headers:Ljava/util/Map;

    invoke-interface {v2, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-virtual {p1, v1, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object p1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    iget-object p1, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$url:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$headers:Ljava/util/Map;

    iget-object v1, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$body:Ljava/util/Map;

    new-instance v2, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1;

    iget-object v3, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$weakActivity:Ljava/lang/ref/WeakReference;

    iget-object v4, p0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1;->$callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-direct {v2, v3, v4}, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1;-><init>(Ljava/lang/ref/WeakReference;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    new-instance v3, Lokhttp3/FormBody$Builder;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v3, v5, v4, v5}, Lokhttp3/FormBody$Builder;-><init>(Ljava/nio/charset/Charset;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Ljava/lang/String;

    if-eqz v6, :cond_0

    check-cast v4, Ljava/lang/String;

    goto :goto_1

    :cond_0
    instance-of v6, v4, Ljava/lang/Boolean;

    if-eqz v6, :cond_1

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "toLowerCase(...)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    instance-of v6, v4, Ljava/lang/Number;

    if-eqz v6, :cond_2

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-virtual {v3, v5, v4}, Lokhttp3/FormBody$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/FormBody$Builder;

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Lokhttp3/FormBody$Builder;->build()Lokhttp3/FormBody;

    move-result-object v1

    new-instance v3, Lokhttp3/Request$Builder;

    invoke-direct {v3}, Lokhttp3/Request$Builder;-><init>()V

    invoke-virtual {v3, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object p1

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v3, v1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p1

    sget-object v0, Lcom/sma/androidnetworklib/OXO1;->OXO1:Lcom/sma/androidnetworklib/OXO1;

    invoke-virtual {v0}, Lcom/sma/androidnetworklib/OXO1;->OXO1()Lokhttp3/OkHttpClient;

    move-result-object v0

    invoke-virtual {v0, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object p1

    new-instance v0, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$OXO1;

    invoke-direct {v0, v2}, Lcom/sma/smartv3/biz/WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$OXO1;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-interface {p1, v0}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
