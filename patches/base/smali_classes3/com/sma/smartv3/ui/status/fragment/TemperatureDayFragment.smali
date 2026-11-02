.class public Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;
.super Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/ag3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment<",
        "Lcom/sma/smartv3/db/entity/Temperature;",
        ">;",
        "Lcom/android/mltcode/paycertificationapi/ag3<",
        "Lcom/sma/smartv3/db/entity/Temperature;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTemperatureDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/TemperatureDayFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,197:1\n19#2:198\n15#2:199\n1#3:200\n1#3:208\n99#4,7:201\n106#4,3:209\n79#4,7:212\n109#4:219\n*S KotlinDebug\n*F\n+ 1 TemperatureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/TemperatureDayFragment\n*L\n51#1:198\n51#1:199\n67#1:208\n67#1:201,7\n67#1:209,3\n67#1:212,7\n67#1:219\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTemperatureDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/TemperatureDayFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,197:1\n19#2:198\n15#2:199\n1#3:200\n1#3:208\n99#4,7:201\n106#4,3:209\n79#4,7:212\n109#4:219\n*S KotlinDebug\n*F\n+ 1 TemperatureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/TemperatureDayFragment\n*L\n51#1:198\n51#1:199\n67#1:208\n67#1:201,7\n67#1:209,3\n67#1:212,7\n67#1:219\n*E\n"
    }
.end annotation


# instance fields
.field private final btnMeasure$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isImperial:Z

.field private mAllList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/Temperature;",
            ">;"
        }
    .end annotation
.end field

.field private final mAppUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mMaxNormalTemp:F

.field private mMinNormalTemp:F

.field private mRecyclerAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "Lcom/sma/smartv3/db/entity/Temperature;",
            ">;"
        }
    .end annotation
.end field

