.class public final Lcom/sma/smartv3/model/BatchOtaConfig;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private bleName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isLocalOta:Z

.field private platform:I


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/sma/smartv3/model/BatchOtaConfig;-><init>(ILcom/sma/smartv3/model/BleFirmwareInfo;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/ExtraPackVersions;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILcom/sma/smartv3/model/BleFirmwareInfo;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/ExtraPackVersions;Ljava/lang/String;Z)V
    .locals 1
    .param p2    # Lcom/sma/smartv3/model/BleFirmwareInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/model/ExtraPackVersions;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleFirmwareInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareVersion"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraPackageDatas"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleName"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->platform:I

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    .line 5
    iput-object p3, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    .line 6
    iput-object p4, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    .line 7
    iput-object p5, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleName:Ljava/lang/String;

    .line 8
    iput-boolean p6, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->isLocalOta:Z

    return-void
.end method

.method public synthetic constructor <init>(ILcom/sma/smartv3/model/BleFirmwareInfo;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/ExtraPackVersions;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    and-int/lit8 v0, p7, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move/from16 v0, p1

    :goto_0
    and-int/lit8 v2, p7, 0x2

    if-eqz v2, :cond_1

    .line 9
    new-instance v3, Lcom/sma/smartv3/model/BleFirmwareInfo;

    const/16 v9, 0x1f

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/sma/smartv3/model/BleFirmwareInfo;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v2, p7, 0x4

    if-eqz v2, :cond_2

    .line 10
    new-instance v4, Lcom/sma/smartv3/model/FirmwareVersion;

    const/16 v15, 0x3ff

    const/16 v16, 0x0

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

    invoke-direct/range {v4 .. v16}, Lcom/sma/smartv3/model/FirmwareVersion;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v2, p7, 0x8

    if-eqz v2, :cond_3

    .line 11
    new-instance v5, Lcom/sma/smartv3/model/ExtraPackVersions;

    const/16 v13, 0x7f

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v5 .. v14}, Lcom/sma/smartv3/model/ExtraPackVersions;-><init>(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v2, p7, 0x10

    if-eqz v2, :cond_4

    .line 12
    const-string v2, ""

    goto :goto_4

    :cond_4
    move-object/from16 v2, p5

    :goto_4
    and-int/lit8 v6, p7, 0x20

    if-eqz v6, :cond_5

    move/from16 p7, v1

    :goto_5
    move-object/from16 p1, p0

    move/from16 p2, v0

    move-object/from16 p6, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    goto :goto_6

    :cond_5
    move/from16 p7, p6

    goto :goto_5

    .line 13
    :goto_6
    invoke-direct/range {p1 .. p7}, Lcom/sma/smartv3/model/BatchOtaConfig;-><init>(ILcom/sma/smartv3/model/BleFirmwareInfo;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/ExtraPackVersions;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/BatchOtaConfig;ILcom/sma/smartv3/model/BleFirmwareInfo;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/ExtraPackVersions;Ljava/lang/String;ZILjava/lang/Object;)Lcom/sma/smartv3/model/BatchOtaConfig;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->platform:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleName:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->isLocalOta:Z

    :cond_5
    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/sma/smartv3/model/BatchOtaConfig;->copy(ILcom/sma/smartv3/model/BleFirmwareInfo;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/ExtraPackVersions;Ljava/lang/String;Z)Lcom/sma/smartv3/model/BatchOtaConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->platform:I

    return v0
.end method

.method public final component2()Lcom/sma/smartv3/model/BleFirmwareInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    return-object v0
.end method

.method public final component3()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final component4()Lcom/sma/smartv3/model/ExtraPackVersions;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleName:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->isLocalOta:Z

    return v0
.end method

.method public final copy(ILcom/sma/smartv3/model/BleFirmwareInfo;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/ExtraPackVersions;Ljava/lang/String;Z)Lcom/sma/smartv3/model/BatchOtaConfig;
    .locals 8
    .param p2    # Lcom/sma/smartv3/model/BleFirmwareInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/model/ExtraPackVersions;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "bleFirmwareInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareVersion"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraPackageDatas"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleName"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/BatchOtaConfig;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/model/BatchOtaConfig;-><init>(ILcom/sma/smartv3/model/BleFirmwareInfo;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/ExtraPackVersions;Ljava/lang/String;Z)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/BatchOtaConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/BatchOtaConfig;

    iget v1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->platform:I

    iget v3, p1, Lcom/sma/smartv3/model/BatchOtaConfig;->platform:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    iget-object v3, p1, Lcom/sma/smartv3/model/BatchOtaConfig;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v3, p1, Lcom/sma/smartv3/model/BatchOtaConfig;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    iget-object v3, p1, Lcom/sma/smartv3/model/BatchOtaConfig;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleName:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/BatchOtaConfig;->bleName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->isLocalOta:Z

    iget-boolean p1, p1, Lcom/sma/smartv3/model/BatchOtaConfig;->isLocalOta:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getBleFirmwareInfo()Lcom/sma/smartv3/model/BleFirmwareInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    return-object v0
.end method

.method public final getBleName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleName:Ljava/lang/String;

    return-object v0
.end method

.method public final getExtraPackageDatas()Lcom/sma/smartv3/model/ExtraPackVersions;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    return-object v0
.end method

.method public final getFirmwareVersion()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final getPlatform()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->platform:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->platform:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/BleFirmwareInfo;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/ExtraPackVersions;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->isLocalOta:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isLocalOta()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->isLocalOta:Z

    return v0
.end method

.method public final setBleFirmwareInfo(Lcom/sma/smartv3/model/BleFirmwareInfo;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/BleFirmwareInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    return-void
.end method

.method public final setBleName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleName:Ljava/lang/String;

    return-void
.end method

.method public final setExtraPackageDatas(Lcom/sma/smartv3/model/ExtraPackVersions;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/ExtraPackVersions;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    return-void
.end method

.method public final setFirmwareVersion(Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-void
.end method

.method public final setLocalOta(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->isLocalOta:Z

    return-void
.end method

.method public final setPlatform(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->platform:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->platform:I

    iget-object v1, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    iget-object v2, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v3, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    iget-object v4, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->bleName:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/sma/smartv3/model/BatchOtaConfig;->isLocalOta:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "BatchOtaConfig(platform="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", bleFirmwareInfo="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", firmwareVersion="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", extraPackageDatas="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bleName="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isLocalOta="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
