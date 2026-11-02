.class public Lcom/sma/smartv3/BaseApp;
.super Lcom/bestmafen/androidbase/base/BaseApplication;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Registered"
    }
.end annotation


# instance fields
.field public X11iII1O1:Lcom/android/mltcode/paycertificationapi/XOIIOO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseApplication;-><init>()V

    return-void
.end method


# virtual methods
.method public final XO0O10(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "privacy_agree"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseApplication;->XIi00iiXO()V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->OiIIX101O(Ljava/lang/Object;)V

    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "base"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    invoke-static {p0}, Landroidx/multidex/MultiDex;->install(Landroid/content/Context;)V

    return-void
.end method

.method public iO(Ljava/util/Set;)V
    .locals 3
    .param p1    # Ljava/util/Set;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/android/mltcode/paycertificationapi/s5;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    const-string v1, "initInitializers"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/blankj/utilcode/util/ProcessUtils;->getCurrentProcessName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "privacy_agree"

    invoke-virtual {v1, v2, v0}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xe

    new-array v1, v1, [Lcom/android/mltcode/paycertificationapi/s5;

    sget-object v2, Lcom/sma/smartv3/initializer/UtilInitializer;->IO:Lcom/sma/smartv3/initializer/UtilInitializer;

    aput-object v2, v1, v0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/X1OI1i;->IO:Lcom/android/mltcode/paycertificationapi/X1OI1i;

    const/4 v2, 0x1

    aput-object v0, v1, v2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/tz0;->IO:Lcom/android/mltcode/paycertificationapi/tz0;

    const/4 v2, 0x2

    aput-object v0, v1, v2

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v2, 0x3

    aput-object v0, v1, v2

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    const/4 v2, 0x4

    aput-object v0, v1, v2

    sget-object v0, Lcom/sma/smartv3/initializer/AGPSInitializer;->IO:Lcom/sma/smartv3/initializer/AGPSInitializer;

    const/4 v2, 0x5

    aput-object v0, v1, v2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/d40;->IO:Lcom/android/mltcode/paycertificationapi/d40;

    const/4 v2, 0x6

    aput-object v0, v1, v2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/w51;->IO:Lcom/android/mltcode/paycertificationapi/w51;

    const/4 v2, 0x7

    aput-object v0, v1, v2

    sget-object v0, Lcom/sma/smartv3/initializer/WorkInitializer;->IO:Lcom/sma/smartv3/initializer/WorkInitializer;

    const/16 v2, 0x8

    aput-object v0, v1, v2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/ka1;->IO:Lcom/android/mltcode/paycertificationapi/ka1;

    const/16 v2, 0x9

    aput-object v0, v1, v2

    sget-object v0, Lcom/sma/smartv3/initializer/StockInitializer;->IO:Lcom/sma/smartv3/initializer/StockInitializer;

    const/16 v2, 0xa

    aput-object v0, v1, v2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/vi6;->IO:Lcom/android/mltcode/paycertificationapi/vi6;

    const/16 v2, 0xb

    aput-object v0, v1, v2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/ii0iIOi;->IO:Lcom/android/mltcode/paycertificationapi/ii0iIOi;

    const/16 v2, 0xc

    aput-object v0, v1, v2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/l87;->IO:Lcom/android/mltcode/paycertificationapi/l87;

    const/16 v2, 0xd

    aput-object v0, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v0

    :goto_0
    check-cast v0, Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public onCreate()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseApplication;->onCreate()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/i72;->XOO0ii0(Landroid/content/Context;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/vk4;->IO:Lcom/android/mltcode/paycertificationapi/vk4;

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/vk4;->OXO1(Landroid/app/Application;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOIIOO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XOIIOO;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sma/smartv3/BaseApp;->X11iII1O1:Lcom/android/mltcode/paycertificationapi/XOIIOO;

    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "privacy_agree"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->X1ii(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onTerminate()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/BaseApp;->X11iII1O1:Lcom/android/mltcode/paycertificationapi/XOIIOO;

    invoke-virtual {p0, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    invoke-super {p0}, Landroid/app/Application;->onTerminate()V

    return-void
.end method
