.class public final Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHeathReportsTopItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeathReportsTopItem.kt\ncom/sma/smartv3/ui/status/item/HeathReportsTopItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,105:1\n19#2:106\n15#2:107\n*S KotlinDebug\n*F\n+ 1 HeathReportsTopItem.kt\ncom/sma/smartv3/ui/status/item/HeathReportsTopItem\n*L\n33#1:106\n33#1:107\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHeathReportsTopItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeathReportsTopItem.kt\ncom/sma/smartv3/ui/status/item/HeathReportsTopItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,105:1\n19#2:106\n15#2:107\n*S KotlinDebug\n*F\n+ 1 HeathReportsTopItem.kt\ncom/sma/smartv3/ui/status/item/HeathReportsTopItem\n*L\n33#1:106\n33#1:107\n*E\n"
    }
.end annotation


# instance fields
.field private ivAvatar:Landroid/widget/ImageView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mAppUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private final mHealthyReport:Lcom/sma/smartv3/db/entity/HealthyReport;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final showUser:Z

.field private final time:J

.field private tv_abnormal:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private tv_height_weight:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private tv_name:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private tv_report_times:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private tv_this_content:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(JZLcom/sma/smartv3/db/entity/HealthyReport;)V
    .locals 32
    .param p4    # Lcom/sma/smartv3/db/entity/HealthyReport;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    move-object/from16 v0, p0

    .line 1
    invoke-direct {v0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    move-wide/from16 v1, p1

    iput-wide v1, v0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->time:J

    move/from16 v1, p3

    iput-boolean v1, v0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->showUser:Z

    move-object/from16 v1, p4

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mHealthyReport:Lcom/sma/smartv3/db/entity/HealthyReport;

    .line 2
    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

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

    const/16 v29, 0x0

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 4
    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    .line 5
    iput-object v2, v0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method public synthetic constructor <init>(JZLcom/sma/smartv3/db/entity/HealthyReport;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;-><init>(JZLcom/sma/smartv3/db/entity/HealthyReport;)V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 2
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslViewHolder;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "<get-context>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mContext:Landroid/content/Context;

    const v0, 0x7f0a060f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.widget.ImageView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->ivAvatar:Landroid/widget/ImageView;

    const v0, 0x7f0a0cc7

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.widget.TextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_name:Landroid/widget/TextView;

    const v0, 0x7f0a0c91

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_height_weight:Landroid/widget/TextView;

    const v0, 0x7f0a0c20

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_abnormal:Landroid/widget/TextView;

    const v0, 0x7f0a0cfa

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_report_times:Landroid/widget/TextView;

    const v0, 0x7f0a188c

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_this_content:Landroid/widget/TextView;

    return-void
.end method

.method public final getIvAvatar()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->ivAvatar:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMAppUser()Lcom/sma/smartv3/model/AppUser;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-object v0
.end method

.method public final getMHealthyReport()Lcom/sma/smartv3/db/entity/HealthyReport;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mHealthyReport:Lcom/sma/smartv3/db/entity/HealthyReport;

    return-object v0
.end method

.method public final getShowUser()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->showUser:Z

    return v0
.end method

.method public final getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->time:J

    return-wide v0
.end method

.method public final getTv_abnormal()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_abnormal:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTv_height_weight()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_height_weight:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTv_name()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_name:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTv_report_times()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_report_times:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTv_this_content()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_this_content:Landroid/widget/TextView;

    return-object v0
.end method

.method public initView()V
    .locals 10

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->showUser:Z

    const-string v1, "mContext"

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->ivAvatar:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_name:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_height_weight:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_abnormal:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_report_times:Landroid/widget/TextView;

    if-eqz v0, :cond_4

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mHealthyReport:Lcom/sma/smartv3/db/entity/HealthyReport;

    if-eqz v0, :cond_c

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMUserGender()I

    move-result v0

    if-nez v0, :cond_5

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    const v4, 0x7f140bd1

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_5
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    const v4, 0x7f140e73

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_7

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mContext:Landroid/content/Context;

    if-nez v4, :cond_6

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_6
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mHealthyReport:Lcom/sma/smartv3/db/entity/HealthyReport;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMUserHeight()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const v7, 0x7f140ba3

    invoke-virtual {v4, v7, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_7
    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mHealthyReport:Lcom/sma/smartv3/db/entity/HealthyReport;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMUserHeight()F

    move-result v4

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/l76;->OXO1(F)[I

    move-result-object v4

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mContext:Landroid/content/Context;

    if-nez v6, :cond_8

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v2

    :cond_8
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    aget v7, v4, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aget v4, v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v7, v4}, [Ljava/lang/Object;

    move-result-object v4

    const v7, 0x7f14039e

    invoke-virtual {v6, v7, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v6

    if-nez v6, :cond_a

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mContext:Landroid/content/Context;

    if-nez v5, :cond_9

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v2

    :cond_9
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mHealthyReport:Lcom/sma/smartv3/db/entity/HealthyReport;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMUserWeight()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const v7, 0x7f140ba5

    invoke-virtual {v5, v7, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_a
    iget-object v6, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mContext:Landroid/content/Context;

    if-nez v6, :cond_b

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v2

    :cond_b
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    iget-object v7, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mHealthyReport:Lcom/sma/smartv3/db/entity/HealthyReport;

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMUserWeight()F

    move-result v7

    invoke-static {v7}, Lcom/android/mltcode/paycertificationapi/l76;->iO(F)F

    move-result v7

    invoke-static {v7, v5}, Lcom/android/mltcode/paycertificationapi/cp5;->iX1O1(FZ)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const v7, 0x7f140ba6

    invoke-virtual {v6, v7, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    :goto_2
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_height_weight:Landroid/widget/TextView;

    if-eqz v6, :cond_c

    const v7, 0x7f140ccb

    invoke-static {v7}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x7f141500

    invoke-static {v8}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_c
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->ivAvatar:Landroid/widget/ImageView;

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mContext:Landroid/content/Context;

    if-nez v0, :cond_d

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_d
    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getAvatarUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    const v4, 0x7f081568

    invoke-virtual {v0, v4}, Lcom/bumptech/glide/request/BaseRequestOptions;->error(I)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/RequestBuilder;

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->ivAvatar:Landroid/widget/ImageView;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_e
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_name:Landroid/widget/TextView;

    if-eqz v0, :cond_11

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getNickname()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_f
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_report_times:Landroid/widget/TextView;

    if-eqz v0, :cond_10

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_10
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_this_content:Landroid/widget/TextView;

    if-eqz v0, :cond_11

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_11
    :goto_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mHealthyReport:Lcom/sma/smartv3/db/entity/HealthyReport;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMAbnormalNumber()I

    move-result v0

    goto :goto_4

    :cond_12
    move v0, v3

    :goto_4
    if-lez v0, :cond_17

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_abnormal:Landroid/widget/TextView;

    if-eqz v0, :cond_15

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mContext:Landroid/content/Context;

    if-nez v4, :cond_13

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_13
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mHealthyReport:Lcom/sma/smartv3/db/entity/HealthyReport;

    if-eqz v5, :cond_14

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMAbnormalNumber()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_5

    :cond_14
    move-object v5, v2

    :goto_5
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const v6, 0x7f140057

    invoke-virtual {v4, v6, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_15
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_abnormal:Landroid/widget/TextView;

    if-eqz v0, :cond_1b

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mContext:Landroid/content/Context;

    if-nez v4, :cond_16

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_16
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f060780

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_6

    :cond_17
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_abnormal:Landroid/widget/TextView;

    if-eqz v0, :cond_19

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mContext:Landroid/content/Context;

    if-nez v4, :cond_18

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_18
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f141022

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_19
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_abnormal:Landroid/widget/TextView;

    if-eqz v0, :cond_1b

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->mContext:Landroid/content/Context;

    if-nez v4, :cond_1a

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_1a
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f06022a

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1b
    :goto_6
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_report_times:Landroid/widget/TextView;

    if-eqz v0, :cond_1f

    iget-wide v4, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->time:J

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-lez v1, :cond_1d

    if-eqz v0, :cond_1e

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_1c

    const/4 v4, 0x3

    invoke-static {v3, v3, v4, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->i0X000X0O(ZZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v2

    iget-wide v4, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->time:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const v4, 0x7f141191

    invoke-virtual {v1, v4, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_1c
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_7

    :cond_1d
    const/16 v3, 0x8

    :cond_1e
    :goto_7
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_1f
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0ead

    return v0
.end method

.method public final setIvAvatar(Landroid/widget/ImageView;)V
    .locals 0
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->ivAvatar:Landroid/widget/ImageView;

    return-void
.end method

.method public final setTv_abnormal(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_abnormal:Landroid/widget/TextView;

    return-void
.end method

.method public final setTv_height_weight(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_height_weight:Landroid/widget/TextView;

    return-void
.end method

.method public final setTv_name(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_name:Landroid/widget/TextView;

    return-void
.end method

.method public final setTv_report_times(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_report_times:Landroid/widget/TextView;

    return-void
.end method

.method public final setTv_this_content(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;->tv_this_content:Landroid/widget/TextView;

    return-void
.end method
