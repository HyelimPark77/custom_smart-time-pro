.class public final Lcom/szabh/smable3/entity/BleMatchRecordTeam;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleMatchRecordTeam$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleMatchRecordTeam.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchRecordTeam.kt\ncom/szabh/smable3/entity/BleMatchRecordTeam\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,93:1\n232#2,3:94\n222#2,15:97\n232#2,3:112\n222#2,15:115\n*S KotlinDebug\n*F\n+ 1 BleMatchRecordTeam.kt\ncom/szabh/smable3/entity/BleMatchRecordTeam\n*L\n60#1:94,3\n60#1:97,15\n62#1:112,3\n62#1:115,15\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleMatchRecordTeam.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchRecordTeam.kt\ncom/szabh/smable3/entity/BleMatchRecordTeam\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,93:1\n232#2,3:94\n222#2,15:97\n232#2,3:112\n222#2,15:115\n*S KotlinDebug\n*F\n+ 1 BleMatchRecordTeam.kt\ncom/szabh/smable3/entity/BleMatchRecordTeam\n*L\n60#1:94,3\n60#1:97,15\n62#1:112,3\n62#1:115,15\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleMatchRecordTeam$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x774

.field public static final NAME_LENGTH:I = 0x19


# instance fields
.field private mGoalTypes:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mGuestPlayers:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecordPlayer;",
            ">;"
        }
    .end annotation
.end field

.field private mGuestTeamColor:I

.field private mHomePlayers:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecordPlayer;",
            ">;"
        }
    .end annotation
.end field

.field private mHomeTeamColor:I

