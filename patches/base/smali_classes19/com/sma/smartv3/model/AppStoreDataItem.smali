.class public final Lcom/sma/smartv3/model/AppStoreDataItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private appStoreType:I

.field private binOnlinePath:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final bleAppInfo:Lcom/szabh/smable3/entity/BleAppInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final id:I

.field private isShowNewFlag:Z

.field private final onlinePath:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final path:I


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/sma/smartv3/model/AppStoreDataItem;-><init>(ILcom/szabh/smable3/entity/BleAppInfo;ILjava/lang/String;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILcom/szabh/smable3/entity/BleAppInfo;ILjava/lang/String;Ljava/lang/String;ZI)V
    .locals 1
    .param p2    # Lcom/szabh/smable3/entity/BleAppInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleAppInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onlinePath"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binOnlinePath"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->id:I

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->bleAppInfo:Lcom/szabh/smable3/entity/BleAppInfo;

    .line 5
    iput p3, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->path:I

    .line 6
    iput-object p4, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->onlinePath:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->binOnlinePath:Ljava/lang/String;

    .line 8
    iput-boolean p6, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->isShowNewFlag:Z

    .line 9
    iput p7, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->appStoreType:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/szabh/smable3/entity/BleAppInfo;ILjava/lang/String;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    and-int/lit8 v0, p8, 0x1

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    move p1, v1

    :cond_0
    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_1

    .line 10
    new-instance v2, Lcom/szabh/smable3/entity/BleAppInfo;

    const/16 v10, 0x7f

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lcom/szabh/smable3/entity/BleAppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p2, v2

    :cond_1
    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move v1, p3

    :goto_0
    and-int/lit8 v0, p8, 0x8

    .line 11
    const-string v2, ""

    if-eqz v0, :cond_3

    move-object v0, v2

    goto :goto_1

    :cond_3
    move-object/from16 v0, p4

    :goto_1
    and-int/lit8 v3, p8, 0x10

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    move-object/from16 v2, p5

    :goto_2
    and-int/lit8 v3, p8, 0x20

    if-eqz v3, :cond_5

    const/4 v3, 0x0

    goto :goto_3

    :cond_5
    move/from16 v3, p6

    :goto_3
    and-int/lit8 v4, p8, 0x40

    if-eqz v4, :cond_6

    .line 12
    sget-object v4, Lcom/sma/smartv3/model/AppStoreItemType;->INSTALL:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result v4

    move/from16 p8, v4

    :goto_4
    move-object p3, p2

    move-object/from16 p5, v0

    move/from16 p4, v1

    move-object/from16 p6, v2

    move/from16 p7, v3

    move p2, p1

    move-object p1, p0

    goto :goto_5

    :cond_6
    move/from16 p8, p7

    goto :goto_4

    .line 13
    :goto_5
    invoke-direct/range {p1 .. p8}, Lcom/sma/smartv3/model/AppStoreDataItem;-><init>(ILcom/szabh/smable3/entity/BleAppInfo;ILjava/lang/String;Ljava/lang/String;ZI)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/AppStoreDataItem;ILcom/szabh/smable3/entity/BleAppInfo;ILjava/lang/String;Ljava/lang/String;ZIILjava/lang/Object;)Lcom/sma/smartv3/model/AppStoreDataItem;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->id:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->bleAppInfo:Lcom/szabh/smable3/entity/BleAppInfo;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->path:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->onlinePath:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->binOnlinePath:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-boolean p6, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->isShowNewFlag:Z

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget p7, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->appStoreType:I

    :cond_6
    move p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/sma/smartv3/model/AppStoreDataItem;->copy(ILcom/szabh/smable3/entity/BleAppInfo;ILjava/lang/String;Ljava/lang/String;ZI)Lcom/sma/smartv3/model/AppStoreDataItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->id:I

    return v0
.end method

.method public final component2()Lcom/szabh/smable3/entity/BleAppInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->bleAppInfo:Lcom/szabh/smable3/entity/BleAppInfo;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->path:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->onlinePath:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->binOnlinePath:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->isShowNewFlag:Z

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->appStoreType:I

    return v0
.end method

.method public final copy(ILcom/szabh/smable3/entity/BleAppInfo;ILjava/lang/String;Ljava/lang/String;ZI)Lcom/sma/smartv3/model/AppStoreDataItem;
    .locals 9
    .param p2    # Lcom/szabh/smable3/entity/BleAppInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "bleAppInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onlinePath"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binOnlinePath"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/AppStoreDataItem;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/sma/smartv3/model/AppStoreDataItem;-><init>(ILcom/szabh/smable3/entity/BleAppInfo;ILjava/lang/String;Ljava/lang/String;ZI)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/model/AppStoreDataItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/AppStoreDataItem;

    iget v1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->id:I

    iget v3, p1, Lcom/sma/smartv3/model/AppStoreDataItem;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->bleAppInfo:Lcom/szabh/smable3/entity/BleAppInfo;

    iget-object v3, p1, Lcom/sma/smartv3/model/AppStoreDataItem;->bleAppInfo:Lcom/szabh/smable3/entity/BleAppInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->path:I

    iget v3, p1, Lcom/sma/smartv3/model/AppStoreDataItem;->path:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->onlinePath:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/AppStoreDataItem;->onlinePath:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->binOnlinePath:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/AppStoreDataItem;->binOnlinePath:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->isShowNewFlag:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/model/AppStoreDataItem;->isShowNewFlag:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->appStoreType:I

    iget p1, p1, Lcom/sma/smartv3/model/AppStoreDataItem;->appStoreType:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAppStoreType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->appStoreType:I

    return v0
.end method

.method public final getBinOnlinePath()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->binOnlinePath:Ljava/lang/String;

    return-object v0
.end method

.method public final getBleAppInfo()Lcom/szabh/smable3/entity/BleAppInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->bleAppInfo:Lcom/szabh/smable3/entity/BleAppInfo;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->id:I

    return v0
.end method

.method public final getOnlinePath()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->onlinePath:Ljava/lang/String;

    return-object v0
.end method

.method public final getPath()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->path:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->bleAppInfo:Lcom/szabh/smable3/entity/BleAppInfo;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAppInfo;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->path:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->onlinePath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->binOnlinePath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->isShowNewFlag:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->appStoreType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isShowNewFlag()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->isShowNewFlag:Z

    return v0
.end method

.method public final setAppStoreType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->appStoreType:I

    return-void
.end method

.method public final setBinOnlinePath(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->binOnlinePath:Ljava/lang/String;

    return-void
.end method

.method public final setShowNewFlag(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->isShowNewFlag:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->id:I

    iget-object v1, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->bleAppInfo:Lcom/szabh/smable3/entity/BleAppInfo;

    iget v2, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->path:I

    iget-object v3, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->onlinePath:Ljava/lang/String;

    iget-object v4, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->binOnlinePath:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->isShowNewFlag:Z

    iget v6, p0, Lcom/sma/smartv3/model/AppStoreDataItem;->appStoreType:I

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "AppStoreDataItem(id="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", bleAppInfo="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", path="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", onlinePath="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", binOnlinePath="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isShowNewFlag="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", appStoreType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
