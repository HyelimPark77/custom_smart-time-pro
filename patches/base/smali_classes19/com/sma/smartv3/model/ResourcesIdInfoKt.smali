.class public final Lcom/sma/smartv3/model/ResourcesIdInfoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final getWatchFaceElementColors(Landroid/content/Context;)Ljava/util/List;
    .locals 13
    .param p0    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0601ce

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    const/4 v2, 0x1

    const v3, 0x7f0816b2

    invoke-direct {v1, v3, v0, v2}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZ)V

    new-instance v2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f0601cf

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const v5, 0x7f0816b3

    const/4 v7, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0601d0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const v4, 0x7f0816b4

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v5, 0x7f0601d1

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    const/4 v8, 0x4

    const v5, 0x7f0816b5

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v6, 0x7f0601d2

    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const v6, 0x7f0816b6

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v7, 0x7f0601d3

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v8

    const/4 v10, 0x4

    const/4 v11, 0x0

    const v7, 0x7f0816b7

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v0, 0x7f0601d4

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    const/4 v11, 0x4

    const/4 v12, 0x0

    const v8, 0x7f0816b8

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v1 .. v7}, [Lcom/sma/smartv3/model/ResourcesIdInfo;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iIiiO([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static final getWatchFaceElementDigitalTimes()Ljava/util/List;
    .locals 12
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const v1, 0x7f080908

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const v2, 0x7f080909

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const v3, 0x7f08090a

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const v4, 0x7f08090b

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const v5, 0x7f08090c

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const v6, 0x7f08090d

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const v7, 0x7f08090e

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v0 .. v6}, [Lcom/sma/smartv3/model/ResourcesIdInfo;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iIiiO([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static final getWatchFaceElementPointers(Lcom/szabh/smable3/entity/BleDeviceInfo;)Ljava/util/List;
    .locals 11
    .param p0    # Lcom/szabh/smable3/entity/BleDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/entity/BleDeviceInfo;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "deviceInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMPlatform()Ljava/lang/String;

    move-result-object p0

    const-string v0, "B9"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance v0, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const v1, 0x7f0808dd

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const v2, 0x7f0808de

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const v3, 0x7f0808df

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const v4, 0x7f0808e0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const v5, 0x7f0808e1

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const v6, 0x7f0808e2

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v0 .. v5}, [Lcom/sma/smartv3/model/ResourcesIdInfo;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iIiiO([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const v1, 0x7f0808e3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const v2, 0x7f0808e4

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const v3, 0x7f0808e5

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const v4, 0x7f0808e6

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const v5, 0x7f0808e7

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const v6, 0x7f0808e8

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v0 .. v5}, [Lcom/sma/smartv3/model/ResourcesIdInfo;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iIiiO([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static final getWatchFaceElementScales(Lcom/szabh/smable3/entity/BleDeviceInfo;Z)Ljava/util/List;
    .locals 10
    .param p0    # Lcom/szabh/smable3/entity/BleDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/entity/BleDeviceInfo;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "deviceInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    new-instance v1, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const v2, 0x7f0808f0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const v3, 0x7f0808f1

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const v4, 0x7f0808f2

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const v5, 0x7f0808f3

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v1, v2, v3, v4}, [Lcom/sma/smartv3/model/ResourcesIdInfo;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iIiiO([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMPlatform()Ljava/lang/String;

    move-result-object p0

    const-string p1, "B9"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance v0, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const v1, 0x7f0808ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const v2, 0x7f0808ee

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const v3, 0x7f0808ef

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v1, v2}, [Lcom/sma/smartv3/model/ResourcesIdInfo;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iIiiO([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const v1, 0x7f0808ea

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const v2, 0x7f0808eb

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const v3, 0x7f0808ec

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v1, v2}, [Lcom/sma/smartv3/model/ResourcesIdInfo;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iIiiO([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method
