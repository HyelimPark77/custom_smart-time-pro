.class final Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->checkAuthStatus(Landroid/app/Activity;)V
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
    value = "SMAP\nHykyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,391:1\n11#2,2:392\n*S KotlinDebug\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1\n*L\n118#1:392,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.biz.fitness_site.hyky.HykyManager$checkAuthStatus$1"
    f = "HykyManager.kt"
    i = {
        0x1,
        0x2
    }
    l = {
        0x6c,
        0x73,
        0x7d
    }
    m = "invokeSuspend"
    n = {
        "isAuth",
        "isAuth"
    }
    s = {
        "Z$0",
        "Z$0"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHykyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,391:1\n11#2,2:392\n*S KotlinDebug\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1\n*L\n118#1:392,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $appUser:Lcom/sma/smartv3/model/AppUser;

.field final synthetic $deviceMAC:Ljava/lang/String;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;Lcom/sma/smartv3/model/AppUser;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;",
            "Lcom/sma/smartv3/model/AppUser;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    iput-object p2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->$appUser:Lcom/sma/smartv3/model/AppUser;

    iput-object p3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->$deviceMAC:Ljava/lang/String;

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

    new-instance p1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->$appUser:Lcom/sma/smartv3/model/AppUser;

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->$deviceMAC:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;Lcom/sma/smartv3/model/AppUser;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->Z$0:Z

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    invoke-static {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->access$getMHykyModel(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;)Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->$appUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getPhone()Ljava/lang/String;

    move-result-object v1

    iput v4, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->label:I

    invoke-virtual {p1, v1, p0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->checkAuthStatus(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_0
    move-object v9, p0

    goto/16 :goto_5

    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v4, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    invoke-static {v4}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->access$getTAG$p(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " checkAuthStatus scope.launch :isAuth = "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-nez v1, :cond_5

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_5
    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    invoke-static {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->access$getMHykyModel(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;)Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    move-result-object p1

    iget-object v4, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->$deviceMAC:Ljava/lang/String;

    iput-boolean v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->Z$0:Z

    iput v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->label:I

    invoke-virtual {p1, v4, p0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->getSnInfo(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_0

    :cond_6
    :goto_2
    check-cast p1, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    if-eqz p1, :cond_7

    iget-object v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;->deviceInfoExists()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {v3, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->setMDeviceCode(Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;)V

    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    const-class v4, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v5, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, v4, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    invoke-static {v3}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->access$getTAG$p(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->getMDeviceCode()Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " checkAuthStatus scope.launch :mDeviceCode = "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    invoke-static {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->access$getMHykyModel(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;)Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    move-result-object v3

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->$appUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->noAreaCodePhone()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->$deviceMAC:Ljava/lang/String;

    sget-object p1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getDeviceCode()Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    move-result-object v4

    const-string v7, ""

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;->getSn()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_9

    :cond_8
    move-object v4, v7

    :cond_9
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getDeviceCode()Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;->getCmei()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_a

    goto :goto_3

    :cond_a
    move-object v8, p1

    goto :goto_4

    :cond_b
    :goto_3
    move-object v8, v7

    :goto_4
    iput-boolean v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->Z$0:Z

    iput v2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->label:I

    move-object v7, v4

    const/4 v4, 0x1

    move-object v9, p0

    invoke-virtual/range {v3 .. v9}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->bindDeviceToHyky(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    :goto_5
    return-object v0

    :cond_c
    :goto_6
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, v9, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    invoke-static {v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->access$getMBleHandleCallback$p(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;)Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, v9, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    invoke-static {v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->access$getTAG$p(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " checkAuthStatus scope.launch :bindSuccess = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
