.class public Lcom/sma/smartv3/ui/status/item/MainStepItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainStepItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainStepItem.kt\ncom/sma/smartv3/ui/status/item/MainStepItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,195:1\n19#2:196\n15#2:197\n*S KotlinDebug\n*F\n+ 1 MainStepItem.kt\ncom/sma/smartv3/ui/status/item/MainStepItem\n*L\n99#1:196\n99#1:197\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMainStepItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainStepItem.kt\ncom/sma/smartv3/ui/status/item/MainStepItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,195:1\n19#2:196\n15#2:197\n*S KotlinDebug\n*F\n+ 1 MainStepItem.kt\ncom/sma/smartv3/ui/status/item/MainStepItem\n*L\n99#1:196\n99#1:197\n*E\n"
    }
.end annotation


# instance fields
.field private activity:Lcom/sma/smartv3/db/entity/Activity;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public distanceUnit:Lcom/sma/smartv3/view/text/PFMedium;

.field private final initEvent:Z

.field private ivWeather:Landroid/widget/ImageView;

.field private final mActivityDao:Lcom/sma/smartv3/db/dao/ActivityDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public mContext:Landroid/content/Context;

.field private tvCalorie:Lcom/sma/smartv3/view/text/DINCondBold;

.field private tvDistance:Lcom/sma/smartv3/view/text/DINCondBold;

.field public tvTemperature:Lcom/sma/smartv3/view/text/DINCondBold;

.field public tvWeatherTime:Lcom/sma/smartv3/view/text/DINCondBold;

