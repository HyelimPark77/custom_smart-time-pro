.class public final Lcom/sma/smartv3/model/BGEMUser;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/model/BGEMUser$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/model/BGEMUser$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private age:I

.field private appUserId:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private device_id:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private family_history:Z

.field private gender:Lcom/sma/smartv3/model/BGEMGender;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private glicemiaUserId:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private height:I

.field private high_cholesterol:Z

.field private weight:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/model/BGEMUser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/model/BGEMUser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/model/BGEMUser;->Companion:Lcom/sma/smartv3/model/BGEMUser$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/sma/smartv3/model/BGEMUser;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/sma/smartv3/model/BGEMGender;IILjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILcom/sma/smartv3/model/BGEMGender;IILjava/lang/String;ZZ)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/model/BGEMGender;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "appUserId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "glicemiaUserId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gender"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "device_id"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMUser;->appUserId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/model/BGEMUser;->glicemiaUserId:Ljava/lang/String;

    .line 5
    iput p3, p0, Lcom/sma/smartv3/model/BGEMUser;->age:I

    .line 6
    iput-object p4, p0, Lcom/sma/smartv3/model/BGEMUser;->gender:Lcom/sma/smartv3/model/BGEMGender;

    .line 7
    iput p5, p0, Lcom/sma/smartv3/model/BGEMUser;->weight:I

    .line 8
    iput p6, p0, Lcom/sma/smartv3/model/BGEMUser;->height:I

    .line 9
    iput-object p7, p0, Lcom/sma/smartv3/model/BGEMUser;->device_id:Ljava/lang/String;

    .line 10
    iput-boolean p8, p0, Lcom/sma/smartv3/model/BGEMUser;->family_history:Z

    .line 11
    iput-boolean p9, p0, Lcom/sma/smartv3/model/BGEMUser;->high_cholesterol:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILcom/sma/smartv3/model/BGEMGender;IILjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p11, p10, 0x1

    .line 12
    const-string v0, ""

    if-eqz p11, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    const/4 v1, 0x0

    if-eqz p11, :cond_2

    move p3, v1

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    .line 13
    sget-object p4, Lcom/sma/smartv3/model/BGEMGender;->M:Lcom/sma/smartv3/model/BGEMGender;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move p5, v1

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move p6, v1

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    move p8, v1

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    move p10, v1

    :goto_0
    move p9, p8

    move-object p8, p7

    move p7, p6

    move p6, p5

    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_8
    move p10, p9

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/sma/smartv3/model/BGEMUser;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/sma/smartv3/model/BGEMGender;IILjava/lang/String;ZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/BGEMUser;Ljava/lang/String;Ljava/lang/String;ILcom/sma/smartv3/model/BGEMGender;IILjava/lang/String;ZZILjava/lang/Object;)Lcom/sma/smartv3/model/BGEMUser;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/model/BGEMUser;->appUserId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/model/BGEMUser;->glicemiaUserId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget p3, p0, Lcom/sma/smartv3/model/BGEMUser;->age:I

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/sma/smartv3/model/BGEMUser;->gender:Lcom/sma/smartv3/model/BGEMGender;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget p5, p0, Lcom/sma/smartv3/model/BGEMUser;->weight:I

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget p6, p0, Lcom/sma/smartv3/model/BGEMUser;->height:I

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/sma/smartv3/model/BGEMUser;->device_id:Ljava/lang/String;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-boolean p8, p0, Lcom/sma/smartv3/model/BGEMUser;->family_history:Z

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-boolean p9, p0, Lcom/sma/smartv3/model/BGEMUser;->high_cholesterol:Z

    :cond_8
    move p10, p8

    move p11, p9

    move p8, p6

    move-object p9, p7

    move-object p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/sma/smartv3/model/BGEMUser;->copy(Ljava/lang/String;Ljava/lang/String;ILcom/sma/smartv3/model/BGEMGender;IILjava/lang/String;ZZ)Lcom/sma/smartv3/model/BGEMUser;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMUser;->appUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMUser;->glicemiaUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BGEMUser;->age:I

    return v0
.end method

