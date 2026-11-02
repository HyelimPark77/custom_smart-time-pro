.class public final Lcom/sma/smartv3/ui/status/item/BloodGlucoseItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private final initEvent:Z

.field private lastTime:Lcom/sma/smartv3/view/text/DINCondBold;

.field private lastValue:Lcom/sma/smartv3/view/text/DINCondBold;

.field private final mBloodGlucoseDao:Lcom/sma/smartv3/db/dao/BloodGlucoseDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->bloodGlucoseDao()Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucoseItem;->mBloodGlucoseDao:Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucoseItem;->initEvent:Z

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

    const v0, 0x7f0a0682

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucoseItem;->lastTime:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0683

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucoseItem;->lastValue:Lcom/sma/smartv3/view/text/DINCondBold;

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucoseItem;->initEvent:Z

    return v0
.end method

.method public initView()V
    .locals 8

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucoseItem;->mBloodGlucoseDao:Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    invoke-interface {v0}, Lcom/sma/smartv3/db/dao/BloodGlucoseDao;->getLastData()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const-string v2, "lastValue"

    const-string v3, "lastTime"

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucoseItem;->lastTime:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v4

    :cond_0
    const v1, 0x7f1403bc

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucoseItem;->lastValue:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v4, v0

    :goto_0
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucoseItem;->lastTime:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v1, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v4

    :cond_3
    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/BloodGlucose;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/BloodGlucose;->getMTime()J

    move-result-wide v5

    const/4 v3, 0x1

    invoke-static {v4, v3, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X0i1O(Lcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v7

    invoke-static {v5, v6, v7}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucoseItem;->lastValue:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v4, v1

    :goto_1
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/BloodGlucose;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose;->getMValue()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%.1f"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1069

    return v0
.end method

.method public final onBloodGlucoseChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "bloodglucose_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onBloodGlucoseChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/BloodGlucoseItem;->initView()V

    return-void
.end method
