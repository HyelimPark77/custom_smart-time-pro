.class public final Lcom/sma/smartv3/ui/sport/SportDetailActivity;
.super Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailActivity.kt\ncom/sma/smartv3/ui/sport/SportDetailActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,170:1\n104#2,9:171\n113#2,3:181\n99#2,3:184\n104#2,9:187\n113#2,3:197\n99#2,3:200\n104#2,9:203\n113#2,3:213\n99#2,3:216\n1#3:180\n1#3:196\n1#3:212\n37#4,2:219\n*S KotlinDebug\n*F\n+ 1 SportDetailActivity.kt\ncom/sma/smartv3/ui/sport/SportDetailActivity\n*L\n60#1:171,9\n60#1:181,3\n60#1:184,3\n61#1:187,9\n61#1:197,3\n61#1:200,3\n62#1:203,9\n62#1:213,3\n62#1:216,3\n60#1:180\n61#1:196\n62#1:212\n89#1:219,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailActivity.kt\ncom/sma/smartv3/ui/sport/SportDetailActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,170:1\n104#2,9:171\n113#2,3:181\n99#2,3:184\n104#2,9:187\n113#2,3:197\n99#2,3:200\n104#2,9:203\n113#2,3:213\n99#2,3:216\n1#3:180\n1#3:196\n1#3:212\n37#4,2:219\n*S KotlinDebug\n*F\n+ 1 SportDetailActivity.kt\ncom/sma/smartv3/ui/sport/SportDetailActivity\n*L\n60#1:171,9\n60#1:181,3\n60#1:184,3\n61#1:187,9\n61#1:197,3\n61#1:200,3\n62#1:203,9\n62#1:213,3\n62#1:216,3\n60#1:180\n61#1:196\n62#1:212\n89#1:219,2\n*E\n"
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

.field private isLocationEmpty:Z

.field private final mLocationDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mWorkout:Lcom/sma/smartv3/db/entity/Workout;

.field private final mWorkoutDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public sportDetailChartFragment:Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;

.field public sportDetailFragment:Lcom/sma/smartv3/ui/sport/SportDetailFragment;

.field public sportDetailMapFragment:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

.field private final table$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final topPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ks4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ks4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->table$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ls4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ls4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ms4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ms4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ns4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ns4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/os4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/os4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->topPanel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ps4;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/ps4;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->mWorkoutDao$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qs4;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/qs4;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->mLocationDao$delegate:Lkotlin/Lazy;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->isLocationEmpty:Z

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->mLocationDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->table_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->mWorkoutDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->topPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0025

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private final getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->mLocationDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/LocationDao;

    return-object v0
.end method

.method private final getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->mWorkoutDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/WorkoutDao;

    return-object v0
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

.method private static final table_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    const v0, 0x7f0a0b64

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method

.method private static final topPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0bcc

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getAbhTitleOtherRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getSportDetailChartFragment()Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->sportDetailChartFragment:Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sportDetailChartFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSportDetailFragment()Lcom/sma/smartv3/ui/sport/SportDetailFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->sportDetailFragment:Lcom/sma/smartv3/ui/sport/SportDetailFragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sportDetailFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSportDetailMapFragment()Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->sportDetailMapFragment:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sportDetailMapFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTable()Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->table$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    return-object v0
.end method

.method public final getTopPanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->topPanel$delegate:Lkotlin/Lazy;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getWorkoutById(I)Lcom/sma/smartv3/db/entity/Workout;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object p1

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v2, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v0

    :cond_1
    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v2

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

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
    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->isLocationEmpty:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->initFragment()V

    return-void
.end method

.method public final initFragment()V
    .locals 7

    sget-object v0, Lcom/bestmafen/androidbase/base/BaseFragment;->Companion:Lcom/bestmafen/androidbase/base/BaseFragment$OXO1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    const-string v1, "mWorkout"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "mArg0"

    invoke-virtual {v3, v4, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "mArg2"

    invoke-virtual {v3, v5, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v6, "mArg3"

    invoke-virtual {v3, v6, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-class v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz v0, :cond_5

    check-cast v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->setSportDetailMapFragment(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3, v4, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v5, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v3, v6, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-class v0, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz v0, :cond_4

    check-cast v0, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->setSportDetailChartFragment(Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v0, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v1, v4, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v5, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v1, v6, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-class v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz v0, :cond_3

    check-cast v0, Lcom/sma/smartv3/ui/sport/SportDetailFragment;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->setSportDetailFragment(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V

    return-void

    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailFragment"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailChartFragment"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailMapFragment"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public initFragments()Ljava/util/List;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->isLocationEmpty:Z

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getSportDetailMapFragment()Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getSportDetailChartFragment()Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getSportDetailFragment()Lcom/sma/smartv3/ui/sport/SportDetailFragment;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public initView()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->setTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v2, 0x7f081072

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->isLocationEmpty:Z

    const-string v3, "getString(...)"

    if-nez v2, :cond_0

    const v2, 0x7f141399

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    const v2, 0x7f1402a0

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const v2, 0x7f1403f2

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMFragmentPagerAdapter()Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/CharSequence;

    invoke-virtual {v2, v0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;->setTitles([Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f060792

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0110

    return v0
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
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->OXO1:Lcom/android/mltcode/paycertificationapi/XIi1i01O;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getTopPanel()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-topPanel>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XIi00iiXO(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getSportDetailMapFragment()Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getUserVisibleHint()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->isLocationEmpty:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getSportDetailMapFragment()Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->share(Landroid/graphics/Bitmap;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getSportDetailChartFragment()Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getUserVisibleHint()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getSportDetailChartFragment()Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->share()V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->share(Landroid/graphics/Bitmap;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getSportDetailFragment()Lcom/sma/smartv3/ui/sport/SportDetailFragment;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getUserVisibleHint()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->getSportDetailFragment()Lcom/sma/smartv3/ui/sport/SportDetailFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailFragment;->share()V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->share(Landroid/graphics/Bitmap;)V

    :cond_2
    return-void
.end method

.method public final setSportDetailChartFragment(Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->sportDetailChartFragment:Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;

    return-void
.end method

.method public final setSportDetailFragment(Lcom/sma/smartv3/ui/sport/SportDetailFragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/sport/SportDetailFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->sportDetailFragment:Lcom/sma/smartv3/ui/sport/SportDetailFragment;

    return-void
.end method

.method public final setSportDetailMapFragment(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->sportDetailMapFragment:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    return-void
.end method

.method public final setTitle()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

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

.method public final share(Landroid/graphics/Bitmap;)V
    .locals 5
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "topBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->XOX0O0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/ImageUtils;->getBitmap(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    const-string v2, "createBitmap(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v2, p1, v3, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v2, v0, v3, p1, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->OXO1:Lcom/android/mltcode/paycertificationapi/XIi1i01O;

    invoke-virtual {p1, p0, v1}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XO0O10(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final testUploadStrava()V
    .locals 12

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    const/4 v1, 0x0

    const-string v2, "mWorkout"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v8

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v6

    new-instance v3, Lcom/sma/smartv3/db/entity/WorkoutIndex;

    const/16 v10, 0x11

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lcom/sma/smartv3/db/entity/WorkoutIndex;-><init>(IIJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/sma/smartv3/ui/sport/SportDetailActivity$OXO1;

    invoke-direct {v0, v3}, Lcom/sma/smartv3/ui/sport/SportDetailActivity$OXO1;-><init>(Lcom/sma/smartv3/db/entity/WorkoutIndex;)V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void
.end method