.method public final component4()Lcom/sma/smartv3/model/BGEMGender;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMUser;->gender:Lcom/sma/smartv3/model/BGEMGender;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BGEMUser;->weight:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BGEMUser;->height:I

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMUser;->device_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMUser;->family_history:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMUser;->high_cholesterol:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ILcom/sma/smartv3/model/BGEMGender;IILjava/lang/String;ZZ)Lcom/sma/smartv3/model/BGEMUser;
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/model/BGEMGender;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "appUserId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "glicemiaUserId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gender"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "device_id"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/BGEMUser;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/sma/smartv3/model/BGEMUser;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/sma/smartv3/model/BGEMGender;IILjava/lang/String;ZZ)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/BGEMUser;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/BGEMUser;

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMUser;->appUserId:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/BGEMUser;->appUserId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMUser;->glicemiaUserId:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/BGEMUser;->glicemiaUserId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/model/BGEMUser;->age:I

    iget v3, p1, Lcom/sma/smartv3/model/BGEMUser;->age:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMUser;->gender:Lcom/sma/smartv3/model/BGEMGender;

    iget-object v3, p1, Lcom/sma/smartv3/model/BGEMUser;->gender:Lcom/sma/smartv3/model/BGEMGender;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/model/BGEMUser;->weight:I

    iget v3, p1, Lcom/sma/smartv3/model/BGEMUser;->weight:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/model/BGEMUser;->height:I

    iget v3, p1, Lcom/sma/smartv3/model/BGEMUser;->height:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMUser;->device_id:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/BGEMUser;->device_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/sma/smartv3/model/BGEMUser;->family_history:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/model/BGEMUser;->family_history:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/sma/smartv3/model/BGEMUser;->high_cholesterol:Z

    iget-boolean p1, p1, Lcom/sma/smartv3/model/BGEMUser;->high_cholesterol:Z

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAge()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BGEMUser;->age:I

    return v0
.end method

.method public final getAppUserId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMUser;->appUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final getDevice_id()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMUser;->device_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getFamily_history()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMUser;->family_history:Z

    return v0
.end method

.method public final getGender()Lcom/sma/smartv3/model/BGEMGender;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMUser;->gender:Lcom/sma/smartv3/model/BGEMGender;

    return-object v0
.end method

.method public final getGlicemiaUserId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMUser;->glicemiaUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BGEMUser;->height:I

    return v0
.end method

.method public final getHigh_cholesterol()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMUser;->high_cholesterol:Z

    return v0
.end method

.method public final getWeight()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BGEMUser;->weight:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMUser;->appUserId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMUser;->glicemiaUserId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/BGEMUser;->age:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMUser;->gender:Lcom/sma/smartv3/model/BGEMGender;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/BGEMUser;->weight:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/BGEMUser;->height:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMUser;->device_id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/BGEMUser;->family_history:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/BGEMUser;->high_cholesterol:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setAge(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BGEMUser;->age:I

    return-void
.end method

.method public final setAppUserId(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMUser;->appUserId:Ljava/lang/String;

    return-void
.end method

.method public final setDevice_id(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMUser;->device_id:Ljava/lang/String;

    return-void
.end method

.method public final setFamily_history(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/BGEMUser;->family_history:Z

    return-void
.end method

.method public final setGender(Lcom/sma/smartv3/model/BGEMGender;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/BGEMGender;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMUser;->gender:Lcom/sma/smartv3/model/BGEMGender;

    return-void
.end method

.method public final setGlicemiaUserId(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMUser;->glicemiaUserId:Ljava/lang/String;

    return-void
.end method

.method public final setHeight(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BGEMUser;->height:I

    return-void
.end method

.method public final setHigh_cholesterol(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/BGEMUser;->high_cholesterol:Z

    return-void
.end method

.method public final setWeight(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BGEMUser;->weight:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMUser;->appUserId:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMUser;->glicemiaUserId:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/model/BGEMUser;->age:I

    iget-object v3, p0, Lcom/sma/smartv3/model/BGEMUser;->gender:Lcom/sma/smartv3/model/BGEMGender;

    iget v4, p0, Lcom/sma/smartv3/model/BGEMUser;->weight:I

    iget v5, p0, Lcom/sma/smartv3/model/BGEMUser;->height:I

    iget-object v6, p0, Lcom/sma/smartv3/model/BGEMUser;->device_id:Ljava/lang/String;

    iget-boolean v7, p0, Lcom/sma/smartv3/model/BGEMUser;->family_history:Z

    iget-boolean v8, p0, Lcom/sma/smartv3/model/BGEMUser;->high_cholesterol:Z

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "BGEMUser(appUserId="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", glicemiaUserId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", age="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", gender="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", weight="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", height="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", device_id="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", family_history="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", high_cholesterol="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
