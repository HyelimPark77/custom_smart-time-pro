.class public final Lcom/sma/smartv3/dto/OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/dto/OXO1$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nThirdPartyDeviceInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartyDeviceInfo.kt\ncom/sma/smartv3/dto/ThirdPartyDeviceInfo\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,116:1\n19#2:117\n15#2:118\n86#2,2:119\n19#2:121\n15#2:122\n*S KotlinDebug\n*F\n+ 1 ThirdPartyDeviceInfo.kt\ncom/sma/smartv3/dto/ThirdPartyDeviceInfo\n*L\n55#1:117\n55#1:118\n66#1:119,2\n84#1:121\n84#1:122\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nThirdPartyDeviceInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartyDeviceInfo.kt\ncom/sma/smartv3/dto/ThirdPartyDeviceInfo\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,116:1\n19#2:117\n15#2:118\n86#2,2:119\n19#2:121\n15#2:122\n*S KotlinDebug\n*F\n+ 1 ThirdPartyDeviceInfo.kt\ncom/sma/smartv3/dto/ThirdPartyDeviceInfo\n*L\n55#1:117\n55#1:118\n66#1:119,2\n84#1:121\n84#1:122\n*E\n"
    }
.end annotation


# static fields
.field public static final I0iXXO:Lcom/sma/smartv3/dto/OXO1$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final I1XOi1:Lcom/sma/smartv3/network/BleInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final O10IXXX0X:I = 0x1

.field public static final X0O:I = 0x1

.field public static final X1ii:I = 0x4344

.field public static final XXI:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field public I0IIOi:I

.field public IO:I

.field public IiI10X:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public O00:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public OIX0iXi:I

.field public OIi0:I

.field public OXO1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XIi00iiXO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XO0O10:I

.field public XOO0ii0:I

.field public iO:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/sma/smartv3/dto/OXO1$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/dto/OXO1$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/dto/OXO1;->I0iXXO:Lcom/sma/smartv3/dto/OXO1$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/dto/OXO1$OXO1;->XIi00iiXO()Lcom/sma/smartv3/dto/OXO1;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/sma/smartv3/dto/OXO1;->XIi00iiXO:Ljava/lang/String;

    if-eqz v1, :cond_0

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, ":"

    const-string v3, ""

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    :cond_1
    sput-object v0, Lcom/sma/smartv3/dto/OXO1;->XXI:Ljava/lang/String;

    new-instance v1, Lcom/sma/smartv3/network/BleInfo;

    const/16 v10, 0xbd

    const/4 v11, 0x0

    const/4 v2, 0x0

    const-string v3, "FakeBle"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v8, ""

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/sma/smartv3/network/BleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/sma/smartv3/dto/OXO1;->I1XOi1:Lcom/sma/smartv3/network/BleInfo;

    return-void
.end method

.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x7ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/sma/smartv3/dto/OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;IIIII)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mac"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelName"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeCode"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/dto/OXO1;->OXO1:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/dto/OXO1;->XIi00iiXO:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/sma/smartv3/dto/OXO1;->iO:Z

    .line 6
    iput p4, p0, Lcom/sma/smartv3/dto/OXO1;->XO0O10:I

    .line 7
    iput-object p5, p0, Lcom/sma/smartv3/dto/OXO1;->O00:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/sma/smartv3/dto/OXO1;->IiI10X:Ljava/lang/String;

    .line 9
    iput p7, p0, Lcom/sma/smartv3/dto/OXO1;->XOO0ii0:I

    .line 10
    iput p8, p0, Lcom/sma/smartv3/dto/OXO1;->I0IIOi:I

    .line 11
    iput p9, p0, Lcom/sma/smartv3/dto/OXO1;->OIi0:I

    .line 12
    iput p10, p0, Lcom/sma/smartv3/dto/OXO1;->IO:I

    .line 13
    iput p11, p0, Lcom/sma/smartv3/dto/OXO1;->OIX0iXi:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p13, p12, 0x1

    .line 14
    const-string v0, ""

    if-eqz p13, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    const/4 v1, 0x0

    if-eqz p13, :cond_2

    move p3, v1

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    const/4 p4, 0x3

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    .line 15
    sget-object p5, Lcom/sma/smartv3/dto/ChatAiMode;->SPARK_CHAIN:Lcom/sma/smartv3/dto/ChatAiMode;

    invoke-virtual {p5}, Lcom/sma/smartv3/dto/ChatAiMode;->getModelName()Ljava/lang/String;

    move-result-object p5

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    move p7, v1

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    move p8, v1

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    move p9, v1

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    move p10, v1

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    move p12, v1

    :goto_0
    move p11, p10

    move p10, p9

    move p9, p8

    move p8, p7

    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_a
    move p12, p11

    goto :goto_0

    .line 16
    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/sma/smartv3/dto/OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;IIIII)V

    return-void
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/dto/OXO1;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/dto/OXO1;->iX(Z)V

    return-void
