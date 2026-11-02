.class public final Lcom/sma/smartv3/ui/status/fragment/DistanceWeekFragment;
.super Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment<",
        "Lcom/sma/smartv3/db/entity/Activity;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDistanceWeekFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistanceWeekFragment.kt\ncom/sma/smartv3/ui/status/fragment/DistanceWeekFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,121:1\n19#2:122\n15#2:123\n*S KotlinDebug\n*F\n+ 1 DistanceWeekFragment.kt\ncom/sma/smartv3/ui/status/fragment/DistanceWeekFragment\n*L\n19#1:122\n19#1:123\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDistanceWeekFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistanceWeekFragment.kt\ncom/sma/smartv3/ui/status/fragment/DistanceWeekFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,121:1\n19#2:122\n15#2:123\n*S KotlinDebug\n*F\n+ 1 DistanceWeekFragment.kt\ncom/sma/smartv3/ui/status/fragment/DistanceWeekFragment\n*L\n19#1:122\n19#1:123\n*E\n"
    }
.end annotation


# instance fields
.field private final formatDecimal:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mActivityDao:Lcom/sma/smartv3/db/dao/ActivityDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;-><init>()V

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/DistanceWeekFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    sget-object v1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->activityDao()Lcom/sma/smartv3/db/dao/ActivityDao;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/DistanceWeekFragment;->mActivityDao:Lcom/sma/smartv3/db/dao/ActivityDao;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->iIX0i()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "%.2f"

    goto :goto_1

    :cond_1
    const-string v1, "%.1f"

    :goto_1
    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/DistanceWeekFragment;->formatDecimal:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public filterData(Ljava/util/List;)V
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->filterData(Ljava/util/List;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/fragment/DistanceWeekFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v4

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static {v3, v4, v0, v5, v6}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getValues()Ljava/util/List;

    move-result-object v4

    new-instance v5, Lcom/github/mikephil/charting/data/BarEntry;

    int-to-float v6, v2

    invoke-direct {v5, v6, v3}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-float/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getOneValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/DistanceWeekFragment;->formatDecimal:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "format(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getTwoValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/DistanceWeekFragment;->formatDecimal:Ljava/lang/String;

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getValues()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->updateChartData(Ljava/util/List;)V

    return-void
.end method

.method public final getFormatDecimal()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/DistanceWeekFragment;->formatDecimal:Ljava/lang/String;

    return-object v0
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getImage()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f081287

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getValueUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/DistanceWeekFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getOneTV()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f141361

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getOneUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/DistanceWeekFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getTwoTV()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f140194

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getTwoUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/DistanceWeekFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
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
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/DistanceWeekFragment;->filterData(Ljava/util/List;)V

    return-void
.end method

.method public onTimePeriodChange(Ljava/util/Calendar;ILcom/sma/smartv3/util/TimePeriod;)Ljava/util/List;
    .locals 20
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
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    const-string v3, "calendar"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "timePeriod"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v3, p2

    invoke-static {v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I1(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;I)[J

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/DistanceWeekFragment;->mActivityDao:Lcom/sma/smartv3/db/dao/ActivityDao;

    const/4 v3, 0x0

    aget-wide v4, v1, v3

    const/4 v6, 0x1

    aget-wide v6, v1, v6

    invoke-interface {v2, v4, v5, v6, v7}, Lcom/sma/smartv3/db/dao/ActivityDao;->getListASC(JJ)Ljava/util/List;

    move-result-object v2

    aget-wide v4, v1, v3

    invoke-static {v4, v5}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IXXOO(J)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/sma/smartv3/ui/status/base/BaseDetailsWeekFragment;->setWeekDay(Ljava/util/List;)V

    aget-wide v4, v1, v3

    invoke-virtual {v0, v4, v5}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->clearCache(J)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getWeekData()Ljava/util/LinkedHashMap;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v8

    cmp-long v6, v8, v6

    if-gez v6, :cond_1

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getWeekData()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    new-instance v6, Lcom/sma/smartv3/db/entity/Activity;

    const/16 v18, 0x3ff

    const/16 v19, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v6 .. v19}, Lcom/sma/smartv3/db/entity/Activity;-><init>(IJLjava/lang/String;IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const-string v5, "iterator(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    move v5, v3

    move v15, v5

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    const-string v7, "next(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v6

    div-int/lit16 v6, v6, 0x2710

    if-gt v5, v6, :cond_4

    sub-int v5, v6, v5

    add-int/2addr v15, v5

    :cond_4
    move v5, v6

    goto :goto_2

    :cond_5
    new-instance v6, Lcom/sma/smartv3/db/entity/Activity;

    const/16 v18, 0x37f

    const/16 v19, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v6 .. v19}, Lcom/sma/smartv3/db/entity/Activity;-><init>(IJLjava/lang/String;IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    return-object v1
.end method

.method public setColor(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/XXX1X11;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0601de

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0601df

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->OI1IiOO1i(II)V

    return-void
.end method

.method public setDataLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "Distance week Data"

    return-object v0
.end method

.method public updateItemData(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 3
    .param p1    # Lcom/github/mikephil/charting/data/Entry;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/DistanceWeekFragment;->formatDecimal:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "format(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