.field private final mTemperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final measurePanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final noData$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tempPb$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mn5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/mn5;-><init>(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->tempPb$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/nn5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/nn5;-><init>(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->rv$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/on5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/on5;-><init>(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->noData$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->temperatureDao()Lcom/sma/smartv3/db/dao/TemperatureDao;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mTemperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mAllList:Ljava/util/ArrayList;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pn5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/pn5;-><init>(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->measurePanel$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qn5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/qn5;-><init>(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->btnMeasure$delegate:Lkotlin/Lazy;

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    const/high16 v1, 0x42100000    # 36.0f

    iput v1, v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mMinNormalTemp:F

    const v1, 0x4215999a    # 37.4f

    iput v1, v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mMaxNormalTemp:F

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->initView$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->btnMeasure_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->rv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)Lcom/sma/smartv3/view/TempProgressBar;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->tempPb_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)Lcom/sma/smartv3/view/TempProgressBar;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->measurePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->noData_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method private static final btnMeasure_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01d7

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final getBtnMeasure()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->btnMeasure$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMeasurePanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->measurePanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getNoData()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->noData$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private final getRv()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->rv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getTempPb()Lcom/sma/smartv3/view/TempProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->tempPb$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/TempProgressBar;

    return-object v0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "start measure"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/sn5;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/sn5;-><init>(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)V

    const/4 p0, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v1, p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v2, 0x4

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final measurePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0829

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final noData_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0897

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final rv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09c1

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final tempPb_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)Lcom/sma/smartv3/view/TempProgressBar;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b81

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/TempProgressBar;

    return-object p0
.end method

.method private final updateChartData()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mAllList:Ljava/util/ArrayList;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mAllList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->getNoData()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->iXiiiO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowTimeDetails()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->iXiiiO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->getTempPb()Lcom/sma/smartv3/view/TempProgressBar;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->isImperial:Z

    invoke-virtual {v0, v2, v1}, Lcom/sma/smartv3/view/TempProgressBar;->iO(IZ)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->getNoData()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mAllList:Ljava/util/ArrayList;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/Temperature;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Temperature;->getMTemperature()I

    move-result v0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->isImperial:Z

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->iIiiO(IZ)F

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowTimeDetails()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v3, 0x0

    invoke-static {v2, v1, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XO0X10iO(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v1

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mAllList:Ljava/util/ArrayList;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/Temperature;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Temperature;->getMTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/util/Date;->setTime(J)V

    sget-object v3, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->getTempPb()Lcom/sma/smartv3/view/TempProgressBar;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mAllList:Ljava/util/ArrayList;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/Temperature;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Temperature;->getMTemperature()I

    move-result v1

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->isImperial:Z

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/view/TempProgressBar;->iO(IZ)V

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getValueUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->isImperial:Z

    if-eqz v1, :cond_1

    const v1, 0x7f140bad

    goto :goto_1

    :cond_1
    const v1, 0x7f1403da

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mRecyclerAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_2
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mAllList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/db/entity/Temperature;I)V
    .locals 6
    .param p1    # Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/Temperature;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Temperature;->getMTemperature()I

    move-result p3

    const/4 v0, 0x0

    invoke-static {p3, v0}, Lcom/android/mltcode/paycertificationapi/cp5;->iIiiO(IZ)F

    move-result p3

    .line 3
    iget v1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mMinNormalTemp:F

    cmpg-float v2, p3, v1

    if-gez v2, :cond_0

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v1, 0x7f060746

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    const v1, 0x7f140e48

    goto :goto_0

    :cond_0
    cmpl-float v1, p3, v1

    if-ltz v1, :cond_1

    .line 5
    iget v1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mMaxNormalTemp:F

    cmpg-float p3, p3, v1

    if-gez p3, :cond_1

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v1, 0x7f060747

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    const v1, 0x7f141021

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v1, 0x7f060748

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    const v1, 0x7f140cd5

    .line 8
    :goto_0
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Temperature;->getMTemperature()I

    move-result v2

    iget-boolean v3, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->isImperial:Z

    invoke-static {v2, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->iIiiO(IZ)F

    move-result v2

    const v3, 0x7f0a0b7c

    .line 9
    invoke-virtual {p1, v3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/view/text/DINCondBold;

    .line 10
    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    invoke-virtual {v3, p3}, Landroid/widget/TextView;->setTextColor(I)V

    const v2, 0x7f0a0b7b

    .line 12
    invoke-virtual {p1, v2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/view/text/DINCondBold;

    .line 13
    invoke-virtual {v2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    iget-boolean v3, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->isImperial:Z

    if-eqz v3, :cond_2

    const v3, 0x7f140bad

    goto :goto_1

    :cond_2
    const v3, 0x7f1403da

    :goto_1
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    const v2, 0x7f0a0b7a

    .line 15
    invoke-virtual {p1, v2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/view/text/DINCondBold;

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 16
    invoke-static {v0, v3, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XO0X10iO(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 17
    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/Temperature;->getMTime()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/util/Date;->setTime(J)V

    .line 18
    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    .line 19
    invoke-virtual {v0, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    const p2, 0x7f0a0b79

    .line 21
    invoke-virtual {p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/view/text/PFMedium;

    .line 22
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 23
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public bridge synthetic initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/db/entity/Temperature;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/db/entity/Temperature;I)V

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Temperature;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public initView()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iOi1010()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->getMeasurePanel()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->getBtnMeasure()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v3, Lcom/android/mltcode/paycertificationapi/rn5;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/rn5;-><init>(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->getMeasurePanel()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->II1Xi0(I)I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_3

    move v2, v3

    :cond_3
    iput-boolean v2, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->isImperial:Z

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->initView()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->itemLayoutId()I

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mAllList:Ljava/util/ArrayList;

    new-instance v4, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment$initView$2;

    invoke-direct {v4, p0, v1, v2, v3}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment$initView$2;-><init>(Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;Landroid/app/Activity;ILjava/util/ArrayList;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iput-object v4, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mRecyclerAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mRecyclerAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_4
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XI1OX0IO()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getImage()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08135d

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    const/high16 v0, 0x41e00000    # 28.0f

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mMinNormalTemp:F

    const/high16 v0, 0x42080000    # 34.0f

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mMaxNormalTemp:F

    return-void

    :cond_5
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getImage()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f0813a0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    const/high16 v0, 0x42100000    # 36.0f

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mMinNormalTemp:F

    const v0, 0x4215999a    # 37.4f

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mMaxNormalTemp:F

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d1089

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0ea3

    return v0
.end method

.method public onDataChange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Temperature;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mAllList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mAllList:Ljava/util/ArrayList;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->updateChartData()V

    return-void
.end method

.method public final onTemperatureChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "temperature_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->changeTime()V

    return-void
.end method

.method public onTimePeriodChange(Ljava/util/Calendar;ILcom/sma/smartv3/util/TimePeriod;)Ljava/util/List;
    .locals 4
    .param p1    # Ljava/util/Calendar;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/util/TimePeriod;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Calendar;",
            "I",
            "Lcom/sma/smartv3/util/TimePeriod;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Temperature;",
            ">;"
        }
    .end annotation

    const-string v0, "calendar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timePeriod"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I1(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;I)[J

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->setRange([J)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;->mTemperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object p2

    const/4 p3, 0x0

    aget-wide v0, p2, p3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object p2

    const/4 p3, 0x1

    aget-wide v2, p2, p3

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/sma/smartv3/db/dao/TemperatureDao;->getListDesc(JJ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final setDataLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "temp day Data"

    return-object v0
.end method