.end method

.method public static final synthetic OXO1()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/dto/OXO1;->XXI:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/dto/OXO1;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;IIIIIILjava/lang/Object;)Lcom/sma/smartv3/dto/OXO1;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/dto/OXO1;->OXO1:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/dto/OXO1;->XIi00iiXO:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-boolean p3, p0, Lcom/sma/smartv3/dto/OXO1;->iO:Z

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget p4, p0, Lcom/sma/smartv3/dto/OXO1;->XO0O10:I

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/sma/smartv3/dto/OXO1;->O00:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/sma/smartv3/dto/OXO1;->IiI10X:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget p7, p0, Lcom/sma/smartv3/dto/OXO1;->XOO0ii0:I

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget p8, p0, Lcom/sma/smartv3/dto/OXO1;->I0IIOi:I

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget p9, p0, Lcom/sma/smartv3/dto/OXO1;->OIi0:I

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget p10, p0, Lcom/sma/smartv3/dto/OXO1;->IO:I

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget p11, p0, Lcom/sma/smartv3/dto/OXO1;->OIX0iXi:I

    :cond_a
    move p12, p10

    move p13, p11

    move p10, p8

    move p11, p9

    move-object p8, p6

    move p9, p7

    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/sma/smartv3/dto/OXO1;->O10IXXX0X(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;IIIII)Lcom/sma/smartv3/dto/OXO1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic XIi00iiXO()Lcom/sma/smartv3/network/BleInfo;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/dto/OXO1;->I1XOi1:Lcom/sma/smartv3/network/BleInfo;

    return-object v0
.end method


# virtual methods
.method public final I0IIOi()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/dto/OXO1;->iO:Z

    return v0
.end method

.method public final I0iXXO()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->XOO0ii0:I

    return v0
.end method

.method public final I1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/OXO1;->OXO1:Ljava/lang/String;

    return-object v0
.end method

.method public final I1XOi1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/OXO1;->IiI10X:Ljava/lang/String;

    return-object v0
.end method

.method public final II1Xi0()Z
    .locals 4

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->I0IIOi:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    iget-object v3, p0, Lcom/sma/smartv3/dto/OXO1;->OXO1:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/q62;->X0O(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->OIi0:I

    const/16 v3, 0x4344

    if-ne v0, v3, :cond_1

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->IO:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->OIX0iXi:I

    if-ne v0, v2, :cond_1

    return v2

    :cond_1
    return v1

    :cond_2
    return v2
.end method

.method public final IIX1OXO()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->IO:I

    return v0
.end method

.method public final IO()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/OXO1;->O00:Ljava/lang/String;

    return-object v0
.end method

.method public final IiI10X()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->OIX0iXi:I

    return v0
.end method

.method public final O00()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->IO:I

    return v0
.end method

.method public final O10IXXX0X(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;IIIII)Lcom/sma/smartv3/dto/OXO1;
    .locals 13
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mac"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelName"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeCode"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/dto/OXO1;

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/sma/smartv3/dto/OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;IIIII)V

    return-object v1
.end method

