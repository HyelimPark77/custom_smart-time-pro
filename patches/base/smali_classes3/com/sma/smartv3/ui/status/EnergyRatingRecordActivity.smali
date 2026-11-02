.class public final Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/view/ProgressCalendarView$OXO1;


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public mCalendar:Ljava/util/Calendar;

.field private final mCalendarView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mEnergyRatingDao:Lcom/sma/smartv3/db/dao/EnergyRatingDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvLest$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvNext$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIii0I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIii0I;-><init>(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1OiiO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1OiiO;-><init>(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->tvLest$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0X1i1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0X1i1;-><init>(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->tvNext$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0XOXi0I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0XOXi0I;-><init>(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->tvTitle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i00XOX0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i00XOX0;-><init>(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->mCalendarView$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->energyRating()Lcom/sma/smartv3/db/dao/EnergyRatingDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->mEnergyRatingDao:Lcom/sma/smartv3/db/dao/EnergyRatingDao;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)Lcom/sma/smartv3/view/ProgressCalendarView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->mCalendarView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)Lcom/sma/smartv3/view/ProgressCalendarView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)Landroid/widget/ImageButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->tvNext_delegate$lambda$0(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)Landroid/widget/ImageButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)Landroid/widget/ImageButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->tvLest_delegate$lambda$0(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)Landroid/widget/ImageButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->tvTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private final addCurMonthHashMap(Ljava/util/Calendar;)V
    .locals 7

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->MONTH:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->mEnergyRatingDao:Lcom/sma/smartv3/db/dao/EnergyRatingDao;

    aget-wide v1, p1, v3

    const/4 v3, 0x1

    aget-wide v3, p1, v3

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/sma/smartv3/db/dao/EnergyRatingDao;->getEnergyRating(JJ)Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {p0}, Lcom/sma/smartv3/model/EnergyRatingDataKt;->getEnergyRatingColorLevel(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/EnergyRating;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/EnergyRating;->getMTime()J

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getDayStartTimestamp(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;

    if-eqz v5, :cond_2

    iget v5, v5, Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;->OXO1:I

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/EnergyRating;->getMScore()I

    move-result v6

    if-ge v5, v6, :cond_0

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/EnergyRating;->getMScore()I

    move-result v5

    invoke-static {v5}, Lcom/sma/smartv3/model/EnergyRatingDataKt;->getEnergyRatingLevel(I)I

    move-result v5

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    :goto_1
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    goto :goto_2

    :cond_1
    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_1

    :goto_2
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    new-instance v4, Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/EnergyRating;->getMScore()I

    move-result v2

    invoke-direct {v4, v2, v5}, Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;-><init>(II)V

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/EnergyRating;->getMScore()I

    move-result v5

    invoke-static {v5}, Lcom/sma/smartv3/model/EnergyRatingDataKt;->getEnergyRatingLevel(I)I

    move-result v5

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_3

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    :goto_3
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    goto :goto_4

    :cond_3
    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_3

    :goto_4
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    new-instance v4, Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/EnergyRating;->getMScore()I

    move-result v2

    invoke-direct {v4, v2, v5}, Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;-><init>(II)V

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getMCalendarView()Lcom/sma/smartv3/view/ProgressCalendarView;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/ProgressCalendarView;->iO(Ljava/util/Map;)V

    return-void
.end method

.method private final formatCalendar(Ljava/util/Calendar;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getDayStartTimestamp(J)J
    .locals 1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/16 p1, 0xb

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xc

    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xd

    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xe

    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p1

    return-wide p1
.end method

.method private final getMCalendarView()Lcom/sma/smartv3/view/ProgressCalendarView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->mCalendarView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/ProgressCalendarView;

    return-object v0
.end method

.method private final getTvLest()Landroid/widget/ImageButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->tvLest$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    return-object v0
.end method

.method private final getTvNext()Landroid/widget/ImageButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->tvNext$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    return-object v0
.end method

.method private final getTvTitle()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->tvTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getMCalendarView()Lcom/sma/smartv3/view/ProgressCalendarView;

    move-result-object p0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/ProgressCalendarView;->I0iXXO()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getMCalendarView()Lcom/sma/smartv3/view/ProgressCalendarView;

    move-result-object p0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/ProgressCalendarView;->XXI()V

    return-void
.end method

.method private static final mCalendarView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)Lcom/sma/smartv3/view/ProgressCalendarView;
    .locals 1

    const v0, 0x7f0a0028

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/ProgressCalendarView;

    return-object p0
.end method

.method private static final tvLest_delegate$lambda$0(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)Landroid/widget/ImageButton;
    .locals 1

    const v0, 0x7f0a0110

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageButton;

    return-object p0
.end method

.method private static final tvNext_delegate$lambda$0(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)Landroid/widget/ImageButton;
    .locals 1

    const v0, 0x7f0a0893

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageButton;

    return-object p0
.end method

.method private static final tvTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a08a4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMCalendar()Ljava/util/Calendar;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->mCalendar:Ljava/util/Calendar;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mCalendar"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    const-string v0, "getInstance(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->setMCalendar(Ljava/util/Calendar;)V

    return-void
.end method

.method public initView()V
    .locals 4

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "curTime"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getMCalendar()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getMCalendarView()Lcom/sma/smartv3/view/ProgressCalendarView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getMCalendar()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ProgressCalendarView;->setDate(Ljava/util/Calendar;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getMCalendar()Ljava/util/Calendar;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->addCurMonthHashMap(Ljava/util/Calendar;)V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f1412bf

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getMCalendarView()Lcom/sma/smartv3/view/ProgressCalendarView;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/sma/smartv3/view/ProgressCalendarView;->setOnDateSelectedListener(Lcom/sma/smartv3/view/ProgressCalendarView$OXO1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getTvLest()Landroid/widget/ImageButton;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iOIOO1IO1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iOIOO1IO1;-><init>(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getTvNext()Landroid/widget/ImageButton;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O1iI0Ii1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O1iI0Ii1;-><init>(Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getTvTitle()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getMCalendar()Ljava/util/Calendar;

    move-result-object v1

    const-string v2, "yyyy-MM"

    invoke-direct {p0, v1, v2}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->formatCalendar(Ljava/util/Calendar;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d009b

    return v0
.end method

.method public onDateSelected(Ljava/util/Calendar;III)V
    .locals 1
    .param p1    # Ljava/util/Calendar;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p2, "calendar"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 p3, 0x4

    const/4 p4, 0x0

    const/4 v0, 0x0

    invoke-static {p1, p2, v0, p3, p4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object p1

    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    aget-wide p3, p1, v0

    const-string v0, "startTime"

    invoke-virtual {p2, v0, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const/4 p3, 0x1

    aget-wide p3, p1, p3

    const-string p1, "endTime"

    invoke-virtual {p2, p1, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const/4 p1, -0x1

    invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onInteractivePrompts(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onMonthChange(Ljava/util/Calendar;III)V
    .locals 0
    .param p1    # Ljava/util/Calendar;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p2, "calendar"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getTvTitle()Landroid/widget/TextView;

    move-result-object p2

    const-string p3, "yyyy-MM"

    invoke-direct {p0, p1, p3}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->formatCalendar(Ljava/util/Calendar;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->setMCalendar(Ljava/util/Calendar;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->getMCalendar()Ljava/util/Calendar;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->addCurMonthHashMap(Ljava/util/Calendar;)V

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

.method public final setMCalendar(Ljava/util/Calendar;)V
    .locals 1
    .param p1    # Ljava/util/Calendar;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/EnergyRatingRecordActivity;->mCalendar:Ljava/util/Calendar;

    return-void
.end method
