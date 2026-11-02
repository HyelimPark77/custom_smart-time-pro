.class public final Lcom/sma/smartv3/location/CustomLocation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/location/CustomLocation$TYPE;
    }
.end annotation


# instance fields
.field public I0IIOi:F

.field public IO:F

.field public IiI10X:J

.field public O00:I

.field public OIi0:F

.field public OXO1:D

.field public XIi00iiXO:D

.field public XO0O10:F

.field public XOO0ii0:Lcom/sma/smartv3/location/CustomLocation$TYPE;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iO:D


# direct methods
.method public constructor <init>()V
    .locals 17

    .line 1
    const/16 v15, 0x3ff

    const/16 v16, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v16}, Lcom/sma/smartv3/location/CustomLocation;-><init>(DDDFIJLcom/sma/smartv3/location/CustomLocation$TYPE;FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(DDDFIJLcom/sma/smartv3/location/CustomLocation$TYPE;FFF)V
    .locals 1
    .param p11    # Lcom/sma/smartv3/location/CustomLocation$TYPE;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mLocationType"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/sma/smartv3/location/CustomLocation;->OXO1:D

    .line 4
    iput-wide p3, p0, Lcom/sma/smartv3/location/CustomLocation;->XIi00iiXO:D

    .line 5
    iput-wide p5, p0, Lcom/sma/smartv3/location/CustomLocation;->iO:D

    .line 6
    iput p7, p0, Lcom/sma/smartv3/location/CustomLocation;->XO0O10:F

    .line 7
    iput p8, p0, Lcom/sma/smartv3/location/CustomLocation;->O00:I

    .line 8
    iput-wide p9, p0, Lcom/sma/smartv3/location/CustomLocation;->IiI10X:J

    .line 9
    iput-object p11, p0, Lcom/sma/smartv3/location/CustomLocation;->XOO0ii0:Lcom/sma/smartv3/location/CustomLocation$TYPE;

    .line 10
    iput p12, p0, Lcom/sma/smartv3/location/CustomLocation;->I0IIOi:F

    .line 11
    iput p13, p0, Lcom/sma/smartv3/location/CustomLocation;->OIi0:F

    .line 12
    iput p14, p0, Lcom/sma/smartv3/location/CustomLocation;->IO:F

    return-void
.end method

.method public synthetic constructor <init>(DDDFIJLcom/sma/smartv3/location/CustomLocation$TYPE;FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    move-wide v4, v2

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-wide v6, v2

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    move-wide/from16 v2, p5

    :goto_2
    and-int/lit8 v1, v0, 0x8

    const/4 v8, 0x0

    if-eqz v1, :cond_3

    move v1, v8

    goto :goto_3

    :cond_3
    move/from16 v1, p7

    :goto_3
    and-int/lit8 v9, v0, 0x10

    if-eqz v9, :cond_4

    const/4 v9, 0x0

    goto :goto_4

    :cond_4
    move/from16 v9, p8

    :goto_4
    and-int/lit8 v10, v0, 0x20

    if-eqz v10, :cond_5

    const-wide/16 v10, 0x0

    goto :goto_5

    :cond_5
    move-wide/from16 v10, p9

    :goto_5
    and-int/lit8 v12, v0, 0x40

    if-eqz v12, :cond_6

    .line 13
    sget-object v12, Lcom/sma/smartv3/location/CustomLocation$TYPE;->NORMAL:Lcom/sma/smartv3/location/CustomLocation$TYPE;

    goto :goto_6

    :cond_6
    move-object/from16 v12, p11

    :goto_6
    and-int/lit16 v13, v0, 0x80

    if-eqz v13, :cond_7

    move v13, v8

    goto :goto_7

    :cond_7
    move/from16 v13, p12

    :goto_7
    and-int/lit16 v14, v0, 0x100

    if-eqz v14, :cond_8

    move v14, v8

    goto :goto_8

    :cond_8
    move/from16 v14, p13

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    move/from16 p15, v8

    :goto_9
    move-object/from16 p1, p0

    move/from16 p8, v1

    move-wide/from16 p6, v2

    move-wide/from16 p2, v4

    move-wide/from16 p4, v6

    move/from16 p9, v9

    move-wide/from16 p10, v10

    move-object/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    goto :goto_a

    :cond_9
    move/from16 p15, p14

    goto :goto_9

    .line 14
    :goto_a
    invoke-direct/range {p1 .. p15}, Lcom/sma/smartv3/location/CustomLocation;-><init>(DDDFIJLcom/sma/smartv3/location/CustomLocation$TYPE;FFF)V

    return-void
.end method


# virtual methods
.method public final I0IIOi()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/location/CustomLocation;->XO0O10:F

    return v0
.end method

.method public final I0iXXO(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/location/CustomLocation;->I0IIOi:F

    return-void
.end method

.method public final I1XOi1(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/location/CustomLocation;->O00:I

    return-void
.end method

.method public final IIX1OXO(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/location/CustomLocation;->XO0O10:F

    return-void
.end method

.method public final IO()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/location/CustomLocation;->IO:F

    return v0
.end method

.method public final IiI10X()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/location/CustomLocation;->XIi00iiXO:D

    return-wide v0
.end method

.method public final O00()Lcom/sma/smartv3/location/CustomLocation$TYPE;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/location/CustomLocation;->XOO0ii0:Lcom/sma/smartv3/location/CustomLocation$TYPE;

    return-object v0
.end method

.method public final O10IXXX0X(Lcom/sma/smartv3/location/CustomLocation$TYPE;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/location/CustomLocation$TYPE;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/location/CustomLocation;->XOO0ii0:Lcom/sma/smartv3/location/CustomLocation$TYPE;

    return-void
.end method

.method public final OIX0iXi(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/location/CustomLocation;->iO:D

    return-void
.end method

.method public final OIi0()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/location/CustomLocation;->IiI10X:J

    return-wide v0
.end method

.method public final OXO1()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/location/CustomLocation;->iO:D

    return-wide v0
.end method

.method public final X0O(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/location/CustomLocation;->XIi00iiXO:D

    return-void
.end method

.method public final X1ii(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/location/CustomLocation;->OXO1:D

    return-void
.end method

.method public final XIi00iiXO()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/location/CustomLocation;->I0IIOi:F

    return v0
.end method

.method public final XO0O10()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/location/CustomLocation;->OXO1:D

    return-wide v0
.end method

.method public final XOO0ii0()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/location/CustomLocation;->O00:I

    return v0
.end method

.method public final XXI(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/location/CustomLocation;->OIi0:F

    return-void
.end method

.method public final XiOIO(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/location/CustomLocation;->IiI10X:J

    return-void
.end method

.method public final iIiiO(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/location/CustomLocation;->IO:F

    return-void
.end method

.method public final iO()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/location/CustomLocation;->OIi0:F

    return v0
.end method
