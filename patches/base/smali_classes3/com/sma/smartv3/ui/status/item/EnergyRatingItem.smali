.class public final Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEnergyRatingItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnergyRatingItem.kt\ncom/sma/smartv3/ui/status/item/EnergyRatingItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1969#2,14:76\n*S KotlinDebug\n*F\n+ 1 EnergyRatingItem.kt\ncom/sma/smartv3/ui/status/item/EnergyRatingItem\n*L\n60#1:76,14\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEnergyRatingItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnergyRatingItem.kt\ncom/sma/smartv3/ui/status/item/EnergyRatingItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1969#2,14:76\n*S KotlinDebug\n*F\n+ 1 EnergyRatingItem.kt\ncom/sma/smartv3/ui/status/item/EnergyRatingItem\n*L\n60#1:76,14\n*E\n"
    }
.end annotation


# instance fields
.field private energyRatingLastTime:Lcom/sma/smartv3/view/text/DINCondBold;

.field private energyRatingLastValue:Lcom/sma/smartv3/view/text/DINCondBold;

.field public energyRatingList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/EnergyRating;",
            ">;"
        }
    .end annotation
.end field

.field private final initEvent:Z

.field public mContext:Landroid/content/Context;

.field private final mEnergyRatingDao:Lcom/sma/smartv3/db/dao/EnergyRatingDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSegmentProgressView:Lcom/sma/smartv3/view/EnergySegmentProgressView;

.field public range:[J


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->energyRating()Lcom/sma/smartv3/db/dao/EnergyRatingDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->mEnergyRatingDao:Lcom/sma/smartv3/db/dao/EnergyRatingDao;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->initEvent:Z

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0b7e

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->energyRatingLastTime:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0b7f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->energyRatingLastValue:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0b4f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->mSegmentProgressView:Lcom/sma/smartv3/view/EnergySegmentProgressView;

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslViewHolder;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "<get-context>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->setMContext(Landroid/content/Context;)V

    return-void
.end method

.method public final getEnergyRatingList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/EnergyRating;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->energyRatingList:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "energyRatingList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->initEvent:Z

    return v0
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRange()[J
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->range:[J

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "range"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initView()V
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IXOiIi1O1()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/sma/smartv3/model/EnergyRatingDataKt;->getEnergyRatingColorLevel(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->mSegmentProgressView:Lcom/sma/smartv3/view/EnergySegmentProgressView;

    const-string v3, "mSegmentProgressView"

    const/4 v4, 0x0

    if-nez v2, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v4

    :cond_0
    invoke-virtual {v2, v0}, Lcom/sma/smartv3/view/EnergySegmentProgressView;->setSelectColorList(Ljava/util/List;)V

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v2, 0x5

    const/4 v5, 0x0

    invoke-static {v4, v0, v5, v2, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->setRange([J)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->mEnergyRatingDao:Lcom/sma/smartv3/db/dao/EnergyRatingDao;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->getRange()[J

    move-result-object v2

    aget-wide v6, v2, v5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->getRange()[J

    move-result-object v2

    aget-wide v1, v2, v1

    invoke-interface {v0, v6, v7, v1, v2}, Lcom/sma/smartv3/db/dao/EnergyRatingDao;->getEnergyRating(JJ)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->setEnergyRatingList(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->getEnergyRatingList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-string v1, "energyRatingLastValue"

    const-string v2, "energyRatingLastTime"

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->energyRatingLastTime:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v4

    :cond_1
    const v2, 0x7f1403bc

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->energyRatingLastValue:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v4

    :cond_2
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->mSegmentProgressView:Lcom/sma/smartv3/view/EnergySegmentProgressView;

    if-nez v0, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v4, v0

    :goto_0
    const/4 v0, -0x1

    invoke-virtual {v4, v0}, Lcom/sma/smartv3/view/EnergySegmentProgressView;->setSelectIndex(I)V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->energyRatingLastTime:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v4

    :cond_5
    const/4 v2, 0x3

    invoke-static {v5, v5, v2, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->i0X000X0O(ZZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->getEnergyRatingList()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/db/entity/EnergyRating;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/EnergyRating;->getMTime()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->getEnergyRatingList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_1

    :cond_6
    move-object v5, v2

    check-cast v5, Lcom/sma/smartv3/db/entity/EnergyRating;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/EnergyRating;->getMScore()I

    move-result v5

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/sma/smartv3/db/entity/EnergyRating;

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/EnergyRating;->getMScore()I

    move-result v7

    if-ge v5, v7, :cond_8

    move-object v2, v6

    move v5, v7

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_7

    :goto_1
    check-cast v2, Lcom/sma/smartv3/db/entity/EnergyRating;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/EnergyRating;->getMScore()I

    move-result v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->energyRatingLastValue:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v2, :cond_9

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v4

    :cond_9
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->mSegmentProgressView:Lcom/sma/smartv3/view/EnergySegmentProgressView;

    if-nez v1, :cond_a

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_a
    move-object v4, v1

    :goto_2
    invoke-static {v0}, Lcom/sma/smartv3/model/EnergyRatingDataKt;->getEnergyRatingLevel(I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/sma/smartv3/view/EnergySegmentProgressView;->setSelectIndex(I)V

    return-void

    :cond_b
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d106e

    return v0
.end method

.method public final onDataChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "DAILY_ENERGY_RATING_CHANGE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "SWEnergyRatingItem onDataChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->initView()V

    return-void
.end method

.method public final setEnergyRatingList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/EnergyRating;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->energyRatingList:Ljava/util/List;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->mContext:Landroid/content/Context;

    return-void
.end method

.method public final setRange([J)V
    .locals 1
    .param p1    # [J
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/EnergyRatingItem;->range:[J

    return-void
.end method