.field private mRedCardTypes:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mRefereeRoles:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mTeamNames:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mYellowCardTypes:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleMatchRecordTeam$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleMatchRecordTeam$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->Companion:Lcom/szabh/smable3/entity/BleMatchRecordTeam$Companion;

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

    invoke-direct/range {v0 .. v11}, Lcom/szabh/smable3/entity/BleMatchRecordTeam;-><init>(Ljava/util/List;IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleMatchRecordTeam3;)V
    .locals 11
    .param p1    # Lcom/szabh/smable3/entity/BleMatchRecordTeam3;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleMatchRecordTeam"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;->getMTeamNames()Ljava/util/List;

    move-result-object v2

    .line 21
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;->getMHomeTeamColor()I

    move-result v3

    .line 22
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;->getMGuestTeamColor()I

    move-result v4

    .line 23
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;->getMRefereeRoles()Ljava/util/List;

    move-result-object v5

    .line 24
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;->getMHomePlayers()Ljava/util/List;

    move-result-object v6

    .line 25
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;->getMGuestPlayers()Ljava/util/List;

    move-result-object v7

    .line 26
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;->getMGoalTypes()Ljava/util/List;

    move-result-object v8

    .line 27
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;->getMYellowCardTypes()Ljava/util/List;

    move-result-object v9

    .line 28
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;->getMRedCardTypes()Ljava/util/List;

    move-result-object v10

    move-object v1, p0

    .line 29
    invoke-direct/range {v1 .. v10}, Lcom/szabh/smable3/entity/BleMatchRecordTeam;-><init>(Ljava/util/List;IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecordPlayer;",
            ">;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecordPlayer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mTeamNames"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRefereeRoles"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mHomePlayers"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mGuestPlayers"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mGoalTypes"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mYellowCardTypes"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRedCardTypes"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mTeamNames:Ljava/util/List;

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomeTeamColor:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestTeamColor:I

    .line 6
    iput-object p4, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRefereeRoles:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomePlayers:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestPlayers:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGoalTypes:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mYellowCardTypes:Ljava/util/List;

    .line 11
    iput-object p9, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRedCardTypes:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    .line 12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    and-int/lit8 p11, p10, 0x2

    const/4 v0, 0x0

    if-eqz p11, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    .line 13
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    .line 14
    new-instance p5, Ljava/util/ArrayList;

    invoke-direct {p5}, Ljava/util/ArrayList;-><init>()V

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    .line 15
    new-instance p6, Ljava/util/ArrayList;

    invoke-direct {p6}, Ljava/util/ArrayList;-><init>()V

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    .line 16
    new-instance p7, Ljava/util/ArrayList;

    invoke-direct {p7}, Ljava/util/ArrayList;-><init>()V

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    .line 17
    new-instance p8, Ljava/util/ArrayList;

    invoke-direct {p8}, Ljava/util/ArrayList;-><init>()V

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    .line 18
    new-instance p9, Ljava/util/ArrayList;

    invoke-direct {p9}, Ljava/util/ArrayList;-><init>()V

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 19
    invoke-direct/range {p2 .. p11}, Lcom/szabh/smable3/entity/BleMatchRecordTeam;-><init>(Ljava/util/List;IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleMatchRecordTeam;Ljava/util/List;IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleMatchRecordTeam;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mTeamNames:Ljava/util/List;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomeTeamColor:I

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestTeamColor:I

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRefereeRoles:Ljava/util/List;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomePlayers:Ljava/util/List;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestPlayers:Ljava/util/List;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGoalTypes:Ljava/util/List;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mYellowCardTypes:Ljava/util/List;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRedCardTypes:Ljava/util/List;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->copy(Ljava/util/List;IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/szabh/smable3/entity/BleMatchRecordTeam;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mTeamNames:Ljava/util/List;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomeTeamColor:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestTeamColor:I

    return v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRefereeRoles:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecordPlayer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomePlayers:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecordPlayer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestPlayers:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGoalTypes:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mYellowCardTypes:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRedCardTypes:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/szabh/smable3/entity/BleMatchRecordTeam;
    .locals 11
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecordPlayer;",
            ">;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecordPlayer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/szabh/smable3/entity/BleMatchRecordTeam;"
        }
    .end annotation

    const-string v0, "mTeamNames"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRefereeRoles"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mHomePlayers"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mGuestPlayers"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mGoalTypes"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mYellowCardTypes"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRedCardTypes"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleMatchRecordTeam;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v10}, Lcom/szabh/smable3/entity/BleMatchRecordTeam;-><init>(Ljava/util/List;IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public decode()V
    .locals 11

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/16 v3, 0x19

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-ge v2, v5, :cond_1

    invoke-static {p0, v3, v4, v5, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mTeamNames:Ljava/util/List;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomeTeamColor:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestTeamColor:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move v2, v1

    :goto_1
    const/4 v6, 0x4

    if-ge v2, v6, :cond_3

    invoke-static {p0, v3, v4, v5, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_2

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRefereeRoles:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move v2, v1

    :goto_2
    const-class v6, Lcom/szabh/smable3/entity/BleMatchRecordPlayer;

    const/16 v7, 0x1a

    if-ge v2, v3, :cond_4

    invoke-virtual {v6}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v7}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v6}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move v8, v1

    :goto_3
    if-ge v8, v3, :cond_5

    invoke-virtual {v6}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v7}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v9}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_5
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move v7, v1

    :goto_4
    const/16 v8, 0x8

    if-ge v7, v8, :cond_6

    invoke-static {p0, v3, v4, v5, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_6
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move v8, v1

    :goto_5
    const/4 v9, 0x5

    if-ge v8, v9, :cond_7

    invoke-static {p0, v3, v4, v5, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_7
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    :goto_6
    if-ge v1, v9, :cond_8

    invoke-static {p0, v3, v4, v5, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_8
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v1

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomePlayers:Ljava/util/List;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestPlayers:Ljava/util/List;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    invoke-static {v6, v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGoalTypes:Ljava/util/List;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    invoke-static {v7, v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mYellowCardTypes:Ljava/util/List;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    invoke-static {v8, v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRedCardTypes:Ljava/util/List;

    return-void
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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleMatchRecordTeam;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleMatchRecordTeam;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mTeamNames:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mTeamNames:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomeTeamColor:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomeTeamColor:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestTeamColor:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestTeamColor:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRefereeRoles:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRefereeRoles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomePlayers:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomePlayers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestPlayers:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestPlayers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGoalTypes:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGoalTypes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mYellowCardTypes:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mYellowCardTypes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRedCardTypes:Ljava/util/List;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRedCardTypes:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getMGoalTypes()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGoalTypes:Ljava/util/List;

    return-object v0
.end method

.method public final getMGuestPlayers()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecordPlayer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestPlayers:Ljava/util/List;

    return-object v0
.end method

.method public final getMGuestTeamColor()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestTeamColor:I

    return v0
.end method

.method public final getMHomePlayers()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecordPlayer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomePlayers:Ljava/util/List;

    return-object v0
.end method

.method public final getMHomeTeamColor()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomeTeamColor:I

    return v0
.end method

.method public final getMRedCardTypes()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRedCardTypes:Ljava/util/List;

    return-object v0
.end method

.method public final getMRefereeRoles()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRefereeRoles:Ljava/util/List;

    return-object v0
.end method

.method public final getMTeamNames()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mTeamNames:Ljava/util/List;

    return-object v0
.end method

.method public final getMYellowCardTypes()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mYellowCardTypes:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mTeamNames:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomeTeamColor:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestTeamColor:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRefereeRoles:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomePlayers:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestPlayers:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGoalTypes:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mYellowCardTypes:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRedCardTypes:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMGoalTypes(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGoalTypes:Ljava/util/List;

    return-void
.end method

.method public final setMGuestPlayers(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecordPlayer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestPlayers:Ljava/util/List;

    return-void
.end method

.method public final setMGuestTeamColor(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestTeamColor:I

    return-void
.end method

.method public final setMHomePlayers(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecordPlayer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomePlayers:Ljava/util/List;

    return-void
.end method

.method public final setMHomeTeamColor(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomeTeamColor:I

    return-void
.end method

.method public final setMRedCardTypes(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRedCardTypes:Ljava/util/List;

    return-void
.end method

.method public final setMRefereeRoles(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRefereeRoles:Ljava/util/List;

    return-void
.end method

.method public final setMTeamNames(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mTeamNames:Ljava/util/List;

    return-void
.end method

.method public final setMYellowCardTypes(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mYellowCardTypes:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleMatchRecordTeam(mTeamNames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mTeamNames:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mHomeTeamColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomeTeamColor:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mGuestTeamColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestTeamColor:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRefereeRoles="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRefereeRoles:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mHomePlayers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mHomePlayers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mGuestPlayers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGuestPlayers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mGoalTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mGoalTypes:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mYellowCardTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mYellowCardTypes:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mRedCardTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchRecordTeam;->mRedCardTypes:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
