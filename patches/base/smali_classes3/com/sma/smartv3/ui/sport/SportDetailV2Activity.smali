.class public final Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportDetailV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailV2Activity.kt\ncom/sma/smartv3/ui/sport/SportDetailV2Activity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n104#2,9:213\n113#2,3:223\n99#2,3:226\n104#2,9:229\n113#2,3:239\n99#2,3:242\n1#3:222\n1#3:238\n*S KotlinDebug\n*F\n+ 1 SportDetailV2Activity.kt\ncom/sma/smartv3/ui/sport/SportDetailV2Activity\n*L\n81#1:213,9\n81#1:223,3\n81#1:226,3\n82#1:229,9\n82#1:239,3\n82#1:242,3\n81#1:222\n82#1:238\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportDetailV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailV2Activity.kt\ncom/sma/smartv3/ui/sport/SportDetailV2Activity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n104#2,9:213\n113#2,3:223\n99#2,3:226\n104#2,9:229\n113#2,3:239\n99#2,3:242\n1#3:222\n1#3:238\n*S KotlinDebug\n*F\n+ 1 SportDetailV2Activity.kt\ncom/sma/smartv3/ui/sport/SportDetailV2Activity\n*L\n81#1:213,9\n81#1:223,3\n81#1:226,3\n82#1:229,9\n82#1:239,3\n82#1:242,3\n81#1:222\n82#1:238\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleOtherRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private initializationEvaluate:Z

.field private isLocationEmpty:Z

.field private mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mEvaluationPopup:Lcom/android/mltcode/paycertificationapi/I0iiIOX;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mLocationDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSportViewModel:Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mWorkout:Lcom/sma/smartv3/db/entity/Workout;

.field private final mWorkoutDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public sportDetailChartFragment:Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;

.field public sportDetailMapFragment:Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;

.field private final topPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gw4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/gw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iw4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jw4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/jw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kw4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/kw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->rootView$delegate:Lkotlin/Lazy;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->initializationEvaluate:Z

    new-instance v1, Lcom/android/mltcode/paycertificationapi/lw4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/lw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->topPanel$delegate:Lkotlin/Lazy;

    new-instance v1, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;

    invoke-direct {v1}, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;-><init>()V

    const-class v2, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;->create(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;

    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mSportViewModel:Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mw4;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/mw4;-><init>()V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mWorkoutDao$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/nw4;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/nw4;-><init>()V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mLocationDao$delegate:Lkotlin/Lazy;

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->isLocationEmpty:Z

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;Landroid/graphics/Bitmap;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->onTitleRightOtherClick$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;Landroid/graphics/Bitmap;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mWorkoutDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;Landroid/view/View;IIII)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;Landroid/view/View;IIII)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->showDeletePopup$lambda$0$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OIX0iXi()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mLocationDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->topPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Landroidx/core/widget/NestedScrollView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Landroidx/core/widget/NestedScrollView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0025

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private final getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mLocationDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/LocationDao;

    return-object v0
.end method

.method private final getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mWorkoutDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/WorkoutDao;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;Ljava/util/ArrayList;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->intiObserve$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;Ljava/util/ArrayList;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;Landroid/view/View;IIII)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getRootView()Landroidx/core/widget/NestedScrollView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    add-int/2addr p3, p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getRootView()Landroidx/core/widget/NestedScrollView;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    if-lt p3, p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->initializationEvaluateNumber()V

    :cond_0
    return-void
.end method

