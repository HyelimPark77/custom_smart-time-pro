.class public final Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQiblaTimeCorrectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,120:1\n18#2,2:121\n15#2:123\n*S KotlinDebug\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity\n*L\n109#1:121,2\n109#1:123\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nQiblaTimeCorrectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,120:1\n18#2,2:121\n15#2:123\n*S KotlinDebug\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity\n*L\n109#1:121,2\n109#1:123\n*E\n"
    }
.end annotation


# instance fields
.field private mLocation:Lcom/sma/smartv3/location/CustomLocation;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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


# direct methods
.method public constructor <init>()V
    .locals 19

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ca2;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ca2;-><init>(Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;->recycleView$delegate:Lkotlin/Lazy;

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;->mLocation:Lcom/sma/smartv3/location/CustomLocation;

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;->recycleView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method private final getRecycleView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;->recycleView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private static final recycleView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a0995

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private final showPrayerTime(J)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;->mPrayerTimeData:Ljava/util/Map;

    if-nez v0, :cond_0

    const-string v0, "mPrayerTimeData"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IO0iXO0O()Ljava/text/SimpleDateFormat;

    move-result-object v2

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "showPrayerTime "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " - "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;->getRecycleView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {p2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;->getRecycleView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    new-instance p2, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1;

    invoke-direct {p2, p0, v0}, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1;-><init>(Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;Ljava/util/List;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
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

    const v1, 0x7f141110

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;->onInfoChange(Ljava/lang/Object;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00e8

    return v0
.end method

.method public final onInfoChange(Ljava/lang/Object;)V
    .locals 11
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;->mLocation:Lcom/sma/smartv3/location/CustomLocation;

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;->mLocation:Lcom/sma/smartv3/location/CustomLocation;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v2

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;->mLocation:Lcom/sma/smartv3/location/CustomLocation;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v4

    const/16 v9, 0x10

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lcom/sma/smartv3/model/PrayerTimesKt;->getPrayerTimeMap$default(Lcom/sma/smartv3/model/PrayerTimeSettings;DDJIILjava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;->mPrayerTimeData:Ljava/util/Map;

    invoke-direct {p0, v6, v7}, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;->showPrayerTime(J)V

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
