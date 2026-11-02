.class public final Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTodayHealthyDataActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayHealthyDataActivity.kt\ncom/sma/smartv3/ui/status/TodayHealthyDataActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,171:1\n19#2:172\n15#2:173\n1#3:174\n1#3:178\n1#3:187\n1#3:196\n1#3:205\n69#4,3:175\n72#4,5:179\n69#4,3:184\n72#4,5:188\n69#4,3:193\n72#4,5:197\n69#4,3:202\n72#4,5:206\n*S KotlinDebug\n*F\n+ 1 TodayHealthyDataActivity.kt\ncom/sma/smartv3/ui/status/TodayHealthyDataActivity\n*L\n59#1:172\n59#1:173\n76#1:178\n79#1:187\n82#1:196\n85#1:205\n76#1:175,3\n76#1:179,5\n79#1:184,3\n79#1:188,5\n82#1:193,3\n82#1:197,5\n85#1:202,3\n85#1:206,5\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTodayHealthyDataActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayHealthyDataActivity.kt\ncom/sma/smartv3/ui/status/TodayHealthyDataActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,171:1\n19#2:172\n15#2:173\n1#3:174\n1#3:178\n1#3:187\n1#3:196\n1#3:205\n69#4,3:175\n72#4,5:179\n69#4,3:184\n72#4,5:188\n69#4,3:193\n72#4,5:197\n69#4,3:202\n72#4,5:206\n*S KotlinDebug\n*F\n+ 1 TodayHealthyDataActivity.kt\ncom/sma/smartv3/ui/status/TodayHealthyDataActivity\n*L\n59#1:172\n59#1:173\n76#1:178\n79#1:187\n82#1:196\n85#1:205\n76#1:175,3\n76#1:179,5\n79#1:184,3\n79#1:188,5\n82#1:193,3\n82#1:197,5\n85#1:202,3\n85#1:206,5\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mActivityDao:Lcom/sma/smartv3/db/dao/ActivityDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mAppUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCalorieValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDistanceUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDistanceValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSleepValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mStepValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/cv5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/cv5;-><init>(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dv5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/dv5;-><init>(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ev5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ev5;-><init>(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mStepValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/fv5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/fv5;-><init>(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mCalorieValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/uu5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/uu5;-><init>(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mSleepValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/vu5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/vu5;-><init>(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mDistanceValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/wu5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/wu5;-><init>(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mDistanceUnit$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->activityDao()Lcom/sma/smartv3/db/dao/ActivityDao;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mActivityDao:Lcom/sma/smartv3/db/dao/ActivityDao;

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

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mDistanceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mDistanceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->initData$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity$initData$mAdapter$1;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->initData$lambda$2(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity$initData$mAdapter$1;)V

    return-void
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->initView$lambda$3(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mSleepValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mCalorieValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->initView$lambda$2(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;Landroid/view/View;)V

    return-void
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mStepValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method private final initData()V
    .locals 22
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x18
    .end annotation

    move-object/from16 v0, p0

    sget-object v1, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v2, 0x5

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mActivityDao:Lcom/sma/smartv3/db/dao/ActivityDao;

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
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->getMStepValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->getMCalorieValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v5

    div-int/lit16 v5, v5, 0x2710

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->getMDistanceValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v1

    div-int/lit16 v1, v1, 0x2710

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    const/4 v6, 0x4

    invoke-static {v1, v5, v4, v6, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->IIX1OXO(IIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->getMDistanceUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    if-nez v2, :cond_1

    const v2, 0x7f140d6f

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    const v2, 0x7f140f47

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/av5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/av5;-><init>(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)V

    invoke-static {v7, v1}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->getItemHealthyData(ZLkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity$initData$mAdapter$1;

    invoke-direct {v2, v0, v1}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity$initData$mAdapter$1;-><init>(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;Ljava/util/List;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/bv5;

    invoke-direct {v3, v2}, Lcom/android/mltcode/paycertificationapi/bv5;-><init>(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity$initData$mAdapter$1;)V

    const-wide/16 v4, 0x64

    invoke-virtual {v1, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final initData$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;I)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->getMSleepValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const-string v1, "<get-mSleepValue>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/O0iOi11;->XO0O10(Landroid/content/Context;F)I

    move-result v1

    const v2, 0x7f06006c

    invoke-static {p1, v0, p0, v1, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->iOO1ii1(ILcom/sma/smartv3/view/text/DINCondBold;Landroid/content/Context;II)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initData$lambda$2(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity$initData$mAdapter$1;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;Landroid/view/View;)V
    .locals 1

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/status/StepActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;Landroid/view/View;)V
    .locals 1

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/status/CaloriesActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;Landroid/view/View;)V
    .locals 1

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/status/SleepActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final initView$lambda$3(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;Landroid/view/View;)V
    .locals 1

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/status/DistanceActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final mCalorieValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0029

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final mDistanceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a002b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mDistanceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a002a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a0b30

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final mSleepValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a002c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final mStepValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a002d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method


# virtual methods
.method public final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMAppUser()Lcom/sma/smartv3/model/AppUser;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-object v0
.end method

.method public final getMCalorieValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mCalorieValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getMDistanceUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mDistanceUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMDistanceValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mDistanceValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method public final getMSleepValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mSleepValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getMStepValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->mStepValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f140ca8

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a06c5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/tu5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/tu5;-><init>(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a06b7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xu5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/xu5;-><init>(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a06c4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/yu5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/yu5;-><init>(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a06ba

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/zu5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/zu5;-><init>(Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d012e

    return v0
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;->initData()V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
