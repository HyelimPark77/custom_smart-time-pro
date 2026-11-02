.class public final Lcom/sma/smartv3/model/ExtraPackVersions;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private brandPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private dialPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private fontPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private gpsFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private languagePackVersion:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private networkFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private uiPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


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

    invoke-direct/range {v0 .. v9}, Lcom/sma/smartv3/model/ExtraPackVersions;-><init>(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p5    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p6    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p7    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->uiPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->languagePackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    .line 5
    iput-object p3, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->brandPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    .line 6
    iput-object p4, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->fontPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    .line 7
    iput-object p5, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->gpsFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    .line 8
    iput-object p6, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->networkFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    .line 9
    iput-object p7, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->dialPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move-object p8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/sma/smartv3/model/ExtraPackVersions;-><init>(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/ExtraPackVersions;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;ILjava/lang/Object;)Lcom/sma/smartv3/model/ExtraPackVersions;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->uiPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->languagePackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->brandPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->fontPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->gpsFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->networkFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->dialPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/sma/smartv3/model/ExtraPackVersions;->copy(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;)Lcom/sma/smartv3/model/ExtraPackVersions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->uiPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final component2()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->languagePackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final component3()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->brandPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final component4()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->fontPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final component5()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->gpsFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final component6()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->networkFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final component7()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->dialPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final copy(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;)Lcom/sma/smartv3/model/ExtraPackVersions;
    .locals 8
    .param p1    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p5    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p6    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p7    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/ExtraPackVersions;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/sma/smartv3/model/ExtraPackVersions;-><init>(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;)V

    return-object v0
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
    instance-of v1, p1, Lcom/sma/smartv3/model/ExtraPackVersions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/ExtraPackVersions;

    iget-object v1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->uiPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v3, p1, Lcom/sma/smartv3/model/ExtraPackVersions;->uiPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->languagePackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v3, p1, Lcom/sma/smartv3/model/ExtraPackVersions;->languagePackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->brandPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v3, p1, Lcom/sma/smartv3/model/ExtraPackVersions;->brandPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->fontPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v3, p1, Lcom/sma/smartv3/model/ExtraPackVersions;->fontPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->gpsFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v3, p1, Lcom/sma/smartv3/model/ExtraPackVersions;->gpsFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->networkFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v3, p1, Lcom/sma/smartv3/model/ExtraPackVersions;->networkFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->dialPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object p1, p1, Lcom/sma/smartv3/model/ExtraPackVersions;->dialPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBrandPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->brandPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final getDialPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->dialPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final getFontPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->fontPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final getGpsFirmwareVersion()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->gpsFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final getLanguagePackVersion()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->languagePackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final getNetworkFirmwareVersion()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->networkFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final getUiPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->uiPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->uiPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->languagePackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->brandPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->fontPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->gpsFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->networkFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->dialPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    return v0
.end method

.method public final setBrandPackVersion(Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->brandPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-void
.end method

.method public final setDialPackVersion(Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->dialPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-void
.end method

.method public final setFontPackVersion(Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->fontPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-void
.end method

.method public final setGpsFirmwareVersion(Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->gpsFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-void
.end method

.method public final setLanguagePackVersion(Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->languagePackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-void
.end method

.method public final setNetworkFirmwareVersion(Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->networkFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-void
.end method

.method public final setUiPackVersion(Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->uiPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->uiPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v1, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->languagePackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v2, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->brandPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v3, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->fontPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v4, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->gpsFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v5, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->networkFirmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v6, p0, Lcom/sma/smartv3/model/ExtraPackVersions;->dialPackVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "ExtraPackVersions(uiPackVersion="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", languagePackVersion="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", brandPackVersion="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fontPackVersion="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", gpsFirmwareVersion="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", networkFirmwareVersion="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dialPackVersion="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
