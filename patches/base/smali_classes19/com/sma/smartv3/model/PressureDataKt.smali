.class public final Lcom/sma/smartv3/model/PressureDataKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final PRESSURE_LEVEL_RANGE_0:I = 0x0

.field public static final PRESSURE_LEVEL_RANGE_1:I = 0x19

.field public static final PRESSURE_LEVEL_RANGE_2:I = 0x32

.field public static final PRESSURE_LEVEL_RANGE_3:I = 0x4b

.field public static final PRESSURE_LEVEL_RANGE_4:I = 0x64


# direct methods
.method public static final getBarColors(Landroid/content/Context;I)[I
    .locals 4
    .param p0    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x19

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ge p1, v0, :cond_0

    new-array p1, v3, [I

    const v0, 0x7f060245

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    aput v3, p1, v2

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p0

    aput p0, p1, v1

    return-object p1

    :cond_0
    const/16 v0, 0x32

    if-ge p1, v0, :cond_1

    new-array p1, v3, [I

    const v0, 0x7f060248

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    aput v3, p1, v2

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p0

    aput p0, p1, v1

    return-object p1

    :cond_1
    const/16 v0, 0x4b

    if-ge p1, v0, :cond_2

    new-array p1, v3, [I

    const v0, 0x7f060244

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    aput v3, p1, v2

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p0

    aput p0, p1, v1

    return-object p1

    :cond_2
    new-array p1, v3, [I

    const v0, 0x7f060246

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    aput v3, p1, v2

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p0

    aput p0, p1, v1

    return-object p1
.end method

.method public static final setPressureSbv(Landroid/content/Context;Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;)V
    .locals 14
    .param p0    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sbv"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x19

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v4, 0x32

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v5, 0x4b

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v6, 0x64

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v2, v3, v4, v5, v6}, [Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f030030

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v3

    const-string v4, "getStringArray(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v4, 0x7f030027

    invoke-virtual {p0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object p0

    const-string v4, "getIntArray(...)"

    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v4, v3

    :goto_0
    const/4 v5, 0x1

    if-ge v1, v4, :cond_2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    add-int/lit8 v7, v1, 0x1

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    new-instance v9, Lcom/android/mltcode/paycertificationapi/iz3;

    int-to-float v10, v6

    int-to-float v11, v8

    aget-object v12, v3, v1

    aget v13, p0, v1

    invoke-direct {v9, v10, v11, v12, v13}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFLjava/lang/String;I)V

    const-string v10, ""

    invoke-virtual {v9, v10}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object v9

    if-nez v1, :cond_0

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    goto :goto_1

    :cond_0
    array-length v10, v3

    sub-int/2addr v10, v5

    if-ne v1, v10, :cond_1

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "&"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    :goto_1
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v1, v7

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setShowDescriptionText(Z)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setSegments(Ljava/util/List;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const v0, 0x7f06074b

    invoke-static {p0, v0}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setDescriptionTextColor(I)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setDescriptionTopTextColor(I)V

    return-void
.end method

.method public static final setPressureSbvValue(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;F)V
    .locals 2
    .param p0    # Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "sbv"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x42c80000    # 100.0f

    cmpl-float v1, p1, v0

    if-lez v1, :cond_0

    move p1, v0

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setValue(Ljava/lang/Float;)V

    return-void
.end method