.field public userProfile:Lcom/sma/smartv3/model/AppUser;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->activityDao()Lcom/sma/smartv3/db/dao/ActivityDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->mActivityDao:Lcom/sma/smartv3/db/dao/ActivityDao;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->initEvent:Z

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/status/item/MainStepItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->bindView$lambda$1(Lcom/sma/smartv3/ui/status/item/MainStepItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/status/item/MainStepItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->bindView$lambda$2(Lcom/sma/smartv3/ui/status/item/MainStepItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/status/item/MainStepItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->bindView$lambda$0(Lcom/sma/smartv3/ui/status/item/MainStepItem;Landroid/view/View;)V

    return-void
.end method

.method private static final bindView$lambda$0(Lcom/sma/smartv3/ui/status/item/MainStepItem;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->weatherDetailsEvent()V

    return-void
.end method

.method private static final bindView$lambda$1(Lcom/sma/smartv3/ui/status/item/MainStepItem;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/w85;->OXO1:Lcom/android/mltcode/paycertificationapi/w85;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/w85;->OXO1()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p0

    const-class v1, Lcom/sma/smartv3/ui/status/CaloriesActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    invoke-static {p1, v0, p0}, Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method private static final bindView$lambda$2(Lcom/sma/smartv3/ui/status/item/MainStepItem;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/w85;->OXO1:Lcom/android/mltcode/paycertificationapi/w85;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/w85;->OXO1()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object p0

    const-class v1, Lcom/sma/smartv3/ui/status/DistanceActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    invoke-static {p1, v0, p0}, Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 3
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0bfd

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->tvCalorie:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0c05

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->tvDistance:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a060a

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->ivWeather:Landroid/widget/ImageView;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IiX1ii()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->ivWeather:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    const-string v0, "ivWeather"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type android.view.View"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/s30;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/s30;-><init>(Lcom/sma/smartv3/ui/status/item/MainStepItem;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    const v0, 0x7f0a0c15

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->setTvTemperature(Lcom/sma/smartv3/view/text/DINCondBold;)V

    const v0, 0x7f0a0c19

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->setTvWeatherTime(Lcom/sma/smartv3/view/text/DINCondBold;)V

    const v0, 0x7f0a031f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->setDistanceUnit(Lcom/sma/smartv3/view/text/PFMedium;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->tvCalorie:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_2

    const-string v0, "tvCalorie"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->setMContext(Landroid/content/Context;)V

    const v0, 0x7f0a06b7

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v1, Lcom/android/mltcode/paycertificationapi/t30;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/t30;-><init>(Lcom/sma/smartv3/ui/status/item/MainStepItem;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    const v0, 0x7f0a06ba

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/u30;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/u30;-><init>(Lcom/sma/smartv3/ui/status/item/MainStepItem;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    return-void
.end method

.method public final getActivity()Lcom/sma/smartv3/db/entity/Activity;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->activity:Lcom/sma/smartv3/db/entity/Activity;

    return-object v0
.end method

.method public final getDistanceUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->distanceUnit:Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "distanceUnit"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->initEvent:Z

    return v0
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTvTemperature()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->tvTemperature:Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tvTemperature"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTvWeatherTime()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->tvWeatherTime:Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tvWeatherTime"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getUserProfile()Lcom/sma/smartv3/model/AppUser;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->userProfile:Lcom/sma/smartv3/model/AppUser;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "userProfile"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getWeatherDateTimeString()Ljava/lang/String;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    :try_start_0
    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v3, "WEATHER_SYNC_TIME"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;J)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X1(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public initView()V
    .locals 31

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/model/AppUser;

    const v29, 0x7ffffff

    const/16 v30, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

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

    invoke-direct/range {v1 .. v30}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    check-cast v1, Lcom/sma/smartv3/model/AppUser;

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->setUserProfile(Lcom/sma/smartv3/model/AppUser;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->updateActivity()V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->updateWeather()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d107f    # 1.875068E38f

    return v0
.end method

.method public final onActivityChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "activity_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onActivityChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->updateActivity()V

    return-void
.end method

.method public final onUnitChange(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "UNIT_CHANGE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onUnitChange"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->initView()V

    return-void
.end method

.method public final onWeatherRealtimeChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "weather_realtime_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onWeatherRealtimeChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->updateWeather()V

    return-void
.end method

.method public final setActivity(Lcom/sma/smartv3/db/entity/Activity;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/db/entity/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->activity:Lcom/sma/smartv3/db/entity/Activity;

    return-void
.end method

.method public final setDistanceUnit(Lcom/sma/smartv3/view/text/PFMedium;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->distanceUnit:Lcom/sma/smartv3/view/text/PFMedium;

    return-void
.end method

.method public final setMContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->mContext:Landroid/content/Context;

    return-void
.end method

.method public final setTvTemperature(Lcom/sma/smartv3/view/text/DINCondBold;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->tvTemperature:Lcom/sma/smartv3/view/text/DINCondBold;

    return-void
.end method

.method public final setTvWeatherTime(Lcom/sma/smartv3/view/text/DINCondBold;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->tvWeatherTime:Lcom/sma/smartv3/view/text/DINCondBold;

    return-void
.end method

.method public final setUserProfile(Lcom/sma/smartv3/model/AppUser;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/AppUser;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->userProfile:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method public updateActivity()V
    .locals 22

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getDistanceUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    sget-object v1, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v2, 0x5

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->mActivityDao:Lcom/sma/smartv3/db/dao/ActivityDao;

    aget-wide v5, v1, v4

    const/4 v7, 0x1

    aget-wide v8, v1, v7

    invoke-interface {v2, v5, v6, v8, v9}, Lcom/sma/smartv3/db/dao/ActivityDao;->getActivity(JJ)Lcom/sma/smartv3/db/entity/Activity;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v8, Lcom/sma/smartv3/db/entity/Activity;

    const/16 v20, 0x3ff

    const/16 v21, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v8 .. v21}, Lcom/sma/smartv3/db/entity/Activity;-><init>(IJLjava/lang/String;IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v8

    :cond_0
    iput-object v1, v0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->activity:Lcom/sma/smartv3/db/entity/Activity;

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->tvCalorie:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v1, :cond_1

    const-string v1, "tvCalorie"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_1
    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->activity:Lcom/sma/smartv3/db/entity/Activity;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v2

    div-int/lit16 v2, v2, 0x2710

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->tvDistance:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v1, :cond_2

    const-string v1, "tvDistance"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_2
    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->activity:Lcom/sma/smartv3/db/entity/Activity;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v2

    div-int/lit16 v2, v2, 0x2710

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    const/4 v6, 0x4

    invoke-static {v2, v5, v4, v6, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->IIX1OXO(IIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->O00OXOXO()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "NOTIFICATION_BAR"

    invoke-virtual {v1, v2, v7}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lcom/sma/smartv3/biz/OXO1;->XOO0ii0:Lcom/sma/smartv3/biz/OXO1$OXO1;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/OXO1$OXO1;->OXO1()Lcom/sma/smartv3/biz/OXO1;

    move-result-object v2

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->activity:Lcom/sma/smartv3/db/entity/Activity;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v3

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->activity:Lcom/sma/smartv3/db/entity/Activity;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v1

    div-int/lit16 v4, v1, 0x2710

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sma/smartv3/biz/OXO1;->I1XOi1(Lcom/sma/smartv3/biz/OXO1;IILjava/lang/String;ILjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public updateWeather()V
    .locals 13

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iiX0i1IX()Z

    move-result v1

    const-string v2, "null cannot be cast to non-null type android.view.View"

    const/4 v3, 0x0

    const-string v4, "ivWeather"

    if-eqz v1, :cond_b

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->IX()Z

    move-result v5

    if-eqz v5, :cond_b

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->ivWeather:Landroid/widget/ImageView;

    if-nez v5, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_0
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0IX1()Z

    move-result v0

    const/4 v5, 0x1

    if-eqz v0, :cond_3

    sget-object v6, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v7, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME2:Lcom/szabh/smable3/BleKey;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-class v8, Lcom/szabh/smable3/entity/BleWeatherRealtime2;

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleWeatherRealtime2;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleWeatherRealtime2;->getMWeather()Lcom/szabh/smable3/entity/BleWeather2;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleWeather2;->getMWeatherCode()I

    move-result v6

    goto :goto_0

    :cond_1
    move v6, v2

    :goto_0
    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleWeatherRealtime2;->getMWeather()Lcom/szabh/smable3/entity/BleWeather2;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleWeather2;->getMCurrentTemperature()I

    move-result v0

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    move v7, v5

    goto :goto_3

    :cond_3
    sget-object v7, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v8, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME:Lcom/szabh/smable3/BleKey;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-class v9, Lcom/szabh/smable3/entity/BleWeatherRealtime;

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleWeatherRealtime;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleWeatherRealtime;->getMWeather()Lcom/szabh/smable3/entity/BleWeather;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleWeather;->getMWeatherCode()I

    move-result v6

    goto :goto_2

    :cond_4
    move v6, v2

    :goto_2
    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleWeatherRealtime;->getMWeather()Lcom/szabh/smable3/entity/BleWeather;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleWeather;->getMCurrentTemperature()I

    move-result v0

    goto :goto_1

    :cond_5
    move v0, v2

    move v6, v0

    move v7, v6

    :goto_3
    if-nez v7, :cond_7

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->ivWeather:Landroid/widget/ImageView;

    if-nez v0, :cond_6

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    move-object v3, v0

    :goto_4
    const v0, 0x7f08108c

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getTvTemperature()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getTvWeatherTime()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_7
    iget-object v7, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->ivWeather:Landroid/widget/ImageView;

    if-nez v7, :cond_8

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    move-object v3, v7

    :goto_5
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v6}, Lcom/sma/smartv3/util/UtilsKt;->iOiXi11II(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getTvTemperature()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v4

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/cp5;->II1Xi0(I)I

    move-result v4

    if-ne v4, v5, :cond_9

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object v4

    int-to-float v0, v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/cp5;->I0iXXO(F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const v5, 0x7f14039d

    invoke-virtual {v4, v5, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_9
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const v5, 0x7f14039c

    invoke-virtual {v4, v5, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getTvTemperature()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->IXiOXO()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getTvWeatherTime()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getWeatherDateTimeString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getTvWeatherTime()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_a
    return-void

    :cond_b
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainStepItem;->ivWeather:Landroid/widget/ImageView;

    if-nez v0, :cond_c

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_7

    :cond_c
    move-object v3, v0

    :goto_7
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final weatherDetailsEvent()V
    .locals 9

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0IX1()Z

    move-result v0

    const v1, 0x7f141019

    if-eqz v0, :cond_1

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME2:Lcom/szabh/smable3/BleKey;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-class v4, Lcom/szabh/smable3/entity/BleWeatherRealtime2;

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleWeatherRealtime2;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/sma/smartv3/ui/status/Weather2Activity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-static {v0, v1, v2}, Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void

    :cond_0
    invoke-static {v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_1
    sget-object v3, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v4, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME:Lcom/szabh/smable3/BleKey;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-class v5, Lcom/szabh/smable3/entity/BleWeatherRealtime;

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleWeatherRealtime;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainStepItem;->getMContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/sma/smartv3/ui/status/WeatherActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-static {v0, v1, v2}, Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void

    :cond_2
    invoke-static {v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method
