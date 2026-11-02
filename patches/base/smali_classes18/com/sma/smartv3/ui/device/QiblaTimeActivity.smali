.class public final Lcom/sma/smartv3/ui/device/QiblaTimeActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQiblaTimeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,129:1\n1#2:130\n18#3,2:131\n15#3:133\n*S KotlinDebug\n*F\n+ 1 QiblaTimeActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeActivity\n*L\n100#1:131,2\n100#1:133\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nQiblaTimeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,129:1\n1#2:130\n18#3,2:131\n15#3:133\n*S KotlinDebug\n*F\n+ 1 QiblaTimeActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeActivity\n*L\n100#1:131,2\n100#1:133\n*E\n"
    }
.end annotation


# instance fields
.field private final calendarView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLocation:Lcom/sma/smartv3/location/CustomLocation;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mNextPrayerTime:Lcom/sma/smartv3/model/PrayerTime;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mPrayerTimeData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "+",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/PrayerTime;",
            ">;>;"
        }
    .end annotation
.end field

.field private final recycleView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvCountDownView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvNextTimeName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvNextTimeValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 19

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/x92;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/x92;-><init>(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->calendarView$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/y92;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/y92;-><init>(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->recycleView$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/z92;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/z92;-><init>(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->tvNextTimeName$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/aa2;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/aa2;-><init>(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->tvNextTimeValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ba2;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ba2;-><init>(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->tvCountDownView$delegate:Lkotlin/Lazy;

    new-instance v2, Lcom/sma/smartv3/location/CustomLocation;

    const/16 v17, 0x3ff

    const/16 v18, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v2 .. v18}, Lcom/sma/smartv3/location/CustomLocation;-><init>(DDDFIJLcom/sma/smartv3/location/CustomLocation$TYPE;FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, v0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mLocation:Lcom/sma/smartv3/location/CustomLocation;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Lcom/sma/smartv3/view/CountDownView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->tvCountDownView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Lcom/sma/smartv3/view/CountDownView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->tvNextTimeName_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->recycleView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Lcom/sma/smartv3/view/FutureCalendarView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->calendarView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Lcom/sma/smartv3/view/FutureCalendarView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->tvNextTimeValue_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMNextPrayerTime$p(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Lcom/sma/smartv3/model/PrayerTime;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mNextPrayerTime:Lcom/sma/smartv3/model/PrayerTime;

    return-object p0
.end method

.method public static final synthetic access$showPrayerTime(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->showPrayerTime(J)V

    return-void
.end method

.method private static final calendarView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Lcom/sma/smartv3/view/FutureCalendarView;
    .locals 1

    const v0, 0x7f0a01fb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/FutureCalendarView;

    return-object p0
.end method

.method private final getCalendarView()Lcom/sma/smartv3/view/FutureCalendarView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->calendarView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/FutureCalendarView;

    return-object v0
.end method

.method private final getRecycleView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->recycleView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getTvCountDownView()Lcom/sma/smartv3/view/CountDownView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->tvCountDownView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/CountDownView;

    return-object v0
.end method

.method private final getTvNextTimeName()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->tvNextTimeName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvNextTimeValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->tvNextTimeValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final recycleView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a0995

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private final showPrayerTime(J)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mPrayerTimeData:Ljava/util/Map;

    if-nez v0, :cond_0

    const-string v0, "mPrayerTimeData"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object p1

    :cond_1
    check-cast p1, Ljava/util/List;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->getRecycleView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p2

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->getRecycleView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p2

    new-instance v0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity$showPrayerTime$1;

    invoke-direct {v0, p0, p1}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity$showPrayerTime$1;-><init>(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;Ljava/util/List;)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private static final tvCountDownView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Lcom/sma/smartv3/view/CountDownView;
    .locals 1

    const v0, 0x7f0a0c5d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/CountDownView;

    return-object p0
.end method

.method private static final tvNextTimeName_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0ccb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvNextTimeValue_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0ccc

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 2
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f14110e

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->getCalendarView()Lcom/sma/smartv3/view/FutureCalendarView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/QiblaTimeActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/QiblaTimeActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/FutureCalendarView;->setOnDateSelectedListener(Lcom/sma/smartv3/view/FutureCalendarView$OXO1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->getCalendarView()Lcom/sma/smartv3/view/FutureCalendarView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/FutureCalendarView;->iO(Z)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->onInfoChange(Ljava/lang/Object;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00e7

    return v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->getTvCountDownView()Lcom/sma/smartv3/view/CountDownView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/view/CountDownView;->cancelCountDown()V

    return-void
.end method

.method public final onInfoChange(Ljava/lang/Object;)V
    .locals 13
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "APP_LAST_LOCATION_INFO"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->XXIIO1i11()Lcom/sma/smartv3/location/CustomLocation;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mLocation:Lcom/sma/smartv3/location/CustomLocation;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    const-string v0, "getInstance(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XiOIii1(Ljava/util/Calendar;)J

    move-result-wide v6

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/sma/smartv3/model/PrayerTimeSettings;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    :cond_0
    move-object v1, p1

    check-cast v1, Lcom/sma/smartv3/model/PrayerTimeSettings;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mLocation:Lcom/sma/smartv3/location/CustomLocation;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v2

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mLocation:Lcom/sma/smartv3/location/CustomLocation;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v4

    const/16 v9, 0x10

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lcom/sma/smartv3/model/PrayerTimesKt;->getPrayerTimeMap$default(Lcom/sma/smartv3/model/PrayerTimeSettings;DDJIILjava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mPrayerTimeData:Ljava/util/Map;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-object p1, Lcom/sma/smartv3/model/PrayerTime;->Companion:Lcom/sma/smartv3/model/PrayerTime$Companion;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mPrayerTimeData:Ljava/util/Map;

    const-string v3, "mPrayerTimeData"

    const/4 v4, 0x0

    if-nez v2, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v4

    :cond_1
    invoke-virtual {p1, v2, v0, v1}, Lcom/sma/smartv3/model/PrayerTime$Companion;->findNextTime(Ljava/util/Map;J)Lcom/sma/smartv3/model/PrayerTime;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mNextPrayerTime:Lcom/sma/smartv3/model/PrayerTime;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mLocation:Lcom/sma/smartv3/location/CustomLocation;

    iget-object v8, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mPrayerTimeData:Ljava/util/Map;

    if-nez v8, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v8, v4

    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "onLocationInfoChange "

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0, v6, v7}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->showPrayerTime(J)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mNextPrayerTime:Lcom/sma/smartv3/model/PrayerTime;

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->getTvNextTimeName()Landroid/widget/TextView;

    move-result-object p1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mNextPrayerTime:Lcom/sma/smartv3/model/PrayerTime;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/model/PrayerTime;->getTimeName(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->getTvNextTimeValue()Landroid/widget/TextView;

    move-result-object p1

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {v3, v3, v2, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->i0X000X0O(ZZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v2

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mNextPrayerTime:Lcom/sma/smartv3/model/PrayerTime;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/PrayerTime;->getTime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->getTvCountDownView()Lcom/sma/smartv3/view/CountDownView;

    move-result-object v6

    const-string p1, "<get-tvCountDownView>(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mNextPrayerTime:Lcom/sma/smartv3/model/PrayerTime;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/PrayerTime;->getTime()J

    move-result-wide v7

    sub-long/2addr v7, v0

    const/4 v11, 0x2

    const/4 v12, 0x0

    const-wide/16 v9, 0x0

    invoke-static/range {v6 .. v12}, Lcom/sma/smartv3/view/CountDownView;->startCountDown$default(Lcom/sma/smartv3/view/CountDownView;JJILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->getTvNextTimeValue()Landroid/widget/TextView;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iI()Ljava/text/SimpleDateFormat;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mNextPrayerTime:Lcom/sma/smartv3/model/PrayerTime;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/PrayerTime;->getTime()J

    move-result-wide v1

    const/4 v6, 0x2

    invoke-static {v1, v2, v3, v6, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I1XOi1(JIILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v4, v2, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X0i1O(Lcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/QiblaTimeActivity;->mNextPrayerTime:Lcom/sma/smartv3/model/PrayerTime;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/PrayerTime;->getTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
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