.method public final O1O(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/dto/OXO1;->IO:I

    return-void
.end method

.method public final OII()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->XO0O10:I

    return v0
.end method

.method public final OIX0iXi()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/OXO1;->IiI10X:Ljava/lang/String;

    return-object v0
.end method

.method public final OIi0()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->XO0O10:I

    return v0
.end method

.method public final OX()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/OXO1;->O00:Ljava/lang/String;

    return-object v0
.end method

.method public final OiIIX101O()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->XOO0ii0:I

    return v0
.end method

.method public final X01IiOiIi()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->I0IIOi:I

    return v0
.end method

.method public final X0i1O(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/dto/OXO1;->OXO1:Ljava/lang/String;

    return-void
.end method

.method public final X11iII1O1(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/dto/OXO1;->XIi00iiXO:Ljava/lang/String;

    return-void
.end method

.method public final X1IX(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/dto/OXO1;->O00:Ljava/lang/String;

    return-void
.end method

.method public final X1ii()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->OIi0:I

    return v0
.end method

.method public final XO0O10()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/OXO1;->OXO1:Ljava/lang/String;

    return-object v0
.end method

.method public final XOO0ii0()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/OXO1;->XIi00iiXO:Ljava/lang/String;

    return-object v0
.end method

.method public final XX0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/dto/OXO1;->iO:Z

    return v0
.end method

.method public final XXI()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->I0IIOi:I

    return v0
.end method

.method public final XXIIO1i11(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/dto/OXO1;->OIi0:I

    return-void
.end method

.method public final XXX11i(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/dto/OXO1;->XO0O10:I

    return-void
.end method

.method public final XiOIO()Lcom/sma/smartv3/network/BleInfo;
    .locals 38
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/sma/smartv3/dto/OXO1;->OXO1:Ljava/lang/String;

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionName()Ljava/lang/String;

    move-result-object v7

    const-string v1, "getAppVersionName(...)"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v8, Lcom/sma/smartv3/model/AppUser;

    const v36, 0x7ffffff

    const/16 v37, 0x0

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

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v8 .. v37}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v8, v1

    :goto_0
    check-cast v8, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v8}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v2

    iget-object v8, v0, Lcom/sma/smartv3/dto/OXO1;->XIi00iiXO:Ljava/lang/String;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v9, ":"

    const-string v10, ""

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    new-instance v1, Lcom/sma/smartv3/network/BleInfo;

    const/16 v10, 0x14

    const/4 v11, 0x0

    const/4 v4, 0x0

    const-string v5, "58"

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/sma/smartv3/network/BleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final XiOIii1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/OXO1;->XIi00iiXO:Ljava/lang/String;

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
    instance-of v1, p1, Lcom/sma/smartv3/dto/OXO1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/dto/OXO1;

    iget-object v1, p0, Lcom/sma/smartv3/dto/OXO1;->OXO1:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/dto/OXO1;->OXO1:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/dto/OXO1;->XIi00iiXO:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/dto/OXO1;->XIi00iiXO:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/sma/smartv3/dto/OXO1;->iO:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/dto/OXO1;->iO:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/dto/OXO1;->XO0O10:I

    iget v3, p1, Lcom/sma/smartv3/dto/OXO1;->XO0O10:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/dto/OXO1;->O00:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/dto/OXO1;->O00:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/dto/OXO1;->IiI10X:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/dto/OXO1;->IiI10X:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/dto/OXO1;->XOO0ii0:I

    iget v3, p1, Lcom/sma/smartv3/dto/OXO1;->XOO0ii0:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/sma/smartv3/dto/OXO1;->I0IIOi:I

    iget v3, p1, Lcom/sma/smartv3/dto/OXO1;->I0IIOi:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/sma/smartv3/dto/OXO1;->OIi0:I

    iget v3, p1, Lcom/sma/smartv3/dto/OXO1;->OIi0:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/sma/smartv3/dto/OXO1;->IO:I

    iget v3, p1, Lcom/sma/smartv3/dto/OXO1;->IO:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/sma/smartv3/dto/OXO1;->OIX0iXi:I

    iget p1, p1, Lcom/sma/smartv3/dto/OXO1;->OIX0iXi:I

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/dto/OXO1;->OXO1:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/dto/OXO1;->XIi00iiXO:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/dto/OXO1;->iO:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/dto/OXO1;->XO0O10:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/dto/OXO1;->O00:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/dto/OXO1;->IiI10X:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/dto/OXO1;->XOO0ii0:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/dto/OXO1;->I0IIOi:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/dto/OXO1;->OIi0:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/dto/OXO1;->IO:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/dto/OXO1;->OIX0iXi:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i010I(Lcom/sma/smartv3/dto/ThirdPartyDeviceData;)V
    .locals 2
    .param p1    # Lcom/sma/smartv3/dto/ThirdPartyDeviceData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    if-eqz p1, :cond_2

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/dto/ThirdPartyDeviceData;->getModelId()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/dto/OXO1;->XO0O10:I

    invoke-virtual {p1}, Lcom/sma/smartv3/dto/ThirdPartyDeviceData;->getAiServerName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->SPARK_CHAIN:Lcom/sma/smartv3/dto/ChatAiMode;

    invoke-virtual {v0}, Lcom/sma/smartv3/dto/ChatAiMode;->getModelName()Ljava/lang/String;

    move-result-object v0

    :cond_1
    iput-object v0, p0, Lcom/sma/smartv3/dto/OXO1;->O00:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/sma/smartv3/dto/ThirdPartyDeviceData;->getCode()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/dto/OXO1;->IiI10X:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/sma/smartv3/dto/ThirdPartyDeviceData;->getStatus()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/dto/OXO1;->I0IIOi:I

    invoke-virtual {p1}, Lcom/sma/smartv3/dto/ThirdPartyDeviceData;->getDuration()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/dto/OXO1;->XOO0ii0:I

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NetTransfer:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/dto/OXO1;->iX(Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final iI(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/dto/OXO1;->iO:Z

    return-void
.end method

.method public final iIXi1iiXI(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/dto/OXO1;->OIX0iXi:I

    return-void
.end method

.method public final iIiiO()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->OIi0:I

    return v0
.end method

.method public final iO()Ljava/util/HashMap;
    .locals 39
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    iget-object v4, v0, Lcom/sma/smartv3/dto/OXO1;->OXO1:Ljava/lang/String;

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionName()Ljava/lang/String;

    move-result-object v8

    const-string v2, "getAppVersionName(...)"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    new-instance v9, Lcom/sma/smartv3/model/AppUser;

    const v37, 0x7ffffff

    const/16 v38, 0x0

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

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v9 .. v38}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v5, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v9, v2

    :goto_0
    check-cast v9, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v3

    iget-object v9, v0, Lcom/sma/smartv3/dto/OXO1;->XIi00iiXO:Ljava/lang/String;

    new-instance v2, Lcom/sma/smartv3/network/BleInfo;

    const-string v7, ""

    const/4 v10, 0x0

    const-string v5, ""

    const-string v6, "58"

    invoke-direct/range {v2 .. v10}, Lcom/sma/smartv3/network/BleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    iget-object v3, v3, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    const-string v4, "language"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "BleInfo"

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method public final iOO1ii1(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/dto/OXO1;->IiI10X:Ljava/lang/String;

    return-void
.end method

.method public final iOOX010X()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/OXO1;->OIX0iXi:I

    return v0
.end method

.method public final iX(Z)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "THIRD_PARTY_DEVICE"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5f

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v2, Lcom/sma/smartv3/dto/OXO1;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public final iX1O1(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/dto/OXO1;->XOO0ii0:I

    return-void
.end method

.method public final iXiX011(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/dto/OXO1;->I0IIOi:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 13
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/OXO1;->OXO1:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/dto/OXO1;->XIi00iiXO:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/sma/smartv3/dto/OXO1;->iO:Z

    iget v3, p0, Lcom/sma/smartv3/dto/OXO1;->XO0O10:I

    iget-object v4, p0, Lcom/sma/smartv3/dto/OXO1;->O00:Ljava/lang/String;

    iget-object v5, p0, Lcom/sma/smartv3/dto/OXO1;->IiI10X:Ljava/lang/String;

    iget v6, p0, Lcom/sma/smartv3/dto/OXO1;->XOO0ii0:I

    iget v7, p0, Lcom/sma/smartv3/dto/OXO1;->I0IIOi:I

    iget v8, p0, Lcom/sma/smartv3/dto/OXO1;->OIi0:I

    iget v9, p0, Lcom/sma/smartv3/dto/OXO1;->IO:I

    iget v10, p0, Lcom/sma/smartv3/dto/OXO1;->OIX0iXi:I

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "ThirdPartyDeviceInfo(name="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mac="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", connected="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", modelId="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", modelName="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", activeCode="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", duration="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", state="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", cid="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", bid="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", pid="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