.method private final initializationEvaluateNumber()V
    .locals 5

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->initializationEvaluate:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v3, "SPORT_DETAIL_SCROLL_BTN"

    invoke-virtual {v2, v3, v1}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v2

    const/4 v4, 0x1

    if-le v2, v4, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->onShowEvaluationStatus()V

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    add-int/2addr v2, v4

    invoke-virtual {v0, v3, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    :cond_1
    iput-boolean v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->initializationEvaluate:Z

    return-void
.end method

.method private final intiObserve()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mSportViewModel:Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->getMarkLiveData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qw4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/qw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)V

    new-instance v2, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity$OXO1;

    invoke-direct {v2, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity$OXO1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method private static final intiObserve$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;Ljava/util/ArrayList;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getSportDetailMapFragment()Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;

    move-result-object p0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->onLoadMarkView(Ljava/util/ArrayList;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final mLocationDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->locationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v0

    return-object v0
.end method

.method private static final mWorkoutDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->workoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    return-object v0
.end method

.method private static final onTitleRightOtherClick$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;Landroid/graphics/Bitmap;Z)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getSportDetailMapFragment()Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;

    move-result-object p2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getSportDetailChartFragment()Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    invoke-virtual {p2, v0, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;->setChartFragmentBitmap(Landroid/graphics/Bitmap;I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getSportDetailMapFragment()Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;->share(Landroid/graphics/Bitmap;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Landroidx/core/widget/NestedScrollView;
    .locals 1

    const v0, 0x7f0a09b4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/core/widget/NestedScrollView;

    return-object p0
.end method

.method private final showDeletePopup()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f1403e5

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f1403e6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ow4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ow4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)V

    const v2, 0x7f14034b

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method private static final showDeletePopup$lambda$0$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Z
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->sportDetailDelete()V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0
.end method

.method private final sportDetailDelete()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    const-string v1, "mWorkout"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMSource()I

    move-result v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "detail source "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/db/entity/Workout;->setMIsSync(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v0, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/db/entity/Workout;->setMIsDelete(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v3, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v2

    :cond_3
    invoke-interface {v0, v3}, Lcom/sma/smartv3/db/dao/WorkoutDao;->update(Lcom/sma/smartv3/db/entity/Workout;)I

    const-string v0, "sync_delete_sport"

    const/4 v1, 0x2

    invoke-static {v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final topPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0bcc

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getAbhTitleOtherRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getInitializationEvaluate()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->initializationEvaluate:Z

    return v0
.end method

.method public final getMSportViewModel()Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mSportViewModel:Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;

    return-object v0
.end method

.method public getMStatusStyle()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getRootView()Landroidx/core/widget/NestedScrollView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/widget/NestedScrollView;

    return-object v0
.end method

.method public final getSportDetailChartFragment()Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->sportDetailChartFragment:Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sportDetailChartFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSportDetailMapFragment()Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->sportDetailMapFragment:Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sportDetailMapFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTopPanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->topPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 5
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getWorkoutById(I)Lcom/sma/smartv3/db/entity/Workout;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    const/4 v0, 0x0

    const-string v1, "mWorkout"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object p1

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v2, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v0

    :cond_1
    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v2

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v4, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v0, v4

    :goto_0
    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v0

    invoke-interface {p1, v2, v3, v0, v1}, Lcom/sma/smartv3/db/dao/LocationDao;->getLocation(JJ)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x2

    if-ge p1, v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p1, 0x1

    :goto_2
    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->isLocationEmpty:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->initFragment()V

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final initFragment()V
    .locals 8

    sget-object v0, Lcom/bestmafen/androidbase/base/BaseFragment;->Companion:Lcom/bestmafen/androidbase/base/BaseFragment$OXO1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    const-string v2, "mWorkout"

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v5, "mArg0"

    invoke-virtual {v4, v5, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "mArg1"

    invoke-virtual {v4, v6, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    invoke-virtual {v4, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v7, "mArg3"

    invoke-virtual {v4, v7, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-class v1, Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {v1, v4}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz v1, :cond_3

    check-cast v1, Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->setSportDetailMapFragment(Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v4, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_1
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v2, v5, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v6, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v2, v7, v4}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-class v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz v0, :cond_2

    check-cast v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->setSportDetailChartFragment(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->intiObserve()V

    return-void

    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailV2ChartFragment"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailV2MapFragment"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public initView()V
    .locals 3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->transparentStatusBar()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->setTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v2, 0x7f0813a7

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f081074

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getRootView()Landroidx/core/widget/NestedScrollView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pw4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/pw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnScrollChangeListener(Landroid/view/View$OnScrollChangeListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0111

    return v0
.end method

.method public onResume()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0a0af2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getSportDetailMapFragment()Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0a0af1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getSportDetailChartFragment()Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    return-void
.end method

.method public final onShowEvaluationStatus()V
    .locals 4

    invoke-static {}, Lcom/sma/smartv3/model/EvaluationKt;->isShowEvaluationDialog()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    invoke-interface {v0}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mEvaluationPopup:Lcom/android/mltcode/paycertificationapi/I0iiIOX;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0iiIOX;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v2, v1, v3}, Lcom/android/mltcode/paycertificationapi/I0iiIOX;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mEvaluationPopup:Lcom/android/mltcode/paycertificationapi/I0iiIOX;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mEvaluationPopup:Lcom/android/mltcode/paycertificationapi/I0iiIOX;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mEvaluationPopup:Lcom/android/mltcode/paycertificationapi/I0iiIOX;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getRootView()Landroidx/core/widget/NestedScrollView;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0iiIOX;->XiOIO(Landroid/view/View;)V

    :cond_2
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

.method public onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->showDeletePopup()V

    return-void
.end method

.method public final onTitleRightOtherClick(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->OXO1:Lcom/android/mltcode/paycertificationapi/XIi1i01O;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getTopPanel()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-topPanel>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XIi00iiXO(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getSportDetailChartFragment()Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hw4;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/hw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->showQCCode(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final setInitializationEvaluate(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->initializationEvaluate:Z

    return-void
.end method

.method public final setSportDetailChartFragment(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->sportDetailChartFragment:Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;

    return-void
.end method

.method public final setSportDetailMapFragment(Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->sportDetailMapFragment:Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;

    return-void
.end method

.method public final setTitle()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v1, :cond_0

    const-string v1, "mWorkout"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/q62;->i01OOiI(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final syncDapSportDetailExperience(I)V
    .locals 3
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "SYNC_SPORT_DETAIL_Experience"
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    const/4 v1, 0x0

    const-string v2, "mWorkout"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0, p1}, Lcom/sma/smartv3/db/entity/Workout;->setMFeel(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-interface {p1, v1}, Lcom/sma/smartv3/db/dao/WorkoutDao;->update(Lcom/sma/smartv3/db/entity/Workout;)I

    return-void
.end method
